package typings.testingLibraryDom.queriesMod

import typings.std.Element
import typings.std.RegExp
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
  /**
    * Only considers  elements with the specified accessible name.
    */
  var name: js.UndefOr[
    String | RegExp | (js.Function2[/* accessibleName */ String, /* element */ Element, Boolean])
  ] = js.undefined
  /**
    * Includes every role used in the `role` attribute
    * For example *ByRole('progressbar', {queryFallbacks: true})` will find <div role="meter progresbar">`.
    */
  var queryFallbacks: js.UndefOr[Boolean] = js.undefined
}

object ByRoleOptions {
  @scala.inline
  def apply(
    collapseWhitespace: js.UndefOr[Boolean] = js.undefined,
    exact: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    name: String | RegExp | (js.Function2[/* accessibleName */ String, /* element */ Element, Boolean]) = null,
    normalizer: /* text */ String => String = null,
    queryFallbacks: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): ByRoleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(js.Any.fromFunction1(normalizer))
    if (!js.isUndefined(queryFallbacks)) __obj.updateDynamic("queryFallbacks")(queryFallbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByRoleOptions]
  }
}

