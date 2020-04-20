package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends js.Object {
  var command: String
  var date: String
  var ip: String
  var time: String
  var tty: String
  var user: String
}

object UserData {
  @scala.inline
  def apply(command: String, date: String, ip: String, time: String, tty: String, user: String): UserData = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
}

