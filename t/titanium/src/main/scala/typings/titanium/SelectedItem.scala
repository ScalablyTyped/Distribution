package typings.titanium

import typings.titanium.Titanium.UI.ListSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments for the <Titanium.UI.ListView.itemsselected> event.
  */
@js.native
trait SelectedItem extends js.Object {
  /**
    * Item index.
    */
  var itemIndex: js.UndefOr[Double] = js.native
  /**
    * List section if the item is contained in a list section.
    */
  var section: js.UndefOr[ListSection] = js.native
  /**
    * Section index.
    */
  var sectionIndex: js.UndefOr[Double] = js.native
}

object SelectedItem {
  @scala.inline
  def apply(): SelectedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItem]
  }
  @scala.inline
  implicit class SelectedItemOps[Self <: SelectedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemIndex: Self = this.set("itemIndex", js.undefined)
    @scala.inline
    def setSection(value: ListSection): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    @scala.inline
    def setSectionIndex(value: Double): Self = this.set("sectionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionIndex: Self = this.set("sectionIndex", js.undefined)
  }
  
}

