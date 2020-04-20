package typings.titanium.Titanium.App.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserActivityEventMap extends ProxyEventMap {
  var useractivitydeleted: UserActivityUseractivitydeletedEvent
  var useractivitywascontinued: UserActivityUseractivitywascontinuedEvent
  var useractivitywillsave: UserActivityUseractivitywillsaveEvent
}

object UserActivityEventMap {
  @scala.inline
  def apply(
    useractivitydeleted: UserActivityUseractivitydeletedEvent,
    useractivitywascontinued: UserActivityUseractivitywascontinuedEvent,
    useractivitywillsave: UserActivityUseractivitywillsaveEvent
  ): UserActivityEventMap = {
    val __obj = js.Dynamic.literal(useractivitydeleted = useractivitydeleted.asInstanceOf[js.Any], useractivitywascontinued = useractivitywascontinued.asInstanceOf[js.Any], useractivitywillsave = useractivitywillsave.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserActivityEventMap]
  }
}

