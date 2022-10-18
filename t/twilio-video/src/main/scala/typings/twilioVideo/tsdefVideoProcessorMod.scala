package typings.twilioVideo

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefVideoProcessorMod {
  
  @JSImport("twilio-video/tsdef/VideoProcessor", "VideoProcessor")
  @js.native
  open class VideoProcessor () extends StObject {
    
    def processFrame(
      inputFrameBuffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OffscreenCanvas */ Any,
      outputFrameBuffer: HTMLCanvasElement
    ): js.Promise[Unit] | Unit = js.native
  }
}
