package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WitContribution extends StObject {
  
  /**
    * The id for the contribution.
    */
  var contributionId: String = js.native
  
  /**
    * The height for the contribution.
    */
  var height: Double = js.native
  
  /**
    * A dictionary holding key value pairs for contribution inputs.
    */
  var inputs: StringDictionary[js.Any] = js.native
  
  /**
    * A value indicating if the contribution should be show on deleted workItem.
    */
  var showOnDeletedWorkItem: Boolean = js.native
}
object WitContribution {
  
  @scala.inline
  def apply(
    contributionId: String,
    height: Double,
    inputs: StringDictionary[js.Any],
    showOnDeletedWorkItem: Boolean
  ): WitContribution = {
    val __obj = js.Dynamic.literal(contributionId = contributionId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], showOnDeletedWorkItem = showOnDeletedWorkItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitContribution]
  }
  
  @scala.inline
  implicit class WitContributionMutableBuilder[Self <: WitContribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContributionId(value: String): Self = StObject.set(x, "contributionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: StringDictionary[js.Any]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnDeletedWorkItem(value: Boolean): Self = StObject.set(x, "showOnDeletedWorkItem", value.asInstanceOf[js.Any])
  }
}
