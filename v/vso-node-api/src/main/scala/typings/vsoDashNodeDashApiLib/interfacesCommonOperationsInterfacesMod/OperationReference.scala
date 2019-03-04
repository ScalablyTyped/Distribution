package typings
package vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationReference extends js.Object {
  /**
    * The identifier for this operation.
    */
  var id: java.lang.String
  /**
    * The current status of the operation.
    */
  var status: OperationStatus
  /**
    * Url to get the full object.
    */
  var url: java.lang.String
}

object OperationReference {
  @scala.inline
  def apply(id: java.lang.String, status: OperationStatus, url: java.lang.String): OperationReference = {
    val __obj = js.Dynamic.literal(id = id, status = status, url = url)
  
    __obj.asInstanceOf[OperationReference]
  }
}

