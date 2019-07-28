package typings.webpack.webpackMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var exprContextCritical: js.UndefOr[Boolean] = js.undefined
  var exprContextRecursive: js.UndefOr[Boolean] = js.undefined
  var exprContextRegExp: js.UndefOr[RegExp] = js.undefined
  var exprContextRequest: js.UndefOr[String] = js.undefined
  /** A RegExp or an array of RegExps. Don’t parse files matching. */
  var noParse: js.UndefOr[RegExp | js.Array[RegExp] | (js.Function1[/* content */ String, Boolean])] = js.undefined
  /** A array of applied post loaders. */
  var postLoaders: js.UndefOr[js.Array[RuleSetRule]] = js.undefined
  /** A array of applied pre loaders. */
  var preLoaders: js.UndefOr[js.Array[RuleSetRule]] = js.undefined
  /** An array of rules applied for modules. */
  var rules: js.Array[RuleSetRule]
  var strictExportPresence: js.UndefOr[Boolean] = js.undefined
  var unknownContextCritical: js.UndefOr[Boolean] = js.undefined
  var unknownContextRecursive: js.UndefOr[Boolean] = js.undefined
  var unknownContextRegExp: js.UndefOr[RegExp] = js.undefined
  var unknownContextRequest: js.UndefOr[String] = js.undefined
  var wrappedContextCritical: js.UndefOr[Boolean] = js.undefined
  var wrappedContextRecursive: js.UndefOr[Boolean] = js.undefined
  var wrappedContextRegExp: js.UndefOr[RegExp] = js.undefined
}

object Module {
  @scala.inline
  def apply(
    rules: js.Array[RuleSetRule],
    exprContextCritical: js.UndefOr[Boolean] = js.undefined,
    exprContextRecursive: js.UndefOr[Boolean] = js.undefined,
    exprContextRegExp: RegExp = null,
    exprContextRequest: String = null,
    noParse: RegExp | js.Array[RegExp] | (js.Function1[/* content */ String, Boolean]) = null,
    postLoaders: js.Array[RuleSetRule] = null,
    preLoaders: js.Array[RuleSetRule] = null,
    strictExportPresence: js.UndefOr[Boolean] = js.undefined,
    unknownContextCritical: js.UndefOr[Boolean] = js.undefined,
    unknownContextRecursive: js.UndefOr[Boolean] = js.undefined,
    unknownContextRegExp: RegExp = null,
    unknownContextRequest: String = null,
    wrappedContextCritical: js.UndefOr[Boolean] = js.undefined,
    wrappedContextRecursive: js.UndefOr[Boolean] = js.undefined,
    wrappedContextRegExp: RegExp = null
  ): Module = {
    val __obj = js.Dynamic.literal(rules = rules)
    if (!js.isUndefined(exprContextCritical)) __obj.updateDynamic("exprContextCritical")(exprContextCritical)
    if (!js.isUndefined(exprContextRecursive)) __obj.updateDynamic("exprContextRecursive")(exprContextRecursive)
    if (exprContextRegExp != null) __obj.updateDynamic("exprContextRegExp")(exprContextRegExp)
    if (exprContextRequest != null) __obj.updateDynamic("exprContextRequest")(exprContextRequest)
    if (noParse != null) __obj.updateDynamic("noParse")(noParse.asInstanceOf[js.Any])
    if (postLoaders != null) __obj.updateDynamic("postLoaders")(postLoaders)
    if (preLoaders != null) __obj.updateDynamic("preLoaders")(preLoaders)
    if (!js.isUndefined(strictExportPresence)) __obj.updateDynamic("strictExportPresence")(strictExportPresence)
    if (!js.isUndefined(unknownContextCritical)) __obj.updateDynamic("unknownContextCritical")(unknownContextCritical)
    if (!js.isUndefined(unknownContextRecursive)) __obj.updateDynamic("unknownContextRecursive")(unknownContextRecursive)
    if (unknownContextRegExp != null) __obj.updateDynamic("unknownContextRegExp")(unknownContextRegExp)
    if (unknownContextRequest != null) __obj.updateDynamic("unknownContextRequest")(unknownContextRequest)
    if (!js.isUndefined(wrappedContextCritical)) __obj.updateDynamic("wrappedContextCritical")(wrappedContextCritical)
    if (!js.isUndefined(wrappedContextRecursive)) __obj.updateDynamic("wrappedContextRecursive")(wrappedContextRecursive)
    if (wrappedContextRegExp != null) __obj.updateDynamic("wrappedContextRegExp")(wrappedContextRegExp)
    __obj.asInstanceOf[Module]
  }
}

