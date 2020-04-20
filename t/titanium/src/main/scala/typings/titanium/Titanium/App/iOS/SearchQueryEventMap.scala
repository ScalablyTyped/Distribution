package typings.titanium.Titanium.App.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchQueryEventMap extends ProxyEventMap {
  var completed: SearchQueryCompletedEvent
  var founditems: SearchQueryFounditemsEvent
}

object SearchQueryEventMap {
  @scala.inline
  def apply(completed: SearchQueryCompletedEvent, founditems: SearchQueryFounditemsEvent): SearchQueryEventMap = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], founditems = founditems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryEventMap]
  }
}

