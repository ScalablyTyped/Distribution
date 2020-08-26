package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeModel extends js.Object {
  var behaviors: js.Array[WorkItemTypeBehavior] = js.native
  var `class`: WorkItemTypeClass = js.native
  var color: String = js.native
  var description: String = js.native
  var icon: String = js.native
  var id: String = js.native
  /**
    * Parent WIT Id/Internal ReferenceName that it inherits from
    */
  var inherits: String = js.native
  var isDisabled: Boolean = js.native
  var layout: FormLayout = js.native
  var name: String = js.native
  var states: js.Array[WorkItemStateResultModel] = js.native
  var url: String = js.native
}

object WorkItemTypeModel {
  @scala.inline
  def apply(
    behaviors: js.Array[WorkItemTypeBehavior],
    `class`: WorkItemTypeClass,
    color: String,
    description: String,
    icon: String,
    id: String,
    inherits: String,
    isDisabled: Boolean,
    layout: FormLayout,
    name: String,
    states: js.Array[WorkItemStateResultModel],
    url: String
  ): WorkItemTypeModel = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeModel]
  }
  @scala.inline
  implicit class WorkItemTypeModelOps[Self <: WorkItemTypeModel] (val x: Self) extends AnyVal {
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
    def setBehaviorsVarargs(value: WorkItemTypeBehavior*): Self = this.set("behaviors", js.Array(value :_*))
    @scala.inline
    def setBehaviors(value: js.Array[WorkItemTypeBehavior]): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: WorkItemTypeClass): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInherits(value: String): Self = this.set("inherits", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: FormLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatesVarargs(value: WorkItemStateResultModel*): Self = this.set("states", js.Array(value :_*))
    @scala.inline
    def setStates(value: js.Array[WorkItemStateResultModel]): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

