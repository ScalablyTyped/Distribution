package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousScale extends BaseScale {
  var bins: js.UndefOr[ScaleBins] = js.undefined
  var clamp: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  var padding: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var range: js.UndefOr[RangeScheme] = js.undefined
}

