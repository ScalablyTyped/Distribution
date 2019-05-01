package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A push button that "snaps in", i.e. it is selected when pressed and deselected when pressed again.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._ToggleButtonProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined alignment, checked, image, text, textColor */ @JSImport("tabris", "ToggleButton")
@js.native
class ToggleButton () extends Widget {
  def this(properties: Properties[ToggleButton, TypeScriptPropertiesKey]) = this()
  /**
    * The horizontal alignment of the button text.
    */
  var alignment: tabrisLib.tabrisLibStrings.center | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.right = js.native
  /**
    * The checked state of the toggle button.
    */
  var checked: scala.Boolean = js.native
  /**
    * An image to be displayed on the button.
    */
  var image: Image | scala.Null = js.native
  /**
    * The button's label text.
    */
  var text: java.lang.String = js.native
  /**
    * The color of the text.
    */
  var textColor: tabrisLib.Color = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_ToggleButton: ToggleButtonProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: ToggleButtonEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: ToggleButtonEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: ToggleButtonEvents): this.type = js.native
}

