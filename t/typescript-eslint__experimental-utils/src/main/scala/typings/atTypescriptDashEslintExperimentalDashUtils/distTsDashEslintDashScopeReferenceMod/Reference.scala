package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod

import org.scalablytyped.runtime.Instantiable0
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`1`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`2`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`3`
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Identifier
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var from: Scope
  var identifier: Identifier
  var init: Boolean
  var resolved: Variable | Null
  var writeExpr: Node | Null
  def isRead(): Boolean
  def isReadOnly(): Boolean
  def isReadWrite(): Boolean
  def isWrite(): Boolean
  def isWriteOnly(): Boolean
}

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint-scope/Reference", "Reference")
@js.native
object Reference extends Instantiable0[Reference] {
  var READ: `1` = js.native
  var RW: `3` = js.native
  var WRITE: `2` = js.native
}

