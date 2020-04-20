package typings.titanium.Titanium.App

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidEventMap extends ProxyEventMap {
  var shortcutitemclick: AndroidShortcutitemclickEvent
}

object AndroidEventMap {
  @scala.inline
  def apply(shortcutitemclick: AndroidShortcutitemclickEvent): AndroidEventMap = {
    val __obj = js.Dynamic.literal(shortcutitemclick = shortcutitemclick.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidEventMap]
  }
}

