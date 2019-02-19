package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymLogScale extends BaseScale {
  var base: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var clamp: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  var nice: js.UndefOr[scala.Boolean | scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var padding: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var range: js.UndefOr[RangeScheme] = js.undefined
  @JSName("type")
  var type_SymLogScale: vegaDashTypingsLib.vegaDashTypingsLibStrings.symlog
  var zero: js.UndefOr[vegaDashTypingsLib.vegaDashTypingsLibNumbers.`false`] = js.undefined
}

