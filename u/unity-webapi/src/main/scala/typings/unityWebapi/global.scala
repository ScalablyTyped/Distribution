package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class UnityIndicatorProperties ()
    extends typings.unityWebapi.UnityIndicatorProperties
  
  @js.native
  class UnitySettings ()
    extends typings.unityWebapi.UnitySettings
  
  @js.native
  class UnityTrackMetadata ()
    extends typings.unityWebapi.UnityTrackMetadata
  
  @js.native
  object UnityPlaybackState extends js.Object {
    /* 1 */ val Paused: typings.unityWebapi.UnityPlaybackState.Paused with Double = js.native
    /* 0 */ val Playing: typings.unityWebapi.UnityPlaybackState.Playing with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.unityWebapi.UnityPlaybackState with Double] = js.native
  }
  
}

