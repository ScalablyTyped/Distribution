package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NDMediaStreamType extends StObject
/** Indicates the type of a protected media stream. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDMediaStreamType")
@js.native
object NDMediaStreamType extends StObject {
  
  /** The stream is an audio stream. */
  @js.native
  sealed trait audio
    extends StObject
       with NDMediaStreamType
  
  /** The stream is a video stream. */
  @js.native
  sealed trait video
    extends StObject
       with NDMediaStreamType
}
