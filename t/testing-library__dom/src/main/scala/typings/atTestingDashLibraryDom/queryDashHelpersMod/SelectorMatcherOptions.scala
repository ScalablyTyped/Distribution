package typings.atTestingDashLibraryDom.queryDashHelpersMod

import typings.atTestingDashLibraryDom.matchesMod.MatcherOptions
import typings.atTestingDashLibraryDom.matchesMod.NormalizerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorMatcherOptions extends MatcherOptions {
  var selector: js.UndefOr[String] = js.undefined
}

object SelectorMatcherOptions {
  @scala.inline
  def apply(
    collapseWhitespace: js.UndefOr[Boolean] = js.undefined,
    exact: js.UndefOr[Boolean] = js.undefined,
    normalizer: NormalizerFn = null,
    selector: String = null,
    trim: js.UndefOr[Boolean] = js.undefined
  ): SelectorMatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (normalizer != null) __obj.updateDynamic("normalizer")(normalizer)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[SelectorMatcherOptions]
  }
}

