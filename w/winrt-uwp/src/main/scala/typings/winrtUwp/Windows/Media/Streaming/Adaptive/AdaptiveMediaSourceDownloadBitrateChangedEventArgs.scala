package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DownloadBitrateChanged event. */
@js.native
trait AdaptiveMediaSourceDownloadBitrateChangedEventArgs extends StObject {
  
  /** Gets a value indicating the new download bitrate for the media source. */
  var newValue: Double = js.native
  
  /** Gets a value indicating the previous download bitrate for the media source. */
  var oldValue: Double = js.native
}
object AdaptiveMediaSourceDownloadBitrateChangedEventArgs {
  
  @scala.inline
  def apply(newValue: Double, oldValue: Double): AdaptiveMediaSourceDownloadBitrateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadBitrateChangedEventArgs]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourceDownloadBitrateChangedEventArgsMutableBuilder[Self <: AdaptiveMediaSourceDownloadBitrateChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
