package typings.webidl2.mod

import typings.webidl2.webidl2Strings.iterable
import typings.webidl2.webidl2Strings.maplike
import typings.webidl2.webidl2Strings.setlike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationMemberType extends IDLInterfaceMemberType {
  /** An array of arguments for the iterable declaration. */
  var arguments: js.Array[Argument]
  /** Whether the iterable is declared as async. */
  var async: Boolean
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** An array with one or more IDL Types representing the declared type arguments. */
  var idlType: js.Array[IDLTypeDescription]
  /** Whether the maplike or setlike is declared as read only. */
  var readonly: Boolean
  var `type`: iterable | maplike | setlike
}

object DeclarationMemberType {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    async: Boolean,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    readonly: Boolean,
    `type`: iterable | maplike | setlike
  ): DeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationMemberType]
  }
}

