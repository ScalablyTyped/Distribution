package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceType extends ObjectType {
  var localTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.native
  var outerTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.native
  var thisType: js.UndefOr[TypeParameter] = js.native
  var typeParameters: js.UndefOr[js.Array[TypeParameter]] = js.native
}

object InterfaceType {
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
    symbol: Symbol
  ): InterfaceType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceType]
  }
  @scala.inline
  implicit class InterfaceTypeOps[Self <: InterfaceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocalTypeParametersVarargs(value: TypeParameter*): Self = this.set("localTypeParameters", js.Array(value :_*))
    @scala.inline
    def setLocalTypeParameters(value: js.Array[TypeParameter]): Self = this.set("localTypeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalTypeParameters: Self = this.set("localTypeParameters", js.undefined)
    @scala.inline
    def setOuterTypeParametersVarargs(value: TypeParameter*): Self = this.set("outerTypeParameters", js.Array(value :_*))
    @scala.inline
    def setOuterTypeParameters(value: js.Array[TypeParameter]): Self = this.set("outerTypeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterTypeParameters: Self = this.set("outerTypeParameters", js.undefined)
    @scala.inline
    def setThisType(value: TypeParameter): Self = this.set("thisType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThisType: Self = this.set("thisType", js.undefined)
    @scala.inline
    def setTypeParametersVarargs(value: TypeParameter*): Self = this.set("typeParameters", js.Array(value :_*))
    @scala.inline
    def setTypeParameters(value: js.Array[TypeParameter]): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeParameters: Self = this.set("typeParameters", js.undefined)
  }
  
}

