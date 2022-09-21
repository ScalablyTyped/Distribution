package typings.videoJs.mod.videojs

import typings.std.Element
import typings.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Clickable Component which is clickable or keyboard actionable,
  * but is not a native HTML button.
  */
@js.native
trait ClickableComponent
  extends StObject
     with Component {
  
  /**
    * Get the localize text to use for the controls on the `Component`.
    *
    * @return - The control text when getting
    */
  def controlText(): String = js.native
  def controlText(text: String, el: Element): Unit = js.native
  
  /**
    * Create a control text element on this `Component`
    *
    * @param [el]
    *        Parent element for the control text.
    *
    * @return The control text element that gets created.
    */
  def createControlTextEl(): Element = js.native
  def createControlTextEl(el: Element): Element = js.native
  
  /**
    * Disable this `Component`s element.
    */
  def disable(): Unit = js.native
  
  /**
    * Enable this `Component`s element.
    */
  def enable(): Unit = js.native
  
  /**
    * Called when a `ClickableComponent` loses focus. Turns off the listener for
    * `keydown` events. Which Stops `this.handleKeyPress` from getting called.
    *
    * @param event
    *        The `blur` event that caused this function to be called.
    *
    * @listens blur
    */
  def handleBlur(event: Event): Unit = js.native
  
  /**
    * This gets called when a `ClickableComponent` gets:
    * - Clicked (via the `click` event, listening starts in the constructor)
    * - Tapped (via the `tap` event, listening starts in the constructor)
    * - The following things happen in order:
    *   1. {@link ClickableComponent#handleFocus} is called via a `focus` event on the
    *      `ClickableComponent`.
    *   2. {@link ClickableComponent#handleFocus} adds a listener for `keydown` on using
    *      {@link ClickableComponent#handleKeyPress}.
    *   3. `ClickableComponent` has not had a `blur` event (`blur` means that focus was lost). The user presses
    *      the space or enter key.
    *   4. {@link ClickableComponent#handleKeyPress} calls this function with the `keydown`
    *      event as a parameter.
    *
    * @param event
    *        The `keydown`, `tap`, or `click` event that caused this function to be
    *        called.
    *
    * @listens tap
    * @listens click
    */
  def handleClick(event: Event): Unit = js.native
  
  /**
    * This gets called when a `ClickableComponent` gains focus via a `focus` event.
    * Turns on listening for `keydown` events. When they happen it
    * calls `this.handleKeyPress`.
    *
    * @param event
    *        The `focus` event that caused this function to be called.
    *
    * @listens focus
    */
  def handleFocus(event: Event): Unit = js.native
  
  /**
    * Called when this ClickableComponent has focus and a key gets pressed down. By
    * default it will call `this.handleClick` when the key is space or enter.
    *
    * @param event
    *        The `keydown` event that caused this function to be called.
    *
    * @listens keydown
    */
  def handleKeyPress(event: Event): Unit = js.native
  
  @JSName("options_")
  var options__ClickableComponent: ClickableComponentOptions = js.native
}
