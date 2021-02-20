package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a user taps the Application Shortcut.
  */
@js.native
trait iOSShortcutitemclickEvent extends iOSBaseEvent {
  
  /**
    * The unique identifier for the application shortcut.
    */
  var itemtype: String = js.native
  
  /**
    * The subtitle of the application shortcut.
    */
  var subtitle: String = js.native
  
  /**
    * The title of the application shortcut.
    */
  var title: String = js.native
  
  /**
    * The payload passed by the application shortcut.
    */
  var userInfo: js.Any = js.native
}
object iOSShortcutitemclickEvent {
  
  @scala.inline
  def apply(itemtype: String, source: iOS, subtitle: String, title: String, userInfo: js.Any): iOSShortcutitemclickEvent = {
    val __obj = js.Dynamic.literal(itemtype = itemtype.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSShortcutitemclickEvent]
  }
  
  @scala.inline
  implicit class iOSShortcutitemclickEventMutableBuilder[Self <: iOSShortcutitemclickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemtype(value: String): Self = StObject.set(x, "itemtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
