package typings
package threeLib.srcLoadersTextureLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/TextureLoader", "TextureLoader")
@js.native
class TextureLoader () extends js.Object {
  def this(manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager) = this()
  var crossOrigin: java.lang.String = js.native
  var manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  var path: java.lang.String = js.native
  var withCredentials: java.lang.String = js.native
  /**
    * Begin loading from url
    *
    * @param url
    */
  def load(url: java.lang.String): threeLib.srcTexturesTextureMod.Texture = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesTextureMod.Texture, scala.Unit]
  ): threeLib.srcTexturesTextureMod.Texture = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesTextureMod.Texture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): threeLib.srcTexturesTextureMod.Texture = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesTextureMod.Texture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): threeLib.srcTexturesTextureMod.Texture = js.native
  def setCrossOrigin(crossOrigin: java.lang.String): TextureLoader = js.native
  def setPath(path: java.lang.String): TextureLoader = js.native
  def setWithCredentials(value: java.lang.String): TextureLoader = js.native
}

