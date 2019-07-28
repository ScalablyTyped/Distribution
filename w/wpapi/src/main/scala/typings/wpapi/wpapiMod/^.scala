package typings.wpapi.wpapiMod

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
/**
  * Construct a REST API client instance object to create
  *
  * @param options An options hash to configure the instance
  */
class ^ () extends WPAPI {
  def this(options: WPAPIOptions) = this()
}

@JSImport("wpapi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Take an arbitrary WordPress site, deduce the WP REST API root endpoint,
    * query that endpoint, and parse the response JSON. Use the returned JSON
    * response to instantiate a WPAPI instance bound to the provided site.
    *
    * @param url A URL within a REST API-enabled WordPress website
    */
  def discover(url: String): js.Promise[WPAPI] = js.native
}

