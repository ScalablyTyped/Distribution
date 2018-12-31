package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMemberType extends js.Object {
  /** An array of arguments for the operation. */
  var arguments: js.Array[Argument]
  /** True if a deleter operation. */
  var deleter: scala.Boolean
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** True if a getter operation. */
  var getter: scala.Boolean
  /** An IDL Type of what the operation returns. If a stringifier, may be absent. */
  var idlType: IDLTypeDescription | scala.Null
  /** The name of the operation. If a stringifier, may be null. */
  var name: java.lang.String | scala.Null
  /** True if a setter operation. */
  var setter: scala.Boolean
  /** True if a static operation. */
  var static: scala.Boolean
  /** True if a stringifier operation. */
  var stringifier: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.operation
}

