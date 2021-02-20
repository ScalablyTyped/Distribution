package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultRetentionSettings extends StObject {
  
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
  implicit class ResultRetentionSettingsMutableBuilder[Self <: ResultRetentionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatedResultsRetentionDuration(value: Double): Self = StObject.set(x, "automatedResultsRetentionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualResultsRetentionDuration(value: Double): Self = StObject.set(x, "manualResultsRetentionDuration", value.asInstanceOf[js.Any])
  }
}
