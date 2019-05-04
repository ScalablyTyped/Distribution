package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgProjection extends js.Object {
  var center: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var clipAngle: js.UndefOr[scala.Double] = js.undefined
  var clipExtent: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var coefficient: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var extent: js.UndefOr[VgSignalRef | js.Array[js.Array[scala.Double]]] = js.undefined
  var fit: js.UndefOr[VgSignalRef | js.Object | js.Array[_]] = js.undefined
  var fraction: js.UndefOr[scala.Double] = js.undefined
  var lobes: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var parallel: js.UndefOr[scala.Double] = js.undefined
  var precision: js.UndefOr[java.lang.String] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rotation of the projection.
    */
  var rotate: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[VgSignalRef | (js.Array[scala.Double | VgSignalRef])] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var tilt: js.UndefOr[scala.Double] = js.undefined
  var translate: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var `type`: js.UndefOr[VgProjectionType] = js.undefined
}

object VgProjection {
  @scala.inline
  def apply(
    name: java.lang.String,
    center: js.Array[scala.Double] = null,
    clipAngle: scala.Int | scala.Double = null,
    clipExtent: js.Array[js.Array[scala.Double]] = null,
    coefficient: scala.Int | scala.Double = null,
    distance: scala.Int | scala.Double = null,
    extent: VgSignalRef | js.Array[js.Array[scala.Double]] = null,
    fit: VgSignalRef | js.Object | js.Array[_] = null,
    fraction: scala.Int | scala.Double = null,
    lobes: scala.Int | scala.Double = null,
    parallel: scala.Int | scala.Double = null,
    precision: java.lang.String = null,
    radius: scala.Int | scala.Double = null,
    ratio: scala.Int | scala.Double = null,
    rotate: js.Array[scala.Double] = null,
    scale: scala.Int | scala.Double = null,
    size: VgSignalRef | (js.Array[scala.Double | VgSignalRef]) = null,
    spacing: scala.Int | scala.Double = null,
    tilt: scala.Int | scala.Double = null,
    translate: js.Array[scala.Double] = null,
    `type`: VgProjectionType = null
  ): VgProjection = {
    val __obj = js.Dynamic.literal(name = name)
    if (center != null) __obj.updateDynamic("center")(center)
    if (clipAngle != null) __obj.updateDynamic("clipAngle")(clipAngle.asInstanceOf[js.Any])
    if (clipExtent != null) __obj.updateDynamic("clipExtent")(clipExtent)
    if (coefficient != null) __obj.updateDynamic("coefficient")(coefficient.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (fraction != null) __obj.updateDynamic("fraction")(fraction.asInstanceOf[js.Any])
    if (lobes != null) __obj.updateDynamic("lobes")(lobes.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgProjection]
  }
}

