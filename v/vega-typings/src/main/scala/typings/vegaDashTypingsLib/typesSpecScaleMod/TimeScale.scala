package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends BaseScale {
  var clamp: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var nice: js.UndefOr[scala.Boolean | TimeInterval | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var padding: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var range: js.UndefOr[RangeScheme] = js.undefined
  @JSName("type")
  var type_TimeScale: vegaDashTypingsLib.vegaDashTypingsLibStrings.time | vegaDashTypingsLib.vegaDashTypingsLibStrings.utc
}

