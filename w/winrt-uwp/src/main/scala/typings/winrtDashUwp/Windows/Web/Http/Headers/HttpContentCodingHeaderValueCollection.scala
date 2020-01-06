package typings.winrtDashUwp.Windows.Web.Http.Headers

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueHttpContentCodingHeaderValue
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterator
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Encoding HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingHeaderValueCollection")
@js.native
abstract class HttpContentCodingHeaderValueCollection () extends Array[HttpContentCodingHeaderValue] {
  /** Gets the number of HttpContentCodingHeaderValue objects in the collection. */
  var size: Double = js.native
  /**
    * Adds a new HttpContentCodingHeaderValue item to the end of the collection.
    * @param value The HttpContentCodingHeaderValue object to append.
    */
  def append(value: HttpContentCodingHeaderValue): Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to the first HttpContentCodingHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpContentCodingHeaderValue items in the collection. The iterator points to the first HttpContentCodingHeaderValue item in the HttpContentCodingHeaderValueCollection .
    */
  def first(): IIterator[HttpContentCodingHeaderValue] = js.native
  /**
    * Returns the HttpContentCodingHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the HttpContentCodingHeaderValueCollection .
    * @return The HttpContentCodingHeaderValue at the specified index in the HttpContentCodingHeaderValueCollection .
    */
  def getAt(index: Double): HttpContentCodingHeaderValue = js.native
  /**
    * Retrieves the HttpContentCodingHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpContentCodingHeaderValue items in the HttpContentCodingHeaderValueCollection .
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueHttpContentCodingHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpContentCodingHeaderValueCollection .
    * @return The view of the HttpContentCodingHeaderValueCollection .
    */
  def getView(): IVectorView[HttpContentCodingHeaderValue] = js.native
  def indexOf(value: HttpContentCodingHeaderValue, extra: js.Any*): Anon_Index = js.native
  /**
    * Determines the index of a specific item in the collection.
    * @param item The object to locate in the collection.
    * @return The index of item if found in the collection; otherwise, –1.
    */
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(item: HttpContentCodingHeaderValue): Double = js.native
  /**
    * Inserts an HttpContentCodingHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpContentCodingHeaderValue): Unit = js.native
  /**
    * Parses and adds an entry to the HttpContentCodingHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpContentCodingHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  /** Removes the last HttpContentCodingHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  /**
    * Replaces all the HttpContentCodingHeaderValue items in the collection with the specified HttpContentCodingHeaderValue items.
    * @param items The HttpContentCodingHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpContentCodingHeaderValue): Unit = js.native
  /**
    * Sets the HttpContentCodingHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpContentCodingHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpContentCodingHeaderValue): Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpContentCodingHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}

