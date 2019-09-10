package typings.tsutils

import typings.tsutils.utilUtilMod.PropertyName
import typings.typescript.typescriptMod.ClassLikeDeclaration
import typings.typescript.typescriptMod.Expression
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.Signature
import typings.typescript.typescriptMod.Symbol
import typings.typescript.typescriptMod.Type
import typings.typescript.typescriptMod.TypeChecker
import typings.typescript.typescriptMod.__String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/type", JSImport.Namespace)
@js.native
object utilTypeMod extends js.Object {
  def getCallSignaturesOfType(`type`: Type): js.Array[Signature] = js.native
  def getConstructorTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  def getInstanceTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = js.native
  def getIteratorYieldResultFromIteratorResult(`type`: Type, node: Node, checker: TypeChecker): Type = js.native
  def getPropertyNameFromType(`type`: Type): js.UndefOr[PropertyName] = js.native
  def getPropertyOfType(`type`: Type, name: __String): js.UndefOr[Symbol] = js.native
  def intersectionTypeParts(`type`: Type): js.Array[Type] = js.native
  def isBooleanLiteralType(`type`: Type, literal: Boolean): Boolean = js.native
  def isEmptyObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = js.native
  def isFalsyType(`type`: Type): Boolean = js.native
  def isPropertyReadonlyInType(`type`: Type, name: __String, checker: TypeChecker): Boolean = js.native
  def isThenableType(checker: TypeChecker, node: Expression): Boolean = js.native
  def isThenableType(checker: TypeChecker, node: Expression, `type`: Type): Boolean = js.native
  def isThenableType(checker: TypeChecker, node: Node, `type`: Type): Boolean = js.native
  def isTypeAssignableToNumber(checker: TypeChecker, `type`: Type): Boolean = js.native
  def isTypeAssignableToString(checker: TypeChecker, `type`: Type): Boolean = js.native
  def removeOptionalityFromType(checker: TypeChecker, `type`: Type): Type = js.native
  def someTypePart(
    `type`: Type,
    predicate: js.Function1[/* t */ Type, /* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    cb: js.Function1[/* t */ Type, Boolean]
  ): Boolean = js.native
  def symbolHasReadonlyDeclaration(symbol: Symbol, checker: TypeChecker): Boolean = js.native
  def unionTypeParts(`type`: Type): js.Array[Type] = js.native
}

