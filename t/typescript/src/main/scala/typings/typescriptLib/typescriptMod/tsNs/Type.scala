package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends FlowType {
  var aliasSymbol: js.UndefOr[Symbol] = js.undefined
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.undefined
  var flags: TypeFlags
  var pattern: js.UndefOr[DestructuringPattern] = js.undefined
  var symbol: Symbol
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
  def getProperty(propertyName: java.lang.String): js.UndefOr[Symbol]
  def getStringIndexType(): js.UndefOr[Type]
  def getSymbol(): js.UndefOr[Symbol]
  def isClass(): /* is typescript.typescript.ts.InterfaceType */ scala.Boolean
  def isClassOrInterface(): /* is typescript.typescript.ts.InterfaceType */ scala.Boolean
  def isIntersection(): /* is typescript.typescript.ts.IntersectionType */ scala.Boolean
  def isLiteral(): /* is typescript.typescript.ts.LiteralType */ scala.Boolean
  def isNumberLiteral(): /* is typescript.typescript.ts.NumberLiteralType */ scala.Boolean
  def isStringLiteral(): /* is typescript.typescript.ts.StringLiteralType */ scala.Boolean
  def isTypeParameter(): /* is typescript.typescript.ts.TypeParameter */ scala.Boolean
  def isUnion(): /* is typescript.typescript.ts.UnionType */ scala.Boolean
  def isUnionOrIntersection(): /* is typescript.typescript.ts.UnionOrIntersectionType */ scala.Boolean
}

object Type {
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
    isClass: () => /* is typescript.typescript.ts.InterfaceType */ scala.Boolean,
    isClassOrInterface: () => /* is typescript.typescript.ts.InterfaceType */ scala.Boolean,
    isIntersection: () => /* is typescript.typescript.ts.IntersectionType */ scala.Boolean,
    isLiteral: () => /* is typescript.typescript.ts.LiteralType */ scala.Boolean,
    isNumberLiteral: () => /* is typescript.typescript.ts.NumberLiteralType */ scala.Boolean,
    isStringLiteral: () => /* is typescript.typescript.ts.StringLiteralType */ scala.Boolean,
    isTypeParameter: () => /* is typescript.typescript.ts.TypeParameter */ scala.Boolean,
    isUnion: () => /* is typescript.typescript.ts.UnionType */ scala.Boolean,
    isUnionOrIntersection: () => /* is typescript.typescript.ts.UnionOrIntersectionType */ scala.Boolean,
    symbol: Symbol,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    pattern: DestructuringPattern = null
  ): Type = {
    val __obj = js.Dynamic.literal(flags = flags, getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), symbol = symbol)
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[Type]
  }
}

