package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

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

