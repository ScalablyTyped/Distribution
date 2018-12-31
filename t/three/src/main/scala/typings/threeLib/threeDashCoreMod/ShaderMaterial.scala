package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "ShaderMaterial")
@js.native
class ShaderMaterial () extends Material {
  def this(parameters: ShaderMaterialParameters) = this()
  var clipping: scala.Boolean = js.native
  var defaultAttributeValues: js.Any = js.native
  var defines: js.Any = js.native
  /**
    * @deprecated Use {@link ShaderMaterial#extensions.derivatives extensions.derivatives} instead.
    */
  var derivatives: js.Any = js.native
  var extensions: threeLib.Anon_ShaderTextureLOD = js.native
  var fragmentShader: java.lang.String = js.native
  var index0AttributeName: js.UndefOr[java.lang.String] = js.native
  var linewidth: scala.Double = js.native
  var morphNormals: scala.Boolean = js.native
  var morphTargets: scala.Boolean = js.native
  var skinning: scala.Boolean = js.native
  var uniforms: org.scalablytyped.runtime.StringDictionary[IUniform] = js.native
  var vertexShader: java.lang.String = js.native
  var wireframe: scala.Boolean = js.native
  var wireframeLinewidth: scala.Double = js.native
  def setValues(parameters: ShaderMaterialParameters): scala.Unit = js.native
}

