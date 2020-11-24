package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
