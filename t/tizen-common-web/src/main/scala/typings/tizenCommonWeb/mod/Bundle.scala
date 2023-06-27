package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "Bundle")
@js.native
open class Bundle () extends StObject {
  def this(json: Any) = this()
  
  /**
    * Calls the callback function for each item stored in the bundle.
    *
    * If bundle is empty the callback function will not be called.
    *
    * @param callback Function to be called for each entry.
    *
    * @remark Empty arrays are treated like string arrays.
    */
  def forEach(callback: BundleItemCallback): Unit = js.native
  
  /**
    * Gets value stored under given key.
    *
    * @param key Bundle entry key.
    *
    * @returns Bundle entry value for a given key.
    *
    * @throws WebAPIException with error type NotFoundError, if the key could not be found.
    */
  def get(key: String): Any = js.native
  
  /**
    * Inserts the key-value pair.
    *
    * @param key Entry key.
    * @param value Entry value.
    *
    * @remark Any value type not specified in the BundleValueType enum will be converted to a string.
    * @remark Empty array value will be treated like STRING\_ARRAY.
    */
  def set(key: String, value: Any): Unit = js.native
  
  /**
    * Converts bundle to JSON-compatible object.
    *
    * @returns JSON-compatible object.
    */
  def toJSON(): Any = js.native
  
  /**
    * Gets type of the value for a given key.
    *
    * @param key Entry key.
    *
    * @returns Entry value type.
    *
    * @throws WebAPIException with error type NotFoundError, if the key could not be found.
    *
    * @remark If the value for the given key is an empty array this function returns STRING\_ARRAY.
    */
  def typeOf(key: String): BundleValueType = js.native
}
