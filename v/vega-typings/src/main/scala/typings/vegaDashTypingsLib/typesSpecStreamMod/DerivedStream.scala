package typings
package vegaDashTypingsLib.typesSpecStreamMod

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
    consume: js.UndefOr[scala.Boolean] = js.undefined,
    debounce: scala.Int | scala.Double = null,
    filter: vegaDashTypingsLib.typesSpecExprMod.Expr | js.Array[vegaDashTypingsLib.typesSpecExprMod.Expr] = null,
    markname: java.lang.String = null,
    marktype: vegaDashTypingsLib.typesSpecMarktypeMod.MarkType = null,
    throttle: scala.Int | scala.Double = null
  ): DerivedStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between)
    if (!js.isUndefined(consume)) __obj.updateDynamic("consume")(consume)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (markname != null) __obj.updateDynamic("markname")(markname)
    if (marktype != null) __obj.updateDynamic("marktype")(marktype)
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerivedStream]
  }
}

