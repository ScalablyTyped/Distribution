package typings.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryStyleInterface extends js.Object {
  var data: js.UndefOr[VictoryStyleObject] = js.native
  var labels: js.UndefOr[VictoryStyleObject] = js.native
  var parent: js.UndefOr[VictoryStyleObject] = js.native
}

object VictoryStyleInterface {
  @scala.inline
  def apply(): VictoryStyleInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryStyleInterface]
  }
  @scala.inline
  implicit class VictoryStyleInterfaceOps[Self <: VictoryStyleInterface] (val x: Self) extends AnyVal {
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
    def setData(value: VictoryStyleObject): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setLabels(value: VictoryStyleObject): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setParent(value: VictoryStyleObject): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

