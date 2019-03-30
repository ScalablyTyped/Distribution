package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TupleType extends GenericType {
  var associatedNames: js.UndefOr[js.Array[__String]] = js.undefined
  var hasRestElement: scala.Boolean
  var minLength: scala.Double
  var readonly: scala.Boolean
}

object TupleType {
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
    hasRestElement: scala.Boolean,
    isClass: () => /* is typescript.typescript.ts.InterfaceType */ scala.Boolean,
    isClassOrInterface: () => /* is typescript.typescript.ts.InterfaceType */ scala.Boolean,
    isIntersection: () => /* is typescript.typescript.ts.IntersectionType */ scala.Boolean,
    isLiteral: () => /* is typescript.typescript.ts.LiteralType */ scala.Boolean,
    isNumberLiteral: () => /* is typescript.typescript.ts.NumberLiteralType */ scala.Boolean,
    isStringLiteral: () => /* is typescript.typescript.ts.StringLiteralType */ scala.Boolean,
    isTypeParameter: () => /* is typescript.typescript.ts.TypeParameter */ scala.Boolean,
    isUnion: () => /* is typescript.typescript.ts.UnionType */ scala.Boolean,
    isUnionOrIntersection: () => /* is typescript.typescript.ts.UnionOrIntersectionType */ scala.Boolean,
    minLength: scala.Double,
    objectFlags: ObjectFlags,
    readonly: scala.Boolean,
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
    val __obj = js.Dynamic.literal(flags = flags, getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), hasRestElement = hasRestElement, isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), minLength = minLength, objectFlags = objectFlags, readonly = readonly, symbol = symbol, target = target)
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

