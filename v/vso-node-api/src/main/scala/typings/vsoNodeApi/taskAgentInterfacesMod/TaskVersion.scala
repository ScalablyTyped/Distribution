package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskVersion extends js.Object {
  var isTest: Boolean = js.native
  var major: Double = js.native
  var minor: Double = js.native
  var patch: Double = js.native
}

object TaskVersion {
  @scala.inline
  def apply(isTest: Boolean, major: Double, minor: Double, patch: Double): TaskVersion = {
    val __obj = js.Dynamic.literal(isTest = isTest.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskVersion]
  }
  @scala.inline
  implicit class TaskVersionOps[Self <: TaskVersion] (val x: Self) extends AnyVal {
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
    def setIsTest(value: Boolean): Self = this.set("isTest", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatch(value: Double): Self = this.set("patch", value.asInstanceOf[js.Any])
  }
  
}

