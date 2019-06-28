package typings
package swaggerDashParserLib.swaggerDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-parser", "$Refs")
@js.native
class $Refs () extends js.Object {
  /**
    * This property is true if the API definition contains any circular references. You may want to check this property before serializing the dereferenced API definition as JSON, since JSON.stringify() does not support circular references by default.
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/refs.md#circular
    */
  var circular: scala.Boolean = js.native
  /**
    * Returns `true` if the given path exists in the OpenAPI definition; otherwise, returns `false`
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/refs.md#existsref
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    */
  def exists($ref: java.lang.String): scala.Boolean = js.native
  /**
    * Gets the value at the given path in the OpenAPI definition. Throws an error if the path does not exist.
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/refs.md#getref
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    */
  def get($ref: java.lang.String): js.Any = js.native
  /**
    * Returns the paths/URLs of all the files in your API definition (including the main API definition file).
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/refs.md#pathstypes
    *
    * @param types (optional) Optionally only return certain types of paths ("file", "http", etc.)
    */
  def paths(types: java.lang.String*): js.Array[java.lang.String] = js.native
  /**
    * Sets the value at the given path in the OpenAPI definition. If the property, or any of its parents, don't exist, they will be created.
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    * @param value The value to assign. Can be anything (object, string, number, etc.)
    */
  def set($ref: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    * Returns a map of paths/URLs and their correspond values.
    *
    * See https://github.com/APIDevTools/swagger-parser/blob/master/docs/refs.md#valuestypes
    *
    * @param types (optional) Optionally only return values from certain locations ("file", "http", etc.)
    */
  def values(types: java.lang.String*): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

