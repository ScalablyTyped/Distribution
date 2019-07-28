package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal(name = name, queryString = queryString, requirementIds = requirementIds, suiteType = suiteType)
  
    __obj.asInstanceOf[SuiteCreateModel]
  }
}

