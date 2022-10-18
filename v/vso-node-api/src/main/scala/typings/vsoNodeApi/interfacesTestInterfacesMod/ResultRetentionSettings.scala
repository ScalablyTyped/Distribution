package typings.vsoNodeApi.interfacesTestInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultRetentionSettings extends StObject {
  
  var automatedResultsRetentionDuration: Double
  
  var lastUpdatedBy: IdentityRef
  
  var lastUpdatedDate: js.Date
  
  var manualResultsRetentionDuration: Double
}
object ResultRetentionSettings {
  
  inline def apply(
    automatedResultsRetentionDuration: Double,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    manualResultsRetentionDuration: Double
  ): ResultRetentionSettings = {
    val __obj = js.Dynamic.literal(automatedResultsRetentionDuration = automatedResultsRetentionDuration.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], manualResultsRetentionDuration = manualResultsRetentionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRetentionSettings]
  }
  
  extension [Self <: ResultRetentionSettings](x: Self) {
    
    inline def setAutomatedResultsRetentionDuration(value: Double): Self = StObject.set(x, "automatedResultsRetentionDuration", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedBy(value: IdentityRef): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setManualResultsRetentionDuration(value: Double): Self = StObject.set(x, "manualResultsRetentionDuration", value.asInstanceOf[js.Any])
  }
}
