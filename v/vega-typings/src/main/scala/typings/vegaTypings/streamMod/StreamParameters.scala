package typings.vegaTypings.streamMod

import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.marktypeMod.MarkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamParameters extends js.Object {
  var between: js.UndefOr[js.Array[Stream]] = js.undefined
  var consume: js.UndefOr[Boolean] = js.undefined
  var debounce: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[Expr | js.Array[Expr]] = js.undefined
  var markname: js.UndefOr[String] = js.undefined
  var marktype: js.UndefOr[MarkType] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
}

object StreamParameters {
  @scala.inline
  def apply(
    between: js.Array[Stream] = null,
    consume: js.UndefOr[Boolean] = js.undefined,
    debounce: Int | Double = null,
    filter: Expr | js.Array[Expr] = null,
    markname: String = null,
    marktype: MarkType = null,
    throttle: Int | Double = null
  ): StreamParameters = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (!js.isUndefined(consume)) __obj.updateDynamic("consume")(consume.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (markname != null) __obj.updateDynamic("markname")(markname.asInstanceOf[js.Any])
    if (marktype != null) __obj.updateDynamic("marktype")(marktype.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamParameters]
  }
}

