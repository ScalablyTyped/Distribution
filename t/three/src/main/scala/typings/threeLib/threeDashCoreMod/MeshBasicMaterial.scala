package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "MeshBasicMaterial")
@js.native
class MeshBasicMaterial () extends Material {
  def this(parameters: MeshBasicMaterialParameters) = this()
  var alphaMap: Texture | scala.Null = js.native
  var aoMap: Texture | scala.Null = js.native
  var aoMapIntensity: scala.Double = js.native
  var color: Color = js.native
  var combine: Combine = js.native
  var envMap: Texture | scala.Null = js.native
  var map: Texture | scala.Null = js.native
  var morphTargets: scala.Boolean = js.native
  var reflectivity: scala.Double = js.native
  var refractionRatio: scala.Double = js.native
  var skinning: scala.Boolean = js.native
  var specularMap: Texture | scala.Null = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinecap: java.lang.String = js.native
  var wireframeLinejoin: java.lang.String = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshBasicMaterialParameters): scala.Unit = js.native
}

