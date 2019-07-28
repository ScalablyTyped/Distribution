package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestApiResponseStatusModel extends js.Object {
  /**
    * Gets or sets the operation details
    */
  var operationDetails: js.Any
  /**
    * Gets or sets the operation id
    */
  var operationId: String
  /**
    * Gets or sets the completed status percentage
    */
  var percentageCompleted: Double
  /**
    * Gets or sets the status
    */
  var status: RestApiResponseStatus
  /**
    * Gets or sets the status message
    */
  var statusMessage: String
}

object RestApiResponseStatusModel {
  @scala.inline
  def apply(
    operationDetails: js.Any,
    operationId: String,
    percentageCompleted: Double,
    status: RestApiResponseStatus,
    statusMessage: String
  ): RestApiResponseStatusModel = {
    val __obj = js.Dynamic.literal(operationDetails = operationDetails, operationId = operationId, percentageCompleted = percentageCompleted, status = status, statusMessage = statusMessage)
  
    __obj.asInstanceOf[RestApiResponseStatusModel]
  }
}

