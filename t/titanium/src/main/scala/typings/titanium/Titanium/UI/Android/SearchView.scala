package typings.titanium.Titanium.UI.Android

import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.blur
import typings.titanium.titaniumStrings.cancel
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
import typings.titanium.titaniumStrings.submit
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specialized text field for entering search text.
  */
@js.native
trait SearchView extends View {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_blur(
    name: blur,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchViewBlurEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    name: cancel,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchViewCancelEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchViewChangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    name: submit,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchViewSubmitEvent, Unit]
  ): Unit = js.native
  
  /**
    * Causes the search view to lose focus.
    */
  def blur(): Unit = js.native
  
  /**
    * Color of the text in this SearchView, as a color name or hex triplet.
    */
  var color: String = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_blur(name: blur): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blur(name: blur, event: SearchViewBlurEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_cancel(name: cancel): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_cancel(name: cancel, event: SearchViewCancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: SearchViewChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: SearchViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: SearchViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: SearchViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: SearchViewFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: SearchViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: SearchViewLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: SearchViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: SearchViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: SearchViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: SearchViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_submit(name: submit): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_submit(name: submit, event: SearchViewSubmitEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: SearchViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: SearchViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: SearchViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: SearchViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: SearchViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: SearchViewTwofingertapEvent): Unit = js.native
  
  /**
    * Causes the search view to gain focus.
    */
  def focus(): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.SearchView.color> property.
    * @deprecated Access <Titanium.UI.Android.SearchView.color> instead.
    */
  def getColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.SearchView.hintText> property.
    * @deprecated Access <Titanium.UI.Android.SearchView.hintText> instead.
    */
  def getHintText(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.SearchView.hintTextColor> property.
    * @deprecated Access <Titanium.UI.Android.SearchView.hintTextColor> instead.
    */
  def getHintTextColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.SearchView.iconified> property.
    * @deprecated Access <Titanium.UI.Android.SearchView.iconified> instead.
    */
  def getIconified(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.SearchView.iconifiedByDefault> property.
    * @deprecated Access <Titanium.UI.Android.SearchView.iconifiedByDefault> instead.
    */
  def getIconifiedByDefault(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.SearchView.submitEnabled> property.
    * @deprecated Access <Titanium.UI.Android.SearchView.submitEnabled> instead.
    */
  def getSubmitEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.SearchView.value> property.
    * @deprecated Access <Titanium.UI.Android.SearchView.value> instead.
    */
  def getValue(): String = js.native
  
  /**
    * Text to show when the search view field is not focused.
    */
  var hintText: String = js.native
  
  /**
    * Color of hint text that displays when field is empty.
    */
  var hintTextColor: String = js.native
  
  /**
    * Iconifies or expands the search view
    */
  var iconified: Boolean = js.native
  
  /**
    * Sets the default or resting state of the search view
    */
  var iconifiedByDefault: Boolean = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_blur(
    name: blur,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchViewBlurEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    name: cancel,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchViewCancelEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchViewChangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    name: submit,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchViewSubmitEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.SearchView.color> property.
    * @deprecated Set the value using <Titanium.UI.Android.SearchView.color> instead.
    */
  def setColor(color: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.SearchView.hintText> property.
    * @deprecated Set the value using <Titanium.UI.Android.SearchView.hintText> instead.
    */
  def setHintText(hintText: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.SearchView.hintTextColor> property.
    * @deprecated Set the value using <Titanium.UI.Android.SearchView.hintTextColor> instead.
    */
  def setHintTextColor(hintTextColor: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.SearchView.iconified> property.
    * @deprecated Set the value using <Titanium.UI.Android.SearchView.iconified> instead.
    */
  def setIconified(iconified: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.SearchView.iconifiedByDefault> property.
    * @deprecated Set the value using <Titanium.UI.Android.SearchView.iconifiedByDefault> instead.
    */
  def setIconifiedByDefault(iconifiedByDefault: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.SearchView.submitEnabled> property.
    * @deprecated Set the value using <Titanium.UI.Android.SearchView.submitEnabled> instead.
    */
  def setSubmitEnabled(submitEnabled: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.SearchView.value> property.
    * @deprecated Set the value using <Titanium.UI.Android.SearchView.value> instead.
    */
  def setValue(value: String): Unit = js.native
  
  /**
    * Whether to display the submit button when necessary or never display.
    */
  var submitEnabled: Boolean = js.native
  
  /**
    * Value of the search view.
    */
  var value: String = js.native
}
