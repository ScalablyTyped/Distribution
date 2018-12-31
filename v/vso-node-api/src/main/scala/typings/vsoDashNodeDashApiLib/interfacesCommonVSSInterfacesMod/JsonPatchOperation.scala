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

