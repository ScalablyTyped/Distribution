package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a region of interest which is a rectangular region on the image which is used for functions such as focus and exposure. */
@JSGlobal("Windows.Media.Devices.RegionOfInterest")
@js.native
/** Creates a new instance of the RegionOfInterest control. */
class RegionOfInterest () extends js.Object {
  /** Gets or sets a value that specifies if auto exposure is enabled. */
  var autoExposureEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if auto focus is enabled. */
  var autoFocusEnabled: scala.Boolean = js.native
  /** Gets or sets a value that specifies if auto white balance is enabled. */
  var autoWhiteBalanceEnabled: scala.Boolean = js.native
  /** Gets or sets the rectangle that defines the region of focus. */
  var bounds: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /** Gets or sets a value indicating whether the Bounds Rect is in pixels or is mapped to a range of 0 to 1.0. */
  var boundsNormalized: scala.Boolean = js.native
  /** Gets or sets the type of region represented by the RegionOfInterest object. */
  var `type`: RegionOfInterestType = js.native
  /** Gets or sets the weight of the region of interest. */
  var weight: scala.Double = js.native
}

