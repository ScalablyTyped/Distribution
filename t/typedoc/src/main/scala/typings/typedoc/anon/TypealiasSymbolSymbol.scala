package typings.typedoc.anon

import typings.typescript.mod.BaseType
import typings.typescript.mod.DestructuringPattern
import typings.typescript.mod.Signature
import typings.typescript.mod.Symbol
import typings.typescript.mod.Type
import typings.typescript.mod.TypeFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.Type & {  aliasSymbol :typescript.typescript.Symbol} */
@js.native
trait TypealiasSymbolSymbol extends StObject {
  
  var aliasSymbol: js.UndefOr[Symbol] with Symbol = js.native
  
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.native
  
  var flags: TypeFlags = js.native
  
  def getApparentProperties(): js.Array[Symbol] = js.native
  
  def getBaseTypes(): js.UndefOr[js.Array[BaseType]] = js.native
  
  def getCallSignatures(): js.Array[Signature] = js.native
  
  def getConstraint(): js.UndefOr[Type] = js.native
  
  def getConstructSignatures(): js.Array[Signature] = js.native
  
  def getDefault(): js.UndefOr[Type] = js.native
  
  def getFlags(): TypeFlags = js.native
  
  def getNonNullableType(): Type = js.native
  
  def getNumberIndexType(): js.UndefOr[Type] = js.native
  
  def getProperties(): js.Array[Symbol] = js.native
  
  def getProperty(propertyName: String): js.UndefOr[Symbol] = js.native
  
  def getStringIndexType(): js.UndefOr[Type] = js.native
  
  def getSymbol(): js.UndefOr[Symbol] = js.native
  
  def isClass(): /* is typescript.typescript.InterfaceType */ Boolean = js.native
  
  def isClassOrInterface(): /* is typescript.typescript.InterfaceType */ Boolean = js.native
  
  def isIntersection(): /* is typescript.typescript.IntersectionType */ Boolean = js.native
  
  def isLiteral(): /* is typescript.typescript.LiteralType */ Boolean = js.native
  
  def isNumberLiteral(): /* is typescript.typescript.NumberLiteralType */ Boolean = js.native
  
  def isStringLiteral(): /* is typescript.typescript.StringLiteralType */ Boolean = js.native
  
  def isTypeParameter(): /* is typescript.typescript.TypeParameter */ Boolean = js.native
  
  def isUnion(): /* is typescript.typescript.UnionType */ Boolean = js.native
  
  def isUnionOrIntersection(): /* is typescript.typescript.UnionOrIntersectionType */ Boolean = js.native
  
  var pattern: js.UndefOr[DestructuringPattern] = js.native
  
  var symbol: Symbol = js.native
}
object TypealiasSymbolSymbol {
  
  @scala.inline
  def apply(
    aliasSymbol: js.UndefOr[Symbol] with Symbol,
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
  
  @scala.inline
  implicit class TypealiasSymbolSymbolMutableBuilder[Self <: TypealiasSymbolSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasSymbol(value: js.UndefOr[Symbol] with Symbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "aliasTypeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasTypeArgumentsUndefined: Self = StObject.set(x, "aliasTypeArguments", js.undefined)
    
    @scala.inline
    def setAliasTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "aliasTypeArguments", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetApparentProperties(value: () => js.Array[Symbol]): Self = StObject.set(x, "getApparentProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBaseTypes(value: () => js.UndefOr[js.Array[BaseType]]): Self = StObject.set(x, "getBaseTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCallSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getCallSignatures", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConstraint(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getConstraint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConstructSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getConstructSignatures", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefault(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFlags(value: () => TypeFlags): Self = StObject.set(x, "getFlags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNonNullableType(value: () => Type): Self = StObject.set(x, "getNonNullableType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumberIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getNumberIndexType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperties(value: () => js.Array[Symbol]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperty(value: String => js.UndefOr[Symbol]): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStringIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getStringIndexType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSymbol(value: () => js.UndefOr[Symbol]): Self = StObject.set(x, "getSymbol", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsClass(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsClassOrInterface(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClassOrInterface", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIntersection(value: () => /* is typescript.typescript.IntersectionType */ Boolean): Self = StObject.set(x, "isIntersection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLiteral(value: () => /* is typescript.typescript.LiteralType */ Boolean): Self = StObject.set(x, "isLiteral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNumberLiteral(value: () => /* is typescript.typescript.NumberLiteralType */ Boolean): Self = StObject.set(x, "isNumberLiteral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStringLiteral(value: () => /* is typescript.typescript.StringLiteralType */ Boolean): Self = StObject.set(x, "isStringLiteral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTypeParameter(value: () => /* is typescript.typescript.TypeParameter */ Boolean): Self = StObject.set(x, "isTypeParameter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUnion(value: () => /* is typescript.typescript.UnionType */ Boolean): Self = StObject.set(x, "isUnion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUnionOrIntersection(value: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean): Self = StObject.set(x, "isUnionOrIntersection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPattern(value: DestructuringPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
