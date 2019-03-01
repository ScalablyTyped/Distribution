package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralType extends Type {
  var freshType: LiteralType
  var regularType: LiteralType
  var value: java.lang.String | scala.Double | PseudoBigInt
}

object LiteralType {
  @scala.inline
  def apply(
    flags: TypeFlags,
    freshType: LiteralType,
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
    regularType: LiteralType,
    symbol: Symbol,
    value: java.lang.String | scala.Double | PseudoBigInt,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    pattern: DestructuringPattern = null
  ): LiteralType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("freshType")(freshType)
    __obj.updateDynamic("getApparentProperties")(getApparentProperties)
    __obj.updateDynamic("getBaseTypes")(getBaseTypes)
    __obj.updateDynamic("getCallSignatures")(getCallSignatures)
    __obj.updateDynamic("getConstraint")(getConstraint)
    __obj.updateDynamic("getConstructSignatures")(getConstructSignatures)
    __obj.updateDynamic("getDefault")(getDefault)
    __obj.updateDynamic("getFlags")(getFlags)
    __obj.updateDynamic("getNonNullableType")(getNonNullableType)
    __obj.updateDynamic("getNumberIndexType")(getNumberIndexType)
    __obj.updateDynamic("getProperties")(getProperties)
    __obj.updateDynamic("getProperty")(getProperty)
    __obj.updateDynamic("getStringIndexType")(getStringIndexType)
    __obj.updateDynamic("getSymbol")(getSymbol)
    __obj.updateDynamic("isClass")(isClass)
    __obj.updateDynamic("isClassOrInterface")(isClassOrInterface)
    __obj.updateDynamic("isIntersection")(isIntersection)
    __obj.updateDynamic("isLiteral")(isLiteral)
    __obj.updateDynamic("isNumberLiteral")(isNumberLiteral)
    __obj.updateDynamic("isStringLiteral")(isStringLiteral)
    __obj.updateDynamic("isTypeParameter")(isTypeParameter)
    __obj.updateDynamic("isUnion")(isUnion)
    __obj.updateDynamic("isUnionOrIntersection")(isUnionOrIntersection)
    __obj.updateDynamic("regularType")(regularType)
    __obj.updateDynamic("symbol")(symbol)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[LiteralType]
  }
}

