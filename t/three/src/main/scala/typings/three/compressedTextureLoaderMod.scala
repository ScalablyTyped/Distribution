package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.compressedTextureMod.CompressedTexture
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/CompressedTextureLoader", JSImport.Namespace)
@js.native
object compressedTextureLoaderMod extends js.Object {
  @js.native
  class CompressedTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String, onLoad: js.Function1[/* texture */ CompressedTexture, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
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
  }
  
}

