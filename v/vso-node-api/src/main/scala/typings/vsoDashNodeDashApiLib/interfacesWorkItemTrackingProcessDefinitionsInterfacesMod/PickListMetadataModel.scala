package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListMetadataModel extends js.Object {
  /**
    * ID of the picklist
    */
  var id: java.lang.String
  /**
    * Is input values by user only limited to suggested values
    */
  var isSuggested: scala.Boolean
  /**
    * Name of the picklist
    */
  var name: java.lang.String
  /**
    * Type of picklist
    */
  var `type`: java.lang.String
  /**
    * Url of the picklist
    */
  var url: java.lang.String
}

object PickListMetadataModel {
  @scala.inline
  def apply(
    id: java.lang.String,
    isSuggested: scala.Boolean,
    name: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): PickListMetadataModel = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isSuggested")(isSuggested)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PickListMetadataModel]
  }
}

