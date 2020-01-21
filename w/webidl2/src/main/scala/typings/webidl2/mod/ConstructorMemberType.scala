package typings.webidl2.mod

import typings.webidl2.webidl2Strings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorMemberType extends IDLInterfaceMemberType {
  /** An array of arguments for the constructor operation. */
  var arguments: js.Array[Argument]
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  var `type`: constructor
}

object ConstructorMemberType {
  @scala.inline
  def apply(arguments: js.Array[Argument], extAttrs: js.Array[ExtendedAttribute], `type`: constructor): ConstructorMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorMemberType]
  }
}

