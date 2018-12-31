package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Accept HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValueCollection")
@js.native
abstract class HttpMediaTypeWithQualityHeaderValueCollection ()
  extends stdLib.Array[HttpMediaTypeWithQualityHeaderValue] {
  /** Gets the number of HttpMediaTypeWithQualityHeaderValue objects in the collection. */
  var size: scala.Double = js.native
  /**
    * Adds a new HttpMediaTypeWithQualityHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpMediaTypeWithQualityHeaderValue): scala.Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): scala.Unit = js.native
  /**
    * Retrieves an iterator to the first HttpMediaTypeWithQualityHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpMediaTypeWithQualityHeaderValue items in the collection. The iterator points to the first HttpMediaTypeWithQualityHeaderValue item in the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[HttpMediaTypeWithQualityHeaderValue] = js.native
  /**
    * Returns the HttpMediaTypeWithQualityHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpMediaTypeWithQualityHeaderValue at the specified index in the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  def getAt(index: scala.Double): HttpMediaTypeWithQualityHeaderValue = js.native
  /**
    * Retrieves the HttpMediaTypeWithQualityHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpMediaTypeWithQualityHeaderValue items in the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueHttpMediaTypeWithQualityHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpMediaTypeWithQualityHeaderValueCollection .
    * @return The view of the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[HttpMediaTypeWithQualityHeaderValue] = js.native
  def indexOf(value: HttpMediaTypeWithQualityHeaderValue, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Retrieves the index of an HttpMediaTypeWithQualityHeaderValue in the collection.
    * @param value The HttpMediaTypeWithQualityHeaderValue to find in the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: HttpMediaTypeWithQualityHeaderValue): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Inserts an HttpMediaTypeWithQualityHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: scala.Double, value: HttpMediaTypeWithQualityHeaderValue): scala.Unit = js.native
  /**
    * Parses and adds an entry to the HttpMediaTypeWithQualityHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: java.lang.String): scala.Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpMediaTypeWithQualityHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: scala.Double): scala.Unit = js.native
  /** Removes the last HttpMediaTypeWithQualityHeaderValue item from the collection. */
  def removeAtEnd(): scala.Unit = js.native
  /**
    * Replaces all the HttpMediaTypeWithQualityHeaderValue items in the collection with the specified HttpMediaTypeWithQualityHeaderValue items.
    * @param items The HttpMediaTypeWithQualityHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpMediaTypeWithQualityHeaderValue): scala.Unit = js.native
  /**
    * Sets the HttpMediaTypeWithQualityHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpMediaTypeWithQualityHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: scala.Double, value: HttpMediaTypeWithQualityHeaderValue): scala.Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpMediaTypeWithQualityHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: java.lang.String): scala.Boolean = js.native
}

