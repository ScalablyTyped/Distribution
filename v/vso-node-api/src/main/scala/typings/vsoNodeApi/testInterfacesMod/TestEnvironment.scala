package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEnvironment extends js.Object {
  var environmentId: String = js.native
  var environmentName: String = js.native
}

object TestEnvironment {
  @scala.inline
  def apply(environmentId: String, environmentName: String): TestEnvironment = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEnvironment]
  }
  @scala.inline
  implicit class TestEnvironmentOps[Self <: TestEnvironment] (val x: Self) extends AnyVal {
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
    def setEnvironmentId(value: String): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentName(value: String): Self = this.set("environmentName", value.asInstanceOf[js.Any])
  }
  
}

