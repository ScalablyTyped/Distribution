package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends js.Object {
  var command: java.lang.String
  var date: java.lang.String
  var ip: java.lang.String
  var time: java.lang.String
  var tty: java.lang.String
  var user: java.lang.String
}

object UserData {
  @scala.inline
  def apply(
    command: java.lang.String,
    date: java.lang.String,
    ip: java.lang.String,
    time: java.lang.String,
    tty: java.lang.String,
    user: java.lang.String
  ): UserData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("tty")(tty)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[UserData]
  }
}

