package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "BufferGeometryLoader")
@js.native
class BufferGeometryLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, scala.Unit],
    onProgress: js.Function1[/* event */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, scala.Unit],
    onProgress: js.Function1[/* event */ js.Any, scala.Unit],
    onError: js.Function1[/* event */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def parse(json: js.Any): BufferGeometry = js.native
}

