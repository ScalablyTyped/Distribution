package typings.three.meshStandardMaterialMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.colorMod.Color
import typings.three.constantsMod.NormalMapTypes
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshStandardMaterial", "MeshStandardMaterial")
@js.native
class MeshStandardMaterial () extends Material {
  def this(parameters: MeshStandardMaterialParameters) = this()
  
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
  	 * @default { 'STANDARD': '' }
  	 */
  @JSName("defines")
  var defines_MeshStandardMaterial: StringDictionary[js.Any] = js.native
  
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
  	 * @default 1
  	 */
  var envMapIntensity: Double = js.native
  
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
  	 * @default 0
  	 */
  var metalness: Double = js.native
  
  /**
  	 * @default null
  	 */
  var metalnessMap: Texture | Null = js.native
  
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
  	 * @default new THREE.Vector2( 1, 1 )
  	 */
  var normalScale: Vector2 = js.native
  
  /**
  	 * @default 0.98
  	 */
  var refractionRatio: Double = js.native
  
  /**
  	 * @default 1
  	 */
  var roughness: Double = js.native
  
  /**
  	 * @default null
  	 */
  var roughnessMap: Texture | Null = js.native
  
  def setValues(parameters: MeshStandardMaterialParameters): Unit = js.native
  
  /**
  	 * @default false
  	 */
  var skinning: Boolean = js.native
  
  /**
  	 * @default false
  	 */
  var vertexTangents: Boolean = js.native
  
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
