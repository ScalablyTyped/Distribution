package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultRetentionSettings extends js.Object {
  var automatedResultsRetentionDuration: scala.Double
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastUpdatedDate: stdLib.Date
  var manualResultsRetentionDuration: scala.Double
}

object ResultRetentionSettings {
  @scala.inline
  def apply(
    automatedResultsRetentionDuration: scala.Double,
    lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastUpdatedDate: stdLib.Date,
    manualResultsRetentionDuration: scala.Double
  ): ResultRetentionSettings = {
    val __obj = js.Dynamic.literal(automatedResultsRetentionDuration = automatedResultsRetentionDuration, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, manualResultsRetentionDuration = manualResultsRetentionDuration)
  
    __obj.asInstanceOf[ResultRetentionSettings]
  }
}

