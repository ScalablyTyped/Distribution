package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Flash Video Settings
	*/
trait FlashVideoSettings extends js.Object {
  /**
  		*	The maximum amount of bandwidth the current outgoing video feed can use, in bytes
  		*/
  var bandwidth: js.UndefOr[Double] = js.undefined
  /**
  		*	The maximum rate at which the camera can capture data, in frames per second
  		*/
  var fps: js.UndefOr[Double] = js.undefined
  /**
  		*	Height in pixels (should be set together with width)
  		*/
  var height: js.UndefOr[Double] = js.undefined
  /**
  		*	Keyframe interval (seconds)
  		*/
  var keyframeInterval: js.UndefOr[Double] = js.undefined
  /**
  		*	H.264 video codec level
  		*/
  var level: js.UndefOr[String] = js.undefined
  /**
  		*	H.264 video codec profile
  		*/
  var profile: js.UndefOr[String] = js.undefined
  /**
  		*	The required level of picture quality, as determined by the amount of compression being applied to each video frame. Acceptable quality values range from 1 (lowest quality, maximum compression) to 100 (highest quality, no compression). The default value is 0, which means that picture quality can vary as needed to avoid exceeding available bandwidth
  		*/
  var quality: js.UndefOr[Double] = js.undefined
  /**
  		*	Width in pixels (should be set together with height)
  		*/
  var width: js.UndefOr[Double] = js.undefined
}

object FlashVideoSettings {
  @scala.inline
  def apply(
    bandwidth: Int | Double = null,
    fps: Int | Double = null,
    height: Int | Double = null,
    keyframeInterval: Int | Double = null,
    level: String = null,
    profile: String = null,
    quality: Int | Double = null,
    width: Int | Double = null
  ): FlashVideoSettings = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (keyframeInterval != null) __obj.updateDynamic("keyframeInterval")(keyframeInterval.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashVideoSettings]
  }
}

