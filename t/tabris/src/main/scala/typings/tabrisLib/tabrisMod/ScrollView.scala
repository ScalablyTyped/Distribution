package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A composite that allows its content to overflow either vertically (default) or horizontally. Since
  * the ScrollView does not compute its own size, the width and height must be defined by the respective
  * layout properties (e.g. either `width` or `left` and `right` must be specified).
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._ScrollViewProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, padding, right, top, transform, visible, width, win_theme. Inlined direction */ @JSImport("tabris", "ScrollView")
@js.native
class ScrollView () extends Composite {
  def this(properties: Properties[ScrollView, TypeScriptPropertiesKey]) = this()
  /**
    * Specifies the scrolling direction of the scroll composite.
    * @static
    */
  var direction: tabrisLib.tabrisLibStrings.horizontal | tabrisLib.tabrisLibStrings.vertical = js.native
  /**
    * The horizontal scrolling position in dip.
    */
  val offsetX: scala.Double = js.native
  /**
    * The vertical scrolling position in dip.
    */
  val offsetY: scala.Double = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_ScrollView: ScrollViewProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: ScrollViewEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: ScrollViewEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: ScrollViewEvents): this.type = js.native
  /**
    * Scrolls to the given horizontal offset. Give `{animate: false}` as the second parameter to suppress
    * the animation.
    * @param offset The offset to scroll to in dip.
    * @param options An additional object to control the animation. Set to `{animate: false}` to scroll without an animation.
    */
  def scrollToX(offset: scala.Double): this.type = js.native
  def scrollToX(offset: scala.Double, options: tabrisLib.Anon_Animate): this.type = js.native
  /**
    * Scrolls to the given vertical offset. Give `{animate: false}` as the second parameter to suppress the
    * animation.
    * @param offset The offset to scroll to in dip.
    * @param options An additional object to control the animation. Set to `{animate: false}` to scroll without an animation.
    */
  def scrollToY(offset: scala.Double): this.type = js.native
  def scrollToY(offset: scala.Double, options: tabrisLib.Anon_Animate): this.type = js.native
}

