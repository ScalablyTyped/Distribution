package typings.three.shaderMaterialMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.AnonDrawBuffers
import typings.three.materialMod.Material
import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/ShaderMaterial", "ShaderMaterial")
@js.native
class ShaderMaterial () extends Material {
  def this(parameters: ShaderMaterialParameters) = this()
  var clipping: Boolean = js.native
  var defaultAttributeValues: js.Any = js.native
  /**
  	 * @deprecated Use {@link ShaderMaterial#extensions.derivatives extensions.derivatives} instead.
  	 */
  var derivatives: js.Any = js.native
  var extensions: AnonDrawBuffers = js.native
  var fragmentShader: String = js.native
  var index0AttributeName: js.UndefOr[String] = js.native
  var lights: Boolean = js.native
  var linewidth: Double = js.native
  var morphNormals: Boolean = js.native
  var morphTargets: Boolean = js.native
  var skinning: Boolean = js.native
  var uniforms: StringDictionary[IUniform] = js.native
  var uniformsNeedUpdate: Boolean = js.native
  var vertexShader: String = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  def setValues(parameters: ShaderMaterialParameters): Unit = js.native
}

