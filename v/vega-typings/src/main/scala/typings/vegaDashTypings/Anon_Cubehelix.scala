package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod.ScaleInterpolate
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.`cubehelix-long`
import typings.vegaDashTypings.vegaDashTypingsStrings.cubehelix
import typings.vegaDashTypings.vegaDashTypingsStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cubehelix extends ScaleInterpolate {
  var gamma: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: rgb | cubehelix | `cubehelix-long` | SignalRef
}

object Anon_Cubehelix {
  @scala.inline
  def apply(`type`: rgb | cubehelix | `cubehelix-long` | SignalRef, gamma: Double | SignalRef = null): Anon_Cubehelix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cubehelix]
  }
}

