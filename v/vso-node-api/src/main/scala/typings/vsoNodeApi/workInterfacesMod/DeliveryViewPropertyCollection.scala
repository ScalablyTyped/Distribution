package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryViewPropertyCollection extends PlanPropertyCollection {
  
  /**
    * Card settings
    */
  var cardSettings: CardSettings = js.native
  
  /**
    * Field criteria
    */
  var criteria: js.Array[FilterClause] = js.native
  
  /**
    * Markers. Will be missing/null if there are no markers.
    */
  var markers: js.Array[Marker] = js.native
  
  /**
    * Team backlog mappings
    */
  var teamBacklogMappings: js.Array[TeamBacklogMapping] = js.native
}
object DeliveryViewPropertyCollection {
  
  @scala.inline
  def apply(
    cardSettings: CardSettings,
    criteria: js.Array[FilterClause],
    markers: js.Array[Marker],
    teamBacklogMappings: js.Array[TeamBacklogMapping]
  ): DeliveryViewPropertyCollection = {
    val __obj = js.Dynamic.literal(cardSettings = cardSettings.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], teamBacklogMappings = teamBacklogMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryViewPropertyCollection]
  }
  
  @scala.inline
  implicit class DeliveryViewPropertyCollectionMutableBuilder[Self <: DeliveryViewPropertyCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardSettings(value: CardSettings): Self = StObject.set(x, "cardSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteria(value: js.Array[FilterClause]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaVarargs(value: FilterClause*): Self = StObject.set(x, "criteria", js.Array(value :_*))
    
    @scala.inline
    def setMarkers(value: js.Array[Marker]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersVarargs(value: Marker*): Self = StObject.set(x, "markers", js.Array(value :_*))
    
    @scala.inline
    def setTeamBacklogMappings(value: js.Array[TeamBacklogMapping]): Self = StObject.set(x, "teamBacklogMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamBacklogMappingsVarargs(value: TeamBacklogMapping*): Self = StObject.set(x, "teamBacklogMappings", js.Array(value :_*))
  }
}
