package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventName extends js.Object {
  var eventName: String
  var message: String
  var name: String
}

object EventName {
  @scala.inline
  def apply(eventName: String, message: String, name: String): EventName = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName]
  }
}

