package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("UnityIndicatorProperties")
  @js.native
  class UnityIndicatorProperties ()
    extends typings.unityWebapi.UnityIndicatorProperties
  
  @JSGlobal("UnityPlaybackState")
  @js.native
  object UnityPlaybackState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.unityWebapi.UnityPlaybackState with Double] = js.native
    
    /* 1 */ val Paused: typings.unityWebapi.UnityPlaybackState.Paused with Double = js.native
    
    /* 0 */ val Playing: typings.unityWebapi.UnityPlaybackState.Playing with Double = js.native
  }
  
  @JSGlobal("UnitySettings")
  @js.native
  class UnitySettings ()
    extends typings.unityWebapi.UnitySettings
  
  @JSGlobal("UnityTrackMetadata")
  @js.native
  class UnityTrackMetadata ()
    extends typings.unityWebapi.UnityTrackMetadata
}
