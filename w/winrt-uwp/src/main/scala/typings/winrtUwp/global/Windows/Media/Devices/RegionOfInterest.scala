package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a region of interest which is a rectangular region on the image which is used for functions such as focus and exposure. */
@JSGlobal("Windows.Media.Devices.RegionOfInterest")
@js.native
/** Creates a new instance of the RegionOfInterest control. */
open class RegionOfInterest ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.RegionOfInterest {
  
  /** Gets or sets a value that specifies if auto exposure is enabled. */
  /* CompleteClass */
  var autoExposureEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if auto focus is enabled. */
  /* CompleteClass */
  var autoFocusEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if auto white balance is enabled. */
  /* CompleteClass */
  var autoWhiteBalanceEnabled: Boolean = js.native
  
  /** Gets or sets the rectangle that defines the region of focus. */
  /* CompleteClass */
  var bounds: Rect = js.native
  
  /** Gets or sets a value indicating whether the Bounds Rect is in pixels or is mapped to a range of 0 to 1.0. */
  /* CompleteClass */
  var boundsNormalized: Boolean = js.native
  
  /** Gets or sets the type of region represented by the RegionOfInterest object. */
  /* CompleteClass */
  var `type`: typings.winrtUwp.Windows.Media.Devices.RegionOfInterestType = js.native
  
  /** Gets or sets the weight of the region of interest. */
  /* CompleteClass */
  var weight: Double = js.native
}
