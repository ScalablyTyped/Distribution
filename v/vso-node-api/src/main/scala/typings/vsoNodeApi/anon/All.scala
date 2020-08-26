package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends js.Object {
  var all: scala.Double = js.native
  var batchedCI: scala.Double = js.native
  var checkInShelveset: scala.Double = js.native
  var individualCI: scala.Double = js.native
  var manual: scala.Double = js.native
  var none: scala.Double = js.native
  var pullRequest: scala.Double = js.native
  var schedule: scala.Double = js.native
  var triggered: scala.Double = js.native
  var userCreated: scala.Double = js.native
  var validateShelveset: scala.Double = js.native
}

object All {
  @scala.inline
  def apply(
    all: scala.Double,
    batchedCI: scala.Double,
    checkInShelveset: scala.Double,
    individualCI: scala.Double,
    manual: scala.Double,
    none: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    triggered: scala.Double,
    userCreated: scala.Double,
    validateShelveset: scala.Double
  ): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedCI = batchedCI.asInstanceOf[js.Any], checkInShelveset = checkInShelveset.asInstanceOf[js.Any], individualCI = individualCI.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any], userCreated = userCreated.asInstanceOf[js.Any], validateShelveset = validateShelveset.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchedCI(value: scala.Double): Self = this.set("batchedCI", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckInShelveset(value: scala.Double): Self = this.set("checkInShelveset", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndividualCI(value: scala.Double): Self = this.set("individualCI", value.asInstanceOf[js.Any])
    @scala.inline
    def setManual(value: scala.Double): Self = this.set("manual", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setPullRequest(value: scala.Double): Self = this.set("pullRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedule(value: scala.Double): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggered(value: scala.Double): Self = this.set("triggered", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserCreated(value: scala.Double): Self = this.set("userCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateShelveset(value: scala.Double): Self = this.set("validateShelveset", value.asInstanceOf[js.Any])
  }
  
}

