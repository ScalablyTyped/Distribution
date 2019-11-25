package typings.vegaDashTypings.typesSpecProjectionMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.typesSpecUtilMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends BaseProjection {
  /*
    * The name of the projection.
    */
  var name: String
}

object Projection {
  @scala.inline
  def apply(
    name: String,
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
  ): Projection = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Projection]
  }
}

