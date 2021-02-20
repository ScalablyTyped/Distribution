package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.FrozenArray
import typings.webidl2.webidl2Strings.ObservableArray
import typings.webidl2.webidl2Strings.Promise
import typings.webidl2.webidl2Strings._empty
import typings.webidl2.webidl2Strings.record
import typings.webidl2.webidl2Strings.sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractGenericTypeDescription extends AbstractNonUnionTypeDescription {
  
  /**
    * Contains the IDL type description for the type in the sequence,
    * the eventual value of the promise, etc.
    */
  var idlType: js.Array[IDLTypeDescription] = js.native
}
object AbstractGenericTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    generic: FrozenArray | ObservableArray | Promise | record | sequence | _empty,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): AbstractGenericTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractGenericTypeDescription]
  }
  
  @scala.inline
  implicit class AbstractGenericTypeDescriptionMutableBuilder[Self <: AbstractGenericTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdlType(value: js.Array[IDLTypeDescription]): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlTypeVarargs(value: IDLTypeDescription*): Self = StObject.set(x, "idlType", js.Array(value :_*))
  }
}
