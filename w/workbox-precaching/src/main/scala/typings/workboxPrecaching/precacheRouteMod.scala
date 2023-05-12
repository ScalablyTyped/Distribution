package typings.workboxPrecaching

import typings.workboxPrecaching.precacheControllerMod.PrecacheController
import typings.workboxPrecaching.typesMod.PrecacheRouteOptions
import typings.workboxRouting.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheRouteMod {
  
  /**
    * A subclass of {@link workbox-routing.Route} that takes a
    * {@link workbox-precaching.PrecacheController}
    * instance and uses it to match incoming requests and handle fetching
    * responses from the precache.
    *
    * @memberof workbox-precaching
    * @extends workbox-routing.Route
    */
  @JSImport("workbox-precaching/PrecacheRoute", "PrecacheRoute")
  @js.native
  open class PrecacheRoute protected () extends Route {
    /**
      * @param {PrecacheController} precacheController A `PrecacheController`
      * instance used to both match requests and respond to fetch events.
      * @param {Object} [options] Options to control how requests are matched
      * against the list of precached URLs.
      * @param {string} [options.directoryIndex=index.html] The `directoryIndex` will
      * check cache entries for a URLs ending with '/' to see if there is a hit when
      * appending the `directoryIndex` value.
      * @param {Array<RegExp>} [options.ignoreURLParametersMatching=[/^utm_/, /^fbclid$/]] An
      * array of regex's to remove search params when looking for a cache match.
      * @param {boolean} [options.cleanURLs=true] The `cleanURLs` option will
      * check the cache for the URL with a `.html` added to the end of the end.
      * @param {workbox-precaching~urlManipulation} [options.urlManipulation]
      * This is a function that should take a URL and return an array of
      * alternative URLs that should be checked for precache matches.
      */
    def this(precacheController: PrecacheController) = this()
    def this(precacheController: PrecacheController, options: PrecacheRouteOptions) = this()
  }
}
