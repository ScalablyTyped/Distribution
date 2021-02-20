package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceTypeDescription
  extends AbstractGenericTypeDescription
     with GenericTypeDescription {
  
  @JSName("generic")
  var generic_SequenceTypeDescription: sequence = js.native
}
object SequenceTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    generic: sequence,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): SequenceTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceTypeDescription]
  }
  
  @scala.inline
  implicit class SequenceTypeDescriptionMutableBuilder[Self <: SequenceTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneric(value: sequence): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
  }
}
