package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactsEventMap extends ProxyEventMap {
  var reload: ContactsReloadEvent = js.native
}

object ContactsEventMap {
  @scala.inline
  def apply(reload: ContactsReloadEvent): ContactsEventMap = {
    val __obj = js.Dynamic.literal(reload = reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsEventMap]
  }
  @scala.inline
  implicit class ContactsEventMapOps[Self <: ContactsEventMap] (val x: Self) extends AnyVal {
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
    def setReload(value: ContactsReloadEvent): Self = this.set("reload", value.asInstanceOf[js.Any])
  }
  
}

