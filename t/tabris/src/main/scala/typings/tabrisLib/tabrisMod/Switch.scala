package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A switch widget that can be toggled.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._SwitchProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined checked, thumbOffColor, thumbOnColor, trackOffColor, trackOnColor */ @JSImport("tabris", "Switch")
@js.native
class Switch () extends Widget {
  def this(properties: Properties[Switch, TypeScriptPropertiesKey]) = this()
  /**
    * The checked state of the switch.
    */
  var checked: scala.Boolean = js.native
  /**
    * The color of the movable thumb, when switched *off*.
    */
  var thumbOffColor: tabrisLib.Color = js.native
  /**
    * The color of the movable thumb, when switched *on*.
    */
  var thumbOnColor: tabrisLib.Color = js.native
  /**
    * The color of the track that holds the thumb, when switched *off*.
    */
  var trackOffColor: tabrisLib.Color = js.native
  /**
    * The color of the track that holds the thumb, when switched *on*.
    */
  var trackOnColor: tabrisLib.Color = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Switch: SwitchProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: SwitchEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: SwitchEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: SwitchEvents): this.type = js.native
}

