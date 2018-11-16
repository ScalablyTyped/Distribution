package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workboxDashSwLib {
  /**
   * The "handler" callback is called when a service worker's fetch event has been matched by a Route. This callback should return a Promise that resolves with a Response.
   * If a value is returned by the match callback it will be passed in as the context.params argument.
   */
  type HandlerCallback = js.Function1[/* context */ js.Any, stdLib.Promise[stdLib.Response]]
  /**
   * To signify a match, return anything other than null. Return null if the route shouldn't match.
   */
  type MatchCallback = js.Function1[/* context */ js.Any, js.Object | scala.Null]
  /**
   * ===== WorkboxNamespace =====
   */
  
  /**
   * A ModulePathCallback function can be used to modify the modify the where Workbox modules are loaded.
   * @param {string} moduleName - The name of the module to load (i.e. 'workbox-core', 'workbox-precaching' etc.).
   * @param {boolean} debug - When true, dev builds should be loaded, otherwise load prod builds.
   * @returns {string} This callback should return a path of module. This will be passed to importScripts().
   */
  type ModulePathCallback = js.Function2[/* moduleName */ java.lang.String, /* debug */ scala.Boolean, java.lang.String]
  /**
   * ===== ExpirationPlugin =====
   */
  
  type Plugin = js.Any
  /**
   * ===== StreamsNamespace =====
   */
  
  type StreamSource = stdLib.Response | stdLib.ReadableStream | stdLib.BodyInit
  /**
   * The "urlManipulation" callback can be used to determine if there are any additional permutations of a URL that should be used to check against the available precached files.
   * For example, Workbox supports checking for '/index.html' when the URL '/' is provided. This callback allows additional, custom checks.
   * @param {IURLContext} context
   * @returns {URL[]} To add additional urls to test, return an Array of URL's. Please note that these should not be Strings, but URL objects.
   */
  type UrlManipulation = js.Function1[/* context */ js.Any, js.Array[stdLib.URL]]
}
