package typings.webidl2.mod

import typings.webidl2.webidl2Strings.attribute
import typings.webidl2.webidl2Strings.static
import typings.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeMemberType
  extends IDLInterfaceMemberType
     with IDLNamespaceMemberType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** An IDL Type for the attribute. */
  var idlType: IDLTypeDescription = js.native
  /** True if it's an inherit attribute. */
  var inherit: Boolean = js.native
  /** The attribute's name. */
  var name: String = js.native
  /** The container of this type. */
  var parent: InterfaceType | InterfaceMixinType | NamespaceType = js.native
  /** True if it's a read-only attribute. */
  var readonly: Boolean = js.native
  /** Special modifier if exists */
  var special: static | stringifier = js.native
  var `type`: attribute = js.native
}

object AttributeMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceType | InterfaceMixinType | NamespaceType,
    readonly: Boolean,
    special: static | stringifier,
    `type`: attribute
  ): AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeMemberType]
  }
  @scala.inline
  implicit class AttributeMemberTypeOps[Self <: AttributeMemberType] (val x: Self) extends AnyVal {
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
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: InterfaceType | InterfaceMixinType | NamespaceType): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecial(value: static | stringifier): Self = this.set("special", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: attribute): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

