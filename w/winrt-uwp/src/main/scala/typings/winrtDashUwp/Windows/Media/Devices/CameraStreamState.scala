package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Devices.CameraStreamState.blockedForPrivacy
import typings.winrtDashUwp.Windows.Media.Devices.CameraStreamState.notStreaming
import typings.winrtDashUwp.Windows.Media.Devices.CameraStreamState.shutdown
import typings.winrtDashUwp.Windows.Media.Devices.CameraStreamState.streaming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraStreamState extends js.Object

/** Defines the state of a camera stream. */
@JSGlobal("Windows.Media.Devices.CameraStreamState")
@js.native
object CameraStreamState extends js.Object {
  /** Frames in the stream are being dropped for privacy reasons. */
  @js.native
  sealed trait blockedForPrivacy extends CameraStreamState
  
  /** The camera stream is not currently streaming. */
  @js.native
  sealed trait notStreaming extends CameraStreamState
  
  /** The camera stream has been shut down. */
  @js.native
  sealed trait shutdown extends CameraStreamState
  
  /** The camera stream is currently streaming. */
  @js.native
  sealed trait streaming extends CameraStreamState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraStreamState with Double] = js.native
  /* 2 */ @js.native
  object blockedForPrivacy extends TopLevel[blockedForPrivacy with Double]
  
  /* 0 */ @js.native
  object notStreaming extends TopLevel[notStreaming with Double]
  
  /* 3 */ @js.native
  object shutdown extends TopLevel[shutdown with Double]
  
  /* 1 */ @js.native
  object streaming extends TopLevel[streaming with Double]
  
}

