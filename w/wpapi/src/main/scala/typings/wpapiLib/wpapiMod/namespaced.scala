package typings
package wpapiLib.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * REST API Client for WordPress
 *
 * @see http://wp-api.org/node-wpapi/api-reference/wpapi/1.1.2/WPAPI.html
 */
@JSImport("wpapi", JSImport.Namespace)
@js.native
class namespaced () extends WPAPI {
  /**
       * Construct a REST API client instance object to create
       *
       * @param options An options hash to configure the instance
       */
  def this(options: wpapiLib.wpapiMod.WPAPINs.WPAPIOptions) = this()
}

/**
 * REST API Client for WordPress
 *
 * @see http://wp-api.org/node-wpapi/api-reference/wpapi/1.1.2/WPAPI.html
 */
@JSImport("wpapi", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
       * Take an arbitrary WordPress site, deduce the WP REST API root endpoint,
       * query that endpoint, and parse the response JSON. Use the returned JSON
       * response to instantiate a WPAPI instance bound to the provided site.
       *
       * @param url A URL within a REST API-enabled WordPress website
       */
  def discover(url: java.lang.String): stdLib.Promise[wpapiLib.wpapiMod.WPAPI] = js.native
}

