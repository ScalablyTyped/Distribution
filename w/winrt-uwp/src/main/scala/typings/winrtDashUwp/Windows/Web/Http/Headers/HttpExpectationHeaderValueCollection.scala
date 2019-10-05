package typings.winrtDashUwp.Windows.Web.Http.Headers

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueHttpExpectationHeaderValue
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterator
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Expect HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpExpectationHeaderValueCollection")
@js.native
abstract class HttpExpectationHeaderValueCollection () extends Array[HttpExpectationHeaderValue] {
  /** Gets the number of HttpExpectationHeaderValue objects in the collection. */
  var size: Double = js.native
  /**
    * Adds a new HttpExpectationHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpExpectationHeaderValue): Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to the first HttpExpectationHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpExpectationHeaderValue items in the collection. The iterator points to the first HttpExpectationHeaderValue item in the HttpExpectationHeaderValueCollection .
    */
  def first(): IIterator[HttpExpectationHeaderValue] = js.native
  /**
    * Returns the HttpExpectationHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpExpectationHeaderValue at the specified index in the HttpExpectationHeaderValueCollection .
    */
  def getAt(index: Double): HttpExpectationHeaderValue = js.native
  /**
    * Retrieves the HttpExpectationHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpExpectationHeaderValue items in the HttpExpectationHeaderValueCollection .
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueHttpExpectationHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpExpectationHeaderValueCollection .
    * @return The view of the HttpExpectationHeaderValueCollection .
    */
  def getView(): IVectorView[HttpExpectationHeaderValue] = js.native
  def indexOf(value: HttpExpectationHeaderValue, extra: js.Any*): Anon_Index = js.native
  /**
    * Retrieves the index of an HttpExpectationHeaderValue in the collection.
    * @param value The HttpExpectationHeaderValue to find in the HttpExpectationHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: HttpExpectationHeaderValue): Anon_Index = js.native
  /**
    * Inserts an HttpExpectationHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpExpectationHeaderValue): Unit = js.native
  /**
    * Parses and adds an entry to the HttpExpectationHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpExpectationHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  /** Removes the last HttpExpectationHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  /**
    * Replaces all the HttpExpectationHeaderValue items in the collection with the specified HttpExpectationHeaderValue items.
    * @param items The HttpExpectationHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpExpectationHeaderValue): Unit = js.native
  /**
    * Sets the HttpExpectationHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpExpectationHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpExpectationHeaderValue): Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpExpectationHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}

