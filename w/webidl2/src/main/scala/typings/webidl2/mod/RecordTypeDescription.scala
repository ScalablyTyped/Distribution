package typings.webidl2.mod

import typings.webidl2.webidl2Strings.record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordTypeDescription
  extends StObject
     with AbstractGenericTypeDescription
     with GenericTypeDescription {
  
  @JSName("generic")
  var generic_RecordTypeDescription: record
  
  @JSName("idlType")
  var idlType_RecordTypeDescription: js.Tuple2[IDLTypeDescription, IDLTypeDescription]
}
object RecordTypeDescription {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): RecordTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "record", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[RecordTypeDescription]
  }
  
  extension [Self <: RecordTypeDescription](x: Self) {
    
    inline def setGeneric(value: record): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    inline def setIdlType(value: js.Tuple2[IDLTypeDescription, IDLTypeDescription]): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
  }
}
