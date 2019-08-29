package typings.three.srcLoadersCubeTextureLoaderMod

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import typings.three.srcTexturesCubeTextureMod.CubeTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/CubeTextureLoader", "CubeTextureLoader")
@js.native
class CubeTextureLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var crossOrigin: String = js.native
  var manager: LoadingManager = js.native
  var path: js.UndefOr[String] = js.native
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
  def setCrossOrigin(crossOrigin: String): this.type = js.native
  def setPath(path: String): this.type = js.native
}

