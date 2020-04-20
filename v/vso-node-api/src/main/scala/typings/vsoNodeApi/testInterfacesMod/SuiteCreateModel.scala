package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteCreateModel extends js.Object {
  var name: String
  var queryString: String
  var requirementIds: js.Array[Double]
  var suiteType: String
}

object SuiteCreateModel {
  @scala.inline
  def apply(name: String, queryString: String, requirementIds: js.Array[Double], suiteType: String): SuiteCreateModel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], requirementIds = requirementIds.asInstanceOf[js.Any], suiteType = suiteType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteCreateModel]
  }
}

