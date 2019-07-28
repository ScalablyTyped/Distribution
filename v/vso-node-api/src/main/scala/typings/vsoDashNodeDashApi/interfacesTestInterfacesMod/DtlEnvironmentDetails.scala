package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DtlEnvironmentDetails extends js.Object {
  var csmContent: String
  var csmParameters: String
  var subscriptionName: String
}

object DtlEnvironmentDetails {
  @scala.inline
  def apply(csmContent: String, csmParameters: String, subscriptionName: String): DtlEnvironmentDetails = {
    val __obj = js.Dynamic.literal(csmContent = csmContent, csmParameters = csmParameters, subscriptionName = subscriptionName)
  
    __obj.asInstanceOf[DtlEnvironmentDetails]
  }
}

