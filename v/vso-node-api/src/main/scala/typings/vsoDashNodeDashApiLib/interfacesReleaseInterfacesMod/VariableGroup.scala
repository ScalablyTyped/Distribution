package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableGroup extends js.Object {
  /**
    * Gets or sets the identity who created.
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets date on which it got created.
    */
  var createdOn: stdLib.Date
  /**
    * Gets or sets description.
    */
  var description: java.lang.String
  /**
    * Gets the unique identifier of this field.
    */
  var id: scala.Double
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: stdLib.Date
  /**
    * Gets or sets name.
    */
  var name: java.lang.String
  /**
    * Gets or sets provider data.
    */
  var providerData: VariableGroupProviderData
  /**
    * Gets or sets type.
    */
  var `type`: java.lang.String
  var variables: org.scalablytyped.runtime.StringDictionary[VariableValue]
}

object VariableGroup {
  @scala.inline
  def apply(
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdOn: stdLib.Date,
    description: java.lang.String,
    id: scala.Double,
    modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    modifiedOn: stdLib.Date,
    name: java.lang.String,
    providerData: VariableGroupProviderData,
    `type`: java.lang.String,
    variables: org.scalablytyped.runtime.StringDictionary[VariableValue]
  ): VariableGroup = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("createdBy")(createdBy)
    __obj.updateDynamic("createdOn")(createdOn)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("modifiedBy")(modifiedBy)
    __obj.updateDynamic("modifiedOn")(modifiedOn)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("providerData")(providerData)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[VariableGroup]
  }
}

