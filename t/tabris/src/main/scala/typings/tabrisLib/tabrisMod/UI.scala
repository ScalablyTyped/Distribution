package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the top-level parent for all widgets. It provides access to the status bar, the navigation
  * bar, the drawer and the content view.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._UIProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, padding, right, top, transform, visible, width, win_theme. Inlined contentView, drawer, navigationBar, statusBar */ @JSImport("tabris", "UI")
@js.native
class UI protected () extends Composite {
  /**
    * The content view is the container for the widgets that constitute the app's main UI. It covers the
    * entire app area. Widgets can be appended directly to the content view.
    * @static
    */
  var contentView: Composite = js.native
  /**
    * A drawer that can be swiped in from the left edge of the screen. The drawer is locked by default. To
    * use it in an application, set the property `locked` to `false`. The drawer can contain any kind of
    * widgets.
    * @static
    */
  var drawer: Drawer = js.native
  /**
    * Represents the system navigation bar is the onscreen area where *Back*, *Home* and similar buttons
    * are displayed. It is only supported on Android.
    * @static
    */
  var navigationBar: NavigationBar = js.native
  /**
    * Represents the system status bar. This is the area where notifications, status icons and device time
    * are displayed.
    * @static
    */
  var statusBar: StatusBar = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_UI: UIProperties = js.native
}

