package typings.winrtDashUwp.Windows.Web.Http.Headers

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueHttpMethod
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterator
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Web.Http.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Allow HTTP header on an HTTP response. */
@JSGlobal("Windows.Web.Http.Headers.HttpMethodHeaderValueCollection")
@js.native
abstract class HttpMethodHeaderValueCollection () extends Array[HttpMethod] {
  /** Gets the number of HttpMethod objects in the collection. */
  var size: Double = js.native
  /**
    * Adds a new HttpMethod item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpMethod): Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to the first HttpMethod item in the collection.
    * @return An object that can be used to enumerate the HttpMethod items in the collection. The iterator points to the first HttpMethod item in the HttpMethodHeaderValueCollection .
    */
  def first(): IIterator[HttpMethod] = js.native
  /**
    * Returns the HttpMethod at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpMethod at the specified index in the HttpMethodHeaderValueCollection .
    */
  def getAt(index: Double): HttpMethod = js.native
  /**
    * Retrieves the HttpMethod items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpMethod items in the HttpMethodHeaderValueCollection .
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueHttpMethod = js.native
  /**
    * Returns an immutable view of the HttpMethodHeaderValueCollection .
    * @return The view of the HttpMethodHeaderValueCollection .
    */
  def getView(): IVectorView[HttpMethod] = js.native
  def indexOf(value: HttpMethod, extra: js.Any*): Anon_Index = js.native
  /**
    * Determines the index of a specific item in the collection.
    * @param item The object to locate in the collection.
    * @return The index of item if found in the collection; otherwise, –1.
    */
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(item: HttpMethod): Double = js.native
  /**
    * Inserts an HttpMethod into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpMethod): Unit = js.native
  /**
    * Parses and adds an entry to the HttpMethodHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpMethodHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  /** Removes the last HttpMethod item from the collection. */
  def removeAtEnd(): Unit = js.native
  /**
    * Replaces all the HttpMethod items in the collection with the specified HttpMethod items.
    * @param items The HttpMethod items to add to the collection.
    */
  def replaceAll(items: HttpMethod): Unit = js.native
  /**
    * Sets the HttpMethod at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpMethod .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpMethod): Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpMethodHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}

