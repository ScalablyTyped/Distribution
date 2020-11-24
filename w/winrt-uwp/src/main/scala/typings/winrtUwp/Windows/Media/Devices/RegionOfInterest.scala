package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a region of interest which is a rectangular region on the image which is used for functions such as focus and exposure. */
@js.native
trait RegionOfInterest extends js.Object {
  
  /** Gets or sets a value that specifies if auto exposure is enabled. */
  var autoExposureEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if auto focus is enabled. */
  var autoFocusEnabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if auto white balance is enabled. */
  var autoWhiteBalanceEnabled: Boolean = js.native
  
  /** Gets or sets the rectangle that defines the region of focus. */
  var bounds: Rect = js.native
  
  /** Gets or sets a value indicating whether the Bounds Rect is in pixels or is mapped to a range of 0 to 1.0. */
  var boundsNormalized: Boolean = js.native
  
  /** Gets or sets the type of region represented by the RegionOfInterest object. */
  var `type`: RegionOfInterestType = js.native
  
  /** Gets or sets the weight of the region of interest. */
  var weight: Double = js.native
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
  implicit class RegionOfInterestOps[Self <: RegionOfInterest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoExposureEnabled(value: Boolean): Self = this.set("autoExposureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusEnabled(value: Boolean): Self = this.set("autoFocusEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWhiteBalanceEnabled(value: Boolean): Self = this.set("autoWhiteBalanceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: Rect): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsNormalized(value: Boolean): Self = this.set("boundsNormalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RegionOfInterestType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
}
