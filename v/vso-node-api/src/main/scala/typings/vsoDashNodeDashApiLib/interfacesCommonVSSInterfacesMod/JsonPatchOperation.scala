package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonPatchOperation extends js.Object {
  /**
    * The path to copy from for the Move/Copy operation.
    */
  var from: java.lang.String
  /**
    * The patch operation
    */
  var op: Operation
  /**
    * The path for the operation
    */
  var path: java.lang.String
  /**
    * The value for the operation. This is either a primitive or a JToken.
    */
  var value: js.Any
}

object JsonPatchOperation {
  @scala.inline
  def apply(from: java.lang.String, op: Operation, path: java.lang.String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[JsonPatchOperation]
  }
}

