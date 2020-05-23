package typings.unityWebapi

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class UnityIndicatorProperties ()
    extends typings.unityWebapi.UnityIndicatorProperties {
    /* CompleteClass */
    override var count: Double = js.native
    /* CompleteClass */
    override var iconURI: String = js.native
    /* CompleteClass */
    override var onIndicatorActivated: js.Function = js.native
    /* CompleteClass */
    override var time: Date = js.native
  }
  
  @js.native
  class UnitySettings ()
    extends typings.unityWebapi.UnitySettings {
    /* CompleteClass */
    override var iconUrl: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var onInit: js.Function = js.native
  }
  
  @js.native
  class UnityTrackMetadata ()
    extends typings.unityWebapi.UnityTrackMetadata {
    // Optionals
    /* CompleteClass */
    override var album: String = js.native
    /* CompleteClass */
    override var artLocation: String = js.native
    /* CompleteClass */
    override var artist: String = js.native
    /* CompleteClass */
    override var title: String = js.native
  }
  
  @js.native
  object UnityPlaybackState extends js.Object {
    /* 1 */ val Paused: typings.unityWebapi.UnityPlaybackState.Paused with Double = js.native
    /* 0 */ val Playing: typings.unityWebapi.UnityPlaybackState.Playing with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.unityWebapi.UnityPlaybackState with Double] = js.native
  }
  
}

