package typings.three.meshNormalMaterialMod

import typings.three.constantsMod.NormalMapTypes
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshNormalMaterial", "MeshNormalMaterial")
@js.native
class MeshNormalMaterial () extends Material {
  def this(parameters: MeshNormalMaterialParameters) = this()
  
  /**
  	 * @default null
  	 */
  var bumpMap: Texture | Null = js.native
  
  /**
  	 * @default 1
  	 */
  var bumpScale: Double = js.native
  
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
  
  def setValues(parameters: MeshNormalMaterialParameters): Unit = js.native
  
  /**
  	 * @default false
  	 */
  var skinning: Boolean = js.native
  
  /**
  	 * @default false
  	 */
  var wireframe: Boolean = js.native
  
  /**
  	 * @default 1
  	 */
  var wireframeLinewidth: Double = js.native
}
