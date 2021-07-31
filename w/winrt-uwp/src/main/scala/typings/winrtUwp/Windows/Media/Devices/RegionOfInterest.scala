package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a region of interest which is a rectangular region on the image which is used for functions such as focus and exposure. */
trait RegionOfInterest extends StObject {
  
  /** Gets or sets a value that specifies if auto exposure is enabled. */
  var autoExposureEnabled: Boolean
  
  /** Gets or sets a value that specifies if auto focus is enabled. */
  var autoFocusEnabled: Boolean
  
  /** Gets or sets a value that specifies if auto white balance is enabled. */
  var autoWhiteBalanceEnabled: Boolean
  
  /** Gets or sets the rectangle that defines the region of focus. */
  var bounds: Rect
  
  /** Gets or sets a value indicating whether the Bounds Rect is in pixels or is mapped to a range of 0 to 1.0. */
  var boundsNormalized: Boolean
  
  /** Gets or sets the type of region represented by the RegionOfInterest object. */
  var `type`: RegionOfInterestType
  
  /** Gets or sets the weight of the region of interest. */
  var weight: Double
}
object RegionOfInterest {
  
  @scala.inline
  def apply(
    autoExposureEnabled: Boolean,
    autoFocusEnabled: Boolean,
    autoWhiteBalanceEnabled: Boolean,
    bounds: Rect,
    boundsNormalized: Boolean,
    `type`: RegionOfInterestType,
    weight: Double
  ): RegionOfInterest = {
    val __obj = js.Dynamic.literal(autoExposureEnabled = autoExposureEnabled.asInstanceOf[js.Any], autoFocusEnabled = autoFocusEnabled.asInstanceOf[js.Any], autoWhiteBalanceEnabled = autoWhiteBalanceEnabled.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], boundsNormalized = boundsNormalized.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionOfInterest]
  }
  
  @scala.inline
  implicit class RegionOfInterestMutableBuilder[Self <: RegionOfInterest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoExposureEnabled(value: Boolean): Self = StObject.set(x, "autoExposureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusEnabled(value: Boolean): Self = StObject.set(x, "autoFocusEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWhiteBalanceEnabled(value: Boolean): Self = StObject.set(x, "autoWhiteBalanceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: Rect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsNormalized(value: Boolean): Self = StObject.set(x, "boundsNormalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RegionOfInterestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
