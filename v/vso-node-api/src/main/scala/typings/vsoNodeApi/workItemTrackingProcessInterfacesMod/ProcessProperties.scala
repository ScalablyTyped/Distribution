package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessProperties extends js.Object {
  /**
    * Class of the process
    */
  var `class`: ProcessClass
  /**
    * Is the process default process
    */
  var isDefault: Boolean
  /**
    * Is the process enabled
    */
  var isEnabled: Boolean
  /**
    * ID of the parent process
    */
  var parentProcessTypeId: String
  /**
    * Version of the process
    */
  var version: String
}

object ProcessProperties {
  @scala.inline
  def apply(
    `class`: ProcessClass,
    isDefault: Boolean,
    isEnabled: Boolean,
    parentProcessTypeId: String,
    version: String
  ): ProcessProperties = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], parentProcessTypeId = parentProcessTypeId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessProperties]
  }
}

