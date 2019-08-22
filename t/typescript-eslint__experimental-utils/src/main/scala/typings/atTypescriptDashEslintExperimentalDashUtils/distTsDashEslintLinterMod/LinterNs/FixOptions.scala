package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.LinterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixOptions extends LintOptions {
  var fix: js.UndefOr[Boolean] = js.undefined
}

object FixOptions {
  @scala.inline
  def apply(
    allowInlineConfig: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    postprocess: /* problemLists */ js.Array[js.Array[LintMessage]] => js.Array[LintMessage] = null,
    preprocess: /* code */ String => js.Array[String] = null,
    reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.undefined
  ): FixOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInlineConfig)) __obj.updateDynamic("allowInlineConfig")(allowInlineConfig)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix)
    if (postprocess != null) __obj.updateDynamic("postprocess")(js.Any.fromFunction1(postprocess))
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction1(preprocess))
    if (!js.isUndefined(reportUnusedDisableDirectives)) __obj.updateDynamic("reportUnusedDisableDirectives")(reportUnusedDisableDirectives)
    __obj.asInstanceOf[FixOptions]
  }
}

