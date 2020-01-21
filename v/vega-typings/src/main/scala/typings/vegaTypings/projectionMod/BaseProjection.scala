package typings.vegaTypings.projectionMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProjection extends js.Object {
  /*
    * The center of the projection.
    */
  var center: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  /*
    * The clip angle of the projection.
    */
  var clipAngle: js.UndefOr[Double | SignalRef] = js.undefined
  /*
    * The projection’s viewport clip extent to the specified bounds in pixels
    */
  var clipExtent: js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef] = js.undefined
  // TODO: use a union tagged by the projection type to determine which of the following is applicable
  /* The following properties are all supported for specific types of projections. Consult the d3-geo-projection library for more information: https://github.com/d3/d3-geo-projection */
  var coefficient: js.UndefOr[Double | SignalRef] = js.undefined
  var distance: js.UndefOr[Double | SignalRef] = js.undefined
  /*
    * Used in conjunction with fit, provides the pixel area to which the projection should be automatically fit.
    */
  var extent: js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef] = js.undefined
  /*
    * GeoJSON data to which the projection should attempt to automatically fit the translate and scale parameters..
    */
  var fit: js.UndefOr[Fit | js.Array[Fit] | SignalRef] = js.undefined
  var fraction: js.UndefOr[Double | SignalRef] = js.undefined
  var lobes: js.UndefOr[Double | SignalRef] = js.undefined
  var parallel: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The desired parallels of the projection.
    */
  var parallels: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  /**
    * The default radius (in pixels) to use when drawing GeoJSON `Point` and `MultiPoint` geometries.
    */
  var pointRadius: js.UndefOr[Double | SignalRef] = js.undefined
  /*
    * The desired precision of the projection.
    */
  var precision: js.UndefOr[Double | SignalRef] = js.undefined
  var radius: js.UndefOr[Double | SignalRef] = js.undefined
  var ratio: js.UndefOr[Double | SignalRef] = js.undefined
  var reflectX: js.UndefOr[Boolean | SignalRef] = js.undefined
  var reflectY: js.UndefOr[Boolean | SignalRef] = js.undefined
  /**
    * The rotation of the projection.
    */
  var rotate: js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef] = js.undefined
  /**
    * The projection’s scale factor to the specified value.
    */
  var scale: js.UndefOr[Double | SignalRef] = js.undefined
  /*
    * Used in conjunction with fit, provides the width and height in pixels of the area to which the projection should be automatically fit.
    */
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var spacing: js.UndefOr[Double | SignalRef] = js.undefined
  var tilt: js.UndefOr[Double | SignalRef] = js.undefined
  /*
    * The translation of the projection.
    */
  var translate: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  /*
    * The type of the projection. The default is `"mercator"`.
    */
  var `type`: js.UndefOr[ProjectionType | SignalRef] = js.undefined
}

object BaseProjection {
  @scala.inline
  def apply(
    center: (Vector2[Double | SignalRef]) | SignalRef = null,
    clipAngle: Double | SignalRef = null,
    clipExtent: (Vector2[Vector2[Double | SignalRef]]) | SignalRef = null,
    coefficient: Double | SignalRef = null,
    distance: Double | SignalRef = null,
    extent: (Vector2[Vector2[Double | SignalRef]]) | SignalRef = null,
    fit: Fit | js.Array[Fit] | SignalRef = null,
    fraction: Double | SignalRef = null,
    lobes: Double | SignalRef = null,
    parallel: Double | SignalRef = null,
    parallels: (js.Array[Double | SignalRef]) | SignalRef = null,
    pointRadius: Double | SignalRef = null,
    precision: Double | SignalRef = null,
    radius: Double | SignalRef = null,
    ratio: Double | SignalRef = null,
    reflectX: Boolean | SignalRef = null,
    reflectY: Boolean | SignalRef = null,
    rotate: (Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef = null,
    scale: Double | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    spacing: Double | SignalRef = null,
    tilt: Double | SignalRef = null,
    translate: (Vector2[Double | SignalRef]) | SignalRef = null,
    `type`: ProjectionType | SignalRef = null
  ): BaseProjection = {
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
    __obj.asInstanceOf[BaseProjection]
  }
}

