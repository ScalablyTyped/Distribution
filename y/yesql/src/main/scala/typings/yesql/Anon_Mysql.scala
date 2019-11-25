package typings.yesql

import typings.yesql.yesqlStrings.mysql
import typings.yesql.yesqlStrings.pg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mysql extends js.Object {
  var pg: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[pg | mysql] = js.undefined
}

object Anon_Mysql {
  @scala.inline
  def apply(pg: js.UndefOr[Boolean] = js.undefined, `type`: pg | mysql = null): Anon_Mysql = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pg)) __obj.updateDynamic("pg")(pg.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mysql]
  }
}

