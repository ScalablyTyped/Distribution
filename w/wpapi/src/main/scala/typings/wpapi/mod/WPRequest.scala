package typings.wpapi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.File
import typings.wpapi.wpapiStrings.asc
import typings.wpapi.wpapiStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base WordPress API request
  *
  * @see http://wp-api.org/node-wpapi/api-reference/wpapi/1.1.2/WPRequest.html
  */
@JSImport("wpapi", "WPRequest")
@js.native
class WPRequest protected ()
  extends /**
  * A request can define its parameter methods, like .id(), .date(),
  * .author(). They are usually decided by WPAPI routes configuration
  * object.
  */
/* customParamsMethod */ StringDictionary[js.Any] {
  /**
    * WPRequest is the base API request object constructor
    *
    * @param options A hash of options for the WPRequest instance
    */
  def this(options: WPAPIOptions) = this()
  /**
    * Set a request to use authentication, and optionally provide auth
    * credentials. If auth credentials were already specified when the WPAPI
    * instance was created, calling .auth on the request chain will set
    * that request to use the existing credentials.
    *
    * @param credentials An authentication credentials object
    */
  def auth(): WPRequest = js.native
  def auth(credentials: Credentials): WPRequest = js.native
  /**
    * Set the context of the request. Used primarily to expose private
    * values on a request object by setting the context to "edit".
    *
    * @param context The context to set on the request
    */
  def context(context: String): WPRequest = js.native
  /**
    * Create the specified resource with the provided data
    *
    * This is the public interface for creating POST requests
    *
    * @param data The data for the POST request
    * @param callback A callback to invoke with the results of the POST
    * request
    */
  def create(data: js.Any): js.Promise[_] = js.native
  def create(data: js.Any, callback: WPRequestCallback): js.Promise[_] = js.native
  /**
    * Delete the specified resource
    *
    * @param data Data to send along with the DELETE request
    * @param callback A callback to invoke with the results of the DELETE
    * request
    */
  def delete(): js.Promise[_] = js.native
  def delete(data: js.UndefOr[scala.Nothing], callback: WPRequestCallback): js.Promise[_] = js.native
  def delete(data: js.Any): js.Promise[_] = js.native
  def delete(data: js.Any, callback: WPRequestCallback): js.Promise[_] = js.native
  /**
    * Convenience wrapper for .context( 'edit' )
    */
  def edit(): WPRequest = js.native
  /**
    * Return embedded resources as part of the response payload.
    */
  def embed(): WPRequest = js.native
  def exclude(ids: js.Array[Double]): WPRequest = js.native
  /**
    * Exclude specific resource IDs in the response collection.
    *
    * @param ids An ID or array of IDs to exclude
    */
  def exclude(ids: Double): WPRequest = js.native
  /**
    * Specify a file or a file buffer to attach to the request, for use
    * when creating a new Media item
    *
    * @param file A path to a file (in Node) or an file object (Node or
    * Browser) to attach to the request
    * @param name An (optional) filename to use for the file
    */
  def file(file: String): WPRequest = js.native
  def file(file: String, name: String): WPRequest = js.native
  def file(file: File): WPRequest = js.native
  def file(file: File, name: String): WPRequest = js.native
  /**
    * Get the headers for the specified resource
    *
    * @param callback A callback to invoke with the results of the HEAD
    * request
    */
  def get(): js.Promise[_] = js.native
  def get(callback: WPRequestCallback): js.Promise[_] = js.native
  /**
    * Set the id of resource.
    *
    * @param id An ID of item
    */
  def id(id: Double): WPRequest = js.native
  def include(ids: js.Array[Double]): WPRequest = js.native
  /**
    * Include specific resource IDs in the response collection.
    *
    * @param ids An ID or array of IDs to include
    */
  def include(ids: Double): WPRequest = js.native
  /**
    * Set the namespace of the request, e.g. to specify the API root for
    * routes registered by wp core v2 ("wp/v2") or by any given plugin. Any
    * previously- set namespace will be overwritten by subsequent calls to
    * the method.
    *
    * @param namespace A namespace string, e.g. "wp/v2"
    */
  def namespace(namespace: String): WPRequest = js.native
  /**
    * Set an arbitrary offset to retrieve items from a specific point in a
    * collection.
    *
    * @param offsetNumber The number of items by which to offset the response
    */
  def offset(offsetNumber: Double): WPRequest = js.native
  /**
    * Change the sort direction of a returned collection
    *
    * @param direction The order to use when sorting the response
    */
  @JSName("order")
  def order_asc(direction: asc): WPRequest = js.native
  @JSName("order")
  def order_desc(direction: desc): WPRequest = js.native
  /**
    * Order a collection by a specific field
    *
    * @param field The field by which to order the response
    */
  def orderby(field: String): WPRequest = js.native
  /**
    * Set the pagination of a request. Use in conjunction with .perPage()
    * for explicit pagination handling. (The number of pages in a response
    * can be retrieved from the response's _paging.totalPages property.)
    *
    * @param pageNumber The page number of results to retrieve
    */
  def page(pageNumber: Double): WPRequest = js.native
  /**
    * Set a parameter to render into the final query URI.
    *
    * @param props The name of the parameter to set, or an object containing
    * parameter keys and their corresponding values
    * @param value The value of the parameter being set
    */
  def param(props: String): WPRequest = js.native
  def param(props: String, value: String): WPRequest = js.native
  def param(props: String, value: js.Array[_]): WPRequest = js.native
  def param(props: String, value: Double): WPRequest = js.native
  def param(props: StringDictionary[String | Double | js.Array[_]]): WPRequest = js.native
  def param(props: StringDictionary[String | Double | js.Array[_]], value: String): WPRequest = js.native
  def param(props: StringDictionary[String | Double | js.Array[_]], value: js.Array[_]): WPRequest = js.native
  def param(props: StringDictionary[String | Double | js.Array[_]], value: Double): WPRequest = js.native
  /**
    * Set the number of items to be returned in a page of responses.
    *
    * @param itemsPerPage The number of items to return in one page of
    * results
    */
  def perPage(itemsPerPage: Double): WPRequest = js.native
  /**
    * Filter results to those matching the specified search terms.
    *
    * @param searchString A string to search for within post content
    */
  def search(searchString: String): WPRequest = js.native
  /**
    * Specify one or more headers to send with the dispatched HTTP request.
    *
    * @param headers The name of the header to set, or an object of header
    * names and their associated string values
    * @param value The value of the header being set
    */
  def setHeaders(headers: String): WPRequest = js.native
  def setHeaders(headers: String, value: String): WPRequest = js.native
  def setHeaders(headers: StringDictionary[String]): WPRequest = js.native
  def setHeaders(headers: StringDictionary[String], value: String): WPRequest = js.native
  def setPathPart(level: String, value: String): WPRequest = js.native
  def setPathPart(level: String, value: Double): WPRequest = js.native
  def setPathPart(level: Double, value: String): WPRequest = js.native
  /**
    * Set a component of the resource URL itself (as opposed to a query
    * parameter)
    *
    * If a path component has already been set at this level, throw an
    * error: requests are meant to be transient, so any re-writing of a
    * previously-set path part value is likely to be a mistake.
    *
    * @param level A "level" of the path to set, e.g. "1" or "2"
    * @param value The value to set at that path part level
    */
  def setPathPart(level: Double, value: Double): WPRequest = js.native
  /**
    * Query a collection for members with a specific slug.
    *
    * @param slug A post slug (slug), e.g. "hello-world"
    */
  def slug(slug: String): WPRequest = js.native
  /**
    * Calling .then on a query chain will invoke the query as a GET and
    * return a promise
    *
    * @param successCallback A callback to handle the data returned from
    * the GET request
    * @param failureCallback A callback to handle any errors encountered
    * by the request
    */
  def `then`(): js.Promise[_] = js.native
  def `then`(successCallback: js.UndefOr[scala.Nothing], failureCallback: js.Function1[/* error */ Error, Unit]): js.Promise[_] = js.native
  def `then`(successCallback: js.Function1[/* data */ js.Any, Unit]): js.Promise[_] = js.native
  def `then`(
    successCallback: js.Function1[/* data */ js.Any, Unit],
    failureCallback: js.Function1[/* error */ Error, Unit]
  ): js.Promise[_] = js.native
  /**
    * Update the specified resource with the provided data
    *
    * This is the public interface for creating PATCH requests
    *
    * @param data The data for the PATCH request
    * @param callback A callback to invoke with the results of the PATCH
    * request
    */
  def update(data: js.Any): js.Promise[_] = js.native
  def update(data: js.Any, callback: WPRequestCallback): js.Promise[_] = js.native
  /**
    * Validate whether the specified path parts are valid for this endpoint
    *
    * "Path parts" are non-query-string URL segments, like "some" "path" in
    * the URL mydomain.com/some/path?and=a&query=string&too. Because a well
    * -formed path is necessary to execute a successful API request, we
    * throw an error if the user has omitted a value (such as /some/[missing
    * component]/url) or has provided a path part value that does not match
    * the regular expression the API uses to goven that segment.
    */
  def validatePath(): WPRequest = js.native
}

