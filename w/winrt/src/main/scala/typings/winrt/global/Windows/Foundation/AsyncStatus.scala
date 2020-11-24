package typings.winrt.global.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.AsyncStatus with Double] = js.native
  
  /* 0 */ val canceled: typings.winrt.Windows.Foundation.AsyncStatus.canceled with Double = js.native
  
  /* 1 */ val completed: typings.winrt.Windows.Foundation.AsyncStatus.completed with Double = js.native
  
  /* 2 */ val error: typings.winrt.Windows.Foundation.AsyncStatus.error with Double = js.native
  
  /* 3 */ val started: typings.winrt.Windows.Foundation.AsyncStatus.started with Double = js.native
}
