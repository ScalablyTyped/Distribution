package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal(build = build, contextType = contextType, release = release)
  
    __obj.asInstanceOf[TestResultsContext]
  }
}

