package typings
package tsutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/type", JSImport.Namespace)
@js.native
object utilTypeMod extends js.Object {
  def getCallSignaturesOfType(`type`: typescriptLib.typescriptMod.Type): js.Array[typescriptLib.typescriptMod.Signature] = js.native
  def isEmptyObjectType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.ObjectType */ scala.Boolean = js.native
  def isFalsyType(`type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def isThenableType(checker: typescriptLib.typescriptMod.TypeChecker, node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def isThenableType(
    checker: typescriptLib.typescriptMod.TypeChecker,
    node: typescriptLib.typescriptMod.Expression,
    `type`: typescriptLib.typescriptMod.Type
  ): scala.Boolean = js.native
  def isTypeAssignableToNumber(checker: typescriptLib.typescriptMod.TypeChecker, `type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def isTypeAssignableToString(checker: typescriptLib.typescriptMod.TypeChecker, `type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def removeOptionalityFromType(checker: typescriptLib.typescriptMod.TypeChecker, `type`: typescriptLib.typescriptMod.Type): typescriptLib.typescriptMod.Type = js.native
  def unionTypeParts(`type`: typescriptLib.typescriptMod.Type): js.Array[typescriptLib.typescriptMod.Type] = js.native
}

