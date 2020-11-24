package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.FrozenArray
import typings.webidl2.webidl2Strings.ObservableArray
import typings.webidl2.webidl2Strings.Promise
import typings.webidl2.webidl2Strings._empty
import typings.webidl2.webidl2Strings.record
import typings.webidl2.webidl2Strings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractNonUnionTypeDescription extends AbstractTypeDescription {
  
  /** String indicating the generic type (e.g. "Promise", "sequence"). The empty string otherwise. */
  var generic: FrozenArray | ObservableArray | Promise | record | sequence | _empty = js.native
  
  /** Boolean indicating whether this is a union type or not. */
  var union: `false` = js.native
}
object AbstractNonUnionTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    generic: FrozenArray | ObservableArray | Promise | record | sequence | _empty,
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): AbstractNonUnionTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractNonUnionTypeDescription]
  }
  
  @scala.inline
  implicit class AbstractNonUnionTypeDescriptionOps[Self <: AbstractNonUnionTypeDescription] (val x: Self) extends AnyVal {
    
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
    def setGeneric(value: FrozenArray | ObservableArray | Promise | record | sequence | _empty): Self = this.set("generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnion(value: `false`): Self = this.set("union", value.asInstanceOf[js.Any])
  }
}
