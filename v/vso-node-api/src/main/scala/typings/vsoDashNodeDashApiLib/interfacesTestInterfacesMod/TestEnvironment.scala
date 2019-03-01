package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEnvironment extends js.Object {
  var environmentId: java.lang.String
  var environmentName: java.lang.String
}

object TestEnvironment {
  @scala.inline
  def apply(environmentId: java.lang.String, environmentName: java.lang.String): TestEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("environmentId")(environmentId)
    __obj.updateDynamic("environmentName")(environmentName)
    __obj.asInstanceOf[TestEnvironment]
  }
}

