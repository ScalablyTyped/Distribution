package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglShaderUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputInfo extends js.Object {
  var name: java.lang.String
  var shapeInfo: ShapeInfo
}

object InputInfo {
  @scala.inline
  def apply(name: java.lang.String, shapeInfo: ShapeInfo): InputInfo = {
    val __obj = js.Dynamic.literal(name = name, shapeInfo = shapeInfo)
  
    __obj.asInstanceOf[InputInfo]
  }
}

