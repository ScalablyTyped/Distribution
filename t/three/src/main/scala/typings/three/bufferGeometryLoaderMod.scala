package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/BufferGeometryLoader", JSImport.Namespace)
@js.native
object bufferGeometryLoaderMod extends js.Object {
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
  
}

