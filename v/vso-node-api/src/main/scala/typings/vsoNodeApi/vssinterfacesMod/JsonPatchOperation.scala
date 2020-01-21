package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonPatchOperation extends js.Object {
  /**
    * The path to copy from for the Move/Copy operation.
    */
  var from: String
  /**
    * The patch operation
    */
  var op: Operation
  /**
    * The path for the operation
    */
  var path: String
  /**
    * The value for the operation. This is either a primitive or a JToken.
    */
  var value: js.Any
}

object JsonPatchOperation {
  @scala.inline
  def apply(from: String, op: Operation, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
}

