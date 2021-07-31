package typings.webidl2.mod

import typings.webidl2.webidl2Strings.FrozenArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrozenArrayTypeDescription
  extends StObject
     with AbstractGenericTypeDescription
     with GenericTypeDescription {
  
  @JSName("generic")
  var generic_FrozenArrayTypeDescription: FrozenArray
}
object FrozenArrayTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): FrozenArrayTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "FrozenArray", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[FrozenArrayTypeDescription]
  }
  
  @scala.inline
  implicit class FrozenArrayTypeDescriptionMutableBuilder[Self <: FrozenArrayTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneric(value: FrozenArray): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
  }
}
