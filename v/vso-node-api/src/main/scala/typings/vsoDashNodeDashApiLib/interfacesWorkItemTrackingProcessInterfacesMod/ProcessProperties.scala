package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

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
  var isDefault: scala.Boolean
  /**
    * Is the process enabled
    */
  var isEnabled: scala.Boolean
  /**
    * ID of the parent process
    */
  var parentProcessTypeId: java.lang.String
  /**
    * Version of the process
    */
  var version: java.lang.String
}

object ProcessProperties {
  @scala.inline
  def apply(
    `class`: ProcessClass,
    isDefault: scala.Boolean,
    isEnabled: scala.Boolean,
    parentProcessTypeId: java.lang.String,
    version: java.lang.String
  ): ProcessProperties = {
    val __obj = js.Dynamic.literal(`class` = `class`)
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("parentProcessTypeId")(parentProcessTypeId)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ProcessProperties]
  }
}

