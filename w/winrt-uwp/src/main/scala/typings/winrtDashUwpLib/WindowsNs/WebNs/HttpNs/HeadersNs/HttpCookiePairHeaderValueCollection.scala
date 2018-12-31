package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Cookie HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCookiePairHeaderValueCollection")
@js.native
abstract class HttpCookiePairHeaderValueCollection ()
  extends stdLib.Array[HttpCookiePairHeaderValue] {
  /** Gets the number of HttpCookiePairHeaderValue objects in the collection. */
  var size: scala.Double = js.native
  /**
    * Adds a new HttpCookiePairHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpCookiePairHeaderValue): scala.Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): scala.Unit = js.native
  /**
    * Retrieves an iterator to the first HttpCookiePairHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpCookiePairHeaderValue items in the collection. The iterator points to the first HttpCookiePairHeaderValue item in the HttpCookiePairHeaderValueCollection .
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[HttpCookiePairHeaderValue] = js.native
  /**
    * Returns the HttpCookiePairHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpCookiePairHeaderValue at the specified index in the HttpCookiePairHeaderValueCollection .
    */
  def getAt(index: scala.Double): HttpCookiePairHeaderValue = js.native
  /**
    * Retrieves the HttpCookiePairHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpCookiePairHeaderValue items in the HttpCookiePairHeaderValueCollection .
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueHttpCookiePairHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpCookiePairHeaderValueCollection .
    * @return The view of the HttpCookiePairHeaderValueCollection .
    */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[HttpCookiePairHeaderValue] = js.native
  def indexOf(value: HttpCookiePairHeaderValue, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Retrieves the index of an HttpCookiePairHeaderValue in the collection.
    * @param value The HttpCookiePairHeaderValue to find in the HttpCookiePairHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: HttpCookiePairHeaderValue): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Inserts an HttpCookiePairHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: scala.Double, value: HttpCookiePairHeaderValue): scala.Unit = js.native
  /**
    * Parses and adds an entry to the HttpCookiePairHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: java.lang.String): scala.Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpCookiePairHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: scala.Double): scala.Unit = js.native
  /** Removes the last HttpCookiePairHeaderValue item from the collection. */
  def removeAtEnd(): scala.Unit = js.native
  /**
    * Replaces all the HttpCookiePairHeaderValue items in the collection with the specified HttpCookiePairHeaderValue items.
    * @param items The HttpCookiePairHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpCookiePairHeaderValue): scala.Unit = js.native
  /**
    * Sets the HttpCookiePairHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpCookiePairHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: scala.Double, value: HttpCookiePairHeaderValue): scala.Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpCookiePairHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: java.lang.String): scala.Boolean = js.native
}

