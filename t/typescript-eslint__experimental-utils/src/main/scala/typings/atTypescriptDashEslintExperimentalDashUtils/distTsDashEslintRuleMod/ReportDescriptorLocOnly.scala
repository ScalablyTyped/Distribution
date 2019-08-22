package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.LineAndColumnData
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorLocOnly extends js.Object {
  /**
    * An override of the location of the report
    */
  var loc: SourceLocation | LineAndColumnData
}

object ReportDescriptorLocOnly {
  @scala.inline
  def apply(loc: SourceLocation | LineAndColumnData): ReportDescriptorLocOnly = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportDescriptorLocOnly]
  }
}

