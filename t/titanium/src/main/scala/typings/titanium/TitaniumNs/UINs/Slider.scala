package typings.titanium.TitaniumNs.UINs

import typings.titanium.TitaniumNs.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A slider component with a draggable thumb.
		 */
@js.native
trait Slider extends View {
  /**
  			 * Image URL of the slider left track when in the disabled state.
  			 */
  var disabledLeftTrackImage: String = js.native
  /**
  			 * Image URL of the slider right track when in the disabled state.
  			 */
  var disabledRightTrackImage: String = js.native
  /**
  			 * Image URL of the slider thumb when in the disabled state.
  			 */
  var disabledThumbImage: String = js.native
  /**
  			 * Boolean to indicate the enabled state of the slider.
  			 */
  var enabled: Boolean = js.native
  /**
  			 * Image URL of the slider left track when in the highlighted state.
  			 */
  var highlightedLeftTrackImage: String = js.native
  /**
  			 * Image URL of the slider right track when in the highlighted state.
  			 */
  var highlightedRightTrackImage: String = js.native
  /**
  			 * Image URL of the slider thumb when in the highlighted state.
  			 */
  var highlightedThumbImage: String = js.native
  /**
  			 * Image URL of the slider left track.
  			 */
  var leftTrackImage: String = js.native
  /**
  			 * Size of the left end cap for the leftTrackImage, disabledLeftTrackImage, highlightedLeftTrackImage and selectedLeftTrackImage properties.
  			 */
  var leftTrackLeftCap: Double = js.native
  /**
  			 * Size of the top end cap for the leftTrackImage, disabledLeftTrackImage, highlightedLeftTrackImage and selectedLeftTrackImage properties.
  			 */
  var leftTrackTopCap: Double = js.native
  /**
  			 * Maximum value of the slider.
  			 */
  var max: Double = js.native
  /**
  			 * Upper limit on the slider value that can be selected.
  			 */
  var maxRange: Double = js.native
  /**
  			 * Minimum value of the slider.
  			 */
  var min: Double = js.native
  /**
  			 * Lower limit on the slider value that can be selected.
  			 */
  var minRange: Double = js.native
  /**
  			 * Image URL of the slider right track.
  			 */
  var rightTrackImage: String = js.native
  /**
  			 * Size of the left end cap for the rightTrackImage, disabledRightTrackImage, highlightedRightTrackImage and selectedRightTrackImage properties.
  			 */
  var rightTrackLeftCap: Double = js.native
  /**
  			 * Size of the top end cap for the rightTrackImage, disabledRightTrackImage, highlightedRightTrackImage and selectedRightTrackImage properties.
  			 */
  var rightTrackTopCap: Double = js.native
  /**
  			 * Image URL of the slider left track when in the selected state.
  			 */
  var selectedLeftTrackImage: String = js.native
  /**
  			 * Image URL of the slider right track when in the selected state.
  			 */
  var selectedRightTrackImage: String = js.native
  /**
  			 * Image URL of the slider thumb when in the selected state.
  			 */
  var selectedThumbImage: String = js.native
  /**
  			 * Separates the thumbImage from the slider track.
  			 */
  var splitTrack: Boolean = js.native
  /**
  			 * Image for the slider thumb.
  			 */
  var thumbImage: String | Blob = js.native
  /**
  			 * Current value of the slider.
  			 */
  var value: String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.disabledLeftTrackImage> property.
  			 */
  def getDisabledLeftTrackImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.disabledRightTrackImage> property.
  			 */
  def getDisabledRightTrackImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.disabledThumbImage> property.
  			 */
  def getDisabledThumbImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.enabled> property.
  			 */
  def getEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.highlightedLeftTrackImage> property.
  			 */
  def getHighlightedLeftTrackImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.highlightedRightTrackImage> property.
  			 */
  def getHighlightedRightTrackImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.highlightedThumbImage> property.
  			 */
  def getHighlightedThumbImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.leftTrackImage> property.
  			 */
  def getLeftTrackImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.leftTrackLeftCap> property.
  			 */
  def getLeftTrackLeftCap(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.leftTrackTopCap> property.
  			 */
  def getLeftTrackTopCap(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.max> property.
  			 */
  def getMax(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.maxRange> property.
  			 */
  def getMaxRange(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.min> property.
  			 */
  def getMin(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.minRange> property.
  			 */
  def getMinRange(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.rightTrackImage> property.
  			 */
  def getRightTrackImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.rightTrackLeftCap> property.
  			 */
  def getRightTrackLeftCap(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.rightTrackTopCap> property.
  			 */
  def getRightTrackTopCap(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.selectedLeftTrackImage> property.
  			 */
  def getSelectedLeftTrackImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.selectedRightTrackImage> property.
  			 */
  def getSelectedRightTrackImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.selectedThumbImage> property.
  			 */
  def getSelectedThumbImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.splitTrack> property.
  			 */
  def getSplitTrack(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.thumbImage> property.
  			 */
  def getThumbImage(): String | Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.value> property.
  			 */
  def getValue(): String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.disabledLeftTrackImage> property.
  			 */
  def setDisabledLeftTrackImage(disabledLeftTrackImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.disabledRightTrackImage> property.
  			 */
  def setDisabledRightTrackImage(disabledRightTrackImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.disabledThumbImage> property.
  			 */
  def setDisabledThumbImage(disabledThumbImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.enabled> property.
  			 */
  def setEnabled(enabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.highlightedLeftTrackImage> property.
  			 */
  def setHighlightedLeftTrackImage(highlightedLeftTrackImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.highlightedRightTrackImage> property.
  			 */
  def setHighlightedRightTrackImage(highlightedRightTrackImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.highlightedThumbImage> property.
  			 */
  def setHighlightedThumbImage(highlightedThumbImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.leftTrackImage> property.
  			 */
  def setLeftTrackImage(leftTrackImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.leftTrackLeftCap> property.
  			 */
  def setLeftTrackLeftCap(leftTrackLeftCap: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.leftTrackTopCap> property.
  			 */
  def setLeftTrackTopCap(leftTrackTopCap: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.max> property.
  			 */
  def setMax(max: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.maxRange> property.
  			 */
  def setMaxRange(maxRange: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.min> property.
  			 */
  def setMin(min: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.minRange> property.
  			 */
  def setMinRange(minRange: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.rightTrackImage> property.
  			 */
  def setRightTrackImage(rightTrackImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.rightTrackLeftCap> property.
  			 */
  def setRightTrackLeftCap(rightTrackLeftCap: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.rightTrackTopCap> property.
  			 */
  def setRightTrackTopCap(rightTrackTopCap: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.selectedLeftTrackImage> property.
  			 */
  def setSelectedLeftTrackImage(selectedLeftTrackImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.selectedRightTrackImage> property.
  			 */
  def setSelectedRightTrackImage(selectedRightTrackImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.selectedThumbImage> property.
  			 */
  def setSelectedThumbImage(selectedThumbImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.splitTrack> property.
  			 */
  def setSplitTrack(splitTrack: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.thumbImage> property.
  			 */
  def setThumbImage(thumbImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.thumbImage> property.
  			 */
  def setThumbImage(thumbImage: Blob): Unit = js.native
  /**
  			 * Sets the [value](Titanium.UI.Slider.value) property.
  			 */
  def setValue(value: Double): Unit = js.native
  def setValue(value: Double, options: js.Any): Unit = js.native
}

