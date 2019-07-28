package typings.vegaDashLite

import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaDashLite.buildSrcTypeMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Time extends js.Object {
  var time: js.UndefOr[Boolean] = js.undefined
  var timeUnit: TimeUnit
  var `type`: js.UndefOr[Type] = js.undefined
  var undefinedIfExprNotRequired: js.UndefOr[Boolean] = js.undefined
}

object Anon_Time {
  @scala.inline
  def apply(
    timeUnit: TimeUnit,
    time: js.UndefOr[Boolean] = js.undefined,
    `type`: Type = null,
    undefinedIfExprNotRequired: js.UndefOr[Boolean] = js.undefined
  ): Anon_Time = {
    val __obj = js.Dynamic.literal(timeUnit = timeUnit)
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(undefinedIfExprNotRequired)) __obj.updateDynamic("undefinedIfExprNotRequired")(undefinedIfExprNotRequired)
    __obj.asInstanceOf[Anon_Time]
  }
}

