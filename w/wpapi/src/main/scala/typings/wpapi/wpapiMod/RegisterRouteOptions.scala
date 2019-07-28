package typings.wpapi.wpapiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterRouteOptions extends js.Object {
  var methods: js.UndefOr[js.Array[HTTPMethod]] = js.undefined
  var mixins: js.UndefOr[StringDictionary[js.Function1[/* val */ js.Any, _]]] = js.undefined
  var params: js.UndefOr[js.Array[String]] = js.undefined
}

object RegisterRouteOptions {
  @scala.inline
  def apply(
    methods: js.Array[HTTPMethod] = null,
    mixins: StringDictionary[js.Function1[/* val */ js.Any, _]] = null,
    params: js.Array[String] = null
  ): RegisterRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RegisterRouteOptions]
  }
}

