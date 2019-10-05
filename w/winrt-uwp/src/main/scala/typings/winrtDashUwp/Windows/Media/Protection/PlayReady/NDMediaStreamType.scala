package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDMediaStreamType extends js.Object

/** Indicates the type of a protected media stream. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDMediaStreamType")
@js.native
object NDMediaStreamType extends js.Object {
  /** The stream is an audio stream. */
  @js.native
  sealed trait audio extends NDMediaStreamType
  
  /** The stream is a video stream. */
  @js.native
  sealed trait video extends NDMediaStreamType
  
  /* 0 */ val audio: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDMediaStreamType.audio with Double = js.native
  /* 1 */ val video: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDMediaStreamType.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDMediaStreamType with Double] = js.native
}

