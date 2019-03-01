package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSuiteCloneRequest extends js.Object {
  var cloneOptions: CloneOptions
  var destinationSuiteId: scala.Double
  var destinationSuiteProjectName: java.lang.String
}

object TestSuiteCloneRequest {
  @scala.inline
  def apply(
    cloneOptions: CloneOptions,
    destinationSuiteId: scala.Double,
    destinationSuiteProjectName: java.lang.String
  ): TestSuiteCloneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloneOptions")(cloneOptions)
    __obj.updateDynamic("destinationSuiteId")(destinationSuiteId)
    __obj.updateDynamic("destinationSuiteProjectName")(destinationSuiteProjectName)
    __obj.asInstanceOf[TestSuiteCloneRequest]
  }
}

