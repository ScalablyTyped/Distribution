package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsEventMap extends ProxyEventMap {
  var reload: ContactsReloadEvent
}

object ContactsEventMap {
  @scala.inline
  def apply(reload: ContactsReloadEvent): ContactsEventMap = {
    val __obj = js.Dynamic.literal(reload = reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsEventMap]
  }
}

