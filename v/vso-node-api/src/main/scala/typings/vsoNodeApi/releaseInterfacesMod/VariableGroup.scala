package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableGroup extends js.Object {
  /**
    * Gets or sets the identity who created.
    */
  var createdBy: IdentityRef = js.native
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date = js.native
  /**
    * Gets or sets description.
    */
  var description: String = js.native
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double = js.native
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: IdentityRef = js.native
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date = js.native
  /**
    * Gets or sets name.
    */
  var name: String = js.native
  /**
    * Gets or sets provider data.
    */
  var providerData: VariableGroupProviderData = js.native
  /**
    * Gets or sets type.
    */
  var `type`: String = js.native
  var variables: StringDictionary[VariableValue] = js.native
}

object VariableGroup {
  @scala.inline
  def apply(
    createdBy: IdentityRef,
    createdOn: Date,
    description: String,
    id: Double,
    modifiedBy: IdentityRef,
    modifiedOn: Date,
    name: String,
    providerData: VariableGroupProviderData,
    `type`: String,
    variables: StringDictionary[VariableValue]
  ): VariableGroup = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providerData = providerData.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
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
    def setCreatedBy(value: IdentityRef): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedBy(value: IdentityRef): Self = this.set("modifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedOn(value: Date): Self = this.set("modifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderData(value: VariableGroupProviderData): Self = this.set("providerData", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[VariableValue]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

