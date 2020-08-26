package typings.webidl2.mod

import typings.webidl2.webidl2Strings.const
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstantMemberType extends IDLInterfaceMemberType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** An IDL Type of the constant that represents a simple type, the type name. */
  var idlType: IDLTypeDescription = js.native
  /** The name of the constant. */
  var name: String = js.native
  /** Whether its type is nullable. */
  var nullable: Boolean = js.native
  /** The container of this type. */
  var parent: InterfaceType | InterfaceMixinType = js.native
  var `type`: const = js.native
  /** The constant value */
  var value: ValueDescription = js.native
}

object ConstantMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    nullable: Boolean,
    parent: InterfaceType | InterfaceMixinType,
    `type`: const,
    value: ValueDescription
  ): ConstantMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantMemberType]
  }
  @scala.inline
  implicit class ConstantMemberTypeOps[Self <: ConstantMemberType] (val x: Self) extends AnyVal {
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
    def setExtAttrsVarargs(value: ExtendedAttribute*): Self = this.set("extAttrs", js.Array(value :_*))
    @scala.inline
    def setExtAttrs(value: js.Array[ExtendedAttribute]): Self = this.set("extAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = this.set("idlType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: InterfaceType | InterfaceMixinType): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: const): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ValueDescription): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

