package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a <Titanium.UI.ShortcutItem> is clicked.
  */
trait AndroidShortcutitemclickEvent extends AndroidBaseEvent {
  /**
    * Identifier of the clicked shortcut item.
    */
  var id: String
}

object AndroidShortcutitemclickEvent {
  @scala.inline
  def apply(id: String, source: Android): AndroidShortcutitemclickEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidShortcutitemclickEvent]
  }
}

