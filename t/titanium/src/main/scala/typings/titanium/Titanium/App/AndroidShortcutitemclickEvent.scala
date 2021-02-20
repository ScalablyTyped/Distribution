package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a <Titanium.UI.ShortcutItem> is clicked.
  */
@js.native
trait AndroidShortcutitemclickEvent extends AndroidBaseEvent {
  
  /**
    * Identifier of the clicked shortcut item.
    */
  var id: String = js.native
}
object AndroidShortcutitemclickEvent {
  
  @scala.inline
  def apply(id: String, source: Android): AndroidShortcutitemclickEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidShortcutitemclickEvent]
  }
  
  @scala.inline
  implicit class AndroidShortcutitemclickEventMutableBuilder[Self <: AndroidShortcutitemclickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
