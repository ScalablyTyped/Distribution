package typings.tabris.mod

import typings.tabris.tabrisStrings.Android
import typings.tabris.tabrisStrings.`landscape-primary`
import typings.tabris.tabrisStrings.`landscape-secondary`
import typings.tabris.tabrisStrings.`portrait-primary`
import typings.tabris.tabrisStrings.`portrait-secondary`
import typings.tabris.tabrisStrings.iOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Device")
@js.native
/* private */ class Device_ () extends NativeObject {
  
  /**
    * An array of `Camera` objects ordered by priority. The first entry is considered the primary camera of
    * the device.
    * @constant
    */
  val cameras: js.Array[Camera] = js.native
  
  /**
    * The user language configured on the device as an [RFC 4646](http://tools.ietf.org/html/rfc4646)
    * compliant string. For example `"de"`, `"es-ES"`, etc. This property is also available globally as
    * `navigator.language`.  Note: On iOS ≥ 11 it will only return languages declared in
    * [CFBundleLocalizations](https://developer.apple.com/library/archive/documentation/General/Reference/InfoPlistKeyReference/Articles/CoreFoundationKeys.html#//apple_ref/doc/uid/TP40009249-109552-TPXREF111).
    * @constant
    */
  val language: String = js.native
  
  /**
    * The name of the device model. For example `"iPad4,1"` or `"Nexus 7"`. This property is also available
    * globally as `device.model`.
    * @constant
    */
  val model: String = js.native
  
  /**
    * The name of the device set by owner. For example `"John's phone"`. This property is also available
    * globally as `device.name`.
    * **Note:** On Android `name` is only available on Android 7.1+.
    * @constant
    */
  val name: String = js.native
  
  /**
    * Fired when the `orientation` property has changed and the rotation animation has finished.
    */
  var onOrientationChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.orientation] = js.native
  
  /**
    * The device orientation. One of `portrait-primary`, `portrait-secondary`, `landscape-primary`, and
    * `landscape-secondary`.
    */
  val orientation: `landscape-primary` | `landscape-secondary` | `portrait-primary` | `portrait-secondary` = js.native
  
  /**
    * The name of the platform. Either `"Android"` or `"iOS"`. This property is also available globally as
    * `device.platform`.
    * @constant
    */
  val platform: Android | iOS = js.native
  
  /**
    * The ratio between physical pixels and device independent pixels. This property is also available
    * globally as
    * [`window.devicePixelRatio`](https://developer.mozilla.org/en-US/docs/Web/API/Window.devicePixelRatio).
    * @constant
    */
  val scaleFactor: Double = js.native
  
  /**
    * The entire height of the device's screen in device independent pixel. Depends on the current device
    * orientation. This property is also available globally as
    * [screen.height](https://developer.mozilla.org/en-US/docs/Web/API/Screen.height).
    * @constant
    */
  val screenHeight: Double = js.native
  
  /**
    * The entire width of the device's screen in device independent pixel. Depends on the current device
    * orientation. This property is also available globally as
    * [screen.width](https://developer.mozilla.org/en-US/docs/Web/API/Screen.width).
    * @constant
    */
  val screenWidth: Double = js.native
  
  /**
    * Sets all key-value pairs in the properties object.
    * @param properties
    */
  def set(properties: scala.Nothing): this.type = js.native
  
  /**
    * The name of the device manufacture. For example `"Samsung"` or `"Apple"`. This property is also
    * available globally as `device.vendor`.
    * @constant
    */
  val vendor: String = js.native
  
  /**
    * The platform version. On iOS it looks like this: `"8.1.1"`. On Android, the [version
    * code](https://developer.android.com/reference/android/os/Build.VERSION_CODES.html) is returned. This
    * property is also available globally as `device.version`.
    * @constant
    */
  val version: String = js.native
}
