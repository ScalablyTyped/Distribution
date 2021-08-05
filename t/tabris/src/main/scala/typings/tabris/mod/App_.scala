package typings.tabris.mod

import typings.std.ArrayBuffer
import typings.tabris.anon.Files
import typings.tabris.tabrisStrings.idleTimeoutEnabled
import typings.tabris.tabrisStrings.pinnedCertificates
import typings.tabris.tabrisStrings.trustedCertificates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "App")
@js.native
/* private */ class App_ () extends NativeObject {
  
  /**
    * Shuts down the running application and closes the UI.
    */
  def close(): Unit = js.native
  
  /**
    * Returns `false` if this app was build build in production mode, otherwise `true`. In production mode
    * no debugger can be attached to the JavaScript VM or native runtime.
    * @constant
    */
  val debugBuild: Boolean = js.native
  
  /**
    * Returns the URL for a given resource that is bundled with the app. Can be used to access app
    * resources like images, videos, etc. Note that these resources can only be accessed in read-only mode.
    * @param path The path of a resource relative to the application root.
    */
  def getResourceLocation(path: String): String = js.native
  
  /**
    * Uniquely identifies the app.
    * @constant
    */
  val id: String = js.native
  
  /**
    * Allows to control the device idle timout. When disabled the device will not go into sleep mode and
    * turn off the screen to safe battery power.
    * The `idleTimeoutEnabled` will disable any system wide enabled idle settings while the app is in the
    * foreground.
    */
  var idleTimeoutEnabled: Boolean = js.native
  
  /**
    * Asks the operating system to open the given URL in an external app. Operating systems usually support
    * a variety of URL schemes including `http`, `https`, `mailto`, `tel`, and `sms`. Apps can also
    * register for custom URL schemes.
    * @param url The URL to launch.
    */
  def launch(url: String): js.Promise[Unit] = js.native
  
  /**
    * Fired when a back navigation is invoked by the user.
    */
  var onBackNavigation: Listeners[AppBackNavigationEvent[this.type]] = js.native
  
  /**
    * Fired when the app becomes invisible. Either because another app is in the foreground or the user has
    * returned to the home screen.
    */
  var onBackground: Listeners[EventObject[this.type]] = js.native
  
  /**
    * The event is fired when the app starts or when it returns from the background.
    */
  var onForeground: Listeners[EventObject[this.type]] = js.native
  
  /**
    * Fired when the [*idleTimeoutEnabled*](#idleTimeoutEnabled) property has changed.
    */
  var onIdleTimeoutEnabledChanged: ChangeListeners[this.type, idleTimeoutEnabled] = js.native
  
  /**
    * Fired when a hardware key is pressed. Note that these events stem from physical hardware, not from
    * the virtual keyboard.
    * When invoking `event.preventDefault()` the key event is not propagated to the widget hierarchy.
    * However, a `TextInput` with focus will still receive the key event.
    */
  var onKeyPress: Listeners[AppKeyPressEvent[this.type]] = js.native
  
  /**
    * Fired when the app is not the interaction target of the user anymore. Usually preceded by `resume`.
    */
  var onPause: Listeners[EventObject[this.type]] = js.native
  
  /**
    * Fired when the [*pinnedCertificates*](#pinnedCertificates) property has changed.
    */
  var onPinnedCertificatesChanged: ChangeListeners[this.type, pinnedCertificates] = js.native
  
  /**
    * Fired when the app is visible and ready to interact with the user. The event is preceded by either
    * `foreground` (the app becomes visible again) or `pause` (the app regains ability to interact with
    * user).
    */
  var onResume: Listeners[EventObject[this.type]] = js.native
  
  /**
    * Fired when the app is being destroyed. After this callback no more interaction with the app is
    * possible.
    * On Android the terminate event is fired when closing the app via the back navigation or when the
    * system shuts down the app to reclaim memory. In case the app is hard killed by eg. clearing it from
    * the app switcher, the event is not fired.
    * On iOS the event might not always be fired reliably due to the scheduling behavior of the underlying
    * operating system.
    * It is therefore recommended to use the event to clean up resources but not to rely on it for mission
    * critical operations.
    */
  var onTerminate: Listeners[EventObject[this.type]] = js.native
  
  /**
    * Fired when the [*trustedCertificates*](#trustedCertificates) property has changed.
    */
  var onTrustedCertificatesChanged: ChangeListeners[this.type, trustedCertificates] = js.native
  
  /**
    * Enables certificate pinning for HTTP requests. When pinned certificates are defined for a host,
    * connections to this host will only be permitted if the server provides a matching certificate.
    * Connections to hosts that are not in the list are not affected.
    * Certificate pinning affects the following components: XHR/fetch, WebSockets and image loading. It
    * does *not* affect WebViews.
    * The list of pinned certificates has to be in the form of `[{host: <string>, hash: <string>,
    * algorithm: <RSA2048|RSA4096|ECDSA256>}, ..]`.
    * - The `host` attribute denotes the host name (including subdomain) of the host to be pinned
    * ([wildcards allowed](https://en.wikipedia.org/wiki/Wildcard_DNS_record)).
    * - The `hash` attribute is the base64 encoded sha256 fingerprint of the _subjectPublicKeyInfo_,
    * prefixed with `sha256/`.
    * - The `algorithm` attribute denotes the public key algorithm of the SSL certificate and can have the
    * values `RSA2048`, `RSA4096` or `ECDSA256`. This attribute is only required on iOS.
    * Example: `[{host: 'freegeoip.net', hash: 'sha256/+SVYjThgePRQxQ0e8bWTQDRtPYR/xBRufqyMoeaWteo=',
    * algorithm: 'ECDSA256'}]`
    * For further details see https://www.owasp.org/index.php/Certificate_and_Public_Key_Pinning.
    */
  var pinnedCertificates: js.Array[js.Any] = js.native
  
  /**
    * Allows to register a font to use throughout the app. Once a font is registered its alias can be used
    * to apply the font where ever a font can be configured, e.g. in `TextView` or `GraphicalContext`.
    * Tabris.js supports TrueType fonts (*.ttf) and OpenType fonts (*.otf).
    * @param alias An identifier for the registered font. The alias can be used as a font family, e.g. in the `font` properties of `TextView` and `Button`.
    * @param file The font file to register for later use. Similar to images paths, the file path can be absolute, relative or an URL.
    */
  def registerFont(alias: String, file: String): Unit = js.native
  
  /**
    * Closes the running application and either loads a different app at the given `url` or reloads the
    * current app when no `url` is given.
    * @param url An optional url to an app to launch
    */
  def reload(): Unit = js.native
  def reload(url: String): Unit = js.native
  
  /**
    * Asks the operating system to share data with another installed app. The returned promise resolves
    * successfully when the data was shared with another app. The resolved promise contains a string
    * providing platform specific information about the share target. In case sharing was not possible or
    * the share operation has been canceled by the user, the promise is rejected with an appropriate error
    * message.
    * The behavior of this API follows the [W3C Web Share API](https://www.w3.org/TR/web-share/).
    * In order to be able to share an image to the photo app on iOS, the Tabris.js app has to include the
    * text string `NSPhotoLibraryAddUsageDescription` in its plist file. The string is used in the native
    * permission dialog. See the [`'camera' permissions`](../permissions.md#category-camera) docs for
    * examples on how to configure the string.
    * @param data The data to share. The object must contain at least one of the properties: `title`, `text`, `url` or `files`. The files need to have a `name` and mime `type` set. <br/><br/>On iOS the content of the `url` is previewed in the native share dialog. On Android it is treated as regular text. When both `text` and `url` are given on Android the two strings are concatenated with a blank space as defined in the [W3C Web Share API](https://www.w3.org/TR/web-share/).
    */
  def share(data: Files): js.Promise[String] = js.native
  
  /**
    * Adds a set of certificates to validated ssl connections against. The certificates are applied in
    * addition to the system wide default certificates.
    * The `ArrayBuffer` entries of the `trustedCertificates` array consist of the bytes of the certificate
    * files. On Android the certificate file has to be a _*.pem_ (Privacy Enhanced Mail) file whereas on
    * iOS  it has to be _*.der_ (Distinguished Encoding Rules) file.
    */
  var trustedCertificates: js.Array[ArrayBuffer] = js.native
  
  /**
    * The user facing version number of the app.
    * @constant
    */
  val version: String = js.native
  
  /**
    * An alternative version number used in app stores to identify different versions of an app. Usually
    * incremented with each release. This property reflects the `versionCode` on Android and
    * `CFBundleVersion` on iOS.
    * @constant
    */
  val versionCode: Double = js.native
}
