package typings.three.srcLoadersCubeTextureLoaderMod

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import typings.three.srcTexturesCubeTextureMod.CubeTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/CubeTextureLoader", "CubeTextureLoader")
@js.native
class CubeTextureLoader () extends Loader {
  def this(manager: LoadingManager) = this()
  def load(urls: js.Array[String]): CubeTexture = js.native
  def load(urls: js.Array[String], onLoad: js.Function1[/* texture */ CubeTexture, Unit]): CubeTexture = js.native
  def load(
    urls: js.Array[String],
    onLoad: js.Function1[/* texture */ CubeTexture, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
  ): CubeTexture = js.native
  def load(
    urls: js.Array[String],
    onLoad: js.Function1[/* texture */ CubeTexture, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): CubeTexture = js.native
}

