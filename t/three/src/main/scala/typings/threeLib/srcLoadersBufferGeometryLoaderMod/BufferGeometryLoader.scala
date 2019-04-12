package typings
package threeLib.srcLoadersBufferGeometryLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/BufferGeometryLoader", "BufferGeometryLoader")
@js.native
class BufferGeometryLoader () extends js.Object {
  def this(manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager) = this()
  var manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* bufferGeometry */ threeLib.srcCoreBufferGeometryMod.BufferGeometry, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* bufferGeometry */ threeLib.srcCoreBufferGeometryMod.BufferGeometry, scala.Unit],
    onProgress: js.Function1[/* event */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* bufferGeometry */ threeLib.srcCoreBufferGeometryMod.BufferGeometry, scala.Unit],
    onProgress: js.Function1[/* event */ js.Any, scala.Unit],
    onError: js.Function1[/* event */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def parse(json: js.Any): threeLib.srcCoreBufferGeometryMod.BufferGeometry = js.native
}

