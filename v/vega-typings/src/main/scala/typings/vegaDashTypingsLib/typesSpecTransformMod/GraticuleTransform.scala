package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleTransform extends _Transforms {
  var extent: js.UndefOr[
    vegaDashTypingsLib.typesSpecUtilMod.Vector2[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var extentMajor: js.UndefOr[
    vegaDashTypingsLib.typesSpecUtilMod.Vector2[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var extentMinor: js.UndefOr[
    vegaDashTypingsLib.typesSpecUtilMod.Vector2[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var precision: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
  var step: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var stepMajor: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var stepMinor: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.graticule
}

object GraticuleTransform {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.graticule,
    extent: vegaDashTypingsLib.typesSpecUtilMod.Vector2[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    extentMajor: vegaDashTypingsLib.typesSpecUtilMod.Vector2[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    extentMinor: vegaDashTypingsLib.typesSpecUtilMod.Vector2[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    precision: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    signal: java.lang.String = null,
    step: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    stepMajor: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    stepMinor: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): GraticuleTransform = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (extentMajor != null) __obj.updateDynamic("extentMajor")(extentMajor.asInstanceOf[js.Any])
    if (extentMinor != null) __obj.updateDynamic("extentMinor")(extentMinor.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stepMajor != null) __obj.updateDynamic("stepMajor")(stepMajor.asInstanceOf[js.Any])
    if (stepMinor != null) __obj.updateDynamic("stepMinor")(stepMinor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleTransform]
  }
}

