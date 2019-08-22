package typings.atTypescriptDashEslintExperimentalDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTsDashEslintRuleMod {
  import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.BaseNode
  import typings.std.IterableIterator

  type ReportDescriptor[TMessageIds /* <: String */] = ReportDescriptorBase[TMessageIds] with (ReportDescriptorNodeOptionalLoc | ReportDescriptorLocOnly)
  type ReportFixFunction = js.Function1[
    /* fixer */ RuleFixer, 
    Null | RuleFix | js.Array[RuleFix] | IterableIterator[RuleFix]
  ]
  type RuleFunction[T /* <: BaseNode */] = js.Function1[/* node */ T, Unit]
}
