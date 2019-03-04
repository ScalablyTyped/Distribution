package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvolvingArrayType extends ObjectType {
  var elementType: Type
  var finalArrayType: js.UndefOr[Type] = js.undefined
}

object EvolvingArrayType {
  @scala.inline
  def apply(
    elementType: Type,
    flags: TypeFlags,
    getApparentProperties: js.Function0[js.Array[Symbol]],
    getBaseTypes: js.Function0[js.UndefOr[js.Array[BaseType]]],
    getCallSignatures: js.Function0[js.Array[Signature]],
    getConstraint: js.Function0[js.UndefOr[Type]],
    getConstructSignatures: js.Function0[js.Array[Signature]],
    getDefault: js.Function0[js.UndefOr[Type]],
    getFlags: js.Function0[TypeFlags],
    getNonNullableType: js.Function0[Type],
    getNumberIndexType: js.Function0[js.UndefOr[Type]],
    getProperties: js.Function0[js.Array[Symbol]],
    getProperty: js.Function1[java.lang.String, js.UndefOr[Symbol]],
    getStringIndexType: js.Function0[js.UndefOr[Type]],
    getSymbol: js.Function0[js.UndefOr[Symbol]],
    isClass: js.Function0[/* is typescript.typescript.ts.InterfaceType */ scala.Boolean],
    isClassOrInterface: js.Function0[/* is typescript.typescript.ts.InterfaceType */ scala.Boolean],
    isIntersection: js.Function0[/* is typescript.typescript.ts.IntersectionType */ scala.Boolean],
    isLiteral: js.Function0[/* is typescript.typescript.ts.LiteralType */ scala.Boolean],
    isNumberLiteral: js.Function0[/* is typescript.typescript.ts.NumberLiteralType */ scala.Boolean],
    isStringLiteral: js.Function0[/* is typescript.typescript.ts.StringLiteralType */ scala.Boolean],
    isTypeParameter: js.Function0[/* is typescript.typescript.ts.TypeParameter */ scala.Boolean],
    isUnion: js.Function0[/* is typescript.typescript.ts.UnionType */ scala.Boolean],
    isUnionOrIntersection: js.Function0[/* is typescript.typescript.ts.UnionOrIntersectionType */ scala.Boolean],
    objectFlags: ObjectFlags,
    symbol: Symbol,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    finalArrayType: Type = null,
    pattern: DestructuringPattern = null
  ): EvolvingArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType, flags = flags, getApparentProperties = getApparentProperties, getBaseTypes = getBaseTypes, getCallSignatures = getCallSignatures, getConstraint = getConstraint, getConstructSignatures = getConstructSignatures, getDefault = getDefault, getFlags = getFlags, getNonNullableType = getNonNullableType, getNumberIndexType = getNumberIndexType, getProperties = getProperties, getProperty = getProperty, getStringIndexType = getStringIndexType, getSymbol = getSymbol, isClass = isClass, isClassOrInterface = isClassOrInterface, isIntersection = isIntersection, isLiteral = isLiteral, isNumberLiteral = isNumberLiteral, isStringLiteral = isStringLiteral, isTypeParameter = isTypeParameter, isUnion = isUnion, isUnionOrIntersection = isUnionOrIntersection, objectFlags = objectFlags, symbol = symbol)
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments)
    if (finalArrayType != null) __obj.updateDynamic("finalArrayType")(finalArrayType)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[EvolvingArrayType]
  }
}

