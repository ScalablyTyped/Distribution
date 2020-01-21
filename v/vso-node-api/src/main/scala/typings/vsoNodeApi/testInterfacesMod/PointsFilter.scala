package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(configurationNames = configurationNames.asInstanceOf[js.Any], testcaseIds = testcaseIds.asInstanceOf[js.Any], testers = testers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointsFilter]
  }
}

