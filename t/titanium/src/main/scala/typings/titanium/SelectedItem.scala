package typings.titanium

import typings.titanium.Titanium.UI.ListSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments for the <Titanium.UI.ListView.itemsselected> event.
  */
trait SelectedItem extends js.Object {
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

object SelectedItem {
  @scala.inline
  def apply(itemIndex: Int | Double = null, section: ListSection = null, sectionIndex: Int | Double = null): SelectedItem = {
    val __obj = js.Dynamic.literal()
    if (itemIndex != null) __obj.updateDynamic("itemIndex")(itemIndex.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    if (sectionIndex != null) __obj.updateDynamic("sectionIndex")(sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedItem]
  }
}

