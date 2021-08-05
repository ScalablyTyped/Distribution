package typings.webidl2.mod

import typings.webidl2.webidl2Strings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleTypeDescription
  extends StObject
     with AbstractNonUnionTypeDescription
     with IDLTypeDescription {
  
  @JSName("generic")
  var generic_SingleTypeDescription: _empty
  
  /**
    * In most cases, this will just be a string with the type name.
    * If the type is a union, then this contains an array of the types it unites.
    * If it is a generic type, it contains the IDL type description for the type in the sequence,
    * the eventual value of the promise, etc.
    */
  var idlType: String
}
object SingleTypeDescription {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: String,
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): SingleTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[SingleTypeDescription]
  }
  
  extension [Self <: SingleTypeDescription](x: Self) {
    
    inline def setGeneric(value: _empty): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    inline def setIdlType(value: String): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
  }
}
