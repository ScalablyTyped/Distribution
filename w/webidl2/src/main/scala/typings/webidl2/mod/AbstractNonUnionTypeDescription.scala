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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractNonUnionTypeDescription
  extends StObject
     with AbstractTypeDescription {
  
  /** String indicating the generic type (e.g. "Promise", "sequence"). The empty string otherwise. */
  var generic: FrozenArray | ObservableArray | Promise | record | sequence | _empty
  
  /** Boolean indicating whether this is a union type or not. */
  var union: `false`
}
object AbstractNonUnionTypeDescription {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    generic: FrozenArray | ObservableArray | Promise | record | sequence | _empty,
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): AbstractNonUnionTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[AbstractNonUnionTypeDescription]
  }
  
  extension [Self <: AbstractNonUnionTypeDescription](x: Self) {
    
    inline def setGeneric(value: FrozenArray | ObservableArray | Promise | record | sequence | _empty): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    inline def setUnion(value: `false`): Self = StObject.set(x, "union", value.asInstanceOf[js.Any])
  }
}
