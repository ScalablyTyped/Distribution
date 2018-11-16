package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Accept-Language HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValueCollection")
@js.native
abstract class HttpLanguageRangeWithQualityHeaderValueCollection ()
  extends stdLib.Array[HttpLanguageRangeWithQualityHeaderValue] {
  /** Gets the number of HttpLanguageRangeWithQualityHeaderValue objects in the collection. */
  var size: scala.Double = js.native
  /**
                       * Adds a new HttpLanguageRangeWithQualityHeaderValue item to the end of the collection.
                       * @param value The new item to add.
                       */
  def append(value: HttpLanguageRangeWithQualityHeaderValue): scala.Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): scala.Unit = js.native
  /**
                       * Retrieves an iterator to the first HttpLanguageRangeWithQualityHeaderValue item in the collection.
                       * @return An object that can be used to enumerate the HttpLanguageRangeWithQualityHeaderValue items in the collection. The iterator points to the first HttpLanguageRangeWithQualityHeaderValue item in the HttpLanguageRangeWithQualityHeaderValueCollection .
                       */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[HttpLanguageRangeWithQualityHeaderValue] = js.native
  /**
                       * Returns the HttpLanguageRangeWithQualityHeaderValue at the specified index in the collection.
                       * @param index The zero-based index of a specified item in the collection.
                       * @return The HttpLanguageRangeWithQualityHeaderValue at the specified index in the HttpLanguageRangeWithQualityHeaderValueCollection .
                       */
  def getAt(index: scala.Double): HttpLanguageRangeWithQualityHeaderValue = js.native
  /**
                       * Retrieves the HttpLanguageRangeWithQualityHeaderValue items that start at the specified index in the collection.
                       * @param startIndex The zero-based index of the start of the HttpLanguageRangeWithQualityHeaderValue items in the HttpLanguageRangeWithQualityHeaderValueCollection .
                       */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueHttpLanguageRangeWithQualityHeaderValue = js.native
  /**
                       * Returns an immutable view of the HttpLanguageRangeWithQualityHeaderValueCollection .
                       * @return The view of the HttpLanguageRangeWithQualityHeaderValueCollection .
                       */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[HttpLanguageRangeWithQualityHeaderValue] = js.native
  def indexOf(value: HttpLanguageRangeWithQualityHeaderValue, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
                       * Retrieves the index of an HttpLanguageRangeWithQualityHeaderValue in the collection.
                       * @param value The HttpLanguageRangeWithQualityHeaderValue to find in the HttpLanguageRangeWithQualityHeaderValueCollection .
                       */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: HttpLanguageRangeWithQualityHeaderValue): winrtDashUwpLib.Anon_Index = js.native
  /**
                       * Inserts an HttpLanguageRangeWithQualityHeaderValue into the collection at the specified index.
                       * @param index The zero-based index at which value should be inserted.
                       * @param value The object to insert into the collection.
                       */
  def insertAt(index: scala.Double, value: HttpLanguageRangeWithQualityHeaderValue): scala.Unit = js.native
  /**
                       * Parses and adds an entry to the HttpLanguageRangeWithQualityHeaderValueCollection .
                       * @param input The entry to add.
                       */
  def parseAdd(input: java.lang.String): scala.Unit = js.native
  /**
                       * Removes the entry at the specified index from the HttpLanguageRangeWithQualityHeaderValueCollection .
                       * @param index The index of the entry to remove.
                       */
  def removeAt(index: scala.Double): scala.Unit = js.native
  /** Removes the last HttpLanguageRangeWithQualityHeaderValue item from the collection. */
  def removeAtEnd(): scala.Unit = js.native
  /**
                       * Replaces all the HttpLanguageRangeWithQualityHeaderValue items in the collection with the specified HttpLanguageRangeWithQualityHeaderValue items.
                       * @param items The HttpLanguageRangeWithQualityHeaderValue items to add to the collection.
                       */
  def replaceAll(items: HttpLanguageRangeWithQualityHeaderValue): scala.Unit = js.native
  /**
                       * Sets the HttpLanguageRangeWithQualityHeaderValue at the specified index in the collection.
                       * @param index The zero-based index at which to set the HttpLanguageRangeWithQualityHeaderValue .
                       * @param value The item to set.
                       */
  def setAt(index: scala.Double, value: HttpLanguageRangeWithQualityHeaderValue): scala.Unit = js.native
  /**
                       * Tries to parse and add the specified item to the HttpLanguageRangeWithQualityHeaderValueCollection .
                       * @param input The item to parse and add.
                       * @return true if the item successfully parsed and was added; otherwise false.
                       */
  def tryParseAdd(input: java.lang.String): scala.Boolean = js.native
}

