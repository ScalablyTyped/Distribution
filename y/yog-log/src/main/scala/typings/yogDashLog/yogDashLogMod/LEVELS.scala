package typings.yogDashLog.yogDashLogMod

import typings.yogDashLog.yogDashLogStrings.ACCESS
import typings.yogDashLog.yogDashLogStrings.ACCESS_ERROR
import typings.yogDashLog.yogDashLogStrings.DEBUG
import typings.yogDashLog.yogDashLogStrings.FATAL
import typings.yogDashLog.yogDashLogStrings.NOTICE
import typings.yogDashLog.yogDashLogStrings.TRACE
import typings.yogDashLog.yogDashLogStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LEVELS extends js.Object {
  // 访问日志
  var `0`: ACCESS
  // 应用日志等级 ODP格式
  var `1`: FATAL
  var `16`: DEBUG
  var `2`: WARNING
  var `3`: ACCESS_ERROR
  var `4`: NOTICE
  var `8`: TRACE
}

object LEVELS {
  @scala.inline
  def apply(`0`: ACCESS, `1`: FATAL, `16`: DEBUG, `2`: WARNING, `3`: ACCESS_ERROR, `4`: NOTICE, `8`: TRACE): LEVELS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`)
    __obj.updateDynamic("1")(`1`)
    __obj.updateDynamic("16")(`16`)
    __obj.updateDynamic("2")(`2`)
    __obj.updateDynamic("3")(`3`)
    __obj.updateDynamic("4")(`4`)
    __obj.updateDynamic("8")(`8`)
    __obj.asInstanceOf[LEVELS]
  }
}

