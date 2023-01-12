package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentNameMap extends StObject {
  
  var liveDisplay: LiveDisplay
  
  var playbackRateMenuButton: PlaybackRateMenuButton
  
  var progressControl: ProgressControl
  
  var remainingTimeDisplay: RemainingTimeDisplay
}
object ComponentNameMap {
  
  inline def apply(
    liveDisplay: LiveDisplay,
    playbackRateMenuButton: PlaybackRateMenuButton,
    progressControl: ProgressControl,
    remainingTimeDisplay: RemainingTimeDisplay
  ): ComponentNameMap = {
    val __obj = js.Dynamic.literal(liveDisplay = liveDisplay.asInstanceOf[js.Any], playbackRateMenuButton = playbackRateMenuButton.asInstanceOf[js.Any], progressControl = progressControl.asInstanceOf[js.Any], remainingTimeDisplay = remainingTimeDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentNameMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentNameMap] (val x: Self) extends AnyVal {
    
    inline def setLiveDisplay(value: LiveDisplay): Self = StObject.set(x, "liveDisplay", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRateMenuButton(value: PlaybackRateMenuButton): Self = StObject.set(x, "playbackRateMenuButton", value.asInstanceOf[js.Any])
    
    inline def setProgressControl(value: ProgressControl): Self = StObject.set(x, "progressControl", value.asInstanceOf[js.Any])
    
    inline def setRemainingTimeDisplay(value: RemainingTimeDisplay): Self = StObject.set(x, "remainingTimeDisplay", value.asInstanceOf[js.Any])
  }
}
