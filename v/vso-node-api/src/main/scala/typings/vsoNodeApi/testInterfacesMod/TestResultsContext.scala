package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsContext extends js.Object {
  var build: BuildReference
  var contextType: TestResultsContextType
  var release: ReleaseReference
}

object TestResultsContext {
  @scala.inline
  def apply(build: BuildReference, contextType: TestResultsContextType, release: ReleaseReference): TestResultsContext = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], contextType = contextType.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResultsContext]
  }
}

