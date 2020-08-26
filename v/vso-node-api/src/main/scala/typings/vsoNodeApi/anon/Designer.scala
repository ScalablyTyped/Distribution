package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Designer extends js.Object {
  var designer: scala.Double = js.native
  var yaml: scala.Double = js.native
}

object Designer {
  @scala.inline
  def apply(designer: scala.Double, yaml: scala.Double): Designer = {
    val __obj = js.Dynamic.literal(designer = designer.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Designer]
  }
  @scala.inline
  implicit class DesignerOps[Self <: Designer] (val x: Self) extends AnyVal {
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
    def setDesigner(value: scala.Double): Self = this.set("designer", value.asInstanceOf[js.Any])
    @scala.inline
    def setYaml(value: scala.Double): Self = this.set("yaml", value.asInstanceOf[js.Any])
  }
  
}

