package typings.yesql.anon

import typings.yesql.yesqlStrings.mysql
import typings.yesql.yesqlStrings.pg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pg extends js.Object {
  var pg: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[pg | mysql] = js.undefined
}

object Pg {
  @scala.inline
  def apply(pg: js.UndefOr[Boolean] = js.undefined, `type`: pg | mysql = null): Pg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pg)) __obj.updateDynamic("pg")(pg.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pg]
  }
}

