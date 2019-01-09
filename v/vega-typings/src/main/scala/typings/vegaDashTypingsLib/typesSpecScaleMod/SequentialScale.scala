package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequentialScale extends BaseScale {
  var clamp: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var nice: js.UndefOr[scala.Boolean | TimeInterval | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var padding: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var range: RangeScheme
  @JSName("type")
  var type_SequentialScale: vegaDashTypingsLib.vegaDashTypingsLibStrings.sequential
  var zero: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
}

