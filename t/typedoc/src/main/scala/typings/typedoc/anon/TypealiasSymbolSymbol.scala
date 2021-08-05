package typings.typedoc.anon

import typings.typescript.mod.BaseType
import typings.typescript.mod.DestructuringPattern
import typings.typescript.mod.Signature
import typings.typescript.mod.Symbol
import typings.typescript.mod.Type
import typings.typescript.mod.TypeFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.Type & {  aliasSymbol :typescript.typescript.Symbol} */
trait TypealiasSymbolSymbol extends StObject {
  
  var aliasSymbol: js.UndefOr[Symbol] & Symbol
  
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.undefined
  
  var flags: TypeFlags
  
  def getApparentProperties(): js.Array[Symbol]
  
  def getBaseTypes(): js.UndefOr[js.Array[BaseType]]
  
  def getCallSignatures(): js.Array[Signature]
  
  def getConstraint(): js.UndefOr[Type]
  
  def getConstructSignatures(): js.Array[Signature]
  
  def getDefault(): js.UndefOr[Type]
  
  def getFlags(): TypeFlags
  
  def getNonNullableType(): Type
  
  def getNumberIndexType(): js.UndefOr[Type]
  
  def getProperties(): js.Array[Symbol]
  
  def getProperty(propertyName: String): js.UndefOr[Symbol]
  
  def getStringIndexType(): js.UndefOr[Type]
  
  def getSymbol(): js.UndefOr[Symbol]
  
  def isClass(): /* is typescript.typescript.InterfaceType */ Boolean
  
  def isClassOrInterface(): /* is typescript.typescript.InterfaceType */ Boolean
  
  def isIntersection(): /* is typescript.typescript.IntersectionType */ Boolean
  
  def isLiteral(): /* is typescript.typescript.LiteralType */ Boolean
  
  def isNumberLiteral(): /* is typescript.typescript.NumberLiteralType */ Boolean
  
  def isStringLiteral(): /* is typescript.typescript.StringLiteralType */ Boolean
  
  def isTypeParameter(): /* is typescript.typescript.TypeParameter */ Boolean
  
  def isUnion(): /* is typescript.typescript.UnionType */ Boolean
  
  def isUnionOrIntersection(): /* is typescript.typescript.UnionOrIntersectionType */ Boolean
  
  var pattern: js.UndefOr[DestructuringPattern] = js.undefined
  
  var symbol: Symbol
}
object TypealiasSymbolSymbol {
  
  inline def apply(
    aliasSymbol: js.UndefOr[Symbol] & Symbol,
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
    getProperty: String => js.UndefOr[Symbol],
    getStringIndexType: () => js.UndefOr[Type],
    getSymbol: () => js.UndefOr[Symbol],
    isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
    isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
    isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
    isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
    isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
    isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
    isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
    symbol: Symbol
  ): TypealiasSymbolSymbol = {
    val __obj = js.Dynamic.literal(aliasSymbol = aliasSymbol.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypealiasSymbolSymbol]
  }
  
  extension [Self <: TypealiasSymbolSymbol](x: Self) {
    
    inline def setAliasSymbol(value: js.UndefOr[Symbol] & Symbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
    
    inline def setAliasTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "aliasTypeArguments", value.asInstanceOf[js.Any])
    
    inline def setAliasTypeArgumentsUndefined: Self = StObject.set(x, "aliasTypeArguments", js.undefined)
    
    inline def setAliasTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "aliasTypeArguments", js.Array(value :_*))
    
    inline def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGetApparentProperties(value: () => js.Array[Symbol]): Self = StObject.set(x, "getApparentProperties", js.Any.fromFunction0(value))
    
    inline def setGetBaseTypes(value: () => js.UndefOr[js.Array[BaseType]]): Self = StObject.set(x, "getBaseTypes", js.Any.fromFunction0(value))
    
    inline def setGetCallSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getCallSignatures", js.Any.fromFunction0(value))
    
    inline def setGetConstraint(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getConstraint", js.Any.fromFunction0(value))
    
    inline def setGetConstructSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getConstructSignatures", js.Any.fromFunction0(value))
    
    inline def setGetDefault(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
    
    inline def setGetFlags(value: () => TypeFlags): Self = StObject.set(x, "getFlags", js.Any.fromFunction0(value))
    
    inline def setGetNonNullableType(value: () => Type): Self = StObject.set(x, "getNonNullableType", js.Any.fromFunction0(value))
    
    inline def setGetNumberIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getNumberIndexType", js.Any.fromFunction0(value))
    
    inline def setGetProperties(value: () => js.Array[Symbol]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
    
    inline def setGetProperty(value: String => js.UndefOr[Symbol]): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    inline def setGetStringIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getStringIndexType", js.Any.fromFunction0(value))
    
    inline def setGetSymbol(value: () => js.UndefOr[Symbol]): Self = StObject.set(x, "getSymbol", js.Any.fromFunction0(value))
    
    inline def setIsClass(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClass", js.Any.fromFunction0(value))
    
    inline def setIsClassOrInterface(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClassOrInterface", js.Any.fromFunction0(value))
    
    inline def setIsIntersection(value: () => /* is typescript.typescript.IntersectionType */ Boolean): Self = StObject.set(x, "isIntersection", js.Any.fromFunction0(value))
    
    inline def setIsLiteral(value: () => /* is typescript.typescript.LiteralType */ Boolean): Self = StObject.set(x, "isLiteral", js.Any.fromFunction0(value))
    
    inline def setIsNumberLiteral(value: () => /* is typescript.typescript.NumberLiteralType */ Boolean): Self = StObject.set(x, "isNumberLiteral", js.Any.fromFunction0(value))
    
    inline def setIsStringLiteral(value: () => /* is typescript.typescript.StringLiteralType */ Boolean): Self = StObject.set(x, "isStringLiteral", js.Any.fromFunction0(value))
    
    inline def setIsTypeParameter(value: () => /* is typescript.typescript.TypeParameter */ Boolean): Self = StObject.set(x, "isTypeParameter", js.Any.fromFunction0(value))
    
    inline def setIsUnion(value: () => /* is typescript.typescript.UnionType */ Boolean): Self = StObject.set(x, "isUnion", js.Any.fromFunction0(value))
    
    inline def setIsUnionOrIntersection(value: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean): Self = StObject.set(x, "isUnionOrIntersection", js.Any.fromFunction0(value))
    
    inline def setPattern(value: DestructuringPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
