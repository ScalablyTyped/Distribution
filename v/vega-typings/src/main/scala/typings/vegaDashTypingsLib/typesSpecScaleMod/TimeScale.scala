package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends ContinuousScale {
  var nice: js.UndefOr[scala.Boolean | TimeInterval | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  @JSName("type")
  var type_TimeScale: vegaDashTypingsLib.vegaDashTypingsLibStrings.time | vegaDashTypingsLib.vegaDashTypingsLibStrings.utc
}

