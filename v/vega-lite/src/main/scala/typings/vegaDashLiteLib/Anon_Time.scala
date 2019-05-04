package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Time extends js.Object {
  var time: js.UndefOr[scala.Boolean] = js.undefined
  var timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit
  var `type`: js.UndefOr[vegaDashLiteLib.buildSrcTypeMod.Type] = js.undefined
  var undefinedIfExprNotRequired: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Time {
  @scala.inline
  def apply(
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit,
    time: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: vegaDashLiteLib.buildSrcTypeMod.Type = null,
    undefinedIfExprNotRequired: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Time = {
    val __obj = js.Dynamic.literal(timeUnit = timeUnit)
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(undefinedIfExprNotRequired)) __obj.updateDynamic("undefinedIfExprNotRequired")(undefinedIfExprNotRequired)
    __obj.asInstanceOf[Anon_Time]
  }
}

