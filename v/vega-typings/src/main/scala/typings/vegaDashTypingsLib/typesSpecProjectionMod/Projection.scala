package typings
package vegaDashTypingsLib.typesSpecProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /*
    * The center of the projection.
    */
  var center: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  /*
    * The clip angle of the projection.
    */
  var clipAngle: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /*
    * Sets the projection’s viewport clip extent to the specified bounds in pixels
    */
  var clipExtent: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[
      vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
    ]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  // TODO: use a union tagged by the projection type to determine which of the following is applicable
  /* The following properties are all supported for specific types of projections. Consult the d3-geo-projection library for more information: https://github.com/d3/d3-geo-projection */
  var coefficient: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  /*
    * Used in conjunction with fit, provides the pixel area to which the projection should be automatically fit.
    */
  var extent: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[
      vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
    ]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  /*
    * GeoJSON data to which the projection should attempt to automatically fit the translate and scale parameters..
    */
  var fit: js.UndefOr[Fit | js.Array[Fit] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var fraction: js.UndefOr[scala.Double] = js.undefined
  var lobes: js.UndefOr[scala.Double] = js.undefined
  /*
    * The name of the projection.
    */
  var name: java.lang.String
  var parallel: js.UndefOr[scala.Double] = js.undefined
  var parallels: js.UndefOr[
    (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var pointRadius: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /*
    * The desired precision of the projection.
    */
  var precision: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rotation of the projection.
    */
  var rotate: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector3[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var scale: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /*
    * Used in conjunction with fit, provides the width and height in pixels of the area to which the projection should be automatically fit.
    */
  var size: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var tilt: js.UndefOr[scala.Double] = js.undefined
  /*
    * The translation of the projection.
    */
  var translate: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  /*
    * The type of the projection.
    */
  var `type`: ProjectionType | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
}

object Projection {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: ProjectionType | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    center: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    clipAngle: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    clipExtent: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[
      vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
    ]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    coefficient: scala.Int | scala.Double = null,
    distance: scala.Int | scala.Double = null,
    extent: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[
      vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
    ]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    fit: Fit | js.Array[Fit] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    fraction: scala.Int | scala.Double = null,
    lobes: scala.Int | scala.Double = null,
    parallel: scala.Int | scala.Double = null,
    parallels: (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    pointRadius: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    precision: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    radius: scala.Int | scala.Double = null,
    ratio: scala.Int | scala.Double = null,
    rotate: (vegaDashTypingsLib.typesSpecUtilMod.Vector3[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    scale: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    size: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    spacing: scala.Int | scala.Double = null,
    tilt: scala.Int | scala.Double = null,
    translate: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): Projection = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

