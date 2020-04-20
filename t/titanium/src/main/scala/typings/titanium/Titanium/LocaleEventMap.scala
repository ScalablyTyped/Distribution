package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleEventMap extends ProxyEventMap {
  var change: LocaleChangeEvent
}

object LocaleEventMap {
  @scala.inline
  def apply(change: LocaleChangeEvent): LocaleEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleEventMap]
  }
}

