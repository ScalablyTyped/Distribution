package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueHttpNameValueHeaderValue
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Cache-Control HTTP header on HTTP content associated with an HTTP request or response. */
@JSGlobal("Windows.Web.Http.Headers.HttpCacheDirectiveHeaderValueCollection")
@js.native
abstract class HttpCacheDirectiveHeaderValueCollection () extends Array[HttpNameValueHeaderValue] {
  /** Gets or sets the value of the max-age directive in the Cache-Control HTTP header. */
  var maxAge: Double = js.native
  /** Gets or sets the value of the max-stale directive in the Cache-Control HTTP header. */
  var maxStale: Double = js.native
  /** Gets or sets the value of the min-fresh directive in the Cache-Control HTTP header. */
  var minFresh: Double = js.native
  /** Gets or sets the value of the s-maxage directive in the Cache-Control HTTP header. */
  var sharedMaxAge: Double = js.native
  /** Gets the number of HttpNameValueHeaderValue objects in the collection. */
  var size: Double = js.native
  /**
    * Adds a new HttpNameValueHeaderValue item to the end of the collection.
    * @param value The HttpNameValueHeaderValue object to append.
    */
  def append(value: HttpNameValueHeaderValue): Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to the first HttpNameValueHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpNameValueHeaderValue items in the collection. The iterator points to the first HttpNameValueHeaderValue item in the HttpCacheDirectiveHeaderValueCollection .
    */
  def first(): IIterator[HttpNameValueHeaderValue] = js.native
  /**
    * Returns the HttpNameValueHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the HttpCacheDirectiveHeaderValueCollection .
    * @return The HttpNameValueHeaderValue at the specified index in the HttpCacheDirectiveHeaderValueCollection .
    */
  def getAt(index: Double): HttpNameValueHeaderValue = js.native
  /**
    * Retrieves the HttpNameValueHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpNameValueHeaderValue items in the HttpCacheDirectiveHeaderValueCollection .
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueHttpNameValueHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpCacheDirectiveHeaderValueCollection .
    * @return The view of the HttpCacheDirectiveHeaderValueCollection .
    */
  def getView(): IVectorView[HttpNameValueHeaderValue] = js.native
  def indexOf(value: HttpNameValueHeaderValue, extra: js.Any*): Anon_Index = js.native
  /**
    * Retrieves the index of an HttpNameValueHeaderValue in the collection.
    * @param value The HttpNameValueHeaderValue to find in the HttpCacheDirectiveHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: HttpNameValueHeaderValue): Anon_Index = js.native
  /**
    * Inserts an HttpNameValueHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpNameValueHeaderValue): Unit = js.native
  /**
    * Parses and adds an entry to the HttpCacheDirectiveHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpCacheDirectiveHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  /** Removes the last HttpNameValueHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  /**
    * Replaces all the HttpNameValueHeaderValue items in the collection with the specified HttpNameValueHeaderValue items.
    * @param items The collection of HttpNameValueHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpNameValueHeaderValue): Unit = js.native
  /**
    * Sets the HttpNameValueHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpNameValueHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpNameValueHeaderValue): Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpCacheDirectiveHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}

