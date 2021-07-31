package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedAccessType
  extends StObject
     with Type {
  
  var constraint: js.UndefOr[Type] = js.undefined
  
  var indexType: Type
  
  var objectType: Type
  
  var simplifiedForReading: js.UndefOr[Type] = js.undefined
  
  var simplifiedForWriting: js.UndefOr[Type] = js.undefined
}
object IndexedAccessType {
  
  @scala.inline
  def apply(
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
    indexType: Type,
    isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
    isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
    isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
    isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
    isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
    isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
    isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
    objectType: Type,
    symbol: Symbol
  ): IndexedAccessType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), indexType = indexType.asInstanceOf[js.Any], isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectType = objectType.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedAccessType]
  }
  
  @scala.inline
  implicit class IndexedAccessTypeMutableBuilder[Self <: IndexedAccessType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraint(value: Type): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    @scala.inline
    def setIndexType(value: Type): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: Type): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplifiedForReading(value: Type): Self = StObject.set(x, "simplifiedForReading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplifiedForReadingUndefined: Self = StObject.set(x, "simplifiedForReading", js.undefined)
    
    @scala.inline
    def setSimplifiedForWriting(value: Type): Self = StObject.set(x, "simplifiedForWriting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplifiedForWritingUndefined: Self = StObject.set(x, "simplifiedForWriting", js.undefined)
  }
}
