package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "MaterialLoader")
@js.native
class MaterialLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  var textures: ScalablyTyped.runtime.StringDictionary[Texture] = js.native
  def getTexture(name: java.lang.String): Texture = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* material */ Material, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* material */ Material, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* material */ Material, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.Error | stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(json: js.Any): Material = js.native
  def setTextures(textures: ScalablyTyped.runtime.StringDictionary[Texture]): scala.Unit = js.native
}

