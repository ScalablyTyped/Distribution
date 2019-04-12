package typings
package threeLib.srcLoadersDataTextureLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/DataTextureLoader", "DataTextureLoader")
@js.native
class DataTextureLoader () extends js.Object {
  def this(manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager) = this()
  var manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* dataTexture */ threeLib.srcTexturesDataTextureMod.DataTexture, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* dataTexture */ threeLib.srcTexturesDataTextureMod.DataTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* dataTexture */ threeLib.srcTexturesDataTextureMod.DataTexture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
}

