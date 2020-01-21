package typings.yesql

import typings.yesql.yesqlStrings.mysql
import typings.yesql.yesqlStrings.pg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMysql extends js.Object {
  var pg: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[pg | mysql] = js.undefined
}

object AnonMysql {
  @scala.inline
  def apply(pg: js.UndefOr[Boolean] = js.undefined, `type`: pg | mysql = null): AnonMysql = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pg)) __obj.updateDynamic("pg")(pg.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMysql]
  }
}

