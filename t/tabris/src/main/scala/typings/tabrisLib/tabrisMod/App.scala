package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the application.
  */
@JSImport("tabris", "App")
@js.native
class App protected ()
  extends NativeObject
     with _AppProperties {
  /**
    * Uniquely identifies the app.
    */
  val id: java.lang.String = js.native
  /**
    * Enables certificate pinning for HTTP requests. When pinned certificates are defined for a host,
    * connections to this host will only be permitted if the server provides a matching certificate.
    * Connections to hosts that are not in the list are not affected.
    * Certificate pinning affects the following components: XHR/fetch, WebSockets, image loading and app
    * patching. It does *not* affect WebViews.
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
  /* CompleteClass */
  override var pinnedCertificates: js.Array[_] = js.native
  /**
    * Adds a set of certificates to validated ssl connections against. The certificates are applied in
    * addition to the system wide default certificates.
    * The `ArrayBuffer` entries of the `trustedCertificates` array consist of the bytes of the certificate
    * files. On Android the certificate file has to be a _*.pem_ (Privacy Enhanced Mail) file whereas on
    * iOS  it has to be _*.der_ (Distinguished Encoding Rules) file.
    */
  /* CompleteClass */
  override var trustedCertificates: js.Array[_] = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_App: AppProperties = js.native
  /**
    * The user facing version number, e.g. '2.1-beta3'.
    */
  val version: java.lang.String = js.native
  /**
    * An alternative version number used in app stores to identify different versions of an app. Usually
    * incremented with each release. This property reflects the `versionCode` on Android and
    * `CFBundleVersion` on iOS.
    */
  val versionCode: scala.Double = js.native
  /**
    * Shuts down the running application and closes the UI.
    */
  def close(): scala.Unit = js.native
  /**
    * Returns the URL for a given resource that is bundled with the app. Can be used to access app
    * resources like images, videos, etc. Note that these resources can only be accessed in read-only mode.
    * @param path The path of a resource relative to the application root.
    */
  def getResourceLocation(path: java.lang.String): java.lang.String = js.native
  /**
    * Installs a patch from the given URL. When the patch is successfully installed, it will remain
    * inactive until the application is reloaded. Not supported on Windows. For more information see
    * [Patching a Tabris.js App](../patch.md)
    * @param url The URL to fetch a patch from.
    * @param callback A callback function to be called when the installation has finished or failed. In case of a failure, the callback will receive a parameter `error` that contains an Error object. If the installation succeeds, this parameter will be `null` and a second parameter will contain the parsed content of the file `patch.json` from the installed patch.
    * @provisional
    */
  def installPatch(
    url: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* patch */ js.Any | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asks the operating system to open the given URL in an external app. Operating systems usually support
    * a variety of URL schemes including `http`, `https`, `mailto`, `tel`, and `sms`. Apps can also
    * register for custom URL schemes.
    * @param url The URL to launch.
    */
  def launch(url: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: AppEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: AppEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: AppEvents): this.type = js.native
  /**
    * Allows to register a font to use throughout the app. Once a font is registered its alias can be used
    * to apply the font where ever a font can be configured, e.g. in `TextView` or `GraphicalContext`.
    * Tabris.js currently supports TrueType fonts (*.ttf) and OpenType fonts (*.otf).
    * @param alias An identifier for the registered font. The alias can be used in places where a font can be configures, e.g.: `TextView` or `GraphicalContext`
    * @param file The font file to register for later use. Similar to images paths, the file path can be absolute, relative or an URL.
    On the Windows platform it is required to provide the font-family name to reference the font in the given file. The font-family name is provided as a fragment postfix to the file name. For example `arial.ttf#Arial` can be used the load a font named 'Arial' from the file 'arial.ttf'. The file also has to be bundled with the app to work, loading it remotely (e.g. via the developer app) will not work.
    */
  def registerFont(alias: java.lang.String, file: java.lang.String): scala.Unit = js.native
  /**
    * Forces the running application to reload the main module and start over.
    */
  def reload(): scala.Unit = js.native
}

