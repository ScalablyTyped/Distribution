package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskProgressingEventArgs extends StObject {
  
  var documentPageCount: Double
}
object IPrintTaskProgressingEventArgs {
  
  inline def apply(documentPageCount: Double): IPrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal(documentPageCount = documentPageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskProgressingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPrintTaskProgressingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setDocumentPageCount(value: Double): Self = StObject.set(x, "documentPageCount", value.asInstanceOf[js.Any])
  }
}
