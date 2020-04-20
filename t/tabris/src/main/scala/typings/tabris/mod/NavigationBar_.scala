package typings.tabris.mod

import typings.tabris.OmitNavigationBarset
import typings.tabris.tabrisStrings.background
import typings.tabris.tabrisStrings.dark
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.displayMode
import typings.tabris.tabrisStrings.float
import typings.tabris.tabrisStrings.hide
import typings.tabris.tabrisStrings.light
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "NavigationBar")
@js.native
class NavigationBar_ protected () extends NativeObject {
  protected def this(properties: Properties[NavigationBar_, OmitNavigationBarset]) = this()
  /**
    * Background color of the navigation bar.
    */
  var background: ColorValue = js.native
  /**
    * Controls how the navigation bar is positioned relative to the `contentView`. The value `default`
    * places the content above the navigation bar. The `hide` option lets the navigation bar disappear,
    * making room for the content. The `float` option lets the content flow underneath the navigation bar.
    */
  var displayMode: default | float | hide = js.native
  /**
    * The height of the navigation bar in device independent pixel. Can be used in conjunction with the
    * `displayMode` `float` to offset the content as to not have it covered by the navigation bar.
    * @constant
    */
  val height: Double = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_NavigationBar_ : (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with js.Object = js.native
  /**
    * Fired when the [*background*](#background) property has changed.
    */
  var onBackgroundChanged: ChangeListeners[this.type, background] = js.native
  /**
    * Fired when the [*displayMode*](#displayMode) property has changed.
    */
  var onDisplayModeChanged: ChangeListeners[this.type, displayMode] = js.native
  /**
    * Fired when the [*theme*](#theme) property has changed.
    */
  var onThemeChanged: ChangeListeners[this.type, theme] = js.native
  /**
    * Defines the appearance used on the navigation bar. A `dark` theme sets the foreground navigation
    * icons to be of a light color, whereas `light` sets the icons to a dark color. The theme should be set
    * in conjunction with the `background` property for contrast. The value `default` selects the default
    * theme that depends on the device and on the app. Available on Android 8+.
    */
  var theme: dark | default | light = js.native
}

