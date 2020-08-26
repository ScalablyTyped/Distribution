package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointUpdateModel extends js.Object {
  var outcome: String = js.native
  var resetToActive: Boolean = js.native
  var tester: IdentityRef = js.native
}

object PointUpdateModel {
  @scala.inline
  def apply(outcome: String, resetToActive: Boolean, tester: IdentityRef): PointUpdateModel = {
    val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any], resetToActive = resetToActive.asInstanceOf[js.Any], tester = tester.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointUpdateModel]
  }
  @scala.inline
  implicit class PointUpdateModelOps[Self <: PointUpdateModel] (val x: Self) extends AnyVal {
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
    def setOutcome(value: String): Self = this.set("outcome", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetToActive(value: Boolean): Self = this.set("resetToActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setTester(value: IdentityRef): Self = this.set("tester", value.asInstanceOf[js.Any])
  }
  
}

