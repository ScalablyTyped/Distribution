package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotApplicable extends js.Object {
  var error: scala.Double = js.native
  var failed: scala.Double = js.native
  var notApplicable: scala.Double = js.native
  var notSet: scala.Double = js.native
  var pending: scala.Double = js.native
  var succeeded: scala.Double = js.native
}

object NotApplicable {
  @scala.inline
  def apply(
    error: scala.Double,
    failed: scala.Double,
    notApplicable: scala.Double,
    notSet: scala.Double,
    pending: scala.Double,
    succeeded: scala.Double
  ): NotApplicable = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotApplicable]
  }
  @scala.inline
  implicit class NotApplicableOps[Self <: NotApplicable] (val x: Self) extends AnyVal {
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
    def setError(value: scala.Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: scala.Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotApplicable(value: scala.Double): Self = this.set("notApplicable", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotSet(value: scala.Double): Self = this.set("notSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: scala.Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setSucceeded(value: scala.Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
  
}

