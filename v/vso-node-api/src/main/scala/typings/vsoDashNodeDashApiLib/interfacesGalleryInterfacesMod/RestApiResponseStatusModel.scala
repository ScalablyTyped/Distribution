package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  var operationId: java.lang.String
  /**
    * Gets or sets the completed status percentage
    */
  var percentageCompleted: scala.Double
  /**
    * Gets or sets the status
    */
  var status: RestApiResponseStatus
  /**
    * Gets or sets the status message
    */
  var statusMessage: java.lang.String
}

object RestApiResponseStatusModel {
  @scala.inline
  def apply(
    operationDetails: js.Any,
    operationId: java.lang.String,
    percentageCompleted: scala.Double,
    status: RestApiResponseStatus,
    statusMessage: java.lang.String
  ): RestApiResponseStatusModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operationDetails")(operationDetails)
    __obj.updateDynamic("operationId")(operationId)
    __obj.updateDynamic("percentageCompleted")(percentageCompleted)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[RestApiResponseStatusModel]
  }
}

