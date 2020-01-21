package typings.tslint.exclusionsMod

import typings.std.Map
import typings.tslint.completedDocsRuleMod.DocType
import typings.tslint.exclusionDescriptorsMod.IInputExclusionDescriptors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusions", "constructExclusionsMap")
@js.native
object constructExclusionsMap extends js.Object {
  def apply(ruleArguments: js.Array[IInputExclusionDescriptors]): Map[DocType, DocTypeExclusions] = js.native
}

