package typings.tensorflowTfjsBackendWebgl.shaderCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputInfo extends js.Object {
  var name: String = js.native
  var shapeInfo: ShapeInfo = js.native
}

object InputInfo {
  @scala.inline
  def apply(name: String, shapeInfo: ShapeInfo): InputInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shapeInfo = shapeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputInfo]
  }
  @scala.inline
  implicit class InputInfoOps[Self <: InputInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeInfo(value: ShapeInfo): Self = this.set("shapeInfo", value.asInstanceOf[js.Any])
  }
  
}

