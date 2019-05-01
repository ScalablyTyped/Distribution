package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An executable item that is integrated in the application's navigation menu. Add a listener on
  * *select* to implement the action.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._ActionProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined image, placementPriority, title, win_symbol */ @JSImport("tabris", "Action")
@js.native
class Action () extends Widget {
  def this(properties: Properties[Action, TypeScriptPropertiesKey]) = this()
  /**
    * Icon image for the action.
    */
  var image: Image | scala.Null = js.native
  /**
    * Actions with higher placement priority will be placed at a more significant position in the UI, e.g.
    * low priority actions could go into a menu instead of being included in a toolbar.
    */
  var placementPriority: tabrisLib.tabrisLibStrings.high | tabrisLib.tabrisLibStrings.low | tabrisLib.tabrisLibStrings.normal = js.native
  /**
    * The text to be displayed for the action.
    */
  var title: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Action: ActionProperties = js.native
  /**
    * Allows to override the image of the Action with an MDL2 ("Metro Design Language 2") symbol. When the
    * string does not exactly match [the name of an MDL2
    * symbol](https://msdn.microsoft.com/en-us/library/windows/apps/windows.ui.xaml.controls.symbol.aspx)
    * the `image` property is used instead. Platforms other than windows ignore this property and always
    * show the image.
    */
  var win_symbol: java.lang.String = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: ActionEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: ActionEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: ActionEvents): this.type = js.native
}

