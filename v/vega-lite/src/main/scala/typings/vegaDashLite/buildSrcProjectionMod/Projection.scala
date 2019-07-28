package typings.vegaDashLite.buildSrcProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /**
    * Sets the projection’s center to the specified center, a two-element array of longitude and latitude in degrees.
    *
    * __Default value:__ `[0, 0]`
    */
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Sets the projection’s clipping circle radius to the specified angle in degrees. If `null`, switches to [antimeridian](http://bl.ocks.org/mbostock/3788999) cutting rather than small-circle clipping.
    */
  var clipAngle: js.UndefOr[Double] = js.undefined
  /**
    * Sets the projection’s viewport clip extent to the specified bounds in pixels. The extent bounds are specified as an array `[[x0, y0], [x1, y1]]`, where `x0` is the left-side of the viewport, `y0` is the top, `x1` is the right and `y1` is the bottom. If `null`, no viewport clipping is performed.
    */
  var clipExtent: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var coefficient: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var fraction: js.UndefOr[Double] = js.undefined
  var lobes: js.UndefOr[Double] = js.undefined
  var parallel: js.UndefOr[Double] = js.undefined
  /**
    * Sets the threshold for the projection’s [adaptive resampling](http://bl.ocks.org/mbostock/3795544) to the specified value in pixels. This value corresponds to the [Douglas–Peucker distance](http://en.wikipedia.org/wiki/Ramer%E2%80%93Douglas%E2%80%93Peucker_algorithm). If precision is not specified, returns the projection’s current resampling precision which defaults to `√0.5 ≅ 0.70710…`.
    */
  var precision: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  /**
    * Sets the projection’s three-axis rotation to the specified angles, which must be a two- or three-element array of numbers [`lambda`, `phi`, `gamma`] specifying the rotation angles in degrees about each spherical axis. (These correspond to yaw, pitch and roll.)
    *
    * __Default value:__ `[0, 0, 0]`
    */
  var rotate: js.UndefOr[js.Array[Double]] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var tilt: js.UndefOr[Double] = js.undefined
  /**
    * The cartographic projection to use. This value is case-insensitive, for example `"albers"` and `"Albers"` indicate the same projection type. You can find all valid projection types [in the documentation](https://vega.github.io/vega-lite/docs/projection.html#projection-types).
    *
    * __Default value:__ `mercator`
    */
  var `type`: js.UndefOr[ProjectionType] = js.undefined
}

object Projection {
  @scala.inline
  def apply(
    center: js.Array[Double] = null,
    clipAngle: Int | Double = null,
    clipExtent: js.Array[js.Array[Double]] = null,
    coefficient: Int | Double = null,
    distance: Int | Double = null,
    fraction: Int | Double = null,
    lobes: Int | Double = null,
    parallel: Int | Double = null,
    precision: String = null,
    radius: Int | Double = null,
    ratio: Int | Double = null,
    rotate: js.Array[Double] = null,
    spacing: Int | Double = null,
    tilt: Int | Double = null,
    `type`: ProjectionType = null
  ): Projection = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (clipAngle != null) __obj.updateDynamic("clipAngle")(clipAngle.asInstanceOf[js.Any])
    if (clipExtent != null) __obj.updateDynamic("clipExtent")(clipExtent)
    if (coefficient != null) __obj.updateDynamic("coefficient")(coefficient.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (fraction != null) __obj.updateDynamic("fraction")(fraction.asInstanceOf[js.Any])
    if (lobes != null) __obj.updateDynamic("lobes")(lobes.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Projection]
  }
}

