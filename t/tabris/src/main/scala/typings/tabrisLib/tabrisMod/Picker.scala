package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget with a drop-down list of items to choose from.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._PickerProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined borderColor, fillColor, itemCount, itemText, selectionIndex, textColor */ @JSImport("tabris", "Picker")
@js.native
class Picker () extends Widget {
  def this(properties: tabrisLib.Properties[Picker, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * The color of the border of the Picker. On iOS this is a rectangular border around the Picker, on
    * Android it is a single line below the Picker.
    */
  var borderColor: tabrisLib.Color = js.native
  /**
    * The color of the background of the Picker - applies only to iOS.
    */
  var fillColor: tabrisLib.Color = js.native
  /**
    * The number of items to display.
    */
  var itemCount: scala.Double = js.native
  /**
    * The index of the currently selected item.
    */
  var selectionIndex: scala.Double = js.native
  /**
    * The color of the text.
    */
  var textColor: tabrisLib.Color = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Picker: tabrisLib.PickerProperties = js.native
  /**
    * A function that returns the string to display for a given index.
    */
  def itemText(index: scala.Double): java.lang.String = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: PickerEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: PickerEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: PickerEvents): this.type = js.native
}

