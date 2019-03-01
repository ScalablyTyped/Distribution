package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationMemberType extends IDLInterfaceMemberType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An array with one or more IDL Types representing the declared type arguments. */
  var idlType: js.Array[IDLTypeDescription]
  /** Whether the maplike or setlike is declared as read only. */
  var readonly: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.iterable | webidl2Lib.webidl2LibStrings.legacyiterable | webidl2Lib.webidl2LibStrings.setlike | webidl2Lib.webidl2LibStrings.maplike
}

object DeclarationMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    idlType: js.Array[IDLTypeDescription],
    readonly: scala.Boolean,
    `type`: webidl2Lib.webidl2LibStrings.iterable | webidl2Lib.webidl2LibStrings.legacyiterable | webidl2Lib.webidl2LibStrings.setlike | webidl2Lib.webidl2LibStrings.maplike
  ): DeclarationMemberType = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("extAttrs")(extAttrs)
    __obj.updateDynamic("idlType")(idlType)
    __obj.updateDynamic("readonly")(readonly)
    __obj.asInstanceOf[DeclarationMemberType]
  }
}

