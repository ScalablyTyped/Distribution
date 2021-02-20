package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.std.HTMLMediaElement
import typings.std.HTMLVideoElement
import typings.std.MediaStreamTrack
import typings.twilioVideo.mod.VideoTrack.Dimensions
import typings.twilioVideo.twilioVideoStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "VideoTrack")
@js.native
class VideoTrack () extends Track {
  def this(options: EventEmitterOptions) = this()
  
  // Required for Safari if you want to detach without errors
  // See: https://github.com/twilio/twilio-video.js/issues/294#issuecomment-389708981
  var _attachments: js.UndefOr[js.Array[HTMLMediaElement]] = js.native
  
  def attach(): HTMLVideoElement = js.native
  def attach(element: String): HTMLVideoElement = js.native
  def attach(element: HTMLMediaElement): HTMLVideoElement = js.native
  
  def detach(): js.Array[HTMLMediaElement] = js.native
  def detach(element: String): js.Array[HTMLMediaElement] = js.native
  def detach(element: HTMLMediaElement): js.Array[HTMLMediaElement] = js.native
  
  var dimensions: Dimensions = js.native
  
  var isEnabled: Boolean = js.native
  
  var isStarted: Boolean = js.native
  
  @JSName("kind")
  var kind_VideoTrack: video = js.native
  
  var mediaStreamTrack: MediaStreamTrack = js.native
}
object VideoTrack {
  
  @js.native
  trait Dimensions extends StObject {
    
    var height: Double | Null = js.native
    
    var width: Double | Null = js.native
  }
  object Dimensions {
    
    @scala.inline
    def apply(): Dimensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightNull: Self = StObject.set(x, "height", null)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthNull: Self = StObject.set(x, "width", null)
    }
  }
}
