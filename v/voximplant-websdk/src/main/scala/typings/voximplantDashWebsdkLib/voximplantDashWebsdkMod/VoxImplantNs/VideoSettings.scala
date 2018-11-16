package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

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
  var aspectRatio: js.UndefOr[scala.Double | js.Any] = js.undefined
  /**
  		* The origin-unique identifier for the source of the MediaStreamTrack
  		*/
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* This string (or each string, when a list) should be one of the members of VideoFacingModeEnum
  		*/
  var facingMode: js.UndefOr[java.lang.String | js.Any] = js.undefined
  /**
  		* The exact frame rate (frames per second) or frame rate range
  		*/
  var frameRate: js.UndefOr[scala.Double | js.Any] = js.undefined
  /**
  		* The origin-unique group identifier for the source of the MediaStreamTrack. Two devices have the same group identifier if they belong to the same physical device
  		*/
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* The height or height range, in pixels
  		*/
  var height: js.UndefOr[scala.Double | js.Any] = js.undefined
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
  var width: js.UndefOr[scala.Double | js.Any] = js.undefined
}

