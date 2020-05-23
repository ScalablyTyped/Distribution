package typings.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the query finds a new batch of matching items.
  */
trait SearchQueryFounditemsEvent extends SearchQueryBaseEvent {
  /**
    * The number of items that are currently fetched.
    */
  var foundItemsCount: Double
  /**
    * An array of indexed items that match the specified query.
    */
  var items: js.Array[SearchableItem]
}

object SearchQueryFounditemsEvent {
  @scala.inline
  def apply(foundItemsCount: Double, items: js.Array[SearchableItem], source: SearchQuery): SearchQueryFounditemsEvent = {
    val __obj = js.Dynamic.literal(foundItemsCount = foundItemsCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryFounditemsEvent]
  }
}

