package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultsContext extends js.Object {
  var build: BuildReference = js.native
  var contextType: TestResultsContextType = js.native
  var release: ReleaseReference = js.native
}

object TestResultsContext {
  @scala.inline
  def apply(build: BuildReference, contextType: TestResultsContextType, release: ReleaseReference): TestResultsContext = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], contextType = contextType.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsContext]
  }
  @scala.inline
  implicit class TestResultsContextOps[Self <: TestResultsContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuild(value: BuildReference): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextType(value: TestResultsContextType): Self = this.set("contextType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease(value: ReleaseReference): Self = this.set("release", value.asInstanceOf[js.Any])
  }
  
}

