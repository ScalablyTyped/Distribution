package typings.three.lineDashedMaterialMod

import typings.three.lineBasicMaterialMod.LineBasicMaterial
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/LineDashedMaterial", "LineDashedMaterial")
@js.native
class LineDashedMaterial () extends LineBasicMaterial {
  def this(parameters: LineDashedMaterialParameters) = this()
  
  /**
  	 * @default 1
  	 */
  var dashSize: Double = js.native
  
  /**
  	 * @default 1
  	 */
  var gapSize: Double = js.native
  
  val isLineDashedMaterial: `true` = js.native
  
  /**
  	 * @default 1
  	 */
  var scale: Double = js.native
  
  def setValues(parameters: LineDashedMaterialParameters): Unit = js.native
}
