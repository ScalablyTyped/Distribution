package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "MeshPhongMaterial")
@js.native
class MeshPhongMaterial () extends Material {
  def this(parameters: MeshPhongMaterialParameters) = this()
  var alphaMap: Texture | scala.Null = js.native
  var aoMap: Texture | scala.Null = js.native
  var aoMapIntensity: scala.Double = js.native
  var bumpMap: Texture | scala.Null = js.native
  var bumpScale: scala.Double = js.native
  var color: Color = js.native
  var combine: Combine = js.native
  var displacementBias: scala.Double = js.native
  var displacementMap: Texture | scala.Null = js.native
  var displacementScale: scala.Double = js.native
  var emissive: Color = js.native
  var emissiveIntensity: scala.Double = js.native
  var emissiveMap: Texture | scala.Null = js.native
  var envMap: Texture | scala.Null = js.native
  var lightMap: Texture | scala.Null = js.native
  var lightMapIntensity: scala.Double = js.native
  var map: Texture | scala.Null = js.native
  /**
    * @deprecated Use {@link MeshStandardMaterial THREE.MeshStandardMaterial} instead.
    */
  var metal: scala.Boolean = js.native
  var morphNormals: scala.Boolean = js.native
  var morphTargets: scala.Boolean = js.native
  var normalMap: Texture | scala.Null = js.native
  var normalScale: Vector2 = js.native
  var reflectivity: scala.Double = js.native
  var refractionRatio: scala.Double = js.native
  var shininess: scala.Double = js.native
  var skinning: scala.Boolean = js.native
  var specular: Color = js.native
  var specularMap: Texture | scala.Null = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinecap: java.lang.String = js.native
  var wireframeLinejoin: java.lang.String = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: MeshPhongMaterialParameters): scala.Unit = js.native
}

