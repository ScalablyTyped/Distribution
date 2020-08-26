package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class iOSShortcutitemclickEventOps[Self <: iOSShortcutitemclickEvent] (val x: Self) extends AnyVal {
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
    def setItemtype(value: String): Self = this.set("itemtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
  
}

