package typings.tslint.constructorExclusionMod

import typings.std.Set
import typings.tslint.completedDocsRuleMod.Privacy
import typings.tslint.exclusionMod.Exclusion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/constructorExclusion", "ConstructorExclusion")
@js.native
class ConstructorExclusion () extends Exclusion[IConstructorExclusionDescriptor] {
  val privacies: Set[Privacy] = js.native
}

