package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskRequestedEventArgs extends StObject {
  
  var request: PrintTaskRequest
}
object IPrintTaskRequestedEventArgs {
  
  inline def apply(request: PrintTaskRequest): IPrintTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskRequestedEventArgs]
  }
  
  extension [Self <: IPrintTaskRequestedEventArgs](x: Self) {
    
    inline def setRequest(value: PrintTaskRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
