package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TupleType extends GenericType {
  var associatedNames: js.UndefOr[js.Array[__String]] = js.undefined
  var hasRestElement: scala.Boolean
  var minLength: scala.Double
}

object TupleType {
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
    hasRestElement: scala.Boolean,
    isClass: js.Function0[/* is typescript.typescript.ts.InterfaceType */ scala.Boolean],
    isClassOrInterface: js.Function0[/* is typescript.typescript.ts.InterfaceType */ scala.Boolean],
    isIntersection: js.Function0[/* is typescript.typescript.ts.IntersectionType */ scala.Boolean],
    isLiteral: js.Function0[/* is typescript.typescript.ts.LiteralType */ scala.Boolean],
    isNumberLiteral: js.Function0[/* is typescript.typescript.ts.NumberLiteralType */ scala.Boolean],
    isStringLiteral: js.Function0[/* is typescript.typescript.ts.StringLiteralType */ scala.Boolean],
    isTypeParameter: js.Function0[/* is typescript.typescript.ts.TypeParameter */ scala.Boolean],
    isUnion: js.Function0[/* is typescript.typescript.ts.UnionType */ scala.Boolean],
    isUnionOrIntersection: js.Function0[/* is typescript.typescript.ts.UnionOrIntersectionType */ scala.Boolean],
    minLength: scala.Double,
    objectFlags: ObjectFlags,
    symbol: Symbol,
    target: GenericType,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    associatedNames: js.Array[__String] = null,
    localTypeParameters: js.Array[TypeParameter] = null,
    outerTypeParameters: js.Array[TypeParameter] = null,
    pattern: DestructuringPattern = null,
    thisType: TypeParameter = null,
    typeArguments: js.Array[Type] = null,
    typeParameters: js.Array[TypeParameter] = null
  ): TupleType = {
    val __obj = js.Dynamic.literal(flags = flags, getApparentProperties = getApparentProperties, getBaseTypes = getBaseTypes, getCallSignatures = getCallSignatures, getConstraint = getConstraint, getConstructSignatures = getConstructSignatures, getDefault = getDefault, getFlags = getFlags, getNonNullableType = getNonNullableType, getNumberIndexType = getNumberIndexType, getProperties = getProperties, getProperty = getProperty, getStringIndexType = getStringIndexType, getSymbol = getSymbol, hasRestElement = hasRestElement, isClass = isClass, isClassOrInterface = isClassOrInterface, isIntersection = isIntersection, isLiteral = isLiteral, isNumberLiteral = isNumberLiteral, isStringLiteral = isStringLiteral, isTypeParameter = isTypeParameter, isUnion = isUnion, isUnionOrIntersection = isUnionOrIntersection, minLength = minLength, objectFlags = objectFlags, symbol = symbol, target = target)
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments)
    if (associatedNames != null) __obj.updateDynamic("associatedNames")(associatedNames)
    if (localTypeParameters != null) __obj.updateDynamic("localTypeParameters")(localTypeParameters)
    if (outerTypeParameters != null) __obj.updateDynamic("outerTypeParameters")(outerTypeParameters)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (thisType != null) __obj.updateDynamic("thisType")(thisType)
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TupleType]
  }
}

