package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A check box widget.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._CheckBoxProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined checked, checkedTintColor, text, textColor, tintColor */ @JSImport("tabris", "CheckBox")
@js.native
class CheckBox () extends Widget {
  def this(properties: Properties[CheckBox, TypeScriptPropertiesKey]) = this()
  /**
    * The checked state of the check box.
    */
  var checked: scala.Boolean = js.native
  /**
    * The color of the selectable area in checked state. Will fall back to `tintColor` if not set.
    */
  var checkedTintColor: tabrisLib.Color = js.native
  /**
    * The label text of the check box.
    */
  var text: java.lang.String = js.native
  /**
    * The color of the text.
    */
  var textColor: tabrisLib.Color = js.native
  /**
    * The color of the selectable area.
    */
  var tintColor: tabrisLib.Color = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_CheckBox: CheckBoxProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: CheckBoxEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: CheckBoxEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: CheckBoxEvents): this.type = js.native
}

