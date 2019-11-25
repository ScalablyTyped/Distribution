package typings.vsoDashNodeDashApi.interfacesCommonOperationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationReference extends js.Object {
  /**
    * The identifier for this operation.
    */
  var id: String
  /**
    * The current status of the operation.
    */
  var status: OperationStatus
  /**
    * Url to get the full object.
    */
  var url: String
}

object OperationReference {
  @scala.inline
  def apply(id: String, status: OperationStatus, url: String): OperationReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OperationReference]
  }
}

