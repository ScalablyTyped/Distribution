package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedefType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An IDL Type describing what typedef's type. */
  var idlType: IDLTypeDescription
  /** The typedef's name. */
  var name: java.lang.String
  var `type`: webidl2Lib.webidl2LibStrings.typedef
}

object TypedefType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    idlType: IDLTypeDescription,
    name: java.lang.String,
    `type`: webidl2Lib.webidl2LibStrings.typedef
  ): TypedefType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("extAttrs")(extAttrs)
    __obj.updateDynamic("idlType")(idlType)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TypedefType]
  }
}

