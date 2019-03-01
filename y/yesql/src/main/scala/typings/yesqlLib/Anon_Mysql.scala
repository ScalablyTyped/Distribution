package typings
package yesqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mysql extends js.Object {
  var pg: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[yesqlLib.yesqlLibStrings.pg | yesqlLib.yesqlLibStrings.mysql] = js.undefined
}

object Anon_Mysql {
  @scala.inline
  def apply(
    pg: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: yesqlLib.yesqlLibStrings.pg | yesqlLib.yesqlLibStrings.mysql = null
  ): Anon_Mysql = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pg)) __obj.updateDynamic("pg")(pg)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mysql]
  }
}

