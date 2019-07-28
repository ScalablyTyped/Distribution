package typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs

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
  sealed trait deviceError extends PlayToConnectionError
  
  /** The Play To target device is locked. */
  @js.native
  sealed trait deviceLocked extends PlayToConnectionError
  
  /** The Play To target device has not responded for at least 5 seconds. */
  @js.native
  sealed trait deviceNotResponding extends PlayToConnectionError
  
  /** No error occurred. */
  @js.native
  sealed trait none extends PlayToConnectionError
  
  /** The Play To target device failed to play the protected content. */
  @js.native
  sealed trait protectedPlaybackFailed extends PlayToConnectionError
  
  /* 2 */ val deviceError: typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError.deviceError with Double = js.native
  /* 3 */ val deviceLocked: typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError.deviceLocked with Double = js.native
  /* 1 */ val deviceNotResponding: typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError.deviceNotResponding with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError.none with Double = js.native
  /* 4 */ val protectedPlaybackFailed: typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError.protectedPlaybackFailed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayToConnectionError with Double] = js.native
}

