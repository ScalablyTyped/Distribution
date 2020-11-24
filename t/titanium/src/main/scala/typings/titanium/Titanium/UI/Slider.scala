package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
import typings.titanium.Titanium.Blob
import typings.titanium.titaniumStrings.change
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.start
import typings.titanium.titaniumStrings.stop
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A slider component with a draggable thumb.
  */
@js.native
trait Slider extends View {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SliderChangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(name: start, callback: js.ThisFunction1[/* this */ this.type, /* event */ SliderStartEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stop(name: stop, callback: js.ThisFunction1[/* this */ this.type, /* event */ SliderStopEvent, Unit]): Unit = js.native
  
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
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: SliderChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: SliderClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: SliderDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: SliderDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: SliderFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: SliderKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: SliderLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: SliderLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: SliderPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: SliderPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: SliderSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start, event: SliderStartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop, event: SliderStopEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: SliderSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: SliderTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: SliderTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: SliderTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: SliderTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: SliderTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.disabledLeftTrackImage> property.
    * @deprecated Access <Titanium.UI.Slider.disabledLeftTrackImage> instead.
    */
  def getDisabledLeftTrackImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.disabledRightTrackImage> property.
    * @deprecated Access <Titanium.UI.Slider.disabledRightTrackImage> instead.
    */
  def getDisabledRightTrackImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.disabledThumbImage> property.
    * @deprecated Access <Titanium.UI.Slider.disabledThumbImage> instead.
    */
  def getDisabledThumbImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.enabled> property.
    * @deprecated Access <Titanium.UI.Slider.enabled> instead.
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.highlightedLeftTrackImage> property.
    * @deprecated Access <Titanium.UI.Slider.highlightedLeftTrackImage> instead.
    */
  def getHighlightedLeftTrackImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.highlightedRightTrackImage> property.
    * @deprecated Access <Titanium.UI.Slider.highlightedRightTrackImage> instead.
    */
  def getHighlightedRightTrackImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.highlightedThumbImage> property.
    * @deprecated Access <Titanium.UI.Slider.highlightedThumbImage> instead.
    */
  def getHighlightedThumbImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.leftTrackImage> property.
    * @deprecated Access <Titanium.UI.Slider.leftTrackImage> instead.
    */
  def getLeftTrackImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.leftTrackLeftCap> property.
    * @deprecated Access <Titanium.UI.Slider.leftTrackLeftCap> instead.
    */
  def getLeftTrackLeftCap(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.leftTrackTopCap> property.
    * @deprecated Access <Titanium.UI.Slider.leftTrackTopCap> instead.
    */
  def getLeftTrackTopCap(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.max> property.
    * @deprecated Access <Titanium.UI.Slider.max> instead.
    */
  def getMax(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.maxRange> property.
    * @deprecated Access <Titanium.UI.Slider.maxRange> instead.
    */
  def getMaxRange(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.min> property.
    * @deprecated Access <Titanium.UI.Slider.min> instead.
    */
  def getMin(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.minRange> property.
    * @deprecated Access <Titanium.UI.Slider.minRange> instead.
    */
  def getMinRange(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.rightTrackImage> property.
    * @deprecated Access <Titanium.UI.Slider.rightTrackImage> instead.
    */
  def getRightTrackImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.rightTrackLeftCap> property.
    * @deprecated Access <Titanium.UI.Slider.rightTrackLeftCap> instead.
    */
  def getRightTrackLeftCap(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.rightTrackTopCap> property.
    * @deprecated Access <Titanium.UI.Slider.rightTrackTopCap> instead.
    */
  def getRightTrackTopCap(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.selectedLeftTrackImage> property.
    * @deprecated Access <Titanium.UI.Slider.selectedLeftTrackImage> instead.
    */
  def getSelectedLeftTrackImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.selectedRightTrackImage> property.
    * @deprecated Access <Titanium.UI.Slider.selectedRightTrackImage> instead.
    */
  def getSelectedRightTrackImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.selectedThumbImage> property.
    * @deprecated Access <Titanium.UI.Slider.selectedThumbImage> instead.
    */
  def getSelectedThumbImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.splitTrack> property.
    * @deprecated Access <Titanium.UI.Slider.splitTrack> instead.
    */
  def getSplitTrack(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.thumbImage> property.
    * @deprecated Access <Titanium.UI.Slider.thumbImage> instead.
    */
  def getThumbImage(): String | Blob = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.trackTintColor> property.
    * @deprecated Access <Titanium.UI.Slider.trackTintColor> instead.
    */
  def getTrackTintColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Slider.value> property.
    * @deprecated Access <Titanium.UI.Slider.value> instead.
    */
  def getValue(): Double = js.native
  
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
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SliderChangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(name: start, callback: js.ThisFunction1[/* this */ this.type, /* event */ SliderStartEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stop(name: stop, callback: js.ThisFunction1[/* this */ this.type, /* event */ SliderStopEvent, Unit]): Unit = js.native
  
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
    * Sets the value of the <Titanium.UI.Slider.disabledLeftTrackImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.disabledLeftTrackImage> instead.
    */
  def setDisabledLeftTrackImage(disabledLeftTrackImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.disabledRightTrackImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.disabledRightTrackImage> instead.
    */
  def setDisabledRightTrackImage(disabledRightTrackImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.disabledThumbImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.disabledThumbImage> instead.
    */
  def setDisabledThumbImage(disabledThumbImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.enabled> property.
    * @deprecated Set the value using <Titanium.UI.Slider.enabled> instead.
    */
  def setEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.highlightedLeftTrackImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.highlightedLeftTrackImage> instead.
    */
  def setHighlightedLeftTrackImage(highlightedLeftTrackImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.highlightedRightTrackImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.highlightedRightTrackImage> instead.
    */
  def setHighlightedRightTrackImage(highlightedRightTrackImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.highlightedThumbImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.highlightedThumbImage> instead.
    */
  def setHighlightedThumbImage(highlightedThumbImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.leftTrackImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.leftTrackImage> instead.
    */
  def setLeftTrackImage(leftTrackImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.leftTrackLeftCap> property.
    * @deprecated Set the value using <Titanium.UI.Slider.leftTrackLeftCap> instead.
    */
  def setLeftTrackLeftCap(leftTrackLeftCap: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.leftTrackTopCap> property.
    * @deprecated Set the value using <Titanium.UI.Slider.leftTrackTopCap> instead.
    */
  def setLeftTrackTopCap(leftTrackTopCap: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.max> property.
    * @deprecated Set the value using <Titanium.UI.Slider.max> instead.
    */
  def setMax(max: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.maxRange> property.
    * @deprecated Set the value using <Titanium.UI.Slider.maxRange> instead.
    */
  def setMaxRange(maxRange: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.min> property.
    * @deprecated Set the value using <Titanium.UI.Slider.min> instead.
    */
  def setMin(min: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.minRange> property.
    * @deprecated Set the value using <Titanium.UI.Slider.minRange> instead.
    */
  def setMinRange(minRange: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.rightTrackImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.rightTrackImage> instead.
    */
  def setRightTrackImage(rightTrackImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.rightTrackLeftCap> property.
    * @deprecated Set the value using <Titanium.UI.Slider.rightTrackLeftCap> instead.
    */
  def setRightTrackLeftCap(rightTrackLeftCap: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.rightTrackTopCap> property.
    * @deprecated Set the value using <Titanium.UI.Slider.rightTrackTopCap> instead.
    */
  def setRightTrackTopCap(rightTrackTopCap: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.selectedLeftTrackImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.selectedLeftTrackImage> instead.
    */
  def setSelectedLeftTrackImage(selectedLeftTrackImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.selectedRightTrackImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.selectedRightTrackImage> instead.
    */
  def setSelectedRightTrackImage(selectedRightTrackImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.selectedThumbImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.selectedThumbImage> instead.
    */
  def setSelectedThumbImage(selectedThumbImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.splitTrack> property.
    * @deprecated Set the value using <Titanium.UI.Slider.splitTrack> instead.
    */
  def setSplitTrack(splitTrack: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.thumbImage> property.
    * @deprecated Set the value using <Titanium.UI.Slider.thumbImage> instead.
    */
  def setThumbImage(thumbImage: String): Unit = js.native
  def setThumbImage(thumbImage: Blob): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Slider.trackTintColor> property.
    * @deprecated Set the value using <Titanium.UI.Slider.trackTintColor> instead.
    */
  def setTrackTintColor(trackTintColor: String): Unit = js.native
  def setTrackTintColor(trackTintColor: Color): Unit = js.native
  
  /**
    * Sets the [value](Titanium.UI.Slider.value) property.
    */
  def setValue(value: Double): Unit = js.native
  def setValue(value: Double, options: AnimatedOptions): Unit = js.native
  
  /**
    * Separates the thumbImage from the slider track.
    */
  var splitTrack: Boolean = js.native
  
  /**
    * Image for the slider thumb.
    */
  var thumbImage: String | Blob = js.native
  
  /**
    * The color shown for the portion of the progress bar that is not filled.
    */
  var trackTintColor: String | Color = js.native
  
  /**
    * Current value of the slider.
    */
  var value: Double = js.native
}
