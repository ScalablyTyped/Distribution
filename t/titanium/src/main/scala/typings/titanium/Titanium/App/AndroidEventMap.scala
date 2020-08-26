package typings.titanium.Titanium.App

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidEventMap extends ProxyEventMap {
  var shortcutitemclick: AndroidShortcutitemclickEvent = js.native
}

object AndroidEventMap {
  @scala.inline
  def apply(shortcutitemclick: AndroidShortcutitemclickEvent): AndroidEventMap = {
    val __obj = js.Dynamic.literal(shortcutitemclick = shortcutitemclick.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidEventMap]
  }
  @scala.inline
  implicit class AndroidEventMapOps[Self <: AndroidEventMap] (val x: Self) extends AnyVal {
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
    def setShortcutitemclick(value: AndroidShortcutitemclickEvent): Self = this.set("shortcutitemclick", value.asInstanceOf[js.Any])
  }
  
}

