package typings.unityWebapi

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("UnityIndicatorProperties")
  @js.native
  class UnityIndicatorProperties ()
    extends StObject
       with typings.unityWebapi.UnityIndicatorProperties {
    
    /* CompleteClass */
    var count: Double = js.native
    
    /* CompleteClass */
    var iconURI: String = js.native
    
    /* CompleteClass */
    var onIndicatorActivated: js.Function = js.native
    
    /* CompleteClass */
    var time: Date = js.native
  }
  
  @JSGlobal("UnityPlaybackState")
  @js.native
  object UnityPlaybackState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.unityWebapi.UnityPlaybackState & Double] = js.native
    
    /* 1 */ val Paused: typings.unityWebapi.UnityPlaybackState.Paused & Double = js.native
    
    /* 0 */ val Playing: typings.unityWebapi.UnityPlaybackState.Playing & Double = js.native
  }
  
  @JSGlobal("UnitySettings")
  @js.native
  class UnitySettings ()
    extends StObject
       with typings.unityWebapi.UnitySettings {
    
    /* CompleteClass */
    var iconUrl: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var onInit: js.Function = js.native
  }
  
  @JSGlobal("UnityTrackMetadata")
  @js.native
  class UnityTrackMetadata ()
    extends StObject
       with typings.unityWebapi.UnityTrackMetadata {
    
    // Optionals
    /* CompleteClass */
    var album: String = js.native
    
    /* CompleteClass */
    var artLocation: String = js.native
    
    /* CompleteClass */
    var artist: String = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
}
