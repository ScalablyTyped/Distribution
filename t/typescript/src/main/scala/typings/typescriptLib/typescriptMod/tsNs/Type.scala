package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Type extends js.Object {
  var aliasSymbol: js.UndefOr[Symbol] = js.undefined
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.undefined
  var flags: TypeFlags
  var pattern: js.UndefOr[DestructuringPattern] = js.undefined
  var symbol: Symbol
  def getApparentProperties(): js.Array[Symbol]
  def getBaseTypes(): js.UndefOr[js.Array[BaseType]]
  def getCallSignatures(): js.Array[Signature]
  def getConstraint(): js.UndefOr[Type]
  def getConstructSignatures(): js.Array[Signature]
  def getDefault(): js.UndefOr[Type]
  def getFlags(): TypeFlags
  def getNonNullableType(): Type
  def getNumberIndexType(): js.UndefOr[Type]
  def getProperties(): js.Array[Symbol]
  def getProperty(propertyName: java.lang.String): js.UndefOr[Symbol]
  def getStringIndexType(): js.UndefOr[Type]
  def getSymbol(): js.UndefOr[Symbol]
  def isClass(): /* is InterfaceType */scala.Boolean
  def isClassOrInterface(): /* is InterfaceType */scala.Boolean
  def isIntersection(): /* is IntersectionType */scala.Boolean
  def isLiteral(): /* is LiteralType */scala.Boolean
  def isNumberLiteral(): /* is NumberLiteralType */scala.Boolean
  def isStringLiteral(): /* is StringLiteralType */scala.Boolean
  def isTypeParameter(): /* is TypeParameter */scala.Boolean
  def isUnion(): /* is UnionType */scala.Boolean
  def isUnionOrIntersection(): /* is UnionOrIntersectionType */scala.Boolean
}

