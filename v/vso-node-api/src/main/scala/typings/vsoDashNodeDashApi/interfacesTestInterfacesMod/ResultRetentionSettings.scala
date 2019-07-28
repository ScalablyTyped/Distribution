package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(automatedResultsRetentionDuration = automatedResultsRetentionDuration, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, manualResultsRetentionDuration = manualResultsRetentionDuration)
  
    __obj.asInstanceOf[ResultRetentionSettings]
  }
}

