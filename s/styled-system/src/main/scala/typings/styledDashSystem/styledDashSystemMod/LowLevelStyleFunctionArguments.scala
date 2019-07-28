package typings.styledDashSystem.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowLevelStyleFunctionArguments[N, S] extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var cssProperty: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var prop: String
  // new v5 api
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  var scale: js.UndefOr[S] = js.undefined
  var transformValue: js.UndefOr[js.Function2[/* n */ N, /* scale */ js.UndefOr[S], _]] = js.undefined
}

object LowLevelStyleFunctionArguments {
  @scala.inline
  def apply[N, S](
    prop: String,
    alias: String = null,
    cssProperty: String = null,
    key: String = null,
    properties: js.Array[String] = null,
    scale: S = null,
    transformValue: (/* n */ N, /* scale */ js.UndefOr[S]) => _ = null
  ): LowLevelStyleFunctionArguments[N, S] = {
    val __obj = js.Dynamic.literal(prop = prop)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (cssProperty != null) __obj.updateDynamic("cssProperty")(cssProperty)
    if (key != null) __obj.updateDynamic("key")(key)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (transformValue != null) __obj.updateDynamic("transformValue")(js.Any.fromFunction2(transformValue))
    __obj.asInstanceOf[LowLevelStyleFunctionArguments[N, S]]
  }
}

