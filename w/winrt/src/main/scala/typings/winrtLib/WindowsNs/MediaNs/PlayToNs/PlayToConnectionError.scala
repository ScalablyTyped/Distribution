package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayToConnectionError extends js.Object

@JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
@js.native
object PlayToConnectionError extends js.Object {
  @js.native
  sealed trait deviceError
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  @js.native
  sealed trait deviceLocked
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  @js.native
  sealed trait deviceNotResponding
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  /* 2 */ val deviceError: deviceError with scala.Double = js.native
  /* 3 */ val deviceLocked: deviceLocked with scala.Double = js.native
  /* 1 */ val deviceNotResponding: deviceNotResponding with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError with scala.Double] = js.native
}

