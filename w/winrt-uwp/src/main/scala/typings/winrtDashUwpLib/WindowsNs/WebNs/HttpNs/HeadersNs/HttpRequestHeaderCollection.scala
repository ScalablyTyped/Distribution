package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a collection of the HTTP headers associated with an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpRequestHeaderCollection")
@js.native
abstract class HttpRequestHeaderCollection () extends js.Object {
  /** Gets the HttpMediaTypeWithQualityHeaderValueCollection of HttpMediaTypeWithQualityHeaderValue objects that represent the value of an Accept HTTP header on an HTTP request. */
  var accept: HttpMediaTypeWithQualityHeaderValueCollection = js.native
  /** Gets the HttpContentCodingWithQualityHeaderValueCollection of HttpContentCodingWithQualityHeaderValue objects that represent the value of an Accept-Encoding HTTP header on an HTTP request. */
  var acceptEncoding: HttpContentCodingWithQualityHeaderValueCollection = js.native
  /** Gets the HttpLanguageRangeWithQualityHeaderValueCollection of HttpLanguageRangeWithQualityHeaderValue objects that represent the value of an Accept-Language HTTP header on an HTTP request. */
  var acceptLanguage: HttpLanguageRangeWithQualityHeaderValueCollection = js.native
  /** Gets or sets the HttpCredentialsHeaderValue object that represents the value of an Authorization HTTP header on an HTTP request. */
  var authorization: HttpCredentialsHeaderValue = js.native
  /** Gets the HttpCacheDirectiveHeaderValueCollection that represents the value of a Cache-Control HTTP header on an HTTP request. */
  var cacheControl: HttpCacheDirectiveHeaderValueCollection = js.native
  /** Gets the HttpConnectionOptionHeaderValueCollection of HttpConnectionOptionHeaderValue objects that represent the value of a Connection HTTP header on an HTTP request. */
  var connection: HttpConnectionOptionHeaderValueCollection = js.native
  /** Gets the HttpCookiePairHeaderValueCollection of HttpCookiePairHeaderValue objects that represent the value of an Cookie HTTP header sent on an HTTP request. */
  var cookie: HttpCookiePairHeaderValueCollection = js.native
  /** Gets or sets the DateTime object that represents the value of a Date HTTP header on an HTTP request. */
  var date: stdLib.Date = js.native
  /** Gets the HttpExpectationHeaderValueCollection of HttpExpectationHeaderValue objects that represent the value of an Expect HTTP header on an HTTP request. */
  var expect: HttpExpectationHeaderValueCollection = js.native
  /** Gets or sets the String that represents the value of a From HTTP header on an HTTP request. */
  var from: java.lang.String = js.native
  /** Gets or sets the HostName that represents the value of a Host HTTP header on an HTTP request. */
  var host: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
  /** Gets or sets the DateTime object that represents the value of an If-Modified-Since HTTP header on an HTTP request. */
  var ifModifiedSince: stdLib.Date = js.native
  /** Gets or sets the DateTime object that represents the value of an If-Unmodified-Since HTTP header on an HTTP request. */
  var ifUnmodifiedSince: stdLib.Date = js.native
  /** Gets or sets an integer value that represents the value of a Max-Forwards HTTP header on an HTTP request. */
  var maxForwards: scala.Double = js.native
  /** Gets or sets the HttpCredentialsHeaderValue object that represent the value of a Proxy-Authorization HTTP header on an HTTP request. */
  var proxyAuthorization: HttpCredentialsHeaderValue = js.native
  /** Gets or sets the Uri that represents the value of a Referer HTTP header on an HTTP request. */
  var referer: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the number of objects in the HttpRequestHeaderCollection . */
  var size: scala.Double = js.native
  /** Gets the HttpTransferCodingHeaderValueCollection of HttpTransferCodingHeaderValue objects that represent the value of a Transfer-Encoding HTTP header on an HTTP request. */
  var transferEncoding: HttpTransferCodingHeaderValueCollection = js.native
  /** Gets the HttpProductInfoHeaderValueCollection of HttpProductInfoHeaderValue objects that represent the value of a User-Agent HTTP header on an HTTP request. */
  var userAgent: HttpProductInfoHeaderValueCollection = js.native
  /**
    * Adds a new item to the end of the HttpRequestHeaderCollection .
    * @param name The name of the value to add.
    * @param value The item value to add.
    */
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /** Removes all objects from the HttpRequestHeaderCollection . */
  def clear(): scala.Unit = js.native
  /**
    * Retrieves an iterator to the first item in the HttpRequestHeaderCollection .
    * @return An object that can be used to enumerate the items in the collection. The iterator points to the first item in the HttpRequestHeaderCollection .
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]] = js.native
  /**
    * Returns an immutable view of the HttpRequestHeaderCollection .
    * @return The view of the HttpRequestHeaderCollection .
    */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String] = js.native
  /**
    * Determines whether the HttpRequestHeaderCollection contains the specified key.
    * @param key The key associated with the item to locate.
    * @return true if the key is found; otherwise, false.
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Inserts or replaces an item in the HttpRequestHeaderCollection with the specified key and value.
    * @param key The key of the item to be inserted.
    * @param value The value of the item to insert.
    * @return true if an item with the specified key is an existing item that was replaced; otherwise false.
    */
  def insert(key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  /**
    * Finds an item in the HttpRequestHeaderCollection if it exists.
    * @param key The key of the item to lookup.
    * @return The value of the item if found.
    */
  def lookup(key: java.lang.String): java.lang.String = js.native
  /**
    * Removes a specific item from the HttpRequestHeaderCollection .
    * @param key The key of the item to remove.
    * @return true if the item was removed, otherwise false.
    */
  def remove(key: java.lang.String): scala.Boolean = js.native
  /**
    * Removes a specific object from the HttpRequestHeaderCollection .
    * @param key The key of the item to remove.
    */
  @JSName("remove")
  def remove_Unit(key: java.lang.String): scala.Unit = js.native
  /**
    * Try to append the specified item to the HttpRequestHeaderCollection without validation.
    * @param name The name of the item to append.
    * @param value The value of the item to append.
    * @return true if the item was appended; otherwise false.
    */
  def tryAppendWithoutValidation(name: java.lang.String, value: java.lang.String): scala.Boolean = js.native
}

