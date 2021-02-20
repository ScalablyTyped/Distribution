package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTaskRequestedEventArgs extends IPrintTaskRequestedEventArgs
object PrintTaskRequestedEventArgs {
  
  @scala.inline
  def apply(request: PrintTaskRequest): PrintTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskRequestedEventArgs]
  }
}
