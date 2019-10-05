package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(command = command, date = date, ip = ip, time = time, tty = tty, user = user)
  
    __obj.asInstanceOf[UserData]
  }
}

