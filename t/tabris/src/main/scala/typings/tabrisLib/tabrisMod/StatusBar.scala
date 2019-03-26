package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status bar is the area where notifications, status icons and device time are displayed. The
  * singleton instance can be accessed via `ui.statusBar`.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._StatusBarProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined displayMode, theme */ @JSImport("tabris", "StatusBar")
@js.native
class StatusBar protected () extends Widget {
  protected def this(properties: tabrisLib.Properties[StatusBar, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * Controls how the status bar is positioned relative to the `ui.contentView`. The value `default`
    * places the content below the status bar. The `hide` option lets the status bar disappear, making more
    * room for the content. The `float` option lets the content flow underneath the status bar. *On Windows
    * `float` is currently not supported and treated as `hide`.*
    */
  var displayMode: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.float | tabrisLib.tabrisLibStrings.hide = js.native
  /**
    * The height of the status bar in device independent pixel. Can be used in conjunction with the
    * `displayMode` `'float'` to offset the content as to not have it covered by the status bar.
    * @static
    */
  @JSName("height")
  val height_StatusBar: scala.Double = js.native
  /**
    * Defines the shade used on the status bar. A `dark` theme sets the foreground icons to be of a light
    * color, whereas `light` sets the icons to a dark color. The theme should be set in conjunction with
    * the `background` property for contrast. The value `default` selects the default theme that depends on
    * the device and on the app. Available on iOS and Android 6+.
    */
  var theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_StatusBar: tabrisLib.StatusBarProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: StatusBarEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: StatusBarEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: StatusBarEvents): this.type = js.native
}

