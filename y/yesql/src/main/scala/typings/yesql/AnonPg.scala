package typings.yesql

import typings.yesql.yesqlStrings.mysql
import typings.yesql.yesqlStrings.pg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPg extends js.Object {
  var pg: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[pg | mysql] = js.undefined
}

object AnonPg {
  @scala.inline
  def apply(pg: js.UndefOr[Boolean] = js.undefined, `type`: pg | mysql = null): AnonPg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pg)) __obj.updateDynamic("pg")(pg.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPg]
  }
}

