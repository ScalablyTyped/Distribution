package typings.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An item from the signle choice menu has been selected.
		 */
trait QuickSettingsServiceTiledialogoptionselectedEvent extends QuickSettingsServiceBaseEvent {
  /**
  			 * Index of the selected item from the single choice menu in the dialog.
  			 */
  var itemIndex: Double
}

object QuickSettingsServiceTiledialogoptionselectedEvent {
  @scala.inline
  def apply(itemIndex: Double, source: QuickSettingsService): QuickSettingsServiceTiledialogoptionselectedEvent = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickSettingsServiceTiledialogoptionselectedEvent]
  }
}

