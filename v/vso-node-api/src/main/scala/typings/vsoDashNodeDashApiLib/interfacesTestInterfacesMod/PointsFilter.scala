package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointsFilter extends js.Object {
  var configurationNames: js.Array[java.lang.String]
  var testcaseIds: js.Array[scala.Double]
  var testers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]
}

object PointsFilter {
  @scala.inline
  def apply(
    configurationNames: js.Array[java.lang.String],
    testcaseIds: js.Array[scala.Double],
    testers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]
  ): PointsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configurationNames")(configurationNames)
    __obj.updateDynamic("testcaseIds")(testcaseIds)
    __obj.updateDynamic("testers")(testers)
    __obj.asInstanceOf[PointsFilter]
  }
}

