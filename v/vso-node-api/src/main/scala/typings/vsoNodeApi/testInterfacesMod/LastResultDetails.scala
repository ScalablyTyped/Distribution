package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastResultDetails extends js.Object {
  var dateCompleted: Date = js.native
  var duration: Double = js.native
  var runBy: IdentityRef = js.native
}

object LastResultDetails {
  @scala.inline
  def apply(dateCompleted: Date, duration: Double, runBy: IdentityRef): LastResultDetails = {
    val __obj = js.Dynamic.literal(dateCompleted = dateCompleted.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastResultDetails]
  }
  @scala.inline
  implicit class LastResultDetailsOps[Self <: LastResultDetails] (val x: Self) extends AnyVal {
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
    def setDateCompleted(value: Date): Self = this.set("dateCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunBy(value: IdentityRef): Self = this.set("runBy", value.asInstanceOf[js.Any])
  }
  
}

