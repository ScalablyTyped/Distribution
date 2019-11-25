package typings.atTestingDashLibraryDom.matchesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherOptions extends js.Object {
  /** Use normalizer with getDefaultNormalizer instead */
  var collapseWhitespace: js.UndefOr[Boolean] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var normalizer: js.UndefOr[NormalizerFn] = js.undefined
  /** Use normalizer with getDefaultNormalizer instead */
  var trim: js.UndefOr[Boolean] = js.undefined
}

object MatcherOptions {
  @scala.inline
  def apply(
    collapseWhitespace: js.UndefOr[Boolean] = js.undefined,
    exact: js.UndefOr[Boolean] = js.undefined,
    normalizer: /* text */ String => String = null,
    trim: js.UndefOr[Boolean] = js.undefined
  ): MatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(js.Any.fromFunction1(normalizer))
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherOptions]
  }
}

