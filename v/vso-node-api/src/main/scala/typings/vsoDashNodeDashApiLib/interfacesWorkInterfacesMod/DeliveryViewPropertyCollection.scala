package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryViewPropertyCollection extends PlanPropertyCollection {
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
  @scala.inline
  def apply(
    cardSettings: CardSettings,
    criteria: js.Array[FilterClause],
    markers: js.Array[Marker],
    teamBacklogMappings: js.Array[TeamBacklogMapping]
  ): DeliveryViewPropertyCollection = {
    val __obj = js.Dynamic.literal(cardSettings = cardSettings, criteria = criteria, markers = markers, teamBacklogMappings = teamBacklogMappings)
  
    __obj.asInstanceOf[DeliveryViewPropertyCollection]
  }
}

