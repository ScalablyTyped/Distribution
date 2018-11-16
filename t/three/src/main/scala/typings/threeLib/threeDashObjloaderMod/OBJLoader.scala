package typings
package threeLib.threeDashObjloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-objloader", "OBJLoader")
@js.native
class OBJLoader () extends js.Object {
  def this(manager: threeLib.threeDashCoreMod.LoadingManager) = this()
  var manager: threeLib.threeDashCoreMod.LoadingManager = js.native
  var materials: js.Array[threeLib.threeDashCoreMod.Material] = js.native
  var path: java.lang.String = js.native
  var regexp: js.Any = js.native
  def _createParserState(): js.Any = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* group */ threeLib.threeDashCoreMod.Group, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* group */ threeLib.threeDashCoreMod.Group, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* group */ threeLib.threeDashCoreMod.Group, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(data: java.lang.String): threeLib.threeDashCoreMod.Group = js.native
  def setMaterials(materials: threeLib.threeDashMtlloaderMod.MaterialCreator): scala.Unit = js.native
  def setPath(value: java.lang.String): scala.Unit = js.native
}

