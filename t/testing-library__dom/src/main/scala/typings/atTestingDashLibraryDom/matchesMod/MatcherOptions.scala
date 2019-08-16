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
    normalizer: NormalizerFn = null,
    trim: js.UndefOr[Boolean] = js.undefined
  ): MatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (normalizer != null) __obj.updateDynamic("normalizer")(normalizer)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[MatcherOptions]
  }
}

