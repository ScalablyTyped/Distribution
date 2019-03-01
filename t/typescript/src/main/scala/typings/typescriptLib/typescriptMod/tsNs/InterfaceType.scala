package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class and interface types (ObjectFlags.Class and ObjectFlags.Interface). */
trait InterfaceType extends ObjectType {
  var localTypeParameters: js.UndefOr[js.Array[TypeParameter]]
  var outerTypeParameters: js.UndefOr[js.Array[TypeParameter]]
  var thisType: js.UndefOr[TypeParameter]
  var typeParameters: js.UndefOr[js.Array[TypeParameter]]
}

object InterfaceType {
  @scala.inline
  def apply(
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
    localTypeParameters: js.Array[TypeParameter] = null,
    outerTypeParameters: js.Array[TypeParameter] = null,
    pattern: DestructuringPattern = null,
    thisType: TypeParameter = null,
    typeParameters: js.Array[TypeParameter] = null
  ): InterfaceType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
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
    __obj.updateDynamic("objectFlags")(objectFlags)
    __obj.updateDynamic("symbol")(symbol)
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments)
    if (localTypeParameters != null) __obj.updateDynamic("localTypeParameters")(localTypeParameters)
    if (outerTypeParameters != null) __obj.updateDynamic("outerTypeParameters")(outerTypeParameters)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (thisType != null) __obj.updateDynamic("thisType")(thisType)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[InterfaceType]
  }
}

