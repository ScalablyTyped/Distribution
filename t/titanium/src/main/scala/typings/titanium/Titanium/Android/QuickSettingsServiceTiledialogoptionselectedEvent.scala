package typings.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item from the signle choice menu has been selected.
  */
@js.native
trait QuickSettingsServiceTiledialogoptionselectedEvent extends QuickSettingsServiceBaseEvent {
  /**
    * Index of the selected item from the single choice menu in the dialog.
    */
  var itemIndex: Double = js.native
}

object QuickSettingsServiceTiledialogoptionselectedEvent {
  @scala.inline
  def apply(itemIndex: Double, source: QuickSettingsService): QuickSettingsServiceTiledialogoptionselectedEvent = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickSettingsServiceTiledialogoptionselectedEvent]
  }
  @scala.inline
  implicit class QuickSettingsServiceTiledialogoptionselectedEventOps[Self <: QuickSettingsServiceTiledialogoptionselectedEvent] (val x: Self) extends AnyVal {
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
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
  }
  
}

