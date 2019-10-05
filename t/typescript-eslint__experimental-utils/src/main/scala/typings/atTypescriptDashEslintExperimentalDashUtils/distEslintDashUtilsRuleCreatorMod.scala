package typings.atTypescriptDashEslintExperimentalDashUtils

import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.docs
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.url
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleListener
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleMetaData
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleMetaDataDocs
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleModule
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils/dist/eslint-utils/RuleCreator", JSImport.Namespace)
@js.native
object distEslintDashUtilsRuleCreatorMod extends js.Object {
  def RuleCreator(urlCreator: js.Function1[/* ruleName */ String, String]): js.Function1[
    /* hasNameMetaDefaultOptionsCreate */ Anon_Context[String, js.Array[_], RuleListener], 
    RuleModule[String, js.Array[_], RuleListener]
  ] = js.native
  type CreateRuleMeta[TMessageIds /* <: String */] = Anon_Docs with (Omit[RuleMetaData[TMessageIds], docs])
  type CreateRuleMetaDocs = Omit[RuleMetaDataDocs, url]
}

