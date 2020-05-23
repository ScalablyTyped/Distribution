package typings.titanium

import typings.titanium.Titanium.UI.ListSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments for the <Titanium.UI.ListView.prefetch> and <Titanium.UI.ListView.cancelprefetch> events.
  */
trait ListItemEventType extends js.Object {
  /**
    * The item ID bound to the list item that generated the event.
    */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Item index.
    */
  var itemIndex: js.UndefOr[Double] = js.undefined
  /**
    * List section if the item is contained in a list section.
    */
  var section: js.UndefOr[ListSection] = js.undefined
  /**
    * Section index.
    */
  var sectionIndex: js.UndefOr[Double] = js.undefined
}

object ListItemEventType {
  @scala.inline
  def apply(
    itemId: java.lang.String = null,
    itemIndex: js.UndefOr[Double] = js.undefined,
    section: ListSection = null,
    sectionIndex: js.UndefOr[Double] = js.undefined
  ): ListItemEventType = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (!js.isUndefined(itemIndex)) __obj.updateDynamic("itemIndex")(itemIndex.get.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    if (!js.isUndefined(sectionIndex)) __obj.updateDynamic("sectionIndex")(sectionIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemEventType]
  }
}

