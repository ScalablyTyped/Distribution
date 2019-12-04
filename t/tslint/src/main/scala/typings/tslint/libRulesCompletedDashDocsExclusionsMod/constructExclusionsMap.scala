package typings.tslint.libRulesCompletedDashDocsExclusionsMod

import typings.std.Map
import typings.tslint.libRulesCompletedDashDocsExclusionDescriptorsMod.IInputExclusionDescriptors
import typings.tslint.libRulesCompletedDocsRuleMod.DocType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusions", "constructExclusionsMap")
@js.native
object constructExclusionsMap extends js.Object {
  def apply(ruleArguments: js.Array[IInputExclusionDescriptors]): Map[DocType, DocTypeExclusions] = js.native
}

