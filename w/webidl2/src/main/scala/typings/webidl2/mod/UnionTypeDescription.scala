package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`true`
import typings.webidl2.webidl2Strings._empty
import org.scalablytyped.runtime.StObject
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
  implicit class UnionTypeDescriptionMutableBuilder[Self <: UnionTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneric(value: _empty): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlType(value: js.Array[IDLTypeDescription]): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlTypeVarargs(value: IDLTypeDescription*): Self = StObject.set(x, "idlType", js.Array(value :_*))
    
    @scala.inline
    def setUnion(value: `true`): Self = StObject.set(x, "union", value.asInstanceOf[js.Any])
  }
}
