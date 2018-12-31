package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Proxy-Authenticate or WWW-Authenticate HTTP header on an HTTP response. */
@JSGlobal("Windows.Web.Http.Headers.HttpChallengeHeaderValueCollection")
@js.native
abstract class HttpChallengeHeaderValueCollection ()
  extends stdLib.Array[HttpChallengeHeaderValue] {
  /** Gets the number of HttpChallengeHeaderValue objects in the collection. */
  var size: scala.Double = js.native
  /**
    * Adds a new HttpChallengeHeaderValue item to the end of the collection.
    * @param value The HttpChallengeHeaderValue object to append.
    */
  def append(value: HttpChallengeHeaderValue): scala.Unit = js.native
  /** Removes all HttpChallengeHeaderValue objects from the collection. */
  def clear(): scala.Unit = js.native
  /**
    * Retrieves an iterator to the first HttpChallengeHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpChallengeHeaderValue items in the collection. The iterator points to the first HttpChallengeHeaderValue item in the HttpChallengeHeaderValueCollection .
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[HttpChallengeHeaderValue] = js.native
  /**
    * Returns the HttpChallengeHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the HttpChallengeHeaderValueCollection .
    * @return The HttpChallengeHeaderValue at the specified index in the HttpChallengeHeaderValueCollection
    */
  def getAt(index: scala.Double): HttpChallengeHeaderValue = js.native
  /**
    * Retrieves the HttpChallengeHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpChallengeHeaderValue items in the HttpChallengeHeaderValueCollection .
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueHttpChallengeHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpChallengeHeaderValueCollection .
    * @return The view of the HttpChallengeHeaderValueCollection .
    */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[HttpChallengeHeaderValue] = js.native
  def indexOf(value: HttpChallengeHeaderValue, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Retrieves the index of an HttpChallengeHeaderValue in the collection.
    * @param value The HttpChallengeHeaderValue to find in the HttpChallengeHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: HttpChallengeHeaderValue): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Inserts an HttpChallengeHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: scala.Double, value: HttpChallengeHeaderValue): scala.Unit = js.native
  /**
    * Parses and adds an entry to the HttpChallengeHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: java.lang.String): scala.Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpChallengeHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: scala.Double): scala.Unit = js.native
  /** Removes the last HttpChallengeHeaderValue item from the collection. */
  def removeAtEnd(): scala.Unit = js.native
  /**
    * Replaces all the HttpChallengeHeaderValue items in the collection with the specified HttpChallengeHeaderValue items.
    * @param items The collection of HttpChallengeHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpChallengeHeaderValue): scala.Unit = js.native
  /**
    * Sets the HttpChallengeHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpChallengeHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: scala.Double, value: HttpChallengeHeaderValue): scala.Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpChallengeHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: java.lang.String): scala.Boolean = js.native
}

