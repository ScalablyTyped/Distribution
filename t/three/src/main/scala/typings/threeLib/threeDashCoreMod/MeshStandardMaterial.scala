package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "MeshStandardMaterial")
@js.native
class MeshStandardMaterial () extends Material {
  def this(parameters: MeshStandardMaterialParameters) = this()
  var alphaMap: Texture | scala.Null = js.native
  var aoMap: Texture | scala.Null = js.native
  var aoMapIntensity: scala.Double = js.native
  var bumpMap: Texture | scala.Null = js.native
  var bumpScale: scala.Double = js.native
  var color: Color = js.native
  var defines: js.Any = js.native
  var displacementBias: scala.Double = js.native
  var displacementMap: Texture | scala.Null = js.native
  var displacementScale: scala.Double = js.native
  var emissive: Color = js.native
  var emissiveIntensity: scala.Double = js.native
  var emissiveMap: Texture | scala.Null = js.native
  var envMap: Texture | scala.Null = js.native
  var envMapIntensity: scala.Double = js.native
  var lightMap: Texture | scala.Null = js.native
  var lightMapIntensity: scala.Double = js.native
  var map: Texture | scala.Null = js.native
  var metalness: scala.Double = js.native
  var metalnessMap: Texture | scala.Null = js.native
  var morphNormals: scala.Boolean = js.native
  var morphTargets: scala.Boolean = js.native
  var normalMap: Texture | scala.Null = js.native
  var normalScale: scala.Double = js.native
  var refractionRatio: scala.Double = js.native
  var roughness: scala.Double = js.native
  var roughnessMap: Texture | scala.Null = js.native
  var skinning: scala.Boolean = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshStandardMaterialParameters): scala.Unit = js.native
}

