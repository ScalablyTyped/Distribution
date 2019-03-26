package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget representing a numeric value as a horizontal bar with a growing indicator.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._ProgressBarProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined maximum, minimum, selection, state, tintColor */ @JSImport("tabris", "ProgressBar")
@js.native
class ProgressBar () extends Widget {
  def this(properties: tabrisLib.Properties[ProgressBar, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * The value that represents a progress of 100%.
    */
  var maximum: scala.Double = js.native
  /**
    * The value that represents a progress of 0%.
    */
  var minimum: scala.Double = js.native
  /**
    * The actual progress to be displayed.
    */
  var selection: scala.Double = js.native
  /**
    * This property affects the color of the progress indicator. Not supported on iOS.
    */
  var state: tabrisLib.tabrisLibStrings.error | tabrisLib.tabrisLibStrings.normal | tabrisLib.tabrisLibStrings.paused = js.native
  /**
    * The color used to display the current progress.
    */
  var tintColor: tabrisLib.Color = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_ProgressBar: tabrisLib.ProgressBarProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: ProgressBarEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: ProgressBarEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: ProgressBarEvents): this.type = js.native
}

