package typings.videoJs.mod.videojs

import typings.std.Element
import typings.videoJs.mod.videojs.EventTarget.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `MenuButton` class for any popup {@link Menu}.
  */
@js.native
trait MenuButton extends Component {
  var menu: Menu = js.native
  var menuButton_ : Button = js.native
  @JSName("options_")
  var options__MenuButton: MenuButtonOptions = js.native
  /**
    * Allow sub components to stack CSS class names for the wrapper element
    *
    * @return The constructed wrapper DOM `className`
    */
  def buildWrapperCSSClass(): String = js.native
  /**
    * Get or set the localized control text that will be used for accessibility.
    *
    * > NOTE: This will come from the internal `menuButton_` element.
    *
    * @param [text]
    *        Control text for element.
    *
    * @param [el=this.menuButton_.el()]
    *        Element to set the title on.
    *
    * @return - The control text when getting
    */
  def controlText(): String = js.native
  def controlText(text: String, el: Element): String = js.native
  /**
    * Create the list of menu items. Specific to each subclass.
    */
  def createItems(): js.Array[MenuItem] = js.native
  /**
    * Create the menu and add all items to it.
    *
    * @return The constructed menu
    */
  def createMenu(): Menu = js.native
  /**
    * Disable the `MenuButton`. Don't allow it to be clicked.
    */
  def disable(): Unit = js.native
  /**
    * Enable the `MenuButton`. Allow it to be clicked.
    */
  def enable(): Unit = js.native
  /**
    * Called when a `MenuButton` loses focus. Turns off the listener for
    * `keydown` events. Which Stops `this.handleKeyPress` from getting called.
    *
    * @param event
    *        The `blur` event that caused this function to be called.
    *
    * @listens blur
    */
  def handleBlur(event: Event): Unit = js.native
  /**
    * Handle a click on a `MenuButton`.
    * See {@link ClickableComponent#handleClick} for instances where this is called.
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
    * This gets called when a `MenuButton` gains focus via a `focus` event.
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
    * Handle tab, escape, down arrow, and up arrow keys for `MenuButton`. See
    * {@link ClickableComponent#handleKeyPress} for instances where this is called.
    *
    * @param event
    *        The `keydown` event that caused this function to be called.
    *
    * @listens keydown
    */
  def handleKeyPress(event: Event): Unit = js.native
  /**
    * Handle a `keydown` event on a sub-menu. The listener for this is added in
    * the constructor.
    *
    * @param event
    *        Key press event
    *
    * @listens keydown
    */
  def handleSubmenuKeyPress(event: Event): Unit = js.native
  /**
    * Put the current `MenuButton` into a pressed state.
    */
  def pressButton(): Unit = js.native
  /**
    * Take the current `MenuButton` out of a pressed state.
    */
  def unpressButton(): Unit = js.native
  /**
    * Update the menu based on the current state of its items.
    */
  def update(): Unit = js.native
}

