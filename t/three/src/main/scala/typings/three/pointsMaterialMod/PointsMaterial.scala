package typings.three.pointsMaterialMod

import typings.three.colorMod.Color
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/PointsMaterial", "PointsMaterial")
@js.native
class PointsMaterial () extends Material {
  def this(parameters: PointsMaterialParameters) = this()
  
  /**
  	 * @default null
  	 */
  var alphaMap: Texture | Null = js.native
  
  /**
  	 * @default new THREE.Color( 0xffffff )
  	 */
  var color: Color = js.native
  
  /**
  	 * @default null
  	 */
  var map: Texture | Null = js.native
  
  /**
  	 * @default false
  	 */
  var morphTargets: Boolean = js.native
  
  def setValues(parameters: PointsMaterialParameters): Unit = js.native
  
  /**
  	 * @default 1
  	 */
  var size: Double = js.native
  
  /**
  	 * @default true
  	 */
  var sizeAttenuation: Boolean = js.native
}
