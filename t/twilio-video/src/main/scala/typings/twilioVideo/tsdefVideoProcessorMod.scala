package typings.twilioVideo

import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefVideoProcessorMod {
  
  @JSImport("twilio-video/tsdef/VideoProcessor", "VideoProcessor")
  @js.native
  open class VideoProcessor () extends StObject {
    
    def processFrame(inputFrameBuffer: HTMLCanvasElement, outputFrameBuffer: HTMLCanvasElement): js.Promise[Unit] | Unit = js.native
    def processFrame(inputFrameBuffer: HTMLVideoElement, outputFrameBuffer: HTMLCanvasElement): js.Promise[Unit] | Unit = js.native
    def processFrame(inputFrameBuffer: OffscreenCanvas, outputFrameBuffer: HTMLCanvasElement): js.Promise[Unit] | Unit = js.native
  }
}
