package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the device that executes the application.
  */
@JSImport("tabris", "Device")
@js.native
class Device protected ()
  extends NativeObject
     with _DeviceProperties {
  /**
    * The user language configured on the device as an [RFC 4646](http://tools.ietf.org/html/rfc4646)
    * compliant string. For example `"de"`, `"es-ES"`, etc. This property is also available globally as
    * `navigator.language`.
    * @static
    */
  val language: java.lang.String = js.native
  /**
    * The name of the device model. For example `"iPad4,1"` or `"Nexus 7"`. This property is also available
    * globally as `device.model`.
    * @static
    */
  val model: java.lang.String = js.native
  /**
    * The name of the device set by owner. For example `"John's iPhone"`. This property is also available
    * globally as `device.name`.
    * @static
    */
  val name: java.lang.String = js.native
  /**
    * The device orientation. One of `portrait-primary`, `portrait-secondary`, `landscape-primary`, and
    * `landscape-secondary`.
    */
  val orientation: tabrisLib.tabrisLibStrings.`landscape-primary` | tabrisLib.tabrisLibStrings.`landscape-secondary` | tabrisLib.tabrisLibStrings.`portrait-primary` | tabrisLib.tabrisLibStrings.`portrait-secondary` = js.native
  /**
    * The name of the platform. Currently either `"Android"`, `"iOS"`, or `"windows"`. This property is
    * also available globally as `device.platform`.
    * @static
    */
  /* CompleteClass */
  override var platform: tabrisLib.tabrisLibStrings.Android | tabrisLib.tabrisLibStrings.iOS | tabrisLib.tabrisLibStrings.windows = js.native
  /**
    * The ratio between physical pixels and device independent pixels. This property is also available
    * globally as
    * [`window.devicePixelRatio`](https://developer.mozilla.org/en-US/docs/Web/API/Window.devicePixelRatio).
    * @static
    */
  val scaleFactor: scala.Double = js.native
  /**
    * The entire height of the device's screen in device independent pixel. Depends on the current device
    * orientation. This property is also available globally as
    * [screen.height](https://developer.mozilla.org/en-US/docs/Web/API/Screen.height).
    * @static
    */
  val screenHeight: scala.Double = js.native
  /**
    * The entire width of the device's screen in device independent pixel. Depends on the current device
    * orientation. This property is also available globally as
    * [screen.width](https://developer.mozilla.org/en-US/docs/Web/API/Screen.width).
    * @static
    */
  val screenWidth: scala.Double = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Device: DeviceProperties = js.native
  /**
    * The name of the device manufacture. For example `"Samsung"` or `"Apple"`. This property is also
    * available globally as `device.vendor`.
    * @static
    */
  val vendor: java.lang.String = js.native
  /**
    * The platform version. On iOS it looks like this: `"8.1.1"`. On Android, the [version
    * code](https://developer.android.com/reference/android/os/Build.VERSION_CODES.html) is returned. This
    * property is also available globally as `device.version`.
    * @static
    */
  val version: java.lang.String = js.native
  /**
    * Returns `true` if a hardware keyboard is present. The developer may choose to handle some user input
    * differently in that case. Available only on windows.
    */
  val win_keyboardPresent: scala.Boolean = js.native
  /**
    * On a PC this returns `"touch"` when in tablet mode, otherwise `"mouse"`. On phones this this returns
    * `"mouse"` when displayed on an external display ("Continuum"), otherwise `"touch"`. Available only on
    * windows
    */
  val win_primaryInput: tabrisLib.tabrisLibStrings.mouse | tabrisLib.tabrisLibStrings.touch = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: DeviceEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: DeviceEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: DeviceEvents): this.type = js.native
}

