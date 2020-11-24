package typings.three.meshPhongMaterialMod

import typings.three.colorMod.Color
import typings.three.constantsMod.Combine
import typings.three.constantsMod.NormalMapTypes
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshPhongMaterial", "MeshPhongMaterial")
@js.native
class MeshPhongMaterial () extends Material {
  def this(parameters: MeshPhongMaterialParameters) = this()
  
  /**
  	 * @default null
  	 */
  var alphaMap: Texture | Null = js.native
  
  /**
  	 * @default null
  	 */
  var aoMap: Texture | Null = js.native
  
  /**
  	 * @default null
  	 */
  var aoMapIntensity: Double = js.native
  
  /**
  	 * @default null
  	 */
  var bumpMap: Texture | Null = js.native
  
  /**
  	 * @default 1
  	 */
  var bumpScale: Double = js.native
  
  /**
  	 * @default new THREE.Color( 0xffffff )
  	 */
  var color: Color = js.native
  
  /**
  	 * @default THREE.MultiplyOperation
  	 */
  var combine: Combine = js.native
  
  /**
  	 * @default 0
  	 */
  var displacementBias: Double = js.native
  
  /**
  	 * @default null
  	 */
  var displacementMap: Texture | Null = js.native
  
  /**
  	 * @default 1
  	 */
  var displacementScale: Double = js.native
  
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
  	 * @default null
  	 */
  var lightMapIntensity: Double = js.native
  
  /**
  	 * @default null
  	 */
  var map: Texture | Null = js.native
  
  /**
  	 * @deprecated Use {@link MeshStandardMaterial THREE.MeshStandardMaterial} instead.
  	 */
  var metal: Boolean = js.native
  
  /**
  	 * @default false
  	 */
  var morphNormals: Boolean = js.native
  
  /**
  	 * @default false
  	 */
  var morphTargets: Boolean = js.native
  
  /**
  	 * @default null
  	 */
  var normalMap: Texture | Null = js.native
  
  /**
  	 * @default THREE.TangentSpaceNormalMap
  	 */
  var normalMapType: NormalMapTypes = js.native
  
  /**
  	 * @default new Vector2( 1, 1 )
  	 */
  var normalScale: Vector2 = js.native
  
  /**
  	 * @default 1
  	 */
  var reflectivity: Double = js.native
  
  /**
  	 * @default 0.98
  	 */
  var refractionRatio: Double = js.native
  
  def setValues(parameters: MeshPhongMaterialParameters): Unit = js.native
  
  /**
  	 * @default 30
  	 */
  var shininess: Double = js.native
  
  /**
  	 * @default false
  	 */
  var skinning: Boolean = js.native
  
  /**
  	 * @default new THREE.Color( 0x111111 )
  	 */
  var specular: Color = js.native
  
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
