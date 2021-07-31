package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackSettings extends StObject {
  
  //width: number;
  //height: number;
  //aspectRatio: number;
  //frameRate: number;
  //facingMode: string;
  //volume: number;
  //sampleRate: number;
  //sampleSize: number;
  //echoCancellation: boolean;
  var latency: js.UndefOr[Double] = js.undefined
}
object MediaTrackSettings {
  
  @scala.inline
  def apply(): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSettings]
  }
  
  @scala.inline
  implicit class MediaTrackSettingsMutableBuilder[Self <: MediaTrackSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
  }
}
