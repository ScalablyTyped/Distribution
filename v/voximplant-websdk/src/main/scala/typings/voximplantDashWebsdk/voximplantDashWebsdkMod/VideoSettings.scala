package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	WebRTC Video Settings (aka Constraints)
	*/
trait VideoSettings extends js.Object {
  /**
  		* The exact aspect ratio (width in pixels divided by height in pixels, represented as a double rounded to the tenth decimal place) or aspect ratio range
  		*/
  var aspectRatio: js.UndefOr[Double | js.Any] = js.undefined
  /**
  		* The origin-unique identifier for the source of the MediaStreamTrack
  		*/
  var deviceId: js.UndefOr[String] = js.undefined
  /**
  		* This string (or each string, when a list) should be one of the members of VideoFacingModeEnum
  		*/
  var facingMode: js.UndefOr[String | js.Any] = js.undefined
  /**
  		* The exact frame rate (frames per second) or frame rate range
  		*/
  var frameRate: js.UndefOr[Double | js.Any] = js.undefined
  /**
  		* The origin-unique group identifier for the source of the MediaStreamTrack. Two devices have the same group identifier if they belong to the same physical device
  		*/
  var groupId: js.UndefOr[String] = js.undefined
  /**
  		* The height or height range, in pixels
  		*/
  var height: js.UndefOr[Double | js.Any] = js.undefined
  /**
  		*	Mandatory constraints object
  		*/
  var mandatory: js.UndefOr[js.Object] = js.undefined
  /**
  		*	Optional constraints object
  		*/
  var optional: js.UndefOr[js.Object] = js.undefined
  /**
  		* The width or width range, in pixels
  		*/
  var width: js.UndefOr[Double | js.Any] = js.undefined
}

object VideoSettings {
  @scala.inline
  def apply(
    aspectRatio: Double | js.Any = null,
    deviceId: String = null,
    facingMode: String | js.Any = null,
    frameRate: Double | js.Any = null,
    groupId: String = null,
    height: Double | js.Any = null,
    mandatory: js.Object = null,
    optional: js.Object = null,
    width: Double | js.Any = null
  ): VideoSettings = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mandatory != null) __obj.updateDynamic("mandatory")(mandatory.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSettings]
  }
}

