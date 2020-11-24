package typings.three.meshDepthMaterialMod

import typings.three.constantsMod.DepthPackingStrategies
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/MeshDepthMaterial", "MeshDepthMaterial")
@js.native
class MeshDepthMaterial () extends Material {
  def this(parameters: MeshDepthMaterialParameters) = this()
  
  /**
  	 * @default null
  	 */
  var alphaMap: Texture | Null = js.native
  
  /**
  	 * @default THREE.BasicDepthPacking
  	 */
  var depthPacking: DepthPackingStrategies = js.native
  
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
  
  def setValues(parameters: MeshDepthMaterialParameters): Unit = js.native
  
  /**
  	 * @default false
  	 */
  var wireframe: Boolean = js.native
  
  /**
  	 * @default 1
  	 */
  var wireframeLinewidth: Double = js.native
}
