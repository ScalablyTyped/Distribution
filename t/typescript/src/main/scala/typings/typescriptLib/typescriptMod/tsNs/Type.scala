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
  def isClass(): /* is typescript.typescript.ts.InterfaceType */ scala.Boolean
  def isClassOrInterface(): /* is typescript.typescript.ts.InterfaceType */ scala.Boolean
  def isIntersection(): /* is typescript.typescript.ts.IntersectionType */ scala.Boolean
  def isLiteral(): /* is typescript.typescript.ts.LiteralType */ scala.Boolean
  def isNumberLiteral(): /* is typescript.typescript.ts.NumberLiteralType */ scala.Boolean
  def isStringLiteral(): /* is typescript.typescript.ts.StringLiteralType */ scala.Boolean
  def isTypeParameter(): /* is typescript.typescript.ts.TypeParameter */ scala.Boolean
  def isUnion(): /* is typescript.typescript.ts.UnionType */ scala.Boolean
  def isUnionOrIntersection(): /* is typescript.typescript.ts.UnionOrIntersectionType */ scala.Boolean
}

