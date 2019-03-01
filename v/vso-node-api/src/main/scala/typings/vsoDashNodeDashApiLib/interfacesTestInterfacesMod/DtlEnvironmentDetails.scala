package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DtlEnvironmentDetails extends js.Object {
  var csmContent: java.lang.String
  var csmParameters: java.lang.String
  var subscriptionName: java.lang.String
}

object DtlEnvironmentDetails {
  @scala.inline
  def apply(csmContent: java.lang.String, csmParameters: java.lang.String, subscriptionName: java.lang.String): DtlEnvironmentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("csmContent")(csmContent)
    __obj.updateDynamic("csmParameters")(csmParameters)
    __obj.updateDynamic("subscriptionName")(subscriptionName)
    __obj.asInstanceOf[DtlEnvironmentDetails]
  }
}

