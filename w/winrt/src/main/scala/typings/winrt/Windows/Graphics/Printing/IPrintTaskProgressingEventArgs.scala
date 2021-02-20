package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskProgressingEventArgs extends StObject {
  
  var documentPageCount: Double = js.native
}
object IPrintTaskProgressingEventArgs {
  
  @scala.inline
  def apply(documentPageCount: Double): IPrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal(documentPageCount = documentPageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskProgressingEventArgs]
  }
  
  @scala.inline
  implicit class IPrintTaskProgressingEventArgsMutableBuilder[Self <: IPrintTaskProgressingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentPageCount(value: Double): Self = StObject.set(x, "documentPageCount", value.asInstanceOf[js.Any])
  }
}
