package typings.twilioDashChat.libPushnotificationMod.PushNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  var action: String
  var badge: Double
  var body: String
  var data: js.Object
  var sound: String
  var title: String
  var `type`: Type
}

object Descriptor {
  @scala.inline
  def apply(
    action: String,
    badge: Double,
    body: String,
    data: js.Object,
    sound: String,
    title: String,
    `type`: Type
  ): Descriptor = {
    val __obj = js.Dynamic.literal(action = action, badge = badge, body = body, data = data, sound = sound, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Descriptor]
  }
}

