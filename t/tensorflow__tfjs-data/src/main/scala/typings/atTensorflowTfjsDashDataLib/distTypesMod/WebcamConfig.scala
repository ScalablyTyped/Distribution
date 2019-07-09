package typings
package atTensorflowTfjsDashDataLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamConfig extends js.Object {
  /**
    * A boolean value that indicates whether to crop the video frame from center.
    * If true, `resizeWidth` and `resizeHeight` must be specified; then an image
    * of size `[resizeWidth, resizeHeight]` is taken from the center of the frame
    * without scaling. If false, the entire image is returned (perhaps scaled to
    * fit in `[resizeWidth, resizeHeight]`, if those are provided).
    */
  var centerCrop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string used to request a specific camera. The deviceId can be obtained by
    * calling `mediaDevices.enumerateDevices()`.
    */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string specifying which camera to use on device. If the value is
    * 'user', it will use front camera. If the value is 'environment', it will
    * use rear camera.
    */
  var facingMode: js.UndefOr[
    atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataLibStrings.user | atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataLibStrings.environment
  ] = js.undefined
  /**
    * Specifies the height of the output tensor. The actual height of the
    * HTMLVideoElement (if provided) can be different and the final image will be
    * resized to match resizeHeight.
    */
  var resizeHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the width of the output tensor. The actual width of the
    * HTMLVideoElement (if provided) can be different and the final image will be
    * resized to match resizeWidth.
    */
  var resizeWidth: js.UndefOr[scala.Double] = js.undefined
}

object WebcamConfig {
  @scala.inline
  def apply(
    centerCrop: js.UndefOr[scala.Boolean] = js.undefined,
    deviceId: java.lang.String = null,
    facingMode: atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataLibStrings.user | atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataLibStrings.environment = null,
    resizeHeight: scala.Int | scala.Double = null,
    resizeWidth: scala.Int | scala.Double = null
  ): WebcamConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerCrop)) __obj.updateDynamic("centerCrop")(centerCrop)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (resizeHeight != null) __obj.updateDynamic("resizeHeight")(resizeHeight.asInstanceOf[js.Any])
    if (resizeWidth != null) __obj.updateDynamic("resizeWidth")(resizeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebcamConfig]
  }
}

