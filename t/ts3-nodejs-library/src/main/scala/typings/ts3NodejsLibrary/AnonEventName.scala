package typings.ts3NodejsLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventName extends js.Object {
  var eventName: String
  var message: String
  var name: String
}

object AnonEventName {
  @scala.inline
  def apply(eventName: String, message: String, name: String): AnonEventName = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventName]
  }
}

