package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a collection of the HTTP headers associated with content on an HTTP request or response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentHeaderCollection")
@js.native
/** Initializes a new instance of the HttpContentHeaderCollection class. */
class HttpContentHeaderCollection () extends js.Object {
  /** Gets or sets the HttpContentDispositionHeaderValue object that represents the value of an HTTP Content-Disposition header on the HTTP content. */
  var contentDisposition: HttpContentDispositionHeaderValue = js.native
  /** Gets the HttpContentCodingHeaderValueCollection of HttpContentCodingHeaderValue objects that represent the value of an HTTP Content-Encoding header on the HTTP content. */
  var contentEncoding: HttpContentCodingHeaderValueCollection = js.native
  /** Gets the HttpLanguageHeaderValueCollection of objects that represent the value of an HTTP Content-Language header on the HTTP content. */
  var contentLanguage: HttpLanguageHeaderValueCollection = js.native
  /** Gets or sets the value of the HTTP Content-Length header on the HTTP content. */
  var contentLength: Double = js.native
  /** Gets or sets the value of the HTTP Content-Location header on the HTTP content. */
  var contentLocation: Uri = js.native
  /** Gets or sets the value of an HTTP Content-MD5 header on the HTTP content. */
  var contentMD5: IBuffer = js.native
  /** Gets or sets the HttpContentRangeHeaderValue object that represent the value of an HTTP Content-Range header on the HTTP content. */
  var contentRange: HttpContentRangeHeaderValue = js.native
  /** Gets or sets the HttpMediaTypeHeaderValue object that represent the value of an HTTP Content-Type header on the HTTP content. */
  var contentType: HttpMediaTypeHeaderValue = js.native
  /** Gets or sets the DateTime object that represents the value of an HTTP Expires header on the HTTP content. */
  var expires: Date = js.native
  /** Gets or sets the DateTime object that represents the value of an HTTP Last-Modified header on the HTTP content. */
  var lastModified: Date = js.native
  /** Gets the number of objects in the HttpContentHeaderCollection . */
  var size: Double = js.native
  /**
    * Adds a new item to the end of the HttpContentHeaderCollection .
    * @param name The name of the value to add.
    * @param value The item value to add.
    */
  def append(name: String, value: String): Unit = js.native
  /** Removes all objects from the HttpContentHeaderCollection . */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to the first item in the HttpContentHeaderCollection .
    * @return An object that can be used to enumerate the items in the collection. The iterator points to the first item in the HttpContentHeaderCollection .
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Returns an immutable view of the HttpContentHeaderCollection .
    * @return The view of the HttpContentHeaderCollection .
    */
  def getView(): IMapView[String, String] = js.native
  /**
    * Determines whether the HttpContentHeaderCollection contains the specified key.
    * @param key The key associated with the item to locate.
    * @return true if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Inserts or replaces an item in the HttpContentHeaderCollection with the specified key and value.
    * @param key The key of the item to be inserted.
    * @param value The value of the item to insert.
    * @return true if an item with the specified key is an existing item that was replaced; otherwise false.
    */
  def insert(key: String, value: String): Boolean = js.native
  /**
    * Finds an item in the HttpContentHeaderCollection if it exists.
    * @param key The key of the item to lookup.
    * @return The value of the item if found.
    */
  def lookup(key: String): String = js.native
  /**
    * Removes a specific item from the HttpContentHeaderCollection .
    * @param key The key of the item to remove.
    * @return true if the item was removed, otherwise false.
    */
  def remove(key: String): Boolean = js.native
  /**
    * Removes a specific object from the HttpContentHeaderCollection .
    * @param key The key of the item to remove.
    */
  @JSName("remove")
  def remove_Unit(key: String): Unit = js.native
  /**
    * Try to append the specified item to the HttpContentHeaderCollection without validation.
    * @param name The name of the item to append.
    * @param value The value of the item to append.
    * @return true if the item was appended; otherwise false.
    */
  def tryAppendWithoutValidation(name: String, value: String): Boolean = js.native
}

