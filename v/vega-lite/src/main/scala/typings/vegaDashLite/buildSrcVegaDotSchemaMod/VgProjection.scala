package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgProjection extends js.Object {
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  var clipAngle: js.UndefOr[Double] = js.undefined
  var clipExtent: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var coefficient: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var extent: js.UndefOr[VgSignalRef | js.Array[js.Array[Double]]] = js.undefined
  var fit: js.UndefOr[VgSignalRef | js.Object | js.Array[_]] = js.undefined
  var fraction: js.UndefOr[Double] = js.undefined
  var lobes: js.UndefOr[Double] = js.undefined
  var name: String
  var parallel: js.UndefOr[Double] = js.undefined
  var precision: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  /**
    * The rotation of the projection.
    */
  var rotate: js.UndefOr[js.Array[Double]] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[VgSignalRef | (js.Array[Double | VgSignalRef])] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var tilt: js.UndefOr[Double] = js.undefined
  var translate: js.UndefOr[js.Array[Double]] = js.undefined
  var `type`: js.UndefOr[VgProjectionType] = js.undefined
}

object VgProjection {
  @scala.inline
  def apply(
    name: String,
    center: js.Array[Double] = null,
    clipAngle: Int | Double = null,
    clipExtent: js.Array[js.Array[Double]] = null,
    coefficient: Int | Double = null,
    distance: Int | Double = null,
    extent: VgSignalRef | js.Array[js.Array[Double]] = null,
    fit: VgSignalRef | js.Object | js.Array[_] = null,
    fraction: Int | Double = null,
    lobes: Int | Double = null,
    parallel: Int | Double = null,
    precision: String = null,
    radius: Int | Double = null,
    ratio: Int | Double = null,
    rotate: js.Array[Double] = null,
    scale: Int | Double = null,
    size: VgSignalRef | (js.Array[Double | VgSignalRef]) = null,
    spacing: Int | Double = null,
    tilt: Int | Double = null,
    translate: js.Array[Double] = null,
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

