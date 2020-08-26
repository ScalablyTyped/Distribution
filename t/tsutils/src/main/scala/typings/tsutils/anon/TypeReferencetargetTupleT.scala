package typings.tsutils.anon

import typings.typescript.mod.ArrayTypeNode
import typings.typescript.mod.BaseType
import typings.typescript.mod.DestructuringPattern
import typings.typescript.mod.GenericType
import typings.typescript.mod.ObjectFlags
import typings.typescript.mod.Signature
import typings.typescript.mod.Symbol
import typings.typescript.mod.TupleType
import typings.typescript.mod.TupleTypeNode
import typings.typescript.mod.Type
import typings.typescript.mod.TypeFlags
import typings.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined typescript.typescript.TypeReference & {  target :typescript.typescript.TupleType} */
@js.native
trait TypeReferencetargetTupleT extends js.Object {
  var aliasSymbol: js.UndefOr[Symbol] = js.native
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.native
  var flags: TypeFlags = js.native
  var node: js.UndefOr[TypeReferenceNode | ArrayTypeNode | TupleTypeNode] = js.native
  var objectFlags: ObjectFlags = js.native
  var pattern: js.UndefOr[DestructuringPattern] = js.native
  var symbol: Symbol = js.native
  var target: GenericType with TupleType = js.native
  var typeArguments: js.UndefOr[js.Array[Type]] = js.native
  def getApparentProperties(): js.Array[Symbol] = js.native
  def getBaseTypes(): js.UndefOr[js.Array[BaseType]] = js.native
  def getCallSignatures(): js.Array[Signature] = js.native
  def getConstraint(): js.UndefOr[Type] = js.native
  def getConstructSignatures(): js.Array[Signature] = js.native
  def getDefault(): js.UndefOr[Type] = js.native
  def getFlags(): TypeFlags = js.native
  def getNonNullableType(): Type = js.native
  def getNumberIndexType(): js.UndefOr[Type] = js.native
  def getProperties(): js.Array[Symbol] = js.native
  def getProperty(propertyName: String): js.UndefOr[Symbol] = js.native
  def getStringIndexType(): js.UndefOr[Type] = js.native
  def getSymbol(): js.UndefOr[Symbol] = js.native
  def isClass(): /* is typescript.typescript.InterfaceType */ Boolean = js.native
  def isClassOrInterface(): /* is typescript.typescript.InterfaceType */ Boolean = js.native
  def isIntersection(): /* is typescript.typescript.IntersectionType */ Boolean = js.native
  def isLiteral(): /* is typescript.typescript.LiteralType */ Boolean = js.native
  def isNumberLiteral(): /* is typescript.typescript.NumberLiteralType */ Boolean = js.native
  def isStringLiteral(): /* is typescript.typescript.StringLiteralType */ Boolean = js.native
  def isTypeParameter(): /* is typescript.typescript.TypeParameter */ Boolean = js.native
  def isUnion(): /* is typescript.typescript.UnionType */ Boolean = js.native
  def isUnionOrIntersection(): /* is typescript.typescript.UnionOrIntersectionType */ Boolean = js.native
}

object TypeReferencetargetTupleT {
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
    target: GenericType with TupleType
  ): TypeReferencetargetTupleT = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeReferencetargetTupleT]
  }
  @scala.inline
  implicit class TypeReferencetargetTupleTOps[Self <: TypeReferencetargetTupleT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlags(value: TypeFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetApparentProperties(value: () => js.Array[Symbol]): Self = this.set("getApparentProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBaseTypes(value: () => js.UndefOr[js.Array[BaseType]]): Self = this.set("getBaseTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCallSignatures(value: () => js.Array[Signature]): Self = this.set("getCallSignatures", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConstraint(value: () => js.UndefOr[Type]): Self = this.set("getConstraint", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConstructSignatures(value: () => js.Array[Signature]): Self = this.set("getConstructSignatures", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDefault(value: () => js.UndefOr[Type]): Self = this.set("getDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFlags(value: () => TypeFlags): Self = this.set("getFlags", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNonNullableType(value: () => Type): Self = this.set("getNonNullableType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumberIndexType(value: () => js.UndefOr[Type]): Self = this.set("getNumberIndexType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProperties(value: () => js.Array[Symbol]): Self = this.set("getProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProperty(value: String => js.UndefOr[Symbol]): Self = this.set("getProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStringIndexType(value: () => js.UndefOr[Type]): Self = this.set("getStringIndexType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSymbol(value: () => js.UndefOr[Symbol]): Self = this.set("getSymbol", js.Any.fromFunction0(value))
    @scala.inline
    def setIsClass(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = this.set("isClass", js.Any.fromFunction0(value))
    @scala.inline
    def setIsClassOrInterface(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = this.set("isClassOrInterface", js.Any.fromFunction0(value))
    @scala.inline
    def setIsIntersection(value: () => /* is typescript.typescript.IntersectionType */ Boolean): Self = this.set("isIntersection", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLiteral(value: () => /* is typescript.typescript.LiteralType */ Boolean): Self = this.set("isLiteral", js.Any.fromFunction0(value))
    @scala.inline
    def setIsNumberLiteral(value: () => /* is typescript.typescript.NumberLiteralType */ Boolean): Self = this.set("isNumberLiteral", js.Any.fromFunction0(value))
    @scala.inline
    def setIsStringLiteral(value: () => /* is typescript.typescript.StringLiteralType */ Boolean): Self = this.set("isStringLiteral", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTypeParameter(value: () => /* is typescript.typescript.TypeParameter */ Boolean): Self = this.set("isTypeParameter", js.Any.fromFunction0(value))
    @scala.inline
    def setIsUnion(value: () => /* is typescript.typescript.UnionType */ Boolean): Self = this.set("isUnion", js.Any.fromFunction0(value))
    @scala.inline
    def setIsUnionOrIntersection(value: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean): Self = this.set("isUnionOrIntersection", js.Any.fromFunction0(value))
    @scala.inline
    def setObjectFlags(value: ObjectFlags): Self = this.set("objectFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: Symbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: GenericType with TupleType): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setAliasSymbol(value: Symbol): Self = this.set("aliasSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasSymbol: Self = this.set("aliasSymbol", js.undefined)
    @scala.inline
    def setAliasTypeArgumentsVarargs(value: Type*): Self = this.set("aliasTypeArguments", js.Array(value :_*))
    @scala.inline
    def setAliasTypeArguments(value: js.Array[Type]): Self = this.set("aliasTypeArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasTypeArguments: Self = this.set("aliasTypeArguments", js.undefined)
    @scala.inline
    def setNode(value: TypeReferenceNode | ArrayTypeNode | TupleTypeNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setPattern(value: DestructuringPattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setTypeArgumentsVarargs(value: Type*): Self = this.set("typeArguments", js.Array(value :_*))
    @scala.inline
    def setTypeArguments(value: js.Array[Type]): Self = this.set("typeArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeArguments: Self = this.set("typeArguments", js.undefined)
  }
  
}

