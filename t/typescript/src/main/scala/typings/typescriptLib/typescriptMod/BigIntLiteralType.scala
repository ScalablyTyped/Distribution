package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigIntLiteralType extends LiteralType {
  @JSName("value")
  var value_BigIntLiteralType: PseudoBigInt
}

object BigIntLiteralType {
  @scala.inline
  def apply(
    flags: TypeFlags,
    freshType: LiteralType,
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
    isClass: () => /* is typescript.typescript.InterfaceType */ scala.Boolean,
    isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ scala.Boolean,
    isIntersection: () => /* is typescript.typescript.IntersectionType */ scala.Boolean,
    isLiteral: () => /* is typescript.typescript.LiteralType */ scala.Boolean,
    isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ scala.Boolean,
    isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ scala.Boolean,
    isTypeParameter: () => /* is typescript.typescript.TypeParameter */ scala.Boolean,
    isUnion: () => /* is typescript.typescript.UnionType */ scala.Boolean,
    isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ scala.Boolean,
    regularType: LiteralType,
    symbol: Symbol,
    value: PseudoBigInt,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    pattern: DestructuringPattern = null
  ): BigIntLiteralType = {
    val __obj = js.Dynamic.literal(flags = flags, freshType = freshType, getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), regularType = regularType, symbol = symbol, value = value)
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[BigIntLiteralType]
  }
}

