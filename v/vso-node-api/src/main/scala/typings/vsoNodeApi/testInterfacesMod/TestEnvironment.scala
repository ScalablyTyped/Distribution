package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEnvironment extends js.Object {
  var environmentId: String
  var environmentName: String
}

object TestEnvironment {
  @scala.inline
  def apply(environmentId: String, environmentName: String): TestEnvironment = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestEnvironment]
  }
}

