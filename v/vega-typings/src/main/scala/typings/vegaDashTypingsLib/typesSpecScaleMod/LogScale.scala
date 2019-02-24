package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogScale extends ContinuousScale {
  var base: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var nice: js.UndefOr[scala.Boolean | scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  @JSName("type")
  var type_LogScale: vegaDashTypingsLib.vegaDashTypingsLibStrings.log
  var zero: js.UndefOr[vegaDashTypingsLib.vegaDashTypingsLibNumbers.`false`] = js.undefined
}

