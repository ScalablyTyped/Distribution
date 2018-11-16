package typings
package winjsLib.WinJSNs.BindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Do not instantiate. Returned by the createSorted method.
    **/
@js.native
trait SortedListProjection[T] extends ListProjection[T] {
  //#endregion Methods
  //#region Properties
  /**
           * Gets or sets the length of the list. Returns an integer value one higher than the highest element defined in a list.
          **/
  var length: scala.Double = js.native
  //#region Methods
  /**
           * Returns a key/data pair for the specified index.
           * @param index The index of the value to retrieve.
           * @returns An object that has two properties: key and data.
          **/
  def getItem(index: scala.Double): IKeyDataPair[T] = js.native
  /**
           * Returns the index of the first occurrence of a key.
           * @param key The key to locate in the list.
           * @returns The index of the first occurrence of a key in a list, or -1 if not found.
          **/
  def indexOfKey(key: java.lang.String): scala.Double = js.native
  /**
           * Forces the list to send a itemmutated notification to any listeners for the value at the specified index.
           * @param index The index of the value that was mutated.
          **/
  def notifyMutated(index: scala.Double): scala.Unit = js.native
  /**
           * Replaces the value at the specified index with a new value.
           * @param index The index of the value to be replaced.
           * @param newValue The new value.
          **/
  def setAt(index: scala.Double, newValue: T): scala.Unit = js.native
}

