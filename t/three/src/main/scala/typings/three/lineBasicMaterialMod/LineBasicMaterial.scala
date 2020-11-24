package typings.three.lineBasicMaterialMod

import typings.three.colorMod.Color
import typings.three.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/LineBasicMaterial", "LineBasicMaterial")
@js.native
class LineBasicMaterial () extends Material {
  def this(parameters: LineBasicMaterialParameters) = this()
  
  /**
  	 * @default 0xffffff
  	 */
  var color: Color = js.native
  
  /**
  	 * @default 'round'
  	 */
  var linecap: String = js.native
  
  /**
  	 * @default 'round'
  	 */
  var linejoin: String = js.native
  
  /**
  	 * @default 1
  	 */
  var linewidth: Double = js.native
  
  /**
  	 * @default false
  	 */
  var morphTargets: Boolean = js.native
  
  def setValues(parameters: LineBasicMaterialParameters): Unit = js.native
}
