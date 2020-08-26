package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a user selects an action for an interactive remote notification.
  */
@js.native
trait iOSRemotenotificationactionEvent extends iOSBaseEvent {
  /**
    * Identifier of the category of the interactive notification.
    */
  var category: String = js.native
  /**
    * The payload passed to the Apple Push Notification Service.
    */
  var data: js.Any = js.native
  /**
    * Identifier of the action that was selected of the interactive notification.
    */
  var identifier: String = js.native
}

object iOSRemotenotificationactionEvent {
  @scala.inline
  def apply(category: String, data: js.Any, identifier: String, source: iOS): iOSRemotenotificationactionEvent = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSRemotenotificationactionEvent]
  }
  @scala.inline
  implicit class iOSRemotenotificationactionEventOps[Self <: iOSRemotenotificationactionEvent] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
  }
  
}

