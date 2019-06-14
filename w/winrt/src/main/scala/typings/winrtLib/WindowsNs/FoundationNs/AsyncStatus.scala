package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsyncStatus extends js.Object

@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends js.Object {
  @js.native
  sealed trait canceled
    extends winrtLib.WindowsNs.FoundationNs.AsyncStatus
  
  @js.native
  sealed trait completed
    extends winrtLib.WindowsNs.FoundationNs.AsyncStatus
  
  @js.native
  sealed trait error
    extends winrtLib.WindowsNs.FoundationNs.AsyncStatus
  
  @js.native
  sealed trait started
    extends winrtLib.WindowsNs.FoundationNs.AsyncStatus
  
  /* 0 */ val canceled: canceled with scala.Double = js.native
  /* 1 */ val completed: completed with scala.Double = js.native
  /* 2 */ val error: error with scala.Double = js.native
  /* 3 */ val started: started with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.FoundationNs.AsyncStatus with scala.Double] = js.native
}

