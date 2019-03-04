package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackType extends IDLRootType {
  /** A list of arguments, as in function parameters. */
  var arguments: js.Array[Argument]
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An IDL Type describing what the callback returns. */
  var idlType: IDLTypeDescription
  /** The name of the callback. */
  var name: java.lang.String
  var `type`: webidl2Lib.webidl2LibStrings.callback
}

object CallbackType {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttributes],
    idlType: IDLTypeDescription,
    name: java.lang.String,
    `type`: webidl2Lib.webidl2LibStrings.callback
  ): CallbackType = {
    val __obj = js.Dynamic.literal(arguments = arguments, extAttrs = extAttrs, idlType = idlType, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CallbackType]
  }
}

