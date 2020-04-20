package typings.titanium.Titanium.App.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefaultsEventMap extends ProxyEventMap {
  var change: UserDefaultsChangeEvent
}

object UserDefaultsEventMap {
  @scala.inline
  def apply(change: UserDefaultsChangeEvent): UserDefaultsEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefaultsEventMap]
  }
}

