package typings.three.meshMatcapMaterialMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.colorMod.Color
import typings.three.constantsMod.NormalMapTypes
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshMatcapMaterial", "MeshMatcapMaterial")
@js.native
class MeshMatcapMaterial () extends Material {
  def this(parameters: MeshMatcapMaterialParameters) = this()
  
  /**
  	 * @default null
  	 */
  var alphaMap: Texture | Null = js.native
  
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
  	 * @default { 'MATCAP': '' }
  	 */
  @JSName("defines")
  var defines_MeshMatcapMaterial: StringDictionary[js.Any] = js.native
  
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
  	 * @default null
  	 */
  var map: Texture | Null = js.native
  
  /**
  	 * @default null
  	 */
  var matcap: Texture | Null = js.native
  
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
  
  def setValues(parameters: MeshMatcapMaterialParameters): Unit = js.native
  
  /**
  	 * @default false
  	 */
  var skinning: Boolean = js.native
}
