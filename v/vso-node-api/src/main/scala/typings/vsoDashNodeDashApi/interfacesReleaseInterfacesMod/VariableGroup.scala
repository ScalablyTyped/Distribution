package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableGroup extends js.Object {
  /**
    * Gets or sets the identity who created.
    */
  var createdBy: IdentityRef
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date
  /**
    * Gets or sets description.
    */
  var description: String
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: IdentityRef
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date
  /**
    * Gets or sets name.
    */
  var name: String
  /**
    * Gets or sets provider data.
    */
  var providerData: VariableGroupProviderData
  /**
    * Gets or sets type.
    */
  var `type`: String
  var variables: StringDictionary[VariableValue]
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
}

