package typings
package vegaDashTypingsLib.typesSpecStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamParameters extends js.Object {
  var between: js.UndefOr[js.Array[Stream]] = js.undefined
  var consume: js.UndefOr[scala.Boolean] = js.undefined
  var debounce: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[
    vegaDashTypingsLib.typesSpecExprMod.Expr | js.Array[vegaDashTypingsLib.typesSpecExprMod.Expr]
  ] = js.undefined
  var markname: js.UndefOr[java.lang.String] = js.undefined
  var marktype: js.UndefOr[vegaDashTypingsLib.typesSpecMarktypeMod.MarkType] = js.undefined
  var throttle: js.UndefOr[scala.Double] = js.undefined
}

object StreamParameters {
  @scala.inline
  def apply(
    between: js.Array[Stream] = null,
    consume: js.UndefOr[scala.Boolean] = js.undefined,
    debounce: scala.Int | scala.Double = null,
    filter: vegaDashTypingsLib.typesSpecExprMod.Expr | js.Array[vegaDashTypingsLib.typesSpecExprMod.Expr] = null,
    markname: java.lang.String = null,
    marktype: vegaDashTypingsLib.typesSpecMarktypeMod.MarkType = null,
    throttle: scala.Int | scala.Double = null
  ): StreamParameters = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(between)
    if (!js.isUndefined(consume)) __obj.updateDynamic("consume")(consume)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (markname != null) __obj.updateDynamic("markname")(markname)
    if (marktype != null) __obj.updateDynamic("marktype")(marktype)
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamParameters]
  }
}

