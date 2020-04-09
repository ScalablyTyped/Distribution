package typings.vegaTypings.configMod

import typings.std.Exclude
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.projectionMod.Fit
import typings.vegaTypings.projectionMod.ProjectionType
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/projection.BaseProjection> */
trait ProjectionConfig extends js.Object {
  var center: (Exclude[
    js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
  var clipAngle: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var clipExtent: (Exclude[
    js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
  var coefficient: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var distance: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var extent: (Exclude[
    js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
  var fit: (Exclude[
    js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]])
  var fraction: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var lobes: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var parallel: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var parallels: (Exclude[
    js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]])
  var pointRadius: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var precision: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var radius: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var ratio: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var reflectX: (Exclude[
    js.UndefOr[Boolean | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
  var reflectY: (Exclude[
    js.UndefOr[Boolean | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
  var rotate: (Exclude[
    js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[
    js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
  ])
  var scale: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var size: (Exclude[
    js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
  var spacing: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var tilt: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var translate: (Exclude[
    js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
  var `type`: (Exclude[
    js.UndefOr[ProjectionType | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]])
}

object ProjectionConfig {
  @scala.inline
  def apply(
    center: (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]]) = null,
    clipAngle: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    clipExtent: (Exclude[
      js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]]) = null,
    coefficient: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    distance: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    extent: (Exclude[
      js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]]) = null,
    fit: (Exclude[
      js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]]) = null,
    fraction: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    lobes: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    parallel: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    parallels: (Exclude[
      js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]]) = null,
    pointRadius: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    precision: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    radius: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    ratio: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    reflectX: (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]]) = null,
    reflectY: (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]]) = null,
    rotate: (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[
      js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
    ]) = null,
    scale: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    size: (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]]) = null,
    spacing: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    tilt: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    translate: (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]]) = null,
    `type`: (Exclude[
      js.UndefOr[ProjectionType | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]]) = null
  ): ProjectionConfig = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (clipAngle != null) __obj.updateDynamic("clipAngle")(clipAngle.asInstanceOf[js.Any])
    if (clipExtent != null) __obj.updateDynamic("clipExtent")(clipExtent.asInstanceOf[js.Any])
    if (coefficient != null) __obj.updateDynamic("coefficient")(coefficient.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (fraction != null) __obj.updateDynamic("fraction")(fraction.asInstanceOf[js.Any])
    if (lobes != null) __obj.updateDynamic("lobes")(lobes.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (parallels != null) __obj.updateDynamic("parallels")(parallels.asInstanceOf[js.Any])
    if (pointRadius != null) __obj.updateDynamic("pointRadius")(pointRadius.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (reflectX != null) __obj.updateDynamic("reflectX")(reflectX.asInstanceOf[js.Any])
    if (reflectY != null) __obj.updateDynamic("reflectY")(reflectY.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionConfig]
  }
}

