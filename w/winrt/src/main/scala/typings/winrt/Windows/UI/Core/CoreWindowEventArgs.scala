package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreWindowEventArgs extends ICoreWindowEventArgs
object CoreWindowEventArgs {
  
  @scala.inline
  def apply(handled: Boolean): CoreWindowEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreWindowEventArgs]
  }
}
