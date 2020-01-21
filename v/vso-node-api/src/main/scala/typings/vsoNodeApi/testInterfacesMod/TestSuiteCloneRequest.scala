package typings.vsoNodeApi.testInterfacesMod

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
    val __obj = js.Dynamic.literal(cloneOptions = cloneOptions.asInstanceOf[js.Any], destinationSuiteId = destinationSuiteId.asInstanceOf[js.Any], destinationSuiteProjectName = destinationSuiteProjectName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestSuiteCloneRequest]
  }
}

