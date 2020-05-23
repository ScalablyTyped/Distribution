package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a <Titanium.UI.ShortcutItem> is clicked.
  */
trait AppShortcutitemclickEvent extends AppBaseEvent {
  /**
    * Identifier of the clicked shortcut item.
    */
  var id: String
}

object AppShortcutitemclickEvent {
  @scala.inline
  def apply(id: String, source: App): AppShortcutitemclickEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppShortcutitemclickEvent]
  }
}

