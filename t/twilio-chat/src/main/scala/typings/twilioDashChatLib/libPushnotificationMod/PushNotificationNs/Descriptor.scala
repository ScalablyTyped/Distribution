package typings
package twilioDashChatLib.libPushnotificationMod.PushNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  var action: java.lang.String
  var badge: scala.Double
  var body: java.lang.String
  var data: js.Object
  var sound: java.lang.String
  var title: java.lang.String
  var `type`: Type
}

object Descriptor {
  @scala.inline
  def apply(
    action: java.lang.String,
    badge: scala.Double,
    body: java.lang.String,
    data: js.Object,
    sound: java.lang.String,
    title: java.lang.String,
    `type`: Type
  ): Descriptor = {
    val __obj = js.Dynamic.literal(action = action, badge = badge, body = body, data = data, sound = sound, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Descriptor]
  }
}

