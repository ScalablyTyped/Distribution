package typings.tslint.blockExclusionMod

import typings.std.Set
import typings.tslint.completedDocsRuleMod.Visibility
import typings.tslint.exclusionMod.Exclusion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/completed-docs/blockExclusion", "BlockExclusion")
@js.native
class BlockExclusion () extends Exclusion[IBlockExclusionDescriptor] {
  
  val visibilities: Set[Visibility] = js.native
}
