package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/loaders/TextureLoader", JSImport.Namespace)
@js.native
object textureLoaderMod extends js.Object {
  @js.native
  class TextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): Texture = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Texture = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Texture = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Texture = js.native
    def load(url: String, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Texture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Texture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Texture = js.native
  }
  
}

