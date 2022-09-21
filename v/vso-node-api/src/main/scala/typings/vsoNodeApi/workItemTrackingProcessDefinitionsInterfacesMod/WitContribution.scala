package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WitContribution extends StObject {
  
  /**
    * The id for the contribution.
    */
  var contributionId: String
  
  /**
    * The height for the contribution.
    */
  var height: Double
  
  /**
    * A dictionary holding key value pairs for contribution inputs.
    */
  var inputs: StringDictionary[Any]
  
  /**
    * A value indicating if the contribution should be show on deleted workItem.
    */
  var showOnDeletedWorkItem: Boolean
}
object WitContribution {
  
  inline def apply(
    contributionId: String,
    height: Double,
    inputs: StringDictionary[Any],
    showOnDeletedWorkItem: Boolean
  ): WitContribution = {
    val __obj = js.Dynamic.literal(contributionId = contributionId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], showOnDeletedWorkItem = showOnDeletedWorkItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitContribution]
  }
  
  extension [Self <: WitContribution](x: Self) {
    
    inline def setContributionId(value: String): Self = StObject.set(x, "contributionId", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringDictionary[Any]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setShowOnDeletedWorkItem(value: Boolean): Self = StObject.set(x, "showOnDeletedWorkItem", value.asInstanceOf[js.Any])
  }
}
