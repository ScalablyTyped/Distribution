package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectOptions extends js.Object {
  var ConnectOptions: Anon_EnumValuesAnonIncludeInheritedDefinitionsOnly
  var JWTAlgorithm: Anon_EnumValuesAnonHS256
  var JsonPatchOperation: js.Any
  var Operation: Anon_EnumValuesAnonAddCopy
}

object Anon_ConnectOptions {
  @scala.inline
  def apply(
    ConnectOptions: Anon_EnumValuesAnonIncludeInheritedDefinitionsOnly,
    JWTAlgorithm: Anon_EnumValuesAnonHS256,
    JsonPatchOperation: js.Any,
    Operation: Anon_EnumValuesAnonAddCopy
  ): Anon_ConnectOptions = {
    val __obj = js.Dynamic.literal(ConnectOptions = ConnectOptions, JWTAlgorithm = JWTAlgorithm, JsonPatchOperation = JsonPatchOperation, Operation = Operation)
  
    __obj.asInstanceOf[Anon_ConnectOptions]
  }
}

