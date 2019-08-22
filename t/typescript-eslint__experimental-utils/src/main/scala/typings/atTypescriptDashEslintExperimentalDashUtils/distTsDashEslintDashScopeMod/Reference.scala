package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeMod

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

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint-scope", "Reference")
@js.native
class ReferenceCls ()
  extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference {
  /* CompleteClass */
  override var from: Scope = js.native
  /* CompleteClass */
  override var identifier: Identifier = js.native
  /* CompleteClass */
  override var init: Boolean = js.native
  /* CompleteClass */
  override var resolved: Variable | Null = js.native
  /* CompleteClass */
  override var writeExpr: Node | Null = js.native
  /* CompleteClass */
  override def isRead(): Boolean = js.native
  /* CompleteClass */
  override def isReadOnly(): Boolean = js.native
  /* CompleteClass */
  override def isReadWrite(): Boolean = js.native
  /* CompleteClass */
  override def isWrite(): Boolean = js.native
  /* CompleteClass */
  override def isWriteOnly(): Boolean = js.native
}

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint-scope", "Reference")
@js.native
object Reference
  extends Instantiable0[
      typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
    ] {
  var READ: `1` = js.native
  var RW: `3` = js.native
  var WRITE: `2` = js.native
}

