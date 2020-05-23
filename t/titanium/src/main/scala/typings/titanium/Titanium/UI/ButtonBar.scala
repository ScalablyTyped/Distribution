package typings.titanium.Titanium.UI

import typings.titanium.BarItemType
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An iOS button bar component.
  */
@js.native
trait ButtonBar extends View {
  /**
    * Index of the currently selected button.
    * @deprecated This property has been deprecated in Titanium SDK 8.0.0 as this property has no effect
    * and will be removed in SDK 9.0.0.
    *
    */
  var index: Double = js.native
  /**
    * Array of labels for the button bar.
    */
  var labels: js.Array[BarItemType | String] = js.native
  /**
    * Color of selected button, as a color name or hex triplet.
    */
  var selectedButtonColor: String = js.native
  /**
    * Color of title of button when it is selected, as a color name or hex triplet.
    */
  var selectedTextColor: String = js.native
  /**
    * Color of title of button, as a color name or hex triplet.
    */
  var textColor: String = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ButtonBarClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ButtonBarDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ButtonBarDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ButtonBarKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ButtonBarLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ButtonBarPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ButtonBarPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ButtonBarSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ButtonBarSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ButtonBarTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ButtonBarTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ButtonBarTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ButtonBarTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ButtonBarTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.ButtonBar.index> property.
    * @deprecated This property has been deprecated in Titanium SDK 8.0.0 as this property has no effect
    * and will be removed in SDK 9.0.0.
    *
    */
  def getIndex(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.ButtonBar.labels> property.
    * @deprecated Access <Titanium.UI.ButtonBar.labels> instead.
    */
  def getLabels(): js.Array[BarItemType | String] = js.native
  /**
    * Gets the value of the <Titanium.UI.ButtonBar.selectedButtonColor> property.
    * @deprecated Access <Titanium.UI.ButtonBar.selectedButtonColor> instead.
    */
  def getSelectedButtonColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.ButtonBar.selectedTextColor> property.
    * @deprecated Access <Titanium.UI.ButtonBar.selectedTextColor> instead.
    */
  def getSelectedTextColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.ButtonBar.textColor> property.
    * @deprecated Access <Titanium.UI.ButtonBar.textColor> instead.
    */
  def getTextColor(): String = js.native
  /**
    * Sets the value of the <Titanium.UI.ButtonBar.index> property.
    * @deprecated This property has been deprecated in Titanium SDK 8.0.0 as this property has no effect
    * and will be removed in SDK 9.0.0.
    *
    */
  def setIndex(index: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ButtonBar.labels> property.
    * @deprecated Set the value using <Titanium.UI.ButtonBar.labels> instead.
    */
  def setLabels(labels: js.Array[BarItemType | String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ButtonBar.selectedButtonColor> property.
    * @deprecated Set the value using <Titanium.UI.ButtonBar.selectedButtonColor> instead.
    */
  def setSelectedButtonColor(selectedButtonColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ButtonBar.selectedTextColor> property.
    * @deprecated Set the value using <Titanium.UI.ButtonBar.selectedTextColor> instead.
    */
  def setSelectedTextColor(selectedTextColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ButtonBar.textColor> property.
    * @deprecated Set the value using <Titanium.UI.ButtonBar.textColor> instead.
    */
  def setTextColor(textColor: String): Unit = js.native
}

