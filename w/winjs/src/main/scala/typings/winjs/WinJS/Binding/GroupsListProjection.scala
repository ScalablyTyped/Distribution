package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of groups.
  **/
@js.native
trait GroupsListProjection[T] extends ListBase[T] {
  
  //#region Methods
  /**
    * Gets a key/data pair for the specified index.
    * @param index The index of the value to retrieve.
    * @returns An object that has two properties: key and data.
    **/
  def getItem(index: Double): IKeyDataPair[T] = js.native
  
  /**
    * Gets a key/data pair for the specified key.
    * @param key The key of the value to retrieve.
    * @returns An object with two properties: key and data.
    **/
  def getItemFromKey(key: String): IKeyDataPair[T] = js.native
  
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
}
