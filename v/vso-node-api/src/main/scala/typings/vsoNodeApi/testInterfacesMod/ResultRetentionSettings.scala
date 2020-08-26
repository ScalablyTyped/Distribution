package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultRetentionSettings extends js.Object {
  var automatedResultsRetentionDuration: Double = js.native
  var lastUpdatedBy: IdentityRef = js.native
  var lastUpdatedDate: Date = js.native
  var manualResultsRetentionDuration: Double = js.native
}

object ResultRetentionSettings {
  @scala.inline
  def apply(
    automatedResultsRetentionDuration: Double,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: Date,
    manualResultsRetentionDuration: Double
  ): ResultRetentionSettings = {
    val __obj = js.Dynamic.literal(automatedResultsRetentionDuration = automatedResultsRetentionDuration.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], manualResultsRetentionDuration = manualResultsRetentionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRetentionSettings]
  }
  @scala.inline
  implicit class ResultRetentionSettingsOps[Self <: ResultRetentionSettings] (val x: Self) extends AnyVal {
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
    def setAutomatedResultsRetentionDuration(value: Double): Self = this.set("automatedResultsRetentionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = this.set("lastUpdatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualResultsRetentionDuration(value: Double): Self = this.set("manualResultsRetentionDuration", value.asInstanceOf[js.Any])
  }
  
}

