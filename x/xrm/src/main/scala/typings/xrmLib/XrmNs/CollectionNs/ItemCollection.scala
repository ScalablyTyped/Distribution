package typings
package xrmLib.XrmNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Collections are structures to provide access to data that represent an array, but without the ability to modify the data in the array.
         * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
         */
@js.native
trait ItemCollection[T] extends js.Object {
  /**
               * Applies an operation to all items in this collection.
               * @param delegate An iterative delegate function
               */
  def forEach(delegate: IterativeDelegate[T]): scala.Unit = js.native
  /**
               * Gets the entire array of T.
               * @returns A T[].
               */
  def get(): js.Array[T] = js.native
  /**
               * Gets the item using a delegate matching function
               * @param delegate A matching delegate function
               * @returns A T[] whose members have been validated by delegate.
               */
  def get(delegate: MatchingDelegate[T]): js.Array[T] = js.native
  /**
               * Gets the item given by the key.
               * @param itemName The item name to get.
               * @returns The T matching the key itemName.
               * @see {@link Controls.Control.getName Controls.Control.getName()} for Control-naming schemes.
               */
  def get(itemName: java.lang.String): T = js.native
  /**
               * Gets the item given by the index.
               * @param itemNumber The item number to get.
               * @returns The T in the itemNumber-th place.
               */
  def get(itemNumber: scala.Double): T = js.native
  /**
               * Gets the length of the collection.
               * @returns The length.
               */
  def getLength(): scala.Double = js.native
  /**
               * Gets the item given by the key.
               * @param itemName The item name to get.
               * @returns The T matching the key itemName.
               * @see {@link Controls.Control.getName Controls.Control.getName()} for Control-naming schemes.
               */
  @JSName("get")
  def get_TSubTypeTTSubType[TSubType /* <: T */](attributeName: java.lang.String): TSubType = js.native
  /**
               * Gets the item given by the index.
               * @param itemNumber The item number to get.
               * @returns The T in the itemNumber-th place.
               * @see {@link Controls.Control.getName Controls.Control.getName()} for Control-naming schemes.
               */
  @JSName("get")
  def get_TSubTypeTTSubType[TSubType /* <: T */](itemNumber: scala.Double): TSubType = js.native
}

