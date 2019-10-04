package typings.three.srcLoadersBufferGeometryLoaderMod

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/BufferGeometryLoader", "BufferGeometryLoader")
@js.native
class BufferGeometryLoader () extends Loader {
  def this(manager: LoadingManager) = this()
  def load(url: String, onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit]): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit],
    onProgress: js.Function1[/* event */ js.Any, Unit]
  ): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit],
    onProgress: js.Function1[/* event */ js.Any, Unit],
    onError: js.Function1[/* event */ js.Any, Unit]
  ): Unit = js.native
  def parse(json: js.Any): BufferGeometry = js.native
}

