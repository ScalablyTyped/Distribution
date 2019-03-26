package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget to display a text. For images, use ImageView.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._TextViewProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined alignment, lineSpacing, markupEnabled, maxLines, selectable, text, textColor */ @JSImport("tabris", "TextView")
@js.native
class TextView () extends Widget {
  def this(properties: tabrisLib.Properties[TextView, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * The horizontal alignment of the text.
    */
  var alignment: tabrisLib.tabrisLibStrings.center | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.right = js.native
  /**
    * The amount of space between each line of text. The `lineSpacing` property is a factor with a default
    * value of `1.0`.
    */
  var lineSpacing: scala.Double = js.native
  /**
    * Allows for a subset of HTML tags in the text. Supported tags are: `a`, `del`, `ins`, `b`, `i`,
    * `strong`, `em`, `big`, `small`, `br`. All tags must be closed (e.g. use `<br/>` instead of `<br>`).
    * Nesting tags is currently not supported.
    * @static
    */
  var markupEnabled: scala.Boolean = js.native
  /**
    * Limit the number of lines to be displayed to the given maximum. `null` disables this limit.
    */
  var maxLines: scala.Double | scala.Null = js.native
  /**
    * Whether the text can be selected or not. Currently only support on Android.
    */
  var selectable: scala.Boolean = js.native
  /**
    * The text to display.
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
  val tsProperties_TextView: tabrisLib.TextViewProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: TextViewEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: TextViewEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: TextViewEvents): this.type = js.native
}

