package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.anon.AstcSupported
import typings.three.srcThreeMod.CompressedTexture
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersBasisTextureLoaderMod {
  
  @JSImport("three/examples/jsm/loaders/BasisTextureLoader", "BasisTextureLoader")
  @js.native
  open class BasisTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def detectSupport(renderer: WebGLRenderer): this.type = js.native
    
    def dispose(): Unit = js.native
    
    def load(url: String, onLoad: js.Function1[/* texture */ CompressedTexture, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAsync(url: String): js.Promise[CompressedTexture] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[CompressedTexture] = js.native
    
    def setTranscoderPath(path: String): this.type = js.native
    
    def setWorkerLimit(workerLimit: Double): this.type = js.native
    
    var transcoderBinary: js.typedarray.ArrayBuffer | Null = js.native
    
    var transcoderPath: String = js.native
    
    var transcoderPending: js.Promise[Unit] | Null = js.native
    
    var workerConfig: AstcSupported = js.native
    
    var workerLimit: Double = js.native
    
    var workerNextTaskID: Double = js.native
    
    var workerPool: js.Array[js.Object] = js.native
    
    var workerSourceURL: String = js.native
  }
}
