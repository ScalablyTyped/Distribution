package typings.tslint.libRulesCompletedDashDocsBlockExclusionMod

import typings.std.Set
import typings.tslint.libRulesCompletedDashDocsExclusionMod.Exclusion
import typings.tslint.libRulesCompletedDocsRuleMod.Visibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/blockExclusion", "BlockExclusion")
@js.native
class BlockExclusion () extends Exclusion[IBlockExclusionDescriptor] {
  val visibilities: Set[Visibility] = js.native
}

