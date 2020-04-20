package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultRetentionSettings extends js.Object {
  var automatedResultsRetentionDuration: Double
  var lastUpdatedBy: IdentityRef
  var lastUpdatedDate: Date
  var manualResultsRetentionDuration: Double
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
}

