package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a <Titanium.UI.ShortcutItem> is clicked.
  */
@js.native
trait AppShortcutitemclickEvent extends AppBaseEvent {
  
  /**
    * Identifier of the clicked shortcut item.
    */
  var id: String = js.native
}
object AppShortcutitemclickEvent {
  
  @scala.inline
  def apply(id: String, source: App): AppShortcutitemclickEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppShortcutitemclickEvent]
  }
  
  @scala.inline
  implicit class AppShortcutitemclickEventMutableBuilder[Self <: AppShortcutitemclickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
