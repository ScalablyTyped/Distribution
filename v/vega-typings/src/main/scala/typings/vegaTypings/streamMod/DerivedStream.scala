package typings.vegaTypings.streamMod

import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.marktypeMod.MarkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DerivedStream
  extends _Stream
     with StreamParameters {
  var stream: Stream
}

object DerivedStream {
  @scala.inline
  def apply(
    stream: Stream,
    between: js.Array[Stream] = null,
    consume: js.UndefOr[Boolean] = js.undefined,
    debounce: js.UndefOr[Double] = js.undefined,
    filter: Expr | js.Array[Expr] = null,
    markname: String = null,
    marktype: MarkType = null,
    throttle: js.UndefOr[Double] = js.undefined
  ): DerivedStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (!js.isUndefined(consume)) __obj.updateDynamic("consume")(consume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debounce)) __obj.updateDynamic("debounce")(debounce.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (markname != null) __obj.updateDynamic("markname")(markname.asInstanceOf[js.Any])
    if (marktype != null) __obj.updateDynamic("marktype")(marktype.asInstanceOf[js.Any])
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerivedStream]
  }
}

