package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.UI.View
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
			 * An iOS toolbar, which can contain buttons and certain other controls.
			 * @deprecated Use the cross-platform [Titanium.UI.Toolbar](Titanium.UI.Toolbar) instead.
			 */
@JSGlobal("Titanium.UI.iOS.Toolbar")
@js.native
class Toolbar () extends View {
  /**
  				 * Background color for the toolbar, as a color name or hex triplet.
  				 */
  var barColor: String = js.native
  /**
  				 * If `true`, the background of the toolbar extends upwards.
  				 */
  var extendBackground: Boolean = js.native
  /**
  				 * An array of buttons (or other widgets) contained in the toolbar.
  				 */
  var items: js.Array[View] = js.native
  /**
  				 * If `true`, a translucent background color is used for the toolbar.
  				 */
  var translucent: Boolean = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ToolbarClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ToolbarDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ToolbarDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ToolbarKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ToolbarLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ToolbarPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ToolbarPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ToolbarSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ToolbarSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ToolbarTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ToolbarTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ToolbarTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ToolbarTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ToolbarTwofingertapEvent): Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Toolbar.barColor> property.
  				 * @deprecated Access <Titanium.UI.iOS.Toolbar.barColor> instead.
  				 */
  def getBarColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Toolbar.extendBackground> property.
  				 * @deprecated Access <Titanium.UI.iOS.Toolbar.extendBackground> instead.
  				 */
  def getExtendBackground(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Toolbar.items> property.
  				 * @deprecated Access <Titanium.UI.iOS.Toolbar.items> instead.
  				 */
  def getItems(): js.Array[View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Toolbar.translucent> property.
  				 * @deprecated Access <Titanium.UI.iOS.Toolbar.translucent> instead.
  				 */
  def getTranslucent(): Boolean = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Toolbar.barColor> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.Toolbar.barColor> instead.
  				 */
  def setBarColor(barColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Toolbar.extendBackground> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.Toolbar.extendBackground> instead.
  				 */
  def setExtendBackground(extendBackground: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Toolbar.items> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.Toolbar.items> instead.
  				 */
  def setItems(items: js.Array[View]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Toolbar.translucent> property.
  				 * @deprecated Set the value using <Titanium.UI.iOS.Toolbar.translucent> instead.
  				 */
  def setTranslucent(translucent: Boolean): Unit = js.native
}

