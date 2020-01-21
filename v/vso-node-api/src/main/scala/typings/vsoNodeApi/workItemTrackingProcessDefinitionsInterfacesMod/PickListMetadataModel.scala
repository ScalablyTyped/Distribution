package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListMetadataModel extends js.Object {
  /**
    * ID of the picklist
    */
  var id: String
  /**
    * Is input values by user only limited to suggested values
    */
  var isSuggested: Boolean
  /**
    * Name of the picklist
    */
  var name: String
  /**
    * Type of picklist
    */
  var `type`: String
  /**
    * Url of the picklist
    */
  var url: String
}

object PickListMetadataModel {
  @scala.inline
  def apply(id: String, isSuggested: Boolean, name: String, `type`: String, url: String): PickListMetadataModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSuggested = isSuggested.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListMetadataModel]
  }
}

