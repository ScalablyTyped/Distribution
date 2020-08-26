package typings.vexdb.responseObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwardsResponseObject extends ResponseObject {
  var name: String = js.native
  var order: Double = js.native
  var qualifies: js.Array[String] = js.native
  var sku: String = js.native
  var team: String = js.native
}

object AwardsResponseObject {
  @scala.inline
  def apply(name: String, order: Double, qualifies: js.Array[String], sku: String, team: String): AwardsResponseObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], qualifies = qualifies.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwardsResponseObject]
  }
  @scala.inline
  implicit class AwardsResponseObjectOps[Self <: AwardsResponseObject] (val x: Self) extends AnyVal {
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
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualifiesVarargs(value: String*): Self = this.set("qualifies", js.Array(value :_*))
    @scala.inline
    def setQualifies(value: js.Array[String]): Self = this.set("qualifies", value.asInstanceOf[js.Any])
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
  }
  
}

