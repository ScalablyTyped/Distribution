package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding compass heading data.
  */
trait HeadingData extends js.Object {
  /**
    * Accuracy of the compass heading, in platform-specific units.
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  /**
    * Declination in degrees from magnetic North.
    */
  var magneticHeading: js.UndefOr[Double] = js.undefined
  /**
    * Timestamp for the heading data, in milliseconds.
    */
  var timestamp: js.UndefOr[Double] = js.undefined
  /**
    * Declination in degrees from true North.
    */
  var trueHeading: js.UndefOr[Double] = js.undefined
  /**
    * Raw geomagnetic data for the X axis.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Raw geomagnetic data for the Y axis.
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * Raw geomagnetic data for the Z axis.
    */
  var z: js.UndefOr[Double] = js.undefined
}

object HeadingData {
  @scala.inline
  def apply(
    accuracy: js.UndefOr[Double] = js.undefined,
    magneticHeading: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Double] = js.undefined,
    trueHeading: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): HeadingData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(magneticHeading)) __obj.updateDynamic("magneticHeading")(magneticHeading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trueHeading)) __obj.updateDynamic("trueHeading")(trueHeading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingData]
  }
}

