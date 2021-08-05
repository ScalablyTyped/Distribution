package typings.webidl2.mod

import typings.webidl2.webidl2Strings.sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceTypeDescription
  extends StObject
     with AbstractGenericTypeDescription
     with GenericTypeDescription {
  
  @JSName("generic")
  var generic_SequenceTypeDescription: sequence
}
object SequenceTypeDescription {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): SequenceTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "sequence", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[SequenceTypeDescription]
  }
  
  extension [Self <: SequenceTypeDescription](x: Self) {
    
    inline def setGeneric(value: sequence): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
  }
}
