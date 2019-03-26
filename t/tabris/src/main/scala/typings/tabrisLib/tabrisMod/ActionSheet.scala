package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pop up dialog that offers a selection. Is automatically disposed when closed.
  */
@JSImport("tabris", "ActionSheet")
@js.native
class ActionSheet ()
  extends Popup
     with _ActionSheetProperties {
  def this(properties: tabrisLib.Properties[ActionSheet, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * An array of objects describing the actions to be displayed. Each action must have a title and it can
    * also have an image. Actions with the style `cancel` or `destructive` are displayed in a special way.
    */
  /* CompleteClass */
  override var actions: js.Array[tabrisLib.Anon_Cancel] = js.native
  /**
    * A descriptive message for the available actions.
    */
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /**
    * The title of the action sheet.
    */
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_ActionSheet: tabrisLib.ActionSheetProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: ActionSheetEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: ActionSheetEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: ActionSheetEvents): this.type = js.native
}

