package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.graticule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleTransform extends _Transforms {
  var extent: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.undefined
  var extentMajor: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.undefined
  var extentMinor: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.undefined
  var precision: js.UndefOr[Double | SignalRef] = js.undefined
  var signal: js.UndefOr[SignalName] = js.undefined
  var step: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var stepMajor: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var stepMinor: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var `type`: graticule
}

object GraticuleTransform {
  @scala.inline
  def apply(
    `type`: graticule,
    extent: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef = null,
    extentMajor: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef = null,
    extentMinor: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef = null,
    precision: Double | SignalRef = null,
    signal: SignalName = null,
    step: (Vector2[Double | SignalRef]) | SignalRef = null,
    stepMajor: (Vector2[Double | SignalRef]) | SignalRef = null,
    stepMinor: (Vector2[Double | SignalRef]) | SignalRef = null
  ): GraticuleTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (extentMajor != null) __obj.updateDynamic("extentMajor")(extentMajor.asInstanceOf[js.Any])
    if (extentMinor != null) __obj.updateDynamic("extentMinor")(extentMinor.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stepMajor != null) __obj.updateDynamic("stepMajor")(stepMajor.asInstanceOf[js.Any])
    if (stepMinor != null) __obj.updateDynamic("stepMinor")(stepMinor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleTransform]
  }
}

