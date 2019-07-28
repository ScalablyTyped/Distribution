package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSuiteCloneRequest extends js.Object {
  var cloneOptions: CloneOptions
  var destinationSuiteId: Double
  var destinationSuiteProjectName: String
}

object TestSuiteCloneRequest {
  @scala.inline
  def apply(cloneOptions: CloneOptions, destinationSuiteId: Double, destinationSuiteProjectName: String): TestSuiteCloneRequest = {
    val __obj = js.Dynamic.literal(cloneOptions = cloneOptions, destinationSuiteId = destinationSuiteId, destinationSuiteProjectName = destinationSuiteProjectName)
  
    __obj.asInstanceOf[TestSuiteCloneRequest]
  }
}

