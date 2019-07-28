package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

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
    val __obj = js.Dynamic.literal(isDefault = isDefault, isEnabled = isEnabled, parentProcessTypeId = parentProcessTypeId, version = version)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[ProcessProperties]
  }
}

