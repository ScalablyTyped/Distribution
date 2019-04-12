package typings
package threeLib.srcLoadersMaterialLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/MaterialLoader", "MaterialLoader")
@js.native
class MaterialLoader () extends js.Object {
  def this(manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager) = this()
  var manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  var textures: org.scalablytyped.runtime.StringDictionary[threeLib.srcTexturesTextureMod.Texture] = js.native
  def getTexture(name: java.lang.String): threeLib.srcTexturesTextureMod.Texture = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* material */ threeLib.srcMaterialsMaterialMod.Material, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* material */ threeLib.srcMaterialsMaterialMod.Material, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* material */ threeLib.srcMaterialsMaterialMod.Material, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.Error | stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(json: js.Any): threeLib.srcMaterialsMaterialMod.Material = js.native
  def setTextures(textures: org.scalablytyped.runtime.StringDictionary[threeLib.srcTexturesTextureMod.Texture]): scala.Unit = js.native
}

