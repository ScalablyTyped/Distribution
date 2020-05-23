package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The SearchableIndex module is used to add or remove Ti.App.iOS.SearchableItem objects from the device search index.
  */
@js.native
trait SearchableIndex extends Proxy {
  /**
    * Adds an array of Titanium.App.iOS.SearchableItem objects to the default search index.
    */
  def addToDefaultSearchableIndex(Array: js.Array[SearchableItem], callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  /**
    * Removes search items based on an array of domain identifiers.
    */
  def deleteAllSearchableItemByDomainIdenifiers(Array: js.Array[String], callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  /**
    * Removes all search items added by the application.
    */
  def deleteAllSearchableItems(callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  /**
    * Removes search items based on an array of identifiers.
    */
  def deleteSearchableItemsByIdentifiers(Array: js.Array[String], callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  /**
    * Indicates whether indexing is supported by the device.
    */
  def isSupported(): Boolean = js.native
}

