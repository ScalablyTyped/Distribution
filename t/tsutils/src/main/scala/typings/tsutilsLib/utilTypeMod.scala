package typings
package tsutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/type", JSImport.Namespace)
@js.native
object utilTypeMod extends js.Object {
  def getCallSignaturesOfType(`type`: typescriptLib.typescriptMod.tsNs.Type): js.Array[typescriptLib.typescriptMod.tsNs.Signature] = js.native
  def isEmptyObjectType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.ObjectType */ scala.Boolean = js.native
  def isFalsyType(`type`: typescriptLib.typescriptMod.tsNs.Type): scala.Boolean = js.native
  def isThenableType(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    node: typescriptLib.typescriptMod.tsNs.Expression
  ): scala.Boolean = js.native
  def isThenableType(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    node: typescriptLib.typescriptMod.tsNs.Expression,
    `type`: typescriptLib.typescriptMod.tsNs.Type
  ): scala.Boolean = js.native
  def isTypeAssignableToNumber(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    `type`: typescriptLib.typescriptMod.tsNs.Type
  ): scala.Boolean = js.native
  def isTypeAssignableToString(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    `type`: typescriptLib.typescriptMod.tsNs.Type
  ): scala.Boolean = js.native
  def removeOptionalityFromType(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    `type`: typescriptLib.typescriptMod.tsNs.Type
  ): typescriptLib.typescriptMod.tsNs.Type = js.native
  def unionTypeParts(`type`: typescriptLib.typescriptMod.tsNs.Type): js.Array[typescriptLib.typescriptMod.tsNs.Type] = js.native
}

