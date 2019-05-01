package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workboxDashSwMod {
  /**
    * An implementation of a [cache-first]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#cache-falling-back-to-network}
    * request strategy.
    *
    * A cache first strategy is useful for assets that have been revisioned,
    * such as URLs like `/styles/example.a8f5f1.css`, since they
    * can be cached for long periods of time.
    *
    * If the network request fails, and there is no cache match, this will throw
    * a `WorkboxError` exception.
    */
  type CacheFirst = CacheStrategy
  /**
    *  An implementation of a
    * [cache-only]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#cache-only}
    * request strategy.
    *
    * This class is useful if you want to take advantage of any
    * [Workbox plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}.
    *
    * If there is no cache match, this will throw a `WorkboxError` exception.
    */
  type CacheOnly = CacheStrategy
  /**
    * The "handler" callback is called when a service worker's fetch event has been matched by a Route. This callback should return a Promise that resolves with a Response.
    * If a value is returned by the match callback it will be passed in as the context.params argument.
    */
  type HandlerCallback = CacheStrategy | (js.Function1[/* context */ HandlerContext, js.Promise[stdLib.Response]])
  /**
    * To signify a match, return anything other than null. Return null if the route shouldn't match.
    */
  type MatchCallback = js.Function1[/* context */ MatchContext, js.Object | scala.Null]
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
    * An implementation of a
    * [network first]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#network-falling-back-to-cache}
    * request strategy.
    *
    * By default, this strategy will cache responses with a 200 status code as
    * well as [opaque responses]{@link https://developers.google.com/web/tools/workbox/guides/handle-third-party-requests}.
    * Opaque responses are are cross-origin requests where the response doesn't
    * support [CORS]{@link https://enable-cors.org/}.
    *
    * If the network request fails, and there is no cache match, this will throw
    * a `WorkboxError` exception.
    */
  type NetworkFirst = CacheStrategy
  /**
    * An implementation of a
    * [network-only]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#network-only}
    * request strategy.
    *
    * This class is useful if you want to take advantage of any
    * [Workbox plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}.
    *
    * If the network request fails, this will throw a `WorkboxError` exception.
    */
  type NetworkOnly = CacheStrategy
  /**
    * ===== NetworkOnly strategy =====
    */
  type NetworkOnlyOptions = CacheFirstOptions
  /**
    * ===== RegExpRoute =====
    */
  /**
    * RegExpRoute makes it easy to create a regular expression based Route.
    *
    * For same-origin requests the RegExp only needs to match part of the URL. For
    * requests against third-party servers, you must define a RegExp that matches
    * the start of the URL.
    *
    * [See the module docs for info.]{@link https://developers.google.com/web/tools/workbox/modules/workbox-routing}
    */
  type RegExpRoute = Route
  /**
    * An implementation of a
    * [stale-while-revalidate]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#stale-while-revalidate}
    * request strategy.
    *
    * Resources are requested from both the cache and the network in parallel.
    * The strategy will respond with the cached version if available, otherwise
    * wait for the network response. The cache is updated with the network response
    * with each successful request.
    *
    * By default, this strategy will cache responses with a 200 status code as
    * well as [opaque responses]{@link https://developers.google.com/web/tools/workbox/guides/handle-third-party-requests}.
    * Opaque responses are are cross-origin requests where the response doesn't
    * support [CORS]{@link https://enable-cors.org/}.
    *
    * If the network request fails, and there is no cache match, this will throw
    * a `WorkboxError` exception.
    */
  type StaleWhileRevalidate = CacheStrategy
  /**
    * ===== StaleWhileRevalidate strategy =====
    */
  type StaleWhileRevalidateOptions = CacheFirstOptions
  /**
    * ===== StreamsNamespace =====
    */
  type StreamSource = stdLib.Response | stdLib.ReadableStream[js.Any] | stdLib.BodyInit
  /**
    * The "urlManipulation" callback can be used to determine if there are any additional permutations of a URL that should be used to check against the available precached files.
    * For example, Workbox supports checking for '/index.html' when the URL '/' is provided. This callback allows additional, custom checks.
    * @param {URLContext} context
    * @returns {URL[]} To add additional urls to test, return an Array of URL's. Please note that these should not be Strings, but URL objects.
    */
  type UrlManipulation = js.Function1[/* context */ URLContext, js.Array[stdLib.URL]]
}
