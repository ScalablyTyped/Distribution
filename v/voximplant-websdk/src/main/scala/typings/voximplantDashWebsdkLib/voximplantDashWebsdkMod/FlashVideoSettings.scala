package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

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
  var bandwidth: js.UndefOr[scala.Double] = js.undefined
  /**
  		*	The maximum rate at which the camera can capture data, in frames per second
  		*/
  var fps: js.UndefOr[scala.Double] = js.undefined
  /**
  		*	Height in pixels (should be set together with width)
  		*/
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  		*	Keyframe interval (seconds)
  		*/
  var keyframeInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  		*	H.264 video codec level
  		*/
  var level: js.UndefOr[java.lang.String] = js.undefined
  /**
  		*	H.264 video codec profile
  		*/
  var profile: js.UndefOr[java.lang.String] = js.undefined
  /**
  		*	The required level of picture quality, as determined by the amount of compression being applied to each video frame. Acceptable quality values range from 1 (lowest quality, maximum compression) to 100 (highest quality, no compression). The default value is 0, which means that picture quality can vary as needed to avoid exceeding available bandwidth
  		*/
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
  		*	Width in pixels (should be set together with height)
  		*/
  var width: js.UndefOr[scala.Double] = js.undefined
}

object FlashVideoSettings {
  @scala.inline
  def apply(
    bandwidth: scala.Int | scala.Double = null,
    fps: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    keyframeInterval: scala.Int | scala.Double = null,
    level: java.lang.String = null,
    profile: java.lang.String = null,
    quality: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): FlashVideoSettings = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (keyframeInterval != null) __obj.updateDynamic("keyframeInterval")(keyframeInterval.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashVideoSettings]
  }
}

