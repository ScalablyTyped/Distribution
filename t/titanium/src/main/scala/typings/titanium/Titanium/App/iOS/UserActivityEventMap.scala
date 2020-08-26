package typings.titanium.Titanium.App.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserActivityEventMap extends ProxyEventMap {
  var useractivitydeleted: UserActivityUseractivitydeletedEvent = js.native
  var useractivitywascontinued: UserActivityUseractivitywascontinuedEvent = js.native
  var useractivitywillsave: UserActivityUseractivitywillsaveEvent = js.native
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
  @scala.inline
  implicit class UserActivityEventMapOps[Self <: UserActivityEventMap] (val x: Self) extends AnyVal {
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
    def setUseractivitydeleted(value: UserActivityUseractivitydeletedEvent): Self = this.set("useractivitydeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseractivitywascontinued(value: UserActivityUseractivitywascontinuedEvent): Self = this.set("useractivitywascontinued", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseractivitywillsave(value: UserActivityUseractivitywillsaveEvent): Self = this.set("useractivitywillsave", value.asInstanceOf[js.Any])
  }
  
}

