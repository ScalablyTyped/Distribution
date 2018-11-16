package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "CubeTextureLoader")
@js.native
class CubeTextureLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var crossOrigin: java.lang.String = js.native
  var manager: LoadingManager = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  def load(urls: js.Array[java.lang.String]): CubeTexture = js.native
  def load(urls: js.Array[java.lang.String], onLoad: js.Function1[/* texture */ CubeTexture, scala.Unit]): CubeTexture = js.native
  def load(
    urls: js.Array[java.lang.String],
    onLoad: js.Function1[/* texture */ CubeTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): CubeTexture = js.native
  def load(
    urls: js.Array[java.lang.String],
    onLoad: js.Function1[/* texture */ CubeTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): CubeTexture = js.native
  def setCrossOrigin(crossOrigin: java.lang.String): this.type = js.native
  def setPath(path: java.lang.String): this.type = js.native
}

