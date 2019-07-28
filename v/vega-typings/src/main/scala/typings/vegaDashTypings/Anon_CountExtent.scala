package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod._RangeScheme
import typings.vegaDashTypings.typesSpecSchemeMod.ColorScheme
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountExtent extends _RangeScheme {
  var count: js.UndefOr[Double | SignalRef] = js.undefined
  var extent: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  var scheme: String | js.Array[String] | SignalRef | ColorScheme
}

object Anon_CountExtent {
  @scala.inline
  def apply(
    scheme: String | js.Array[String] | SignalRef | ColorScheme,
    count: Double | SignalRef = null,
    extent: (js.Array[Double | SignalRef]) | SignalRef = null
  ): Anon_CountExtent = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CountExtent]
  }
}

