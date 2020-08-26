package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableGroup extends VariableGroupReference {
  /**
    * The description.
    */
  var description: String = js.native
  /**
    * The name of the variable group.
    */
  var name: String = js.native
  /**
    * The type of the variable group.
    */
  var `type`: String = js.native
  var variables: StringDictionary[BuildDefinitionVariable] = js.native
}

object VariableGroup {
  @scala.inline
  def apply(
    description: String,
    id: Double,
    name: String,
    `type`: String,
    variables: StringDictionary[BuildDefinitionVariable]
  ): VariableGroup = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableGroup]
  }
  @scala.inline
  implicit class VariableGroupOps[Self <: VariableGroup] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[BuildDefinitionVariable]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

