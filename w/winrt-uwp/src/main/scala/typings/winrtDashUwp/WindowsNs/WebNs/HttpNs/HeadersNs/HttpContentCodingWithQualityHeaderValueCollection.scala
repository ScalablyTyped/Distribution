package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueHttpContentCodingWithQualityHeaderValue
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Accept-Encoding HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValueCollection")
@js.native
abstract class HttpContentCodingWithQualityHeaderValueCollection () extends Array[HttpContentCodingWithQualityHeaderValue] {
  /** Gets the number of HttpContentCodingWithQualityHeaderValue objects in the collection. */
  var size: Double = js.native
  /**
    * Adds a new HttpContentCodingWithQualityHeaderValue item to the end of the collection.
    * @param value The HttpContentCodingWithQualityHeaderValue object to append.
    */
  def append(value: HttpContentCodingWithQualityHeaderValue): Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to the first HttpContentCodingWithQualityHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpContentCodingWithQualityHeaderValue items in the collection. The iterator points to the first HttpContentCodingWithQualityHeaderValue item in the HttpContentCodingWithQualityHeaderValueCollection .
    */
  def first(): IIterator[HttpContentCodingWithQualityHeaderValue] = js.native
  /**
    * Returns the HttpContentCodingWithQualityHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpContentCodingWithQualityHeaderValue at the specified index in the HttpContentCodingWithQualityHeaderValueCollection .
    */
  def getAt(index: Double): HttpContentCodingWithQualityHeaderValue = js.native
  /**
    * Retrieves the HttpContentCodingWithQualityHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpContentCodingWithQualityHeaderValue items in the HttpContentCodingWithQualityHeaderValueCollection .
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueHttpContentCodingWithQualityHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpContentCodingWithQualityHeaderValueCollection .
    * @return The view of the HttpContentCodingWithQualityHeaderValueCollection .
    */
  def getView(): IVectorView[HttpContentCodingWithQualityHeaderValue] = js.native
  def indexOf(value: HttpContentCodingWithQualityHeaderValue, extra: js.Any*): Anon_Index = js.native
  /**
    * Retrieves the index of an HttpContentCodingWithQualityHeaderValue in the collection.
    * @param value The HttpContentCodingWithQualityHeaderValue to find in the HttpContentCodingWithQualityHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: HttpContentCodingWithQualityHeaderValue): Anon_Index = js.native
  /**
    * Inserts an HttpContentCodingWithQualityHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpContentCodingWithQualityHeaderValue): Unit = js.native
  /**
    * Parses and adds an entry to the HttpContentCodingWithQualityHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpContentCodingWithQualityHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  /** Removes the last HttpContentCodingWithQualityHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  /**
    * Replaces all the HttpContentCodingWithQualityHeaderValue items in the collection with the specified HttpContentCodingWithQualityHeaderValue items.
    * @param items The HttpContentCodingWithQualityHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpContentCodingWithQualityHeaderValue): Unit = js.native
  /**
    * Sets the HttpContentCodingWithQualityHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpContentCodingWithQualityHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpContentCodingWithQualityHeaderValue): Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpContentCodingWithQualityHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}

