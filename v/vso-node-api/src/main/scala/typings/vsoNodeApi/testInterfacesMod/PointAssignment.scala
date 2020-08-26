package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointAssignment extends js.Object {
  var configuration: ShallowReference = js.native
  var tester: IdentityRef = js.native
}

object PointAssignment {
  @scala.inline
  def apply(configuration: ShallowReference, tester: IdentityRef): PointAssignment = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], tester = tester.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointAssignment]
  }
  @scala.inline
  implicit class PointAssignmentOps[Self <: PointAssignment] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: ShallowReference): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTester(value: IdentityRef): Self = this.set("tester", value.asInstanceOf[js.Any])
  }
  
}

