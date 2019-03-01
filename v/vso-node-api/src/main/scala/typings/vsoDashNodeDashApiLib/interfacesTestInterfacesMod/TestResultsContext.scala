package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("contextType")(contextType)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[TestResultsContext]
  }
}

