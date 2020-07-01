package typings.testingLibraryDom.queryHelpersMod

import typings.testingLibraryDom.matchesMod.MatcherOptions
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
    normalizer: /* text */ String => String = null,
    selector: String = null,
    suggest: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): SelectorMatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(js.Any.fromFunction1(normalizer))
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(suggest)) __obj.updateDynamic("suggest")(suggest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorMatcherOptions]
  }
}

