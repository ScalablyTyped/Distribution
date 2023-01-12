package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceTypeWithDeclaredMembers
  extends StObject
     with InterfaceType {
  
  var declaredCallSignatures: js.Array[Signature]
  
  var declaredConstructSignatures: js.Array[Signature]
  
  var declaredIndexInfos: js.Array[IndexInfo]
  
  var declaredProperties: js.Array[Symbol]
}
object InterfaceTypeWithDeclaredMembers {
  
  inline def apply(
    declaredCallSignatures: js.Array[Signature],
    declaredConstructSignatures: js.Array[Signature],
    declaredIndexInfos: js.Array[IndexInfo],
    declaredProperties: js.Array[Symbol],
    flags: TypeFlags,
    getApparentProperties: () => js.Array[Symbol],
    getBaseTypes: () => js.UndefOr[js.Array[BaseType]],
    getCallSignatures: () => js.Array[Signature],
    getConstraint: () => js.UndefOr[Type],
    getConstructSignatures: () => js.Array[Signature],
    getDefault: () => js.UndefOr[Type],
    getFlags: () => TypeFlags,
    getNonNullableType: () => Type,
    getNumberIndexType: () => js.UndefOr[Type],
    getProperties: () => js.Array[Symbol],
    getProperty: java.lang.String => js.UndefOr[Symbol],
    getStringIndexType: () => js.UndefOr[Type],
    getSymbol: () => js.UndefOr[Symbol],
    isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isIndexType: () => /* is typescript.typescript.IndexType */ Boolean,
    isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
    isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
    isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
    isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
    isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
    isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
    isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
    objectFlags: ObjectFlags,
    symbol: Symbol
  ): InterfaceTypeWithDeclaredMembers = {
    val __obj = js.Dynamic.literal(declaredCallSignatures = declaredCallSignatures.asInstanceOf[js.Any], declaredConstructSignatures = declaredConstructSignatures.asInstanceOf[js.Any], declaredIndexInfos = declaredIndexInfos.asInstanceOf[js.Any], declaredProperties = declaredProperties.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeWithDeclaredMembers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterfaceTypeWithDeclaredMembers] (val x: Self) extends AnyVal {
    
    inline def setDeclaredCallSignatures(value: js.Array[Signature]): Self = StObject.set(x, "declaredCallSignatures", value.asInstanceOf[js.Any])
    
    inline def setDeclaredCallSignaturesVarargs(value: Signature*): Self = StObject.set(x, "declaredCallSignatures", js.Array(value*))
    
    inline def setDeclaredConstructSignatures(value: js.Array[Signature]): Self = StObject.set(x, "declaredConstructSignatures", value.asInstanceOf[js.Any])
    
    inline def setDeclaredConstructSignaturesVarargs(value: Signature*): Self = StObject.set(x, "declaredConstructSignatures", js.Array(value*))
    
    inline def setDeclaredIndexInfos(value: js.Array[IndexInfo]): Self = StObject.set(x, "declaredIndexInfos", value.asInstanceOf[js.Any])
    
    inline def setDeclaredIndexInfosVarargs(value: IndexInfo*): Self = StObject.set(x, "declaredIndexInfos", js.Array(value*))
    
    inline def setDeclaredProperties(value: js.Array[Symbol]): Self = StObject.set(x, "declaredProperties", value.asInstanceOf[js.Any])
    
    inline def setDeclaredPropertiesVarargs(value: Symbol*): Self = StObject.set(x, "declaredProperties", js.Array(value*))
  }
}
