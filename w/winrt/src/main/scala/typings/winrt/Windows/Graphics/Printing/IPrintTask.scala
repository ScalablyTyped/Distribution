package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTask extends StObject {
  
  var oncompleted: js.Any = js.native
  
  var onpreviewing: js.Any = js.native
  
  var onprogressing: js.Any = js.native
  
  var onsubmitting: js.Any = js.native
  
  var options: PrintTaskOptions = js.native
  
  var properties: DataPackagePropertySet = js.native
  
  var source: IPrintDocumentSource = js.native
}
object IPrintTask {
  
  @scala.inline
  def apply(
    oncompleted: js.Any,
    onpreviewing: js.Any,
    onprogressing: js.Any,
    onsubmitting: js.Any,
    options: PrintTaskOptions,
    properties: DataPackagePropertySet,
    source: IPrintDocumentSource
  ): IPrintTask = {
    val __obj = js.Dynamic.literal(oncompleted = oncompleted.asInstanceOf[js.Any], onpreviewing = onpreviewing.asInstanceOf[js.Any], onprogressing = onprogressing.asInstanceOf[js.Any], onsubmitting = onsubmitting.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTask]
  }
  
  @scala.inline
  implicit class IPrintTaskMutableBuilder[Self <: IPrintTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOncompleted(value: js.Any): Self = StObject.set(x, "oncompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpreviewing(value: js.Any): Self = StObject.set(x, "onpreviewing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprogressing(value: js.Any): Self = StObject.set(x, "onprogressing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsubmitting(value: js.Any): Self = StObject.set(x, "onsubmitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: PrintTaskOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: DataPackagePropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: IPrintDocumentSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
