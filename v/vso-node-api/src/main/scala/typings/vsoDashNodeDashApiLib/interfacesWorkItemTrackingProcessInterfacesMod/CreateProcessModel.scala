package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProcessModel extends js.Object {
  /**
    * Description of the process
    */
  var description: java.lang.String
  /**
    * Name of the process
    */
  var name: java.lang.String
  /**
    * The ID of the parent process
    */
  var parentProcessTypeId: java.lang.String
  /**
    * Reference name of the process
    */
  var referenceName: java.lang.String
}

object CreateProcessModel {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    parentProcessTypeId: java.lang.String,
    referenceName: java.lang.String
  ): CreateProcessModel = {
    val __obj = js.Dynamic.literal(description = description, name = name, parentProcessTypeId = parentProcessTypeId, referenceName = referenceName)
  
    __obj.asInstanceOf[CreateProcessModel]
  }
}

