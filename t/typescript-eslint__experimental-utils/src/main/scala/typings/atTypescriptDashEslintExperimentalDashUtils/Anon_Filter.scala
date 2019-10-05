package typings.atTypescriptDashEslintExperimentalDashUtils

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode.FilterPredicate
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Comment
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[FilterPredicate] = js.undefined
  var includeComments: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: /* tokenOrComment */ Token | Comment => Boolean = null,
    includeComments: js.UndefOr[Boolean] = js.undefined,
    skip: Int | Double = null
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Filter]
  }
}

