package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsGroupsForBuild extends js.Object {
  /**
    * BuildId for which groupby result is fetched.
    */
  var buildId: Double
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults]
}

object TestResultsGroupsForBuild {
  @scala.inline
  def apply(buildId: Double, fields: js.Array[FieldDetailsForTestResults]): TestResultsGroupsForBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResultsGroupsForBuild]
  }
}

