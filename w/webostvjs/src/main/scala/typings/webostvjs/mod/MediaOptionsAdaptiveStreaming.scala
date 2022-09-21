package typings.webostvjs.mod

import typings.webostvjs.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaOptionsAdaptiveStreaming extends StObject {
  
  /**
    * The flag that indicates whether screen ratio can be changed by network status. The default value is false.
    * - true: changeable
    * - false: unchangeable
    */
  var apativeResolution: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The flag that indicates streaming mode.
    * This property can be used when transmitting the audio-only streaming
    * (such as music service or radio service) with HLS protocol. The default value is false.
    * - true: audio only
    * - false: video/audio
    */
  var audioOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The object that holds information to control network transmit speed.
    */
  var bps: js.UndefOr[Start] = js.undefined
  
  /**
    * Maximum screen height of the content. The default value is 1080.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum screen width of the content. The default value is 1920.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Flag whether content supports seamless play. The default value is false.
    * - true: support seamless play
    * - false: not support
    */
  var seamlessPlay: js.UndefOr[Boolean] = js.undefined
}
object MediaOptionsAdaptiveStreaming {
  
  inline def apply(): MediaOptionsAdaptiveStreaming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaOptionsAdaptiveStreaming]
  }
  
  extension [Self <: MediaOptionsAdaptiveStreaming](x: Self) {
    
    inline def setApativeResolution(value: Boolean): Self = StObject.set(x, "apativeResolution", value.asInstanceOf[js.Any])
    
    inline def setApativeResolutionUndefined: Self = StObject.set(x, "apativeResolution", js.undefined)
    
    inline def setAudioOnly(value: Boolean): Self = StObject.set(x, "audioOnly", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyUndefined: Self = StObject.set(x, "audioOnly", js.undefined)
    
    inline def setBps(value: Start): Self = StObject.set(x, "bps", value.asInstanceOf[js.Any])
    
    inline def setBpsUndefined: Self = StObject.set(x, "bps", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setSeamlessPlay(value: Boolean): Self = StObject.set(x, "seamlessPlay", value.asInstanceOf[js.Any])
    
    inline def setSeamlessPlayUndefined: Self = StObject.set(x, "seamlessPlay", js.undefined)
  }
}
