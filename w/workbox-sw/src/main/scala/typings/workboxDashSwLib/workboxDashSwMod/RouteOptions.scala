package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptions extends js.Object {
  /**
  	 * The `cleanURLs` option will check the cache for the URL with a `.html` added to the end of the end.
  	 */
  var cleanUrls: scala.Boolean = js.native
  /**
  	 * The `directoryIndex` will check cache entries for a URLs ending with '/' to see if there is a hit when
  	 * appending the `directoryIndex` value.
  	 */
  var directoryIndex: java.lang.String | scala.Null = js.native
  /**
  	 * An array of regex's to remove search params when looking for a cache match.
  	 */
  var ignoreUrlParametersMatching: js.Array[stdLib.RegExp] = js.native
  /**
  	 * This is a function that should take a URL and return an array of
  	 * alternative URL's that should be checked for precache matches.
  	 */
  @JSName("urlManipulation")
  var urlManipulation_Original: UrlManipulation = js.native
  /**
  	 * This is a function that should take a URL and return an array of
  	 * alternative URL's that should be checked for precache matches.
  	 */
  def urlManipulation(context: URLContext): js.Array[stdLib.URL] = js.native
}

