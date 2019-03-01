package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountExtent
  extends vegaDashTypingsLib.typesSpecScaleMod._RangeScheme {
  var count: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var extent: js.UndefOr[
    (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var scheme: java.lang.String | js.Array[java.lang.String] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.typesSpecSchemeMod.ColorScheme
}

object Anon_CountExtent {
  @scala.inline
  def apply(
    scheme: java.lang.String | js.Array[java.lang.String] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.typesSpecSchemeMod.ColorScheme,
    count: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    extent: (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): Anon_CountExtent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CountExtent]
  }
}

