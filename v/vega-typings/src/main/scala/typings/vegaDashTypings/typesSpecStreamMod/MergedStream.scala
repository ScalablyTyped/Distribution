package typings.vegaDashTypings.typesSpecStreamMod

import typings.vegaDashTypings.typesSpecExprMod.Expr
import typings.vegaDashTypings.typesSpecMarktypeMod.MarkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergedStream
  extends _Stream
     with StreamParameters {
  var merge: js.Array[Stream]
}

object MergedStream {
  @scala.inline
  def apply(
    merge: js.Array[Stream],
    between: js.Array[Stream] = null,
    consume: js.UndefOr[Boolean] = js.undefined,
    debounce: Int | Double = null,
    filter: Expr | js.Array[Expr] = null,
    markname: String = null,
    marktype: MarkType = null,
    throttle: Int | Double = null
  ): MergedStream = {
    val __obj = js.Dynamic.literal(merge = merge)
    if (between != null) __obj.updateDynamic("between")(between)
    if (!js.isUndefined(consume)) __obj.updateDynamic("consume")(consume)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (markname != null) __obj.updateDynamic("markname")(markname)
    if (marktype != null) __obj.updateDynamic("marktype")(marktype)
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedStream]
  }
}

