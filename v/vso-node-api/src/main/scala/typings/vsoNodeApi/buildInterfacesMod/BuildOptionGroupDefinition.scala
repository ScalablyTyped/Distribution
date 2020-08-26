package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptionGroupDefinition extends js.Object {
  /**
    * The name of the group to display in the UI.
    */
  var displayName: String = js.native
  /**
    * Indicates whether the group is initially displayed as expanded in the UI.
    */
  var isExpanded: Boolean = js.native
  /**
    * The internal name of the group.
    */
  var name: String = js.native
}

object BuildOptionGroupDefinition {
  @scala.inline
  def apply(displayName: String, isExpanded: Boolean, name: String): BuildOptionGroupDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionGroupDefinition]
  }
  @scala.inline
  implicit class BuildOptionGroupDefinitionOps[Self <: BuildOptionGroupDefinition] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

