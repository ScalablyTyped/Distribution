package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.ObservableArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObservableArrayTypeDescription
  extends AbstractGenericTypeDescription
     with GenericTypeDescription {
  
  @JSName("generic")
  var generic_ObservableArrayTypeDescription: ObservableArray = js.native
}
object ObservableArrayTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    generic: ObservableArray,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): ObservableArrayTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservableArrayTypeDescription]
  }
  
  @scala.inline
  implicit class ObservableArrayTypeDescriptionMutableBuilder[Self <: ObservableArrayTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneric(value: ObservableArray): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
  }
}
