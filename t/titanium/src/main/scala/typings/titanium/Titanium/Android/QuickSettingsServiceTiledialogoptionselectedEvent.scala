package typings.titanium.Titanium.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class QuickSettingsServiceTiledialogoptionselectedEventMutableBuilder[Self <: QuickSettingsServiceTiledialogoptionselectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
  }
}
