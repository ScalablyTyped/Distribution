package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "DataTextureLoader")
@js.native
class DataTextureLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* dataTexture */ DataTexture, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* dataTexture */ DataTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* dataTexture */ DataTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
}

