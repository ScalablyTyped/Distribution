package typings
package threeLib.threeDashMtlloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-mtlloader", "MaterialCreator")
@js.native
class MaterialCreator () extends js.Object {
  def this(baseUrl: java.lang.String) = this()
  def this(baseUrl: java.lang.String, options: js.Any) = this()
  var baseUrl: java.lang.String = js.native
  var materials: js.Any = js.native
  var materialsArray: js.Array[threeLib.threeDashCoreMod.Material] = js.native
  var materialsInfo: js.Any = js.native
  var nameLookup: js.Any = js.native
  var options: js.Any = js.native
  var side: scala.Double = js.native
  var wrap: scala.Double = js.native
  def convert(materialsInfo: js.Any): js.Any = js.native
  def create(materialName: java.lang.String): threeLib.threeDashCoreMod.Material = js.native
  def `createMaterial_`(materialName: java.lang.String): threeLib.threeDashCoreMod.Material = js.native
  def getAsArray(): js.Array[threeLib.threeDashCoreMod.Material] = js.native
  def getIndex(materialName: java.lang.String): threeLib.threeDashCoreMod.Material = js.native
  def getTextureParams(value: java.lang.String, matParams: js.Any): js.Any = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: js.Any,
    onLoad: js.Function1[/* bufferGeometry */ threeLib.threeDashCoreMod.BufferGeometry, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: js.Any,
    onLoad: js.Function1[/* bufferGeometry */ threeLib.threeDashCoreMod.BufferGeometry, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: js.Any,
    onLoad: js.Function1[/* bufferGeometry */ threeLib.threeDashCoreMod.BufferGeometry, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def preload(): scala.Unit = js.native
  def setCrossOrigin(value: scala.Boolean): scala.Unit = js.native
  def setManager(value: js.Any): scala.Unit = js.native
  def setMaterials(materialsInfo: js.Any): scala.Unit = js.native
}

