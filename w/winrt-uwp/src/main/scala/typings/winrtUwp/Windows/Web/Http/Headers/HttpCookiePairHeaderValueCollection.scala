package typings.winrtUwp.Windows.Web.Http.Headers

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsHttpCookiePairHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Cookie HTTP header on an HTTP request. */
@js.native
trait HttpCookiePairHeaderValueCollection extends Array[HttpCookiePairHeaderValue] {
  /** Gets the number of HttpCookiePairHeaderValue objects in the collection. */
  var size: Double = js.native
  /**
    * Adds a new HttpCookiePairHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpCookiePairHeaderValue): Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to the first HttpCookiePairHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpCookiePairHeaderValue items in the collection. The iterator points to the first HttpCookiePairHeaderValue item in the HttpCookiePairHeaderValueCollection .
    */
  def first(): IIterator[HttpCookiePairHeaderValue] = js.native
  /**
    * Returns the HttpCookiePairHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpCookiePairHeaderValue at the specified index in the HttpCookiePairHeaderValueCollection .
    */
  def getAt(index: Double): HttpCookiePairHeaderValue = js.native
  /**
    * Retrieves the HttpCookiePairHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpCookiePairHeaderValue items in the HttpCookiePairHeaderValueCollection .
    */
  def getMany(startIndex: Double): ItemsHttpCookiePairHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpCookiePairHeaderValueCollection .
    * @return The view of the HttpCookiePairHeaderValueCollection .
    */
  def getView(): IVectorView[HttpCookiePairHeaderValue] = js.native
  def indexOf(value: HttpCookiePairHeaderValue, extra: js.Any*): Index = js.native
  /**
    * Determines the index of a specific item in the collection.
    * @param item The object to locate in the collection.
    * @return The index of item if found in the collection; otherwise, –1.
    */
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(item: HttpCookiePairHeaderValue): Double = js.native
  /**
    * Inserts an HttpCookiePairHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpCookiePairHeaderValue): Unit = js.native
  /**
    * Parses and adds an entry to the HttpCookiePairHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpCookiePairHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  /** Removes the last HttpCookiePairHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  /**
    * Replaces all the HttpCookiePairHeaderValue items in the collection with the specified HttpCookiePairHeaderValue items.
    * @param items The HttpCookiePairHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpCookiePairHeaderValue): Unit = js.native
  /**
    * Sets the HttpCookiePairHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpCookiePairHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpCookiePairHeaderValue): Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpCookiePairHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}

