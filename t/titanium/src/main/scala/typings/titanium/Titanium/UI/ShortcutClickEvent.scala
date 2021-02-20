package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a <Titanium.UI.ShortcutItem> was clicked on.
  */
@js.native
trait ShortcutClickEvent extends ShortcutBaseEvent {
  
  /**
    * The shortcut item clicked.
    */
  var item: ShortcutItem = js.native
}
object ShortcutClickEvent {
  
  @scala.inline
  def apply(item: ShortcutItem, source: Shortcut): ShortcutClickEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutClickEvent]
  }
  
  @scala.inline
  implicit class ShortcutClickEventMutableBuilder[Self <: ShortcutClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ShortcutItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
