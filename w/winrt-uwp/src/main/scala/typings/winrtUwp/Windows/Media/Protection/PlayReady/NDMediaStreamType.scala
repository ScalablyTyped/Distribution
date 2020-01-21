package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDMediaStreamType with Double] = js.native
  /* 0 */ @js.native
  object audio extends TopLevel[audio with Double]
  
  /* 1 */ @js.native
  object video extends TopLevel[video with Double]
  
}

