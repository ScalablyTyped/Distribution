package typings.titanium.Titanium.UI

import typings.titanium.hideParams
import typings.titanium.showParams
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
		 * An option dialog is a modal view that includes a message and one or more option items positioned
		 * in the middle of the display on Android and at the bottom edge on iOS. On Android, buttons may
		 * be added below the options.
		 */
@JSGlobal("Titanium.UI.OptionDialog")
@js.native
class OptionDialog () extends View {
  /**
  			 * View to load inside the message area, to create a custom layout.
  			 */
  var androidView: View = js.native
  /**
  			 * List of button names.
  			 */
  var buttonNames: js.Array[String] = js.native
  /**
  			 * Index to define the cancel option.
  			 */
  var cancel: Double = js.native
  /**
  			 * Index to define the destructive option, indicated by a visual cue when rendered.
  			 */
  var destructive: Double = js.native
  /**
  			 * Boolean value indicating if the option dialog should have an opaque background.
  			 */
  var opaquebackground: Boolean = js.native
  /**
  			 * List of option names to display in the dialog.
  			 */
  var options: js.Array[String] = js.native
  /**
  			 * Boolean value indicating if the option dialog should only be cancelled by user gesture or by hide method.
  			 */
  var persistent: Boolean = js.native
  /**
  			 * Defines the default selected option. Since `8.1.0`, if not defined or -1 it will show a normal list instead of radio buttons.
  			 */
  var selectedIndex: Double = js.native
  /**
  			 * Title of the dialog.
  			 */
  var title: String = js.native
  /**
  			 * Key identifying a string in the locale file to use for the title text.
  			 */
  var titleid: String = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: OptionDialogClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: OptionDialogDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: OptionDialogDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: OptionDialogFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: OptionDialogKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: OptionDialogLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: OptionDialogLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: OptionDialogPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: OptionDialogPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: OptionDialogSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: OptionDialogSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: OptionDialogTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: OptionDialogTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: OptionDialogTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: OptionDialogTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: OptionDialogTwofingertapEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.androidView> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.androidView> instead.
  			 */
  def getAndroidView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.buttonNames> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.buttonNames> instead.
  			 */
  def getButtonNames(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.cancel> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.cancel> instead.
  			 */
  def getCancel(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.destructive> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.destructive> instead.
  			 */
  def getDestructive(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.opaquebackground> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.opaquebackground> instead.
  			 */
  def getOpaquebackground(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.options> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.options> instead.
  			 */
  def getOptions(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.persistent> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.persistent> instead.
  			 */
  def getPersistent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.selectedIndex> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.selectedIndex> instead.
  			 */
  def getSelectedIndex(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.title> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.title> instead.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.OptionDialog.titleid> property.
  			 * @deprecated Access <Titanium.UI.OptionDialog.titleid> instead.
  			 */
  def getTitleid(): String = js.native
  def hide(params: hideParams): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.androidView> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.androidView> instead.
  			 */
  def setAndroidView(androidView: View): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.buttonNames> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.buttonNames> instead.
  			 */
  def setButtonNames(buttonNames: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.cancel> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.cancel> instead.
  			 */
  def setCancel(cancel: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.destructive> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.destructive> instead.
  			 */
  def setDestructive(destructive: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.opaquebackground> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.opaquebackground> instead.
  			 */
  def setOpaquebackground(opaquebackground: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.options> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.options> instead.
  			 */
  def setOptions(options: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.persistent> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.persistent> instead.
  			 */
  def setPersistent(persistent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.selectedIndex> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.selectedIndex> instead.
  			 */
  def setSelectedIndex(selectedIndex: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.title> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.title> instead.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.OptionDialog.titleid> property.
  			 * @deprecated Set the value using <Titanium.UI.OptionDialog.titleid> instead.
  			 */
  def setTitleid(titleid: String): Unit = js.native
  def show(params: showParams): Unit = js.native
}

