package typings.tizenCommonWeb.tizenMod

import typings.tizenCommonWeb.tizenCommonWebStrings.BYTES
import typings.tizenCommonWeb.tizenCommonWebStrings.BYTES_ARRAY
import typings.tizenCommonWeb.tizenCommonWebStrings.STRING
import typings.tizenCommonWeb.tizenCommonWebStrings.STRING_ARRAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web/tizen", "Bundle")
@js.native
class Bundle () extends StObject {
  
  /**
    * Calls the callback function for each item stored in the bundle.
    * If bundle is empty the callback function will not be called.
    * @param callback Function to be called for each entry.
    * @remark Empty arrays are treated like string arrays.
    */
  def forEach(callback: BundleItemCallback): Unit = js.native
  
  /**
    * Gets value stored under given key.
    * @param key Bundle entry key.
    * @returns Bundle entry value for a given key.
    * @throw WebAPIException `NotFoundError`
    */
  def get(key: String): js.Any = js.native
  
  /**
    * Inserts the key-value pair.
    * @param key Entry key.
    * @param value Entry value.
    * @remark Any value type not specified in the BundleValueType enum will be converted to a string.
    * @remark Empty array value will be treated like STRING_ARRAY.
    */
  def set(key: String, value: js.Any): Unit = js.native
  
  /**
    * Converts bundle to JSON-compatible object.
    * @returns JSON-compatible object.
    */
  def toJSON(): js.Object = js.native
  
  /**
    * Gets type of the value for a given key.
    * @param key Entry key.
    * @returns Entry value type.
    * @throw WebAPIException `NotFoundError`
    * @remark If the value for the given key is an empty array this function returns STRING_ARRAY.
    *
    */
  def typeOf(key: String): BundleValueType | STRING | STRING_ARRAY | BYTES | BYTES_ARRAY = js.native
}
