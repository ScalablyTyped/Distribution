package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action that displays a search text field with dynamic proposals when selected. Add a listener on
  * *select* to implement the action. On *input*, you may set a list of *proposals*.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._SearchActionProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, image, layoutData, left, opacity, placementPriority, right, title, top, transform, visible, width, win_symbol, win_theme. Inlined message, proposals, text */ @JSImport("tabris", "SearchAction")
@js.native
class SearchAction () extends Action {
  def this(properties: tabrisLib.Properties[SearchAction, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * A hint text that is displayed when the search input is empty.
    */
  var message: java.lang.String = js.native
  /**
    * The list of proposals to display.
    */
  var proposals: js.Array[java.lang.String] = js.native
  /**
    * The text in the search input field.
    */
  var text: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_SearchAction: tabrisLib.SearchActionProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: SearchActionEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: SearchActionEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: SearchActionEvents): this.type = js.native
  /**
    * Invokes the search action, i.e. displays the UI to perform a search.
    */
  def open(): scala.Unit = js.native
}

