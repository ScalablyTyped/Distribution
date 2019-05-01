package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A composite allowing to use a pull-to-refresh gesture to trigger and visualize a long running
  * operation.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._RefreshCompositeProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, padding, right, top, transform, visible, width, win_theme. Inlined refreshEnabled, refreshIndicator, refreshMessage */ @JSImport("tabris", "RefreshComposite")
@js.native
class RefreshComposite () extends Composite {
  def this(properties: Properties[RefreshComposite, TypeScriptPropertiesKey]) = this()
  /**
    * Whether the pull-to-refresh gesture can be performed by the user. When disabled, the
    * `RefreshComposite` behaves like a regular `Composite`.
    */
  var refreshEnabled: scala.Boolean = js.native
  /**
    * Whether to visualize a long running operation. After the user has triggered a manual refresh, this
    * property is `true` and should be set to `false` when the operation ended.
    */
  var refreshIndicator: scala.Boolean = js.native
  /**
    * A message to show to the user during the refresh operation.
    */
  var refreshMessage: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_RefreshComposite: RefreshCompositeProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: RefreshCompositeEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: RefreshCompositeEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: RefreshCompositeEvents): this.type = js.native
}

