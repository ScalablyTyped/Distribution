package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalType extends Type {
  var checkType: Type
  var extendsType: Type
  var resolvedFalseType: js.UndefOr[Type] = js.undefined
  var resolvedTrueType: js.UndefOr[Type] = js.undefined
  var root: ConditionalRoot
}

object ConditionalType {
  @scala.inline
  def apply(
    checkType: Type,
    extendsType: Type,
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
    root: ConditionalRoot,
    symbol: Symbol,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    pattern: DestructuringPattern = null,
    resolvedFalseType: Type = null,
    resolvedTrueType: Type = null
  ): ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType, extendsType = extendsType, flags = flags, getApparentProperties = getApparentProperties, getBaseTypes = getBaseTypes, getCallSignatures = getCallSignatures, getConstraint = getConstraint, getConstructSignatures = getConstructSignatures, getDefault = getDefault, getFlags = getFlags, getNonNullableType = getNonNullableType, getNumberIndexType = getNumberIndexType, getProperties = getProperties, getProperty = getProperty, getStringIndexType = getStringIndexType, getSymbol = getSymbol, isClass = isClass, isClassOrInterface = isClassOrInterface, isIntersection = isIntersection, isLiteral = isLiteral, isNumberLiteral = isNumberLiteral, isStringLiteral = isStringLiteral, isTypeParameter = isTypeParameter, isUnion = isUnion, isUnionOrIntersection = isUnionOrIntersection, root = root, symbol = symbol)
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (resolvedFalseType != null) __obj.updateDynamic("resolvedFalseType")(resolvedFalseType)
    if (resolvedTrueType != null) __obj.updateDynamic("resolvedTrueType")(resolvedTrueType)
    __obj.asInstanceOf[ConditionalType]
  }
}

