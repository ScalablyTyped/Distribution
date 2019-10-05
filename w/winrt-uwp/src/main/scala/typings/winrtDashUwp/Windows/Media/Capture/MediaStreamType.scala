package typings.winrtDashUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaStreamType extends js.Object

/** Specifies a type of stream on a media capture device. */
@JSGlobal("Windows.Media.Capture.MediaStreamType")
@js.native
object MediaStreamType extends js.Object {
  /** An audio stream. */
  @js.native
  sealed trait audio extends MediaStreamType
  
  /** A photo stream. */
  @js.native
  sealed trait photo extends MediaStreamType
  
  /** A video preview stream. */
  @js.native
  sealed trait videoPreview extends MediaStreamType
  
  /** A video recording stream. */
  @js.native
  sealed trait videoRecord extends MediaStreamType
  
  /* 2 */ val audio: typings.winrtDashUwp.Windows.Media.Capture.MediaStreamType.audio with Double = js.native
  /* 3 */ val photo: typings.winrtDashUwp.Windows.Media.Capture.MediaStreamType.photo with Double = js.native
  /* 0 */ val videoPreview: typings.winrtDashUwp.Windows.Media.Capture.MediaStreamType.videoPreview with Double = js.native
  /* 1 */ val videoRecord: typings.winrtDashUwp.Windows.Media.Capture.MediaStreamType.videoRecord with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaStreamType with Double] = js.native
}

