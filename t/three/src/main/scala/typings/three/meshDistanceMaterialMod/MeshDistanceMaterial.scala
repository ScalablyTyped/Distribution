package typings.three.meshDistanceMaterialMod

import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshDistanceMaterial", "MeshDistanceMaterial")
@js.native
class MeshDistanceMaterial () extends Material {
  def this(parameters: MeshDistanceMaterialParameters) = this()
  
  /**
  	 * @default null
  	 */
  var alphaMap: Texture | Null = js.native
  
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
  	 * @default 1000
  	 */
  var farDistance: Double = js.native
  
  /**
  	 * @default null
  	 */
  var map: Texture | Null = js.native
  
  /**
  	 * @default false
  	 */
  var morphTargets: Boolean = js.native
  
  /**
  	 * @default 1
  	 */
  var nearDistance: Double = js.native
  
  /**
  	 * @default new THREE.Vector3()
  	 */
  var referencePosition: Vector3 = js.native
  
  def setValues(parameters: MeshDistanceMaterialParameters): Unit = js.native
  
  /**
  	 * @default false
  	 */
  var skinning: Boolean = js.native
}
