package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the index bar is clicked by the user.
		 */
trait ListViewIndexclickEvent extends ListViewBaseEvent {
  /**
  			 * The index number clicked.
  			 */
  var index: Double
  /**
  			 * The title of the index clicked.
  			 */
  var title: String
}

object ListViewIndexclickEvent {
  @scala.inline
  def apply(index: Double, source: ListView, title: String): ListViewIndexclickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewIndexclickEvent]
  }
}

