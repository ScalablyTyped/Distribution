package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemFieldOperation extends js.Object {
  /**
    * Name of the operation.
    */
  var name: java.lang.String
  /**
    * Reference name of the operation.
    */
  var referenceName: java.lang.String
}

object WorkItemFieldOperation {
  @scala.inline
  def apply(name: java.lang.String, referenceName: java.lang.String): WorkItemFieldOperation = {
    val __obj = js.Dynamic.literal(name = name, referenceName = referenceName)
  
    __obj.asInstanceOf[WorkItemFieldOperation]
  }
}

