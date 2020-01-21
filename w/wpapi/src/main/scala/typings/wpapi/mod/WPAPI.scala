package typings.wpapi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * REST API Client for WordPress
  *
  * @see http://wp-api.org/node-wpapi/api-reference/wpapi/1.1.2/WPAPI.html
  */
@js.native
trait WPAPI
  extends /**
  * An API client can define its parameter methods, like .authors(), .cart(),
  * .products(). They are usually decided by WPAPI namespaces configuration
  * object. They have WPRequest return type.
  */
/* customRoutesMethod */ StringDictionary[js.Any] {
  /**
    * Set the authentication to use for a WPAPI site handler instance. Accepts
    * basic HTTP authentication credentials (string username & password) or a
    * Nonce (for cookie authentication) by default; may be overloaded to accept
    * OAuth credentials in the future.
    *
    * @param credentials An authentication credentials object
    */
  def auth(): WPAPI = js.native
  def auth(credentials: Credentials): WPAPI = js.native
  /**
    * Deduce request methods from a provided API root JSON response object's
    * routes dictionary, and assign those methods to the current instance. If
    * no routes dictionary is provided then the instance will be bootstrapped
    * with route handlers for the default API endpoints only.
    *
    * This method is called automatically during WPAPI instance creation.
    *
    * @param routes The "routes" object from the JSON object returned from the
    * root API endpoint of a WP site, which should be a dictionary of route
    * definition objects keyed by the route's regex pattern
    */
  def bootstrap(routes: Routes): WPAPI = js.native
  /** Start a request against /categories endpoint */
  def categories(): WPRequest = js.native
  /** Start a request against /comments endpoints */
  def comments(): WPRequest = js.native
  /** Start a request against /media endpoints */
  def media(): WPRequest = js.native
  /**
    * Access API endpoint handlers from a particular API namespace object
    *
    * @param namespace A namespace string
    */
  def namespace(namespace: String): WPAPI = js.native
  /** Start a request against /pages endpoints */
  def pages(): WPRequest = js.native
  /** Start a request against /posts endpoints */
  def posts(): WPRequest = js.native
  /**
    * Create and return a handler for an arbitrary WP REST API endpoint.
    *
    * @param namespace A namespace string, e.g. 'myplugin/v1'
    * @param restBase A REST route string, e.g. '/author/(?P\d+)'
    * @param options An (optional) options object
    */
  def registerRoute(namespace: String, restBase: String): WPRequestFactory = js.native
  def registerRoute(namespace: String, restBase: String, options: RegisterRouteOptions): WPRequestFactory = js.native
  /**
    * Generate a query against an arbitrary path on the current endpoint. This
    * is useful for requesting resources at custom WP-API endpoints, such as
    * WooCommerce's /products.
    *
    * @param relativePath An endpoint-relative path to which to bind the request
    */
  def root(): WPRequest = js.native
  def root(relativePath: String): WPRequest = js.native
  /**
    * Set the default headers to use for all HTTP requests created from this
    * WPAPI site instance. Accepts a header name and its associated value as
    * two strings, or multiple headers as an object of name-value pairs.
    *
    * @param headers
    */
  def setHeaders(headers: HTTPHeaders): WPAPI = js.native
  /** Start a request against /settings endpoints */
  def settings(): WPRequest = js.native
  /**
    * Convenience method for making a new WPAPI instance
    *
    * @param endpoint The URI for a WP-API endpoint
    * @param routes The "routes" object from the JSON object returned from the
    * root API endpoint of a WP site, which should be a dictionary of route
    * definition objects keyed by the route's regex pattern
    */
  def site(endpoint: String, routes: Routes): WPAPI = js.native
  /** Start a request against /statuses endpoints */
  def statuses(): WPRequest = js.native
  /** Start a request against /tags endpoints */
  def tags(): WPRequest = js.native
  /** Start a request against /taxonomies endpoints */
  def taxonomies(): WPRequest = js.native
  /**
    * Set custom transport methods to use when making HTTP requests against the
    * API.
    *
    * Pass an object with a function for one or many of "get", "post", "put",
    * "delete" and "head" and that function will be called when making that
    * type of request. The provided transport functions should take a WPRequest
    * handler instance (e.g. the result of a wp.posts()... chain or any other
    * chaining request handler) as their first argument; a data object as their
    * second argument (for POST, PUT and DELETE requests); and an optional
    * callback as their final argument. Transport methods should invoke the
    * callback with the response data (or error, as appropriate), and should
    * also return a Promise.
    *
    * @param transport A dictionary of HTTP transport methods
    */
  def transport(transport: Transport): WPAPI = js.native
  /** Start a request against /types endpoints */
  def types(): WPRequest = js.native
  /**
    * Generate a request against a completely arbitrary endpoint, with no
    * assumptions about or mutation of path, filtering, or query parameters.
    * This request is not restricted to the endpoint specified during WPAPI
    * object instantiation.
    *
    * @param url The URL to request
    */
  def url(url: String): WPRequest = js.native
  /** Start a request against /users endpoints */
  def users(): WPRequest = js.native
}

