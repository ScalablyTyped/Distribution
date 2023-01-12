package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerPlaybackInfoChangeCallback extends StObject {
  
  /**
    * Called when playback metadata is changed.
    *
    * @param metadata Current playback metadata.
    */
  def onmetadatachanged(metadata: MediaControllerMetadata): Unit
  
  /**
    * Called when playback state or position is changed.
    *
    * @param state Current playback state.
    * @param position Current playback position.
    */
  def onplaybackchanged(state: MediaControllerPlaybackState, position: Double): Unit
  
  /**
    * Called when repeat mode is changed.
    *
    * @note _deprecated_ 5.5 Deprecated since 5.5. Instead, use [onrepeatstatechanged](#MediaControllerPlaybackInfoChangeCallback::onrepeatstatechanged).
    *
    * @param mode Current repeat mode.
    *
    * @remark The [onrepeatmodechanged](#MediaControllerPlaybackInfoChangeCallback::onrepeatmodechanged) callback
    * will not be invoked, if the [repeatState](#MediaControllerPlaybackInfo::repeatState) is changed to REPEAT\_ONE.
    */
  def onrepeatmodechanged(mode: Boolean): Unit
  
  /**
    * Called when repeat state is changed.
    *
    * It is guaranteed that the [onrepeatstatechanged](#MediaControllerPlaybackInfoChangeCallback::onrepeatstatechanged) callback
    * will be invoked after the [onrepeatmodechanged](#MediaControllerPlaybackInfoChangeCallback::onrepeatmodechanged).
    *
    * @since 5.5
    *
    * @param state Current repeat state.
    */
  def onrepeatstatechanged(state: MediaControllerRepeatState): Unit
  
  /**
    * Called when shuffle mode is changed.
    *
    * @param mode Current shuffle mode.
    */
  def onshufflemodechanged(mode: Boolean): Unit
}
object MediaControllerPlaybackInfoChangeCallback {
  
  inline def apply(
    onmetadatachanged: MediaControllerMetadata => Unit,
    onplaybackchanged: (MediaControllerPlaybackState, Double) => Unit,
    onrepeatmodechanged: Boolean => Unit,
    onrepeatstatechanged: MediaControllerRepeatState => Unit,
    onshufflemodechanged: Boolean => Unit
  ): MediaControllerPlaybackInfoChangeCallback = {
    val __obj = js.Dynamic.literal(onmetadatachanged = js.Any.fromFunction1(onmetadatachanged), onplaybackchanged = js.Any.fromFunction2(onplaybackchanged), onrepeatmodechanged = js.Any.fromFunction1(onrepeatmodechanged), onrepeatstatechanged = js.Any.fromFunction1(onrepeatstatechanged), onshufflemodechanged = js.Any.fromFunction1(onshufflemodechanged))
    __obj.asInstanceOf[MediaControllerPlaybackInfoChangeCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerPlaybackInfoChangeCallback] (val x: Self) extends AnyVal {
    
    inline def setOnmetadatachanged(value: MediaControllerMetadata => Unit): Self = StObject.set(x, "onmetadatachanged", js.Any.fromFunction1(value))
    
    inline def setOnplaybackchanged(value: (MediaControllerPlaybackState, Double) => Unit): Self = StObject.set(x, "onplaybackchanged", js.Any.fromFunction2(value))
    
    inline def setOnrepeatmodechanged(value: Boolean => Unit): Self = StObject.set(x, "onrepeatmodechanged", js.Any.fromFunction1(value))
    
    inline def setOnrepeatstatechanged(value: MediaControllerRepeatState => Unit): Self = StObject.set(x, "onrepeatstatechanged", js.Any.fromFunction1(value))
    
    inline def setOnshufflemodechanged(value: Boolean => Unit): Self = StObject.set(x, "onshufflemodechanged", js.Any.fromFunction1(value))
  }
}
