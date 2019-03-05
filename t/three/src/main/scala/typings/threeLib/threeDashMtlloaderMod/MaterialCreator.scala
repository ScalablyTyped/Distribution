package typings
package threeLib.threeDashMtlloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-mtlloader", "MaterialCreator")
@js.native
class MaterialCreator () extends js.Object {
  def this(baseUrl: java.lang.String) = this()
  def this(baseUrl: java.lang.String, options: MaterialCreatorOptions) = this()
  var baseUrl: java.lang.String = js.native
  var materials: org.scalablytyped.runtime.StringDictionary[threeLib.threeDashCoreMod.Material] = js.native
  var materialsArray: js.Array[threeLib.threeDashCoreMod.Material] = js.native
  var materialsInfo: org.scalablytyped.runtime.StringDictionary[MaterialInfo] = js.native
  var nameLookup: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  var options: MaterialCreatorOptions = js.native
  var side: threeLib.threeDashCoreMod.Side = js.native
  var wrap: threeLib.threeDashCoreMod.Wrapping = js.native
  def convert(materialsInfo: org.scalablytyped.runtime.StringDictionary[MaterialInfo]): org.scalablytyped.runtime.StringDictionary[MaterialInfo] = js.native
  def create(materialName: java.lang.String): threeLib.threeDashCoreMod.Material = js.native
  def createMaterial_(materialName: java.lang.String): threeLib.threeDashCoreMod.Material = js.native
  def getAsArray(): js.Array[threeLib.threeDashCoreMod.Material] = js.native
  def getIndex(materialName: java.lang.String): threeLib.threeDashCoreMod.Material = js.native
  def getTextureParams(value: java.lang.String, matParams: js.Any): TexParams = js.native
  def loadTexture(url: java.lang.String): threeLib.threeDashCoreMod.Texture = js.native
  def loadTexture(url: java.lang.String, mapping: threeLib.threeDashCoreMod.Mapping): threeLib.threeDashCoreMod.Texture = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: threeLib.threeDashCoreMod.Mapping,
    onLoad: js.Function1[/* bufferGeometry */ threeLib.threeDashCoreMod.BufferGeometry, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: threeLib.threeDashCoreMod.Mapping,
    onLoad: js.Function1[/* bufferGeometry */ threeLib.threeDashCoreMod.BufferGeometry, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: threeLib.threeDashCoreMod.Mapping,
    onLoad: js.Function1[/* bufferGeometry */ threeLib.threeDashCoreMod.BufferGeometry, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def preload(): scala.Unit = js.native
  def setCrossOrigin(value: scala.Boolean): scala.Unit = js.native
  def setManager(value: threeLib.threeDashCoreMod.LoadingManager): scala.Unit = js.native
  def setMaterials(materialsInfo: org.scalablytyped.runtime.StringDictionary[MaterialInfo]): scala.Unit = js.native
}

