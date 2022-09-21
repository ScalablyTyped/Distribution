package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTask extends StObject {
  
  var oncompleted: Any
  
  var onpreviewing: Any
  
  var onprogressing: Any
  
  var onsubmitting: Any
  
  var options: PrintTaskOptions
  
  var properties: DataPackagePropertySet
  
  var source: IPrintDocumentSource
}
object IPrintTask {
  
  inline def apply(
    oncompleted: Any,
    onpreviewing: Any,
    onprogressing: Any,
    onsubmitting: Any,
    options: PrintTaskOptions,
    properties: DataPackagePropertySet,
    source: IPrintDocumentSource
  ): IPrintTask = {
    val __obj = js.Dynamic.literal(oncompleted = oncompleted.asInstanceOf[js.Any], onpreviewing = onpreviewing.asInstanceOf[js.Any], onprogressing = onprogressing.asInstanceOf[js.Any], onsubmitting = onsubmitting.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTask]
  }
  
  extension [Self <: IPrintTask](x: Self) {
    
    inline def setOncompleted(value: Any): Self = StObject.set(x, "oncompleted", value.asInstanceOf[js.Any])
    
    inline def setOnpreviewing(value: Any): Self = StObject.set(x, "onpreviewing", value.asInstanceOf[js.Any])
    
    inline def setOnprogressing(value: Any): Self = StObject.set(x, "onprogressing", value.asInstanceOf[js.Any])
    
    inline def setOnsubmitting(value: Any): Self = StObject.set(x, "onsubmitting", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PrintTaskOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: DataPackagePropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSource(value: IPrintDocumentSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
