package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.FrozenArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrozenArrayTypeDescription
  extends AbstractGenericTypeDescription
     with GenericTypeDescription {
  
  @JSName("generic")
  var generic_FrozenArrayTypeDescription: FrozenArray = js.native
}
object FrozenArrayTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    generic: FrozenArray,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): FrozenArrayTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrozenArrayTypeDescription]
  }
  
  @scala.inline
  implicit class FrozenArrayTypeDescriptionMutableBuilder[Self <: FrozenArrayTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneric(value: FrozenArray): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
  }
}
