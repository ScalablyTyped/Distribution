package typings.three.srcLoadersTextureLoaderMod

import typings.std.ErrorEvent
import typings.std.ProgressEvent
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import typings.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/TextureLoader", "TextureLoader")
@js.native
class TextureLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var crossOrigin: String = js.native
  var manager: LoadingManager = js.native
  var path: String = js.native
  var withCredentials: String = js.native
  /**
  	 * Begin loading from url
  	 *
  	 * @param url
  	 */
  def load(url: String): Texture = js.native
  def load(url: String, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit]
  ): Texture = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* texture */ Texture, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): Texture = js.native
  def setCrossOrigin(crossOrigin: String): TextureLoader = js.native
  def setPath(path: String): TextureLoader = js.native
  def setWithCredentials(value: String): TextureLoader = js.native
}

