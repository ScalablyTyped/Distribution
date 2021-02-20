package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskRequestedEventArgs extends StObject {
  
  var request: PrintTaskRequest = js.native
}
object IPrintTaskRequestedEventArgs {
  
  @scala.inline
  def apply(request: PrintTaskRequest): IPrintTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IPrintTaskRequestedEventArgsMutableBuilder[Self <: IPrintTaskRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: PrintTaskRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
