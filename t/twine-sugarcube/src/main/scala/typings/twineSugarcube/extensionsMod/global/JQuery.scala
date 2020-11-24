package typings.twineSugarcube.extensionsMod.global

import typings.jquery.JQuery.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * Makes the target element(s) WAI-ARIA-compatible clickables—meaning that various accessibility attributes are set and,
    * in addition to mouse clicks, enter/return and spacebar key presses also activate them. Returns a reference to the current
    * jQuery object for chaining.
    * @param handler  The callback to invoke when the target element(s) are activated.
    * @since 2.0.0
    * @example
    * // Given an existing element: <a id="so-clicky">Click me</a>
    * $('#so-clicky').ariaClick(function (event) {
    *         // do stuff
    * });
    *
    * @example
    * // Creates a basic link and appends it to the `output` element
    * $('<a>Click me</a>')
    *         .ariaClick(function (event) {
    *             // do stuff
    *         })
    * .appendTo(output);
    *
    * @example
    * // Creates a basic button and appends it to the `output` element
    * $('<button>Click me</button>')
    *         .ariaClick(function (event) {
    *         // do stuff
    * })
    * .appendTo(output);
    */
  def ariaClick(handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Makes the target element(s) WAI-ARIA-compatible clickables—meaning that various accessibility attributes are set and,
    * in addition to mouse clicks, enter/return and spacebar key presses also activate them. Returns a reference to the current
    * jQuery object for chaining.
    * @param options The options to be used when creating the clickables.
    * @param handler The callback to invoke when the target element(s) are activated.
    * @example
    * // Creates a link with options and appends it to the `output` element
    * $('<a>Click me</a>')
    *         .ariaClick({
    *             one   : true,
    *             label : 'This single-use link does stuff.'
    *         }, function (event) {
    *             // do stuff
    *         })
    * .appendTo(output);
    */
  def ariaClick(options: JQueryAriaClickOptions, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  /**
    * Changes the disabled state of the target WAI-ARIA-compatible clickable element(s). Returns a reference to the current
    * jQuery object for chaining.
    * NOTE: This method is meant to work with clickables created via <jQuery>.ariaClick() and may not work with clickables
    * from other sources. SugarCube uses <jQuery>.ariaClick() internally to handle all of its various link markup and macros.
    * @param state The disabled state to apply. Truthy to disable the element(s), falsy to enable them.
    * @since 2.26.0
    * @example
    * // Given an existing WAI-ARIA-compatible clickable element with the ID "so-clicky"
    * $('#so-clicky').ariaDisabled(true); // Disables the target element
    * $('#so-clicky').ariaDisabled(false); // Enables the target element
    */
  def ariaDisabled(state: Boolean): Boolean = js.native
  
  /**
    * Returns whether any of the target WAI-ARIA-compatible clickable element(s) are disabled.
    *
    * NOTE: This method is meant to work with clickables created via <jQuery>.ariaClick() and may not work with clickables
    * from other sources. SugarCube uses <jQuery>.ariaClick() internally to handle all of its various link markup and macros.
    * @since 2.26.0
    * @example
    * // Given an existing WAI-ARIA-compatible clickable element with the ID "so-clicky"
    * // If "#so-clicky" is disabled:
    * $('#so-clicky').ariaIsDisabled(); // Returns true
    *
    * // If "#so-clicky" is enabled:
    * $('#so-clicky').ariaIsDisabled(); // Returns false
    */
  def ariaIsDisabled(): Boolean = js.native
  
  /**
    * Wikifies the given content source(s) and appends the result to the target element(s). Returns a reference to the
    * current jQuery object for chaining.
    * @param sources The list of content sources.
    * @since 2.0.0
    * @example
    * // Given an element: <div id="the-box"></div>
    * $('#the-box').wiki('Who //are// you?'); // Appends "Who <em>are</em> you?" to the target element
    */
  def wiki(sources: java.lang.String*): this.type = js.native
}
