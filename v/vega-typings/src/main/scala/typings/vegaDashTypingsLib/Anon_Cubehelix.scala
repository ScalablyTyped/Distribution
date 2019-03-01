package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cubehelix
  extends vegaDashTypingsLib.typesSpecScaleMod.ScaleInterpolate {
  var gamma: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.rgb | vegaDashTypingsLib.vegaDashTypingsLibStrings.cubehelix | vegaDashTypingsLib.vegaDashTypingsLibStrings.`cubehelix-long` | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
}

object Anon_Cubehelix {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.rgb | vegaDashTypingsLib.vegaDashTypingsLibStrings.cubehelix | vegaDashTypingsLib.vegaDashTypingsLibStrings.`cubehelix-long` | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    gamma: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): Anon_Cubehelix = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cubehelix]
  }
}

