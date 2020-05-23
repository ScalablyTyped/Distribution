package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a user taps the Application Shortcut.
  */
trait iOSShortcutitemclickEvent extends iOSBaseEvent {
  /**
    * The unique identifier for the application shortcut.
    */
  var itemtype: String
  /**
    * The subtitle of the application shortcut.
    */
  var subtitle: String
  /**
    * The title of the application shortcut.
    */
  var title: String
  /**
    * The payload passed by the application shortcut.
    */
  var userInfo: js.Any
}

object iOSShortcutitemclickEvent {
  @scala.inline
  def apply(itemtype: String, source: iOS, subtitle: String, title: String, userInfo: js.Any): iOSShortcutitemclickEvent = {
    val __obj = js.Dynamic.literal(itemtype = itemtype.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSShortcutitemclickEvent]
  }
}

