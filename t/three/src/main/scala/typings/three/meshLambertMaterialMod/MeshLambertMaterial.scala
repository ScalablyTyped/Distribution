package typings.three.meshLambertMaterialMod

import typings.three.colorMod.Color
import typings.three.constantsMod.Combine
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshLambertMaterial", "MeshLambertMaterial")
@js.native
class MeshLambertMaterial () extends Material {
  def this(parameters: MeshLambertMaterialParameters) = this()
  
  /**
  	 * @default null
  	 */
  var alphaMap: Texture | Null = js.native
  
  /**
  	 * @default null
  	 */
  var aoMap: Texture | Null = js.native
  
  /**
  	 * @default 1
  	 */
  var aoMapIntensity: Double = js.native
  
  /**
  	 * @default new THREE.Color( 0xffffff )
  	 */
  var color: Color = js.native
  
  /**
  	 * @default THREE.MultiplyOperation
  	 */
  var combine: Combine = js.native
  
  /**
  	 * @default new THREE.Color( 0x000000 )
  	 */
  var emissive: Color = js.native
  
  /**
  	 * @default 1
  	 */
  var emissiveIntensity: Double = js.native
  
  /**
  	 * @default null
  	 */
  var emissiveMap: Texture | Null = js.native
  
  /**
  	 * @default null
  	 */
  var envMap: Texture | Null = js.native
  
  /**
  	 * @default null
  	 */
  var lightMap: Texture | Null = js.native
  
  /**
  	 * @default 1
  	 */
  var lightMapIntensity: Double = js.native
  
  /**
  	 * @default null
  	 */
  var map: Texture | Null = js.native
  
  /**
  	 * @default false
  	 */
  var morphNormals: Boolean = js.native
  
  /**
  	 * @default false
  	 */
  var morphTargets: Boolean = js.native
  
  /**
  	 * @default 1
  	 */
  var reflectivity: Double = js.native
  
  /**
  	 * @default 0.98
  	 */
  var refractionRatio: Double = js.native
  
  def setValues(parameters: MeshLambertMaterialParameters): Unit = js.native
  
  /**
  	 * @default false
  	 */
  var skinning: Boolean = js.native
  
  /**
  	 * @default null
  	 */
  var specularMap: Texture | Null = js.native
  
  /**
  	 * @default false
  	 */
  var wireframe: Boolean = js.native
  
  /**
  	 * @default 'round'
  	 */
  var wireframeLinecap: String = js.native
  
  /**
  	 * @default 'round'
  	 */
  var wireframeLinejoin: String = js.native
  
  /**
  	 * @default 1
  	 */
  var wireframeLinewidth: Double = js.native
}
