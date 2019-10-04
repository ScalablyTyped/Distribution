package typings.three.srcLoadersTextureLoaderMod

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import typings.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/TextureLoader", "TextureLoader")
@js.native
class TextureLoader () extends Loader {
  def this(manager: LoadingManager) = this()
  def load(url: String): Texture = js.native
  def load(url: String, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
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

