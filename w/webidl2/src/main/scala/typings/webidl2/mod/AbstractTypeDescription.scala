package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractTypeDescription
  extends StObject
     with AbstractBase {
  
  /** Boolean indicating whether this is nullable or not. */
  var nullable: Boolean
  
  /** The container of this type. */
  @JSName("parent")
  var parent_AbstractTypeDescription: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
}
object AbstractTypeDescription {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): AbstractTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[AbstractTypeDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbstractTypeDescription] (val x: Self) extends AnyVal {
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setParent(
      value: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
