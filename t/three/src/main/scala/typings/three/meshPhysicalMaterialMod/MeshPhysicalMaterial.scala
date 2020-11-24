package typings.three.meshPhysicalMaterialMod

import typings.three.colorMod.Color
import typings.three.meshStandardMaterialMod.MeshStandardMaterial
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshPhysicalMaterial", "MeshPhysicalMaterial")
@js.native
class MeshPhysicalMaterial protected () extends MeshStandardMaterial {
  def this(parameters: MeshPhysicalMaterialParameters) = this()
  
  /**
  	 * @default 0
  	 */
  var clearcoat: Double = js.native
  
  /**
  	 * @default null
  	 */
  var clearcoatMap: Texture | Null = js.native
  
  /**
  	 * @default null
  	 */
  var clearcoatNormalMap: Texture | Null = js.native
  
  /**
  	 * @default new THREE.Vector2( 1, 1 )
  	 */
  var clearcoatNormalScale: Vector2 = js.native
  
  /**
  	 * @default 0
  	 */
  var clearcoatRoughness: Double = js.native
  
  /**
  	 * @default null
  	 */
  var clearcoatRoughnessMap: Texture | Null = js.native
  
  /**
  	 * @default 1.5
  	 */
  var ior: Double = js.native
  
  /**
  	 * @default 0.5
  	 */
  var reflectivity: Double = js.native
  
  /**
  	 * @default null
  	 */
  var sheen: Color | Null = js.native
  
  /**
  	 * @default 0
  	 */
  var transmission: Double = js.native
  
  /**
  	 * @default null
  	 */
  var transmissionMap: Texture | Null = js.native
}
