package typings
package titaniumLib.TitaniumNs.UINs

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
  var disabledLeftTrackImage: java.lang.String = js.native
  /**
  			 * Image URL of the slider right track when in the disabled state.
  			 */
  var disabledRightTrackImage: java.lang.String = js.native
  /**
  			 * Image URL of the slider thumb when in the disabled state.
  			 */
  var disabledThumbImage: java.lang.String = js.native
  /**
  			 * Boolean to indicate the enabled state of the slider.
  			 */
  var enabled: scala.Boolean = js.native
  /**
  			 * Image URL of the slider left track when in the highlighted state.
  			 */
  var highlightedLeftTrackImage: java.lang.String = js.native
  /**
  			 * Image URL of the slider right track when in the highlighted state.
  			 */
  var highlightedRightTrackImage: java.lang.String = js.native
  /**
  			 * Image URL of the slider thumb when in the highlighted state.
  			 */
  var highlightedThumbImage: java.lang.String = js.native
  /**
  			 * Image URL of the slider left track.
  			 */
  var leftTrackImage: java.lang.String = js.native
  /**
  			 * Size of the left end cap for the leftTrackImage, disabledLeftTrackImage, highlightedLeftTrackImage and selectedLeftTrackImage properties.
  			 */
  var leftTrackLeftCap: scala.Double = js.native
  /**
  			 * Size of the top end cap for the leftTrackImage, disabledLeftTrackImage, highlightedLeftTrackImage and selectedLeftTrackImage properties.
  			 */
  var leftTrackTopCap: scala.Double = js.native
  /**
  			 * Maximum value of the slider.
  			 */
  var max: scala.Double = js.native
  /**
  			 * Upper limit on the slider value that can be selected.
  			 */
  var maxRange: scala.Double = js.native
  /**
  			 * Minimum value of the slider.
  			 */
  var min: scala.Double = js.native
  /**
  			 * Lower limit on the slider value that can be selected.
  			 */
  var minRange: scala.Double = js.native
  /**
  			 * Image URL of the slider right track.
  			 */
  var rightTrackImage: java.lang.String = js.native
  /**
  			 * Size of the left end cap for the rightTrackImage, disabledRightTrackImage, highlightedRightTrackImage and selectedRightTrackImage properties.
  			 */
  var rightTrackLeftCap: scala.Double = js.native
  /**
  			 * Size of the top end cap for the rightTrackImage, disabledRightTrackImage, highlightedRightTrackImage and selectedRightTrackImage properties.
  			 */
  var rightTrackTopCap: scala.Double = js.native
  /**
  			 * Image URL of the slider left track when in the selected state.
  			 */
  var selectedLeftTrackImage: java.lang.String = js.native
  /**
  			 * Image URL of the slider right track when in the selected state.
  			 */
  var selectedRightTrackImage: java.lang.String = js.native
  /**
  			 * Image URL of the slider thumb when in the selected state.
  			 */
  var selectedThumbImage: java.lang.String = js.native
  /**
  			 * Separates the thumbImage from the slider track.
  			 */
  var splitTrack: scala.Boolean = js.native
  /**
  			 * Image for the slider thumb.
  			 */
  var thumbImage: java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Current value of the slider.
  			 */
  var value: java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.disabledLeftTrackImage> property.
  			 */
  def getDisabledLeftTrackImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.disabledRightTrackImage> property.
  			 */
  def getDisabledRightTrackImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.disabledThumbImage> property.
  			 */
  def getDisabledThumbImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.enabled> property.
  			 */
  def getEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.highlightedLeftTrackImage> property.
  			 */
  def getHighlightedLeftTrackImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.highlightedRightTrackImage> property.
  			 */
  def getHighlightedRightTrackImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.highlightedThumbImage> property.
  			 */
  def getHighlightedThumbImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.leftTrackImage> property.
  			 */
  def getLeftTrackImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.leftTrackLeftCap> property.
  			 */
  def getLeftTrackLeftCap(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.leftTrackTopCap> property.
  			 */
  def getLeftTrackTopCap(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.max> property.
  			 */
  def getMax(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.maxRange> property.
  			 */
  def getMaxRange(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.min> property.
  			 */
  def getMin(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.minRange> property.
  			 */
  def getMinRange(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.rightTrackImage> property.
  			 */
  def getRightTrackImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.rightTrackLeftCap> property.
  			 */
  def getRightTrackLeftCap(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.rightTrackTopCap> property.
  			 */
  def getRightTrackTopCap(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.selectedLeftTrackImage> property.
  			 */
  def getSelectedLeftTrackImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.selectedRightTrackImage> property.
  			 */
  def getSelectedRightTrackImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.selectedThumbImage> property.
  			 */
  def getSelectedThumbImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.splitTrack> property.
  			 */
  def getSplitTrack(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.thumbImage> property.
  			 */
  def getThumbImage(): java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Slider.value> property.
  			 */
  def getValue(): java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.disabledLeftTrackImage> property.
  			 */
  def setDisabledLeftTrackImage(disabledLeftTrackImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.disabledRightTrackImage> property.
  			 */
  def setDisabledRightTrackImage(disabledRightTrackImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.disabledThumbImage> property.
  			 */
  def setDisabledThumbImage(disabledThumbImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.enabled> property.
  			 */
  def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.highlightedLeftTrackImage> property.
  			 */
  def setHighlightedLeftTrackImage(highlightedLeftTrackImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.highlightedRightTrackImage> property.
  			 */
  def setHighlightedRightTrackImage(highlightedRightTrackImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.highlightedThumbImage> property.
  			 */
  def setHighlightedThumbImage(highlightedThumbImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.leftTrackImage> property.
  			 */
  def setLeftTrackImage(leftTrackImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.leftTrackLeftCap> property.
  			 */
  def setLeftTrackLeftCap(leftTrackLeftCap: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.leftTrackTopCap> property.
  			 */
  def setLeftTrackTopCap(leftTrackTopCap: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.max> property.
  			 */
  def setMax(max: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.maxRange> property.
  			 */
  def setMaxRange(maxRange: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.min> property.
  			 */
  def setMin(min: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.minRange> property.
  			 */
  def setMinRange(minRange: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.rightTrackImage> property.
  			 */
  def setRightTrackImage(rightTrackImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.rightTrackLeftCap> property.
  			 */
  def setRightTrackLeftCap(rightTrackLeftCap: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.rightTrackTopCap> property.
  			 */
  def setRightTrackTopCap(rightTrackTopCap: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.selectedLeftTrackImage> property.
  			 */
  def setSelectedLeftTrackImage(selectedLeftTrackImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.selectedRightTrackImage> property.
  			 */
  def setSelectedRightTrackImage(selectedRightTrackImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.selectedThumbImage> property.
  			 */
  def setSelectedThumbImage(selectedThumbImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.splitTrack> property.
  			 */
  def setSplitTrack(splitTrack: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.thumbImage> property.
  			 */
  def setThumbImage(thumbImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Slider.thumbImage> property.
  			 */
  def setThumbImage(thumbImage: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the [value](Titanium.UI.Slider.value) property.
  			 */
  def setValue(value: scala.Double): scala.Unit = js.native
  def setValue(value: scala.Double, options: js.Any): scala.Unit = js.native
}

