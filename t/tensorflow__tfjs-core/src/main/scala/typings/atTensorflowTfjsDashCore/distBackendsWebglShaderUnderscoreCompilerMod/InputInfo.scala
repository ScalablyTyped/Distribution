package typings.atTensorflowTfjsDashCore.distBackendsWebglShaderUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputInfo extends js.Object {
  var name: String
  var shapeInfo: ShapeInfo
}

object InputInfo {
  @scala.inline
  def apply(name: String, shapeInfo: ShapeInfo): InputInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shapeInfo = shapeInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputInfo]
  }
}

