package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentChildWIMap extends js.Object {
  var childWorkItemIds: js.Array[Double] = js.native
  var id: Double = js.native
  var title: String = js.native
}

object ParentChildWIMap {
  @scala.inline
  def apply(childWorkItemIds: js.Array[Double], id: Double, title: String): ParentChildWIMap = {
    val __obj = js.Dynamic.literal(childWorkItemIds = childWorkItemIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentChildWIMap]
  }
  @scala.inline
  implicit class ParentChildWIMapOps[Self <: ParentChildWIMap] (val x: Self) extends AnyVal {
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
    def setChildWorkItemIdsVarargs(value: Double*): Self = this.set("childWorkItemIds", js.Array(value :_*))
    @scala.inline
    def setChildWorkItemIds(value: js.Array[Double]): Self = this.set("childWorkItemIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

