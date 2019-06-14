package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayToConnectionError extends js.Object

/** Describes an error on a Play To connection. */
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
@js.native
object PlayToConnectionError extends js.Object {
  /** The Play To target device has encountered an error. */
  @js.native
  sealed trait deviceError
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  /** The Play To target device is locked. */
  @js.native
  sealed trait deviceLocked
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  /** The Play To target device has not responded for at least 5 seconds. */
  @js.native
  sealed trait deviceNotResponding
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  /** No error occurred. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  /** The Play To target device failed to play the protected content. */
  @js.native
  sealed trait protectedPlaybackFailed
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  /* 2 */ val deviceError: deviceError with scala.Double = js.native
  /* 3 */ val deviceLocked: deviceLocked with scala.Double = js.native
  /* 1 */ val deviceNotResponding: deviceNotResponding with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val protectedPlaybackFailed: protectedPlaybackFailed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError with scala.Double
  ] = js.native
}

