package typings.tsutils

import typings.typescript.typescriptMod.Expression
import typings.typescript.typescriptMod.Signature
import typings.typescript.typescriptMod.Type
import typings.typescript.typescriptMod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/type", JSImport.Namespace)
@js.native
object utilTypeMod extends js.Object {
  def getCallSignaturesOfType(`type`: Type): js.Array[Signature] = js.native
  def isEmptyObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = js.native
  def isFalsyType(`type`: Type): Boolean = js.native
  def isThenableType(checker: TypeChecker, node: Expression): Boolean = js.native
  def isThenableType(checker: TypeChecker, node: Expression, `type`: Type): Boolean = js.native
  def isTypeAssignableToNumber(checker: TypeChecker, `type`: Type): Boolean = js.native
  def isTypeAssignableToString(checker: TypeChecker, `type`: Type): Boolean = js.native
  def removeOptionalityFromType(checker: TypeChecker, `type`: Type): Type = js.native
  def unionTypeParts(`type`: Type): js.Array[Type] = js.native
}

