package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`true`
import typings.webidl2.webidl2Strings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionTypeDescription
  extends AbstractTypeDescription
     with IDLTypeDescription {
  
  /** String indicating the generic type (e.g. "Promise", "sequence"). The empty string otherwise. */
  var generic: _empty = js.native
  
  /**
    * In most cases, this will just be a string with the type name.
    * If the type is a union, then this contains an array of the types it unites.
    * If it is a generic type, it contains the IDL type description for the type in the sequence,
    * the eventual value of the promise, etc.
    */
  var idlType: js.Array[IDLTypeDescription] = js.native
  
  /** Boolean indicating whether this is a union type or not. */
  var union: `true` = js.native
}
object UnionTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    generic: _empty,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `true`
  ): UnionTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeDescription]
  }
  
  @scala.inline
  implicit class UnionTypeDescriptionOps[Self <: UnionTypeDescription] (val x: Self) extends AnyVal {
    
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
    def setGeneric(value: _empty): Self = this.set("generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlTypeVarargs(value: IDLTypeDescription*): Self = this.set("idlType", js.Array(value :_*))
    
    @scala.inline
    def setIdlType(value: js.Array[IDLTypeDescription]): Self = this.set("idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnion(value: `true`): Self = this.set("union", value.asInstanceOf[js.Any])
  }
}
