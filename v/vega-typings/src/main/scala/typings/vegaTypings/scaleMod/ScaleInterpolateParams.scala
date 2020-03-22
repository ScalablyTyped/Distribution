package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.`cubehelix-long`
import typings.vegaTypings.vegaTypingsStrings.cubehelix
import typings.vegaTypings.vegaTypingsStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleInterpolateParams extends ScaleInterpolate {
  var gamma: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: rgb | cubehelix | `cubehelix-long` | SignalRef
}

object ScaleInterpolateParams {
  @scala.inline
  def apply(`type`: rgb | cubehelix | `cubehelix-long` | SignalRef, gamma: Double | SignalRef = null): ScaleInterpolateParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInterpolateParams]
  }
}

