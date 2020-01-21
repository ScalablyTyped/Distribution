package typings.testingLibraryDom.queriesMod

import typings.testingLibraryDom.matchesMod.MatcherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByRoleOptions extends MatcherOptions {
  /**
    * If true includes elements in the query set that are usually excluded from
    * the accessibility tree. `role="none"` or `role="presentation"` are included
    * in either case.
    * @default false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
}

object ByRoleOptions {
  @scala.inline
  def apply(
    collapseWhitespace: js.UndefOr[Boolean] = js.undefined,
    exact: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    normalizer: /* text */ String => String = null,
    trim: js.UndefOr[Boolean] = js.undefined
  ): ByRoleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(js.Any.fromFunction1(normalizer))
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByRoleOptions]
  }
}

