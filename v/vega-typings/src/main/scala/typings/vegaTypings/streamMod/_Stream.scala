package typings.vegaTypings.streamMod

import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.marktypeMod.MarkType
import typings.vegaTypings.onEventsMod._EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Stream extends _EventListener

object _Stream {
  @scala.inline
  def DerivedStream(
    stream: Stream,
    between: js.Array[Stream] = null,
    consume: js.UndefOr[Boolean] = js.undefined,
    debounce: Int | Double = null,
    filter: Expr | js.Array[Expr] = null,
    markname: String = null,
    marktype: MarkType = null,
    throttle: Int | Double = null
  ): _Stream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (!js.isUndefined(consume)) __obj.updateDynamic("consume")(consume.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (markname != null) __obj.updateDynamic("markname")(markname.asInstanceOf[js.Any])
    if (marktype != null) __obj.updateDynamic("marktype")(marktype.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Stream]
  }
  @scala.inline
  def MergedStream(
    merge: js.Array[Stream],
    between: js.Array[Stream] = null,
    consume: js.UndefOr[Boolean] = js.undefined,
    debounce: Int | Double = null,
    filter: Expr | js.Array[Expr] = null,
    markname: String = null,
    marktype: MarkType = null,
    throttle: Int | Double = null
  ): _Stream = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (!js.isUndefined(consume)) __obj.updateDynamic("consume")(consume.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (markname != null) __obj.updateDynamic("markname")(markname.asInstanceOf[js.Any])
    if (marktype != null) __obj.updateDynamic("marktype")(marktype.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Stream]
  }
}

