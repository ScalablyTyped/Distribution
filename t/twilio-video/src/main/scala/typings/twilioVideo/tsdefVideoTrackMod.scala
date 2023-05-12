package typings.twilioVideo

import typings.std.MediaStreamTrack
import typings.twilioVideo.tsdefMediaTrackMod.MediaTrack
import typings.twilioVideo.tsdefTypesMod.AddProcessorOptions
import typings.twilioVideo.tsdefVideoProcessorMod.VideoProcessor
import typings.twilioVideo.tsdefVideoTrackMod.VideoTrack.Dimensions
import typings.twilioVideo.twilioVideoStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefVideoTrackMod {
  
  @JSImport("twilio-video/tsdef/VideoTrack", "VideoTrack")
  @js.native
  open class VideoTrack () extends MediaTrack {
    
    def addProcessor(processor: VideoProcessor): this.type = js.native
    def addProcessor(processor: VideoProcessor, options: AddProcessorOptions): this.type = js.native
    
    var dimensions: Dimensions = js.native
    
    @JSName("kind")
    var kind_VideoTrack: video = js.native
    
    var processedTrack: MediaStreamTrack | Null = js.native
    
    var processor: VideoProcessor | Null = js.native
    
    def removeProcessor(processor: VideoProcessor): this.type = js.native
  }
  object VideoTrack {
    
    trait Dimensions extends StObject {
      
      var height: Double | Null
      
      var width: Double | Null
    }
    object Dimensions {
      
      inline def apply(): Dimensions = {
        val __obj = js.Dynamic.literal(height = null, width = null)
        __obj.asInstanceOf[Dimensions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightNull: Self = StObject.set(x, "height", null)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthNull: Self = StObject.set(x, "width", null)
      }
    }
  }
}
