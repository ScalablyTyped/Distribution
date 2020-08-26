package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the application is woken up by a silent remote notification. Available only on iOS 7 and later.
  */
@js.native
trait iOSSilentpushEvent extends iOSBaseEvent {
  /**
    * Unique string identifier for the `silentpush` event. This identifier should be passed as the argument
    * to the [endBackgroundHandler](Titanium.App.iOS.endBackgroundHandler) method.
    */
  var handlerId: String = js.native
}

object iOSSilentpushEvent {
  @scala.inline
  def apply(handlerId: String, source: iOS): iOSSilentpushEvent = {
    val __obj = js.Dynamic.literal(handlerId = handlerId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSSilentpushEvent]
  }
  @scala.inline
  implicit class iOSSilentpushEventOps[Self <: iOSSilentpushEvent] (val x: Self) extends AnyVal {
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
    def setHandlerId(value: String): Self = this.set("handlerId", value.asInstanceOf[js.Any])
  }
  
}

