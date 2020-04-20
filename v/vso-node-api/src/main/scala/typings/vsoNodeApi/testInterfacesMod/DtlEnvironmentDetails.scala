package typings.vsoNodeApi.testInterfacesMod

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
    val __obj = js.Dynamic.literal(csmContent = csmContent.asInstanceOf[js.Any], csmParameters = csmParameters.asInstanceOf[js.Any], subscriptionName = subscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtlEnvironmentDetails]
  }
}

