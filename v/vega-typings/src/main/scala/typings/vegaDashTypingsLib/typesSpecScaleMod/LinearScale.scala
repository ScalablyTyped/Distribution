package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearScale extends BaseScale {
  var clamp: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  var nice: js.UndefOr[scala.Boolean | scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var padding: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
   // optional because it's the default
  var range: js.UndefOr[RangeScheme] = js.undefined
  @JSName("type")
  var type_LinearScale: js.UndefOr[vegaDashTypingsLib.vegaDashTypingsLibStrings.linear] = js.undefined
  var zero: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
}

