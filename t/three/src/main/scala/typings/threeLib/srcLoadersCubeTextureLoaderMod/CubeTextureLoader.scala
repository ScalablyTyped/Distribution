package typings
package threeLib.srcLoadersCubeTextureLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/CubeTextureLoader", "CubeTextureLoader")
@js.native
class CubeTextureLoader () extends js.Object {
  def this(manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager) = this()
  var crossOrigin: java.lang.String = js.native
  var manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  def load(urls: js.Array[java.lang.String]): threeLib.srcTexturesCubeTextureMod.CubeTexture = js.native
  def load(
    urls: js.Array[java.lang.String],
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesCubeTextureMod.CubeTexture, scala.Unit]
  ): threeLib.srcTexturesCubeTextureMod.CubeTexture = js.native
  def load(
    urls: js.Array[java.lang.String],
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesCubeTextureMod.CubeTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): threeLib.srcTexturesCubeTextureMod.CubeTexture = js.native
  def load(
    urls: js.Array[java.lang.String],
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesCubeTextureMod.CubeTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): threeLib.srcTexturesCubeTextureMod.CubeTexture = js.native
  def setCrossOrigin(crossOrigin: java.lang.String): this.type = js.native
  def setPath(path: java.lang.String): this.type = js.native
}

