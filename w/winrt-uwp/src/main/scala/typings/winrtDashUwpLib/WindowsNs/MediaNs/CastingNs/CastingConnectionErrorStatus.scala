package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CastingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastingConnectionErrorStatus extends js.Object

/** Indicates the error status when starting or ending a casting connection. */
@JSGlobal("Windows.Media.Casting.CastingConnectionErrorStatus")
@js.native
object CastingConnectionErrorStatus extends js.Object {
  /** The device did not respond to the attempt to start or end theconnection. */
  @js.native
  sealed trait deviceDidNotRespond
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionErrorStatus
  
  /** The device returned an error when attempting to start or end the connection. */
  @js.native
  sealed trait deviceError
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionErrorStatus
  
  /** The device was locked and a start or end the connection could not be made. */
  @js.native
  sealed trait deviceLocked
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionErrorStatus
  
  /** The casting source was invalid. */
  @js.native
  sealed trait invalidCastingSource
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionErrorStatus
  
  /** The device could not provide protected playback. */
  @js.native
  sealed trait protectedPlaybackFailed
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionErrorStatus
  
  /** Starting or ending the connection was successful. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionErrorStatus
  
  /** An unknown error occurred when attempting to start or end the connection. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionErrorStatus
  
  val deviceDidNotRespond: deviceDidNotRespond with java.lang.String = js.native
  val deviceError: deviceError with java.lang.String = js.native
  val deviceLocked: deviceLocked with java.lang.String = js.native
  val invalidCastingSource: invalidCastingSource with java.lang.String = js.native
  val protectedPlaybackFailed: protectedPlaybackFailed with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionErrorStatus with java.lang.String
  ] = js.native
}

