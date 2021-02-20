package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseTypeDescription
  extends AbstractGenericTypeDescription
     with GenericTypeDescription {
  
  @JSName("generic")
  var generic_PromiseTypeDescription: Promise = js.native
}
object PromiseTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    generic: Promise,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): PromiseTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseTypeDescription]
  }
  
  @scala.inline
  implicit class PromiseTypeDescriptionMutableBuilder[Self <: PromiseTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneric(value: Promise): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
  }
}
