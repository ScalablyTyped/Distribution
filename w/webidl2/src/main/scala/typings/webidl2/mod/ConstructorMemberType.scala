package typings.webidl2.mod

import typings.webidl2.webidl2Strings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorMemberType extends IDLInterfaceMemberType {
  /** An array of arguments for the constructor operation. */
  var arguments: js.Array[Argument] = js.native
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** The container of this type. */
  var parent: InterfaceType = js.native
  var `type`: constructor = js.native
}

object ConstructorMemberType {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: InterfaceType,
    `type`: constructor
  ): ConstructorMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorMemberType]
  }
  @scala.inline
  implicit class ConstructorMemberTypeOps[Self <: ConstructorMemberType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgumentsVarargs(value: Argument*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtAttrsVarargs(value: ExtendedAttribute*): Self = this.set("extAttrs", js.Array(value :_*))
    @scala.inline
    def setExtAttrs(value: js.Array[ExtendedAttribute]): Self = this.set("extAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: InterfaceType): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: constructor): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

