package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlan extends js.Object {
  /**
    * Description of the plan
    */
  var description: String = js.native
  /**
    * Name of the plan to create.
    */
  var name: String = js.native
  /**
    * Plan properties.
    */
  var properties: js.Any = js.native
  /**
    * Type of plan to create.
    */
  var `type`: PlanType = js.native
}

object CreatePlan {
  @scala.inline
  def apply(description: String, name: String, properties: js.Any, `type`: PlanType): CreatePlan = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlan]
  }
  @scala.inline
  implicit class CreatePlanOps[Self <: CreatePlan] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PlanType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

