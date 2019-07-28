package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueLanguage
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.GlobalizationNs.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Language HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpLanguageHeaderValueCollection")
@js.native
abstract class HttpLanguageHeaderValueCollection () extends Array[Language] {
  /** Gets the number of Language objects in the collection. */
  var size: Double = js.native
  /**
    * Adds a new Language item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: Language): Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to the first Language item in the collection.
    * @return An object that can be used to enumerate the Language items in the collection. The iterator points to the first Language item in the HttpLanguageHeaderValueCollection .
    */
  def first(): IIterator[Language] = js.native
  /**
    * Returns the Language item at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The Language item at the specified index in the HttpLanguageHeaderValueCollection .
    */
  def getAt(index: Double): Language = js.native
  /**
    * Retrieves the Language items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the Language items in the HttpLanguageHeaderValueCollection .
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueLanguage = js.native
  /**
    * Returns an immutable view of the HttpLanguageHeaderValueCollection .
    * @return The view of the HttpLanguageHeaderValueCollection .
    */
  def getView(): IVectorView[Language] = js.native
  def indexOf(value: Language, extra: js.Any*): Anon_Index = js.native
  /**
    * Retrieves the index of a Language in the collection.
    * @param value The item to find in the HttpLanguageHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: Language): Anon_Index = js.native
  /**
    * Inserts a Language into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: Language): Unit = js.native
  /**
    * Parses and adds an entry to the HttpLanguageHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpLanguageHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  /** Removes the last Language item from the collection. */
  def removeAtEnd(): Unit = js.native
  /**
    * Replaces all the Language items in the collection with the specified Language items.
    * @param items The Language items to add to the collection.
    */
  def replaceAll(items: Language): Unit = js.native
  /**
    * Sets the Language at the specified index in the collection.
    * @param index The zero-based index at which to set the Language .
    * @param value The item to set.
    */
  def setAt(index: Double, value: Language): Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpLanguageHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}

