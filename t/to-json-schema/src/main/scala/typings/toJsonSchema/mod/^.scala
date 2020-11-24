package typings.toJsonSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("to-json-schema", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * `to-json-schema` exports function that converts most javascript values to
    * JSON schema. Such a schema can be used to further validation of similar
    * objects/values
    *
    * @param value Any javascript value
    * @param options optional options object
    */
  def apply(value: js.Any): JSONSchema3or4 = js.native
  def apply(value: js.Any, options: Options): JSONSchema3or4 = js.native
}
