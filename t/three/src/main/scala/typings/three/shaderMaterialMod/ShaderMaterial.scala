package typings.three.shaderMaterialMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.DrawBuffers
import typings.three.constantsMod.GLSLVersion
import typings.three.materialMod.Material
import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/ShaderMaterial", "ShaderMaterial")
@js.native
class ShaderMaterial () extends Material {
  def this(parameters: ShaderMaterialParameters) = this()
  
  /**
  	 * @default false
  	 */
  var clipping: Boolean = js.native
  
  /**
  	 * @default { 'color': [ 1, 1, 1 ], 'uv': [ 0, 0 ], 'uv2': [ 0, 0 ] }
  	 */
  var defaultAttributeValues: js.Any = js.native
  
  /**
  	 * @default {}
  	 */
  @JSName("defines")
  var defines_ShaderMaterial: StringDictionary[js.Any] = js.native
  
  /**
  	 * @deprecated Use {@link ShaderMaterial#extensions.derivatives extensions.derivatives} instead.
  	 */
  var derivatives: js.Any = js.native
  
  /**
  	 * @default { derivatives: false, fragDepth: false, drawBuffers: false, shaderTextureLOD: false }
  	 */
  var extensions: DrawBuffers = js.native
  
  var fragmentShader: String = js.native
  
  /**
  	 * @default null
  	 */
  var glslVersion: GLSLVersion | Null = js.native
  
  /**
  	 * @default undefined
  	 */
  var index0AttributeName: js.UndefOr[String] = js.native
  
  /**
  	 * @default false
  	 */
  var lights: Boolean = js.native
  
  /**
  	 * @default 1
  	 */
  var linewidth: Double = js.native
  
  /**
  	 * @default false
  	 */
  var morphNormals: Boolean = js.native
  
  /**
  	 * @default false
  	 */
  var morphTargets: Boolean = js.native
  
  def setValues(parameters: ShaderMaterialParameters): Unit = js.native
  
  /**
  	 * @default false
  	 */
  var skinning: Boolean = js.native
  
  /**
  	 * @default {}
  	 */
  var uniforms: StringDictionary[IUniform] = js.native
  
  /**
  	 * @default false
  	 */
  var uniformsNeedUpdate: Boolean = js.native
  
  var vertexShader: String = js.native
  
  /**
  	 * @default false
  	 */
  var wireframe: Boolean = js.native
  
  /**
  	 * @default 1
  	 */
  var wireframeLinewidth: Double = js.native
}
