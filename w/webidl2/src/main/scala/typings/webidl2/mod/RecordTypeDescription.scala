package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordTypeDescription
  extends AbstractGenericTypeDescription
     with GenericTypeDescription {
  
  @JSName("generic")
  var generic_RecordTypeDescription: record = js.native
  
  @JSName("idlType")
  var idlType_RecordTypeDescription: js.Tuple2[IDLTypeDescription, IDLTypeDescription] = js.native
}
object RecordTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    generic: record,
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): RecordTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordTypeDescription]
  }
  
  @scala.inline
  implicit class RecordTypeDescriptionMutableBuilder[Self <: RecordTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneric(value: record): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlType(value: js.Tuple2[IDLTypeDescription, IDLTypeDescription]): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
  }
}
