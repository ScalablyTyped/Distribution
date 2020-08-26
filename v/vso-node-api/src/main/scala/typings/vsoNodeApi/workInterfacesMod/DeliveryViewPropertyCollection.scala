package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class DeliveryViewPropertyCollectionOps[Self <: DeliveryViewPropertyCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCardSettings(value: CardSettings): Self = this.set("cardSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setCriteriaVarargs(value: FilterClause*): Self = this.set("criteria", js.Array(value :_*))
    @scala.inline
    def setCriteria(value: js.Array[FilterClause]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkersVarargs(value: Marker*): Self = this.set("markers", js.Array(value :_*))
    @scala.inline
    def setMarkers(value: js.Array[Marker]): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamBacklogMappingsVarargs(value: TeamBacklogMapping*): Self = this.set("teamBacklogMappings", js.Array(value :_*))
    @scala.inline
    def setTeamBacklogMappings(value: js.Array[TeamBacklogMapping]): Self = this.set("teamBacklogMappings", value.asInstanceOf[js.Any])
  }
  
}

