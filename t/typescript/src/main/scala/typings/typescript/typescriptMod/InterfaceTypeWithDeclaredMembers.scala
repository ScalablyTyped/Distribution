package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceTypeWithDeclaredMembers extends InterfaceType {
  var declaredCallSignatures: js.Array[Signature]
  var declaredConstructSignatures: js.Array[Signature]
  var declaredNumberIndexInfo: js.UndefOr[IndexInfo] = js.undefined
  var declaredProperties: js.Array[Symbol]
  var declaredStringIndexInfo: js.UndefOr[IndexInfo] = js.undefined
}

object InterfaceTypeWithDeclaredMembers {
  @scala.inline
  def apply(
    declaredCallSignatures: js.Array[Signature],
    declaredConstructSignatures: js.Array[Signature],
    declaredProperties: js.Array[Symbol],
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
    objectFlags: ObjectFlags,
    symbol: Symbol,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    declaredNumberIndexInfo: IndexInfo = null,
    declaredStringIndexInfo: IndexInfo = null,
    localTypeParameters: js.Array[TypeParameter] = null,
    outerTypeParameters: js.Array[TypeParameter] = null,
    pattern: DestructuringPattern = null,
    thisType: TypeParameter = null,
    typeParameters: js.Array[TypeParameter] = null
  ): InterfaceTypeWithDeclaredMembers = {
    val __obj = js.Dynamic.literal(declaredCallSignatures = declaredCallSignatures.asInstanceOf[js.Any], declaredConstructSignatures = declaredConstructSignatures.asInstanceOf[js.Any], declaredProperties = declaredProperties.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol.asInstanceOf[js.Any])
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments.asInstanceOf[js.Any])
    if (declaredNumberIndexInfo != null) __obj.updateDynamic("declaredNumberIndexInfo")(declaredNumberIndexInfo.asInstanceOf[js.Any])
    if (declaredStringIndexInfo != null) __obj.updateDynamic("declaredStringIndexInfo")(declaredStringIndexInfo.asInstanceOf[js.Any])
    if (localTypeParameters != null) __obj.updateDynamic("localTypeParameters")(localTypeParameters.asInstanceOf[js.Any])
    if (outerTypeParameters != null) __obj.updateDynamic("outerTypeParameters")(outerTypeParameters.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (thisType != null) __obj.updateDynamic("thisType")(thisType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeWithDeclaredMembers]
  }
}

