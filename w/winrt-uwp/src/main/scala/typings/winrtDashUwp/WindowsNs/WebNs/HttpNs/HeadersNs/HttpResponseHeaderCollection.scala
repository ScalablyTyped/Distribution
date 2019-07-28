package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a collection of the HTTP headers associated with an HTTP response. */
@JSGlobal("Windows.Web.Http.Headers.HttpResponseHeaderCollection")
@js.native
abstract class HttpResponseHeaderCollection () extends js.Object {
  /** Gets or sets the TimeSpan object that represents the value of an Age HTTP header on an HTTP response. */
  var age: Double = js.native
  /** Gets the HttpMethodHeaderValueCollection of HttpMethod objects that represent the value of an Allow HTTP header on an HTTP response. */
  var allow: HttpMethodHeaderValueCollection = js.native
  /** Gets the HttpCacheDirectiveHeaderValueCollection of objects that represent the value of a Cache-Control HTTP header on an HTTP response. */
  var cacheControl: HttpCacheDirectiveHeaderValueCollection = js.native
  /** Gets the HttpConnectionOptionHeaderValueCollection of HttpConnectionOptionHeaderValue objects that represent the value of a Connection HTTP header on an HTTP response. */
  var connection: HttpConnectionOptionHeaderValueCollection = js.native
  /** Gets or sets the DateTime object that represents the value of a Date HTTP header on an HTTP response. */
  var date: Date = js.native
  /** Gets or sets the Uri that represents the value or a Location HTTP header on an HTTP response. */
  var location: Uri = js.native
  /** Gets the HttpChallengeHeaderValueCollection of HttpChallengeHeaderValue objects that represent the value of a Proxy-Authenticate HTTP header on an HTTP response. */
  var proxyAuthenticate: HttpChallengeHeaderValueCollection = js.native
  /** Gets or sets the HttpDateOrDeltaHeaderValue object that represent the value of a Retry-After HTTP header on an HTTP response. */
  var retryAfter: HttpDateOrDeltaHeaderValue = js.native
  /** Gets the number of objects in the HttpResponseHeaderCollection . */
  var size: Double = js.native
  /** Gets the HttpTransferCodingHeaderValueCollection of HttpTransferCodingHeaderValue objects that represent the value of a Transfer-Encoding HTTP header on an HTTP response. */
  var transferEncoding: HttpTransferCodingHeaderValueCollection = js.native
  /** Gets the HttpChallengeHeaderValueCollection of HttpChallengeHeaderValue objects that represent the value of a WWW-Authenticate HTTP header on an HTTP response. */
  var wwwAuthenticate: HttpChallengeHeaderValueCollection = js.native
  /**
    * Adds a new item to the end of the HttpResponseHeaderCollection .
    * @param name The name of the value to add.
    * @param value The item value to add.
    */
  def append(name: String, value: String): Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to the first item in the HttpResponseHeaderCollection .
    * @return An object that can be used to enumerate the items in the collection. The iterator points to the first item in the HttpResponseHeaderCollection .
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Returns an immutable view of the HttpResponseHeaderCollection .
    * @return The view of the HttpResponseHeaderCollection .
    */
  def getView(): IMapView[String, String] = js.native
  /**
    * Determines whether the HttpResponseHeaderCollection contains the specified key.
    * @param key The key associated with the item to locate.
    * @return true if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Inserts or replaces an item in the HttpResponseHeaderCollection with the specified key and value.
    * @param key The key of the item to be inserted.
    * @param value The value of the item to insert.
    * @return true if an item with the specified key is an existing item that was replaced; otherwise false.
    */
  def insert(key: String, value: String): Boolean = js.native
  /**
    * Lookup an item in the HttpResponseHeaderCollection .
    * @param key The key of the item to lookup.
    * @return The value of the item if found.
    */
  def lookup(key: String): String = js.native
  /**
    * Removes an item with a given key from the HttpResponseHeaderCollection .
    * @param key Key of the item to be removed.
    */
  def remove(key: String): Unit = js.native
  /**
    * Try to append the specified item to the HttpResponseHeaderCollection without validation.
    * @param name The name of the item to append.
    * @param value The value of the item to append.
    * @return true if the item was appended; otherwise false.
    */
  def tryAppendWithoutValidation(name: String, value: String): Boolean = js.native
}

