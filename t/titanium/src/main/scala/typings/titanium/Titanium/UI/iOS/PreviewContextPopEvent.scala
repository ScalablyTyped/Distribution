package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the user pop the preview. You will most likely open a fullscreen window here.
			 */
trait PreviewContextPopEvent extends PreviewContextBaseEvent {
  /**
  				 * The item ID bound to the list item that generated the event.
  				 */
  var itemId: String
  /**
  				 * The item index of the ListView to identify the selected item.
  				 * Note: This property is only available if the preview context is assigned to a <Titanium.UI.ListView>.
  				 */
  var itemIndex: Double
  /**
  				 * The view to be previewed.
  				 */
  var preview: View
  /**
  				 * The section index of the ListView to identify the selected section.
  				 * Note: This property is only available if the preview context is assigned to a <Titanium.UI.ListView>.
  				 */
  var sectionIndex: Double
}

object PreviewContextPopEvent {
  @scala.inline
  def apply(itemId: String, itemIndex: Double, preview: View, sectionIndex: Double, source: PreviewContext): PreviewContextPopEvent = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContextPopEvent]
  }
}

