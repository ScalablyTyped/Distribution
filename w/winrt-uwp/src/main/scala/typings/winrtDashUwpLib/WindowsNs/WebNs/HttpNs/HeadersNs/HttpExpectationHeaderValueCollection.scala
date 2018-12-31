package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Expect HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpExpectationHeaderValueCollection")
@js.native
abstract class HttpExpectationHeaderValueCollection ()
  extends stdLib.Array[HttpExpectationHeaderValue] {
  /** Gets the number of HttpExpectationHeaderValue objects in the collection. */
  var size: scala.Double = js.native
  /**
    * Adds a new HttpExpectationHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpExpectationHeaderValue): scala.Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): scala.Unit = js.native
  /**
    * Retrieves an iterator to the first HttpExpectationHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpExpectationHeaderValue items in the collection. The iterator points to the first HttpExpectationHeaderValue item in the HttpExpectationHeaderValueCollection .
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[HttpExpectationHeaderValue] = js.native
  /**
    * Returns the HttpExpectationHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpExpectationHeaderValue at the specified index in the HttpExpectationHeaderValueCollection .
    */
  def getAt(index: scala.Double): HttpExpectationHeaderValue = js.native
  /**
    * Retrieves the HttpExpectationHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpExpectationHeaderValue items in the HttpExpectationHeaderValueCollection .
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueHttpExpectationHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpExpectationHeaderValueCollection .
    * @return The view of the HttpExpectationHeaderValueCollection .
    */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[HttpExpectationHeaderValue] = js.native
  def indexOf(value: HttpExpectationHeaderValue, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Retrieves the index of an HttpExpectationHeaderValue in the collection.
    * @param value The HttpExpectationHeaderValue to find in the HttpExpectationHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: HttpExpectationHeaderValue): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Inserts an HttpExpectationHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: scala.Double, value: HttpExpectationHeaderValue): scala.Unit = js.native
  /**
    * Parses and adds an entry to the HttpExpectationHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: java.lang.String): scala.Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpExpectationHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: scala.Double): scala.Unit = js.native
  /** Removes the last HttpExpectationHeaderValue item from the collection. */
  def removeAtEnd(): scala.Unit = js.native
  /**
    * Replaces all the HttpExpectationHeaderValue items in the collection with the specified HttpExpectationHeaderValue items.
    * @param items The HttpExpectationHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpExpectationHeaderValue): scala.Unit = js.native
  /**
    * Sets the HttpExpectationHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpExpectationHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: scala.Double, value: HttpExpectationHeaderValue): scala.Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpExpectationHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: java.lang.String): scala.Boolean = js.native
}

