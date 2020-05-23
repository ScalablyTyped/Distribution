package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod._RangeScheme
import typings.vegaTypings.schemeMod.ColorScheme
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extent extends _RangeScheme {
  var count: js.UndefOr[Double | SignalRef] = js.undefined
  var extent: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  var scheme: String | js.Array[String] | SignalRef | ColorScheme
}

object Extent {
  @scala.inline
  def apply(
    scheme: String | js.Array[String] | SignalRef | ColorScheme,
    count: Double | SignalRef = null,
    extent: (js.Array[Double | SignalRef]) | SignalRef = null
  ): Extent = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extent]
  }
}

