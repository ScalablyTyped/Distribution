package typings.atTypescriptDashEslintExperimentalDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEslintDashUtilsRuleCreatorMod {
  import typings.atTypescriptDashEslintExperimentalDashUtils.Anon_Docs
  import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.docs
  import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.url
  import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleMetaData
  import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleMetaDataDocs
  import typings.std.Omit

  type CreateRuleMeta[TMessageIds /* <: String */] = Anon_Docs with (Omit[RuleMetaData[TMessageIds], docs])
  type CreateRuleMetaDocs = Omit[RuleMetaDataDocs, url]
}
