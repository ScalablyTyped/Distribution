package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointsFilter extends js.Object {
  var configurationNames: js.Array[String]
  var testcaseIds: js.Array[Double]
  var testers: js.Array[IdentityRef]
}

object PointsFilter {
  @scala.inline
  def apply(
    configurationNames: js.Array[String],
    testcaseIds: js.Array[Double],
    testers: js.Array[IdentityRef]
  ): PointsFilter = {
    val __obj = js.Dynamic.literal(configurationNames = configurationNames, testcaseIds = testcaseIds, testers = testers)
  
    __obj.asInstanceOf[PointsFilter]
  }
}

