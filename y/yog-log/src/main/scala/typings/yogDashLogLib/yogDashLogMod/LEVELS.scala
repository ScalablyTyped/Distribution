package typings
package yogDashLogLib.yogDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LEVELS extends js.Object {
  // 访问日志
  var `0`: yogDashLogLib.yogDashLogLibStrings.ACCESS
  // 应用日志等级 ODP格式
  var `1`: yogDashLogLib.yogDashLogLibStrings.FATAL
  var `16`: yogDashLogLib.yogDashLogLibStrings.DEBUG
  var `2`: yogDashLogLib.yogDashLogLibStrings.WARNING
  var `3`: yogDashLogLib.yogDashLogLibStrings.ACCESS_ERROR
  var `4`: yogDashLogLib.yogDashLogLibStrings.NOTICE
  var `8`: yogDashLogLib.yogDashLogLibStrings.TRACE
}

object LEVELS {
  @scala.inline
  def apply(
    `0`: yogDashLogLib.yogDashLogLibStrings.ACCESS,
    `1`: yogDashLogLib.yogDashLogLibStrings.FATAL,
    `16`: yogDashLogLib.yogDashLogLibStrings.DEBUG,
    `2`: yogDashLogLib.yogDashLogLibStrings.WARNING,
    `3`: yogDashLogLib.yogDashLogLibStrings.ACCESS_ERROR,
    `4`: yogDashLogLib.yogDashLogLibStrings.NOTICE,
    `8`: yogDashLogLib.yogDashLogLibStrings.TRACE
  ): LEVELS = {
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

