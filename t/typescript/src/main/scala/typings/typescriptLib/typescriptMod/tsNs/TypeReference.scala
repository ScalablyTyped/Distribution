package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type references (ObjectFlags.Reference). When a class or interface has type parameters or
  * a "this" type, references to the class or interface are made using type references. The
  * typeArguments property specifies the types to substitute for the type parameters of the
  * class or interface and optionally includes an extra element that specifies the type to
  * substitute for "this" in the resulting instantiation. When no extra argument is present,
  * the type reference itself is substituted for "this". The typeArguments property is undefined
  * if the class or interface has no type parameters and the reference isn't specifying an
  * explicit "this" argument.
  */
trait TypeReference extends ObjectType {
  var target: GenericType
  var typeArguments: js.UndefOr[js.Array[Type]] = js.undefined
}

object TypeReference {
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
    target: GenericType,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    pattern: DestructuringPattern = null,
    typeArguments: js.Array[Type] = null
  ): TypeReference = {
    val __obj = js.Dynamic.literal(flags = flags, getApparentProperties = getApparentProperties, getBaseTypes = getBaseTypes, getCallSignatures = getCallSignatures, getConstraint = getConstraint, getConstructSignatures = getConstructSignatures, getDefault = getDefault, getFlags = getFlags, getNonNullableType = getNonNullableType, getNumberIndexType = getNumberIndexType, getProperties = getProperties, getProperty = getProperty, getStringIndexType = getStringIndexType, getSymbol = getSymbol, isClass = isClass, isClassOrInterface = isClassOrInterface, isIntersection = isIntersection, isLiteral = isLiteral, isNumberLiteral = isNumberLiteral, isStringLiteral = isStringLiteral, isTypeParameter = isTypeParameter, isUnion = isUnion, isUnionOrIntersection = isUnionOrIntersection, objectFlags = objectFlags, symbol = symbol, target = target)
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments)
    __obj.asInstanceOf[TypeReference]
  }
}

