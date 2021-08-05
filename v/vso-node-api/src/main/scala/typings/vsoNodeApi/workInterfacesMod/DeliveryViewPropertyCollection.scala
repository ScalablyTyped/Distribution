package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryViewPropertyCollection
  extends StObject
     with PlanPropertyCollection {
  
  /**
    * Card settings
    */
  var cardSettings: CardSettings
  
  /**
    * Field criteria
    */
  var criteria: js.Array[FilterClause]
  
  /**
    * Markers. Will be missing/null if there are no markers.
    */
  var markers: js.Array[Marker]
  
  /**
    * Team backlog mappings
    */
  var teamBacklogMappings: js.Array[TeamBacklogMapping]
}
object DeliveryViewPropertyCollection {
  
  inline def apply(
    cardSettings: CardSettings,
    criteria: js.Array[FilterClause],
    markers: js.Array[Marker],
    teamBacklogMappings: js.Array[TeamBacklogMapping]
  ): DeliveryViewPropertyCollection = {
    val __obj = js.Dynamic.literal(cardSettings = cardSettings.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], teamBacklogMappings = teamBacklogMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryViewPropertyCollection]
  }
  
  extension [Self <: DeliveryViewPropertyCollection](x: Self) {
    
    inline def setCardSettings(value: CardSettings): Self = StObject.set(x, "cardSettings", value.asInstanceOf[js.Any])
    
    inline def setCriteria(value: js.Array[FilterClause]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaVarargs(value: FilterClause*): Self = StObject.set(x, "criteria", js.Array(value :_*))
    
    inline def setMarkers(value: js.Array[Marker]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersVarargs(value: Marker*): Self = StObject.set(x, "markers", js.Array(value :_*))
    
    inline def setTeamBacklogMappings(value: js.Array[TeamBacklogMapping]): Self = StObject.set(x, "teamBacklogMappings", value.asInstanceOf[js.Any])
    
    inline def setTeamBacklogMappingsVarargs(value: TeamBacklogMapping*): Self = StObject.set(x, "teamBacklogMappings", js.Array(value :_*))
  }
}
