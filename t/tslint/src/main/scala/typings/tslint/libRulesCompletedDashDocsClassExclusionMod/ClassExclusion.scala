package typings.tslint.libRulesCompletedDashDocsClassExclusionMod

import typings.std.Set
import typings.tslint.libRulesCompletedDashDocsExclusionMod.Exclusion
import typings.tslint.libRulesCompletedDocsRuleMod.Location
import typings.tslint.libRulesCompletedDocsRuleMod.Privacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/classExclusion", "ClassExclusion")
@js.native
class ClassExclusion () extends Exclusion[IClassExclusionDescriptor] {
  val locations: Set[Location] = js.native
  val privacies: Set[Privacy] = js.native
  var shouldLocationBeDocumented: js.Any = js.native
  var shouldPrivacyBeDocumented: js.Any = js.native
}

