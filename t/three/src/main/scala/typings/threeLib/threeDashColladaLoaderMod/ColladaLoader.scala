package typings
package threeLib.threeDashColladaLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-colladaLoader", "ColladaLoader")
@js.native
class ColladaLoader () extends js.Object {
  def load(url: java.lang.String, onLoad: js.Function1[/* model */ ColladaModel, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* model */ ColladaModel, scala.Unit],
    onProgress: js.Function1[/* request */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* model */ ColladaModel, scala.Unit],
    onProgress: js.Function1[/* request */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(text: java.lang.String): ColladaModel = js.native
  def setCrossOrigin(value: js.Any): scala.Unit = js.native
}

