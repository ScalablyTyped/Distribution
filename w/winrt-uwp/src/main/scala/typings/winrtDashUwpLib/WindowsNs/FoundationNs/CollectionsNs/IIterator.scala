package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports simple iteration over a collection. */
trait IIterator[T] extends js.Object {
  /** Gets the current item in the collection. */
  var current: T
  /** Gets a value that indicates whether the iterator refers to a current item or is at the end of the collection. */
  var hasCurrent: scala.Boolean
  /**
    * Retrieves all items in the collection.
    */
  def getMany(): winrtDashUwpLib.Anon_Items[T]
  /**
    * Advances the iterator to the next item in the collection.
    * @return True if the iterator refers to a valid item in the collection; false if the iterator passes the end of the collection.
    */
  def moveNext(): scala.Boolean
}

