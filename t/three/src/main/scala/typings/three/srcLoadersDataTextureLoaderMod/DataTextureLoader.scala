package typings.three.srcLoadersDataTextureLoaderMod

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import typings.three.srcTexturesDataTextureMod.DataTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/DataTextureLoader", "DataTextureLoader")
@js.native
class DataTextureLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  def load(url: String, onLoad: js.Function1[/* dataTexture */ DataTexture, Unit]): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* dataTexture */ DataTexture, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
  ): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* dataTexture */ DataTexture, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): Unit = js.native
}

