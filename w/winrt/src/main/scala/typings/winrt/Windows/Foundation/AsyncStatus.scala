package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsyncStatus extends js.Object

@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends js.Object {
  @js.native
  sealed trait canceled extends AsyncStatus
  
  @js.native
  sealed trait completed extends AsyncStatus
  
  @js.native
  sealed trait error extends AsyncStatus
  
  @js.native
  sealed trait started extends AsyncStatus
  
  /* 0 */ val canceled: typings.winrt.Windows.Foundation.AsyncStatus.canceled with Double = js.native
  /* 1 */ val completed: typings.winrt.Windows.Foundation.AsyncStatus.completed with Double = js.native
  /* 2 */ val error: typings.winrt.Windows.Foundation.AsyncStatus.error with Double = js.native
  /* 3 */ val started: typings.winrt.Windows.Foundation.AsyncStatus.started with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AsyncStatus with Double] = js.native
}

