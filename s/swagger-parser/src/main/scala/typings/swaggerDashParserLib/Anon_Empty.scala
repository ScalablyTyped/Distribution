package typings
package swaggerDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Empty extends js.Object {
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var unknown: js.UndefOr[scala.Boolean] = js.undefined
  var yaml: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Empty {
  @scala.inline
  def apply(
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    unknown: js.UndefOr[scala.Boolean] = js.undefined,
    yaml: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Empty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (!js.isUndefined(unknown)) __obj.updateDynamic("unknown")(unknown)
    if (!js.isUndefined(yaml)) __obj.updateDynamic("yaml")(yaml)
    __obj.asInstanceOf[Anon_Empty]
  }
}

