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

