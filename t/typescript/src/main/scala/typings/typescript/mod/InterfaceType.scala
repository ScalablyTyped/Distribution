package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class and interface types (ObjectFlags.Class and ObjectFlags.Interface). */
trait InterfaceType
  extends StObject
     with ObjectType {
  
  var localTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.undefined
  
  var outerTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.undefined
  
  var thisType: js.UndefOr[TypeParameter] = js.undefined
  
  var typeParameters: js.UndefOr[js.Array[TypeParameter]] = js.undefined
}
object InterfaceType {
  
  inline def apply(
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
  ): InterfaceType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterfaceType] (val x: Self) extends AnyVal {
    
    inline def setLocalTypeParameters(value: js.Array[TypeParameter]): Self = StObject.set(x, "localTypeParameters", value.asInstanceOf[js.Any])
    
    inline def setLocalTypeParametersUndefined: Self = StObject.set(x, "localTypeParameters", js.undefined)
    
    inline def setLocalTypeParametersVarargs(value: TypeParameter*): Self = StObject.set(x, "localTypeParameters", js.Array(value*))
    
    inline def setOuterTypeParameters(value: js.Array[TypeParameter]): Self = StObject.set(x, "outerTypeParameters", value.asInstanceOf[js.Any])
    
    inline def setOuterTypeParametersUndefined: Self = StObject.set(x, "outerTypeParameters", js.undefined)
    
    inline def setOuterTypeParametersVarargs(value: TypeParameter*): Self = StObject.set(x, "outerTypeParameters", js.Array(value*))
    
    inline def setThisType(value: TypeParameter): Self = StObject.set(x, "thisType", value.asInstanceOf[js.Any])
    
    inline def setThisTypeUndefined: Self = StObject.set(x, "thisType", js.undefined)
    
    inline def setTypeParameters(value: js.Array[TypeParameter]): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
    
    inline def setTypeParametersVarargs(value: TypeParameter*): Self = StObject.set(x, "typeParameters", js.Array(value*))
  }
}
