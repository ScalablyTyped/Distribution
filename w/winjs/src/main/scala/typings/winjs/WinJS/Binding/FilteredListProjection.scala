package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Do not instantiate. A list returned by the createFiltered method.
  **/
@js.native
trait FilteredListProjection[T] extends ListProjection[T] {
  
  //#region Methods
  /**
    * Returns a key/data pair for the specified index.
    * @param index The index of the value to retrieve.
    * @returns An object that has two properties: key and data.
    **/
  def getItem(index: Double): IKeyDataPair[T] = js.native
  
  /**
    * Returns the index of the first occurrence of a key in a list.
    * @param key The key to locate in the list.
    * @returns The index of the first occurrence of a key in a list, or -1 if not found.
    **/
  def indexOfKey(key: String): Double = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * The length of the list. Returns an integer value one higher than the highest element defined in an list.
    **/
  var length: Double = js.native
  
  /**
    * Forces the list to send a itemmutated notification to any listeners for the value at the specified index.
    * @param index The index of the value that was mutated.
    **/
  def notifyMutated(index: Double): Unit = js.native
  
  /**
    * Replaces the value at the specified index with a new value.
    * @param index The index of the value that was replaced.
    * @param newValue The new value.
    **/
  def setAt(index: Double, newValue: T): Unit = js.native
}
