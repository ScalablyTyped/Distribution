package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "CompressedTextureLoader")
@js.native
class CompressedTextureLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  var path: java.lang.String = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* texture */ CompressedTexture, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* texture */ CompressedTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* texture */ CompressedTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def setPath(path: java.lang.String): CompressedTextureLoader = js.native
}

