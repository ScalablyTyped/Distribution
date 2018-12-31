package typings
package winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushNotificationChannel extends js.Object {
  var expirationTime: stdLib.Date
  var onpushnotificationreceived: js.Any
  var uri: java.lang.String
  def close(): scala.Unit
}

