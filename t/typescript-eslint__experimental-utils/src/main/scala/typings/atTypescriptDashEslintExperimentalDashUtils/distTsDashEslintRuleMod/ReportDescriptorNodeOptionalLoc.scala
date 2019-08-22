package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Comment
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.LineAndColumnData
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.SourceLocation
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorNodeOptionalLoc extends js.Object {
  /**
    * An override of the location of the report
    */
  var loc: js.UndefOr[SourceLocation | LineAndColumnData] = js.undefined
  /**
    * The Node or AST Token which the report is being attached to
    */
  var node: Node | Comment | Token
}

object ReportDescriptorNodeOptionalLoc {
  @scala.inline
  def apply(node: Node | Comment | Token, loc: SourceLocation | LineAndColumnData = null): ReportDescriptorNodeOptionalLoc = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorNodeOptionalLoc]
  }
}

