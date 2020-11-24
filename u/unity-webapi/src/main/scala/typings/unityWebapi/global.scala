package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class UnityIndicatorProperties ()
    extends typings.unityWebapi.UnityIndicatorProperties
  
  @js.native
  object UnityPlaybackState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.unityWebapi.UnityPlaybackState with Double] = js.native
    
    /* 1 */ val Paused: typings.unityWebapi.UnityPlaybackState.Paused with Double = js.native
    
    /* 0 */ val Playing: typings.unityWebapi.UnityPlaybackState.Playing with Double = js.native
  }
  
  @js.native
  class UnitySettings ()
    extends typings.unityWebapi.UnitySettings
  
  @js.native
  class UnityTrackMetadata ()
    extends typings.unityWebapi.UnityTrackMetadata
}
