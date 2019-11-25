package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProcessModel extends js.Object {
  /**
    * Description of the process
    */
  var description: String
  /**
    * Name of the process
    */
  var name: String
  /**
    * The ID of the parent process
    */
  var parentProcessTypeId: String
  /**
    * Reference name of the process
    */
  var referenceName: String
}

object CreateProcessModel {
  @scala.inline
  def apply(description: String, name: String, parentProcessTypeId: String, referenceName: String): CreateProcessModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentProcessTypeId = parentProcessTypeId.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateProcessModel]
  }
}

