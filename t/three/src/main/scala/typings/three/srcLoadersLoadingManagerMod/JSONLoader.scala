package typings.three.srcLoadersLoadingManagerMod

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.Anon_Geometry
import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcMaterialsMaterialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/LoadingManager", "JSONLoader")
@js.native
class JSONLoader () extends Loader {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  var withCredentials: Boolean = js.native
  def load(url: String): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function2[/* geometry */ Geometry, /* materials */ js.Array[Material], Unit]
  ): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function2[/* geometry */ Geometry, /* materials */ js.Array[Material], Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
  ): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function2[/* geometry */ Geometry, /* materials */ js.Array[Material], Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): Unit = js.native
  def parse(json: js.Any): Anon_Geometry = js.native
  def parse(json: js.Any, texturePath: String): Anon_Geometry = js.native
  def setTexturePath(value: String): Unit = js.native
}

