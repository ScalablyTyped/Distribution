package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var exprContextCritical: js.UndefOr[scala.Boolean] = js.undefined
  var exprContextRecursive: js.UndefOr[scala.Boolean] = js.undefined
  var exprContextRegExp: js.UndefOr[stdLib.RegExp] = js.undefined
  var exprContextRequest: js.UndefOr[java.lang.String] = js.undefined
  /** A RegExp or an array of RegExps. Don’t parse files matching. */
  var noParse: js.UndefOr[
    stdLib.RegExp | js.Array[stdLib.RegExp] | (js.Function1[/* content */ java.lang.String, scala.Boolean])
  ] = js.undefined
  /** A array of applied post loaders. */
  var postLoaders: js.UndefOr[js.Array[RuleSetRule]] = js.undefined
  /** A array of applied pre loaders. */
  var preLoaders: js.UndefOr[js.Array[RuleSetRule]] = js.undefined
  /** An array of rules applied for modules. */
  var rules: js.Array[RuleSetRule]
  var strictExportPresence: js.UndefOr[scala.Boolean] = js.undefined
  var unknownContextCritical: js.UndefOr[scala.Boolean] = js.undefined
  var unknownContextRecursive: js.UndefOr[scala.Boolean] = js.undefined
  var unknownContextRegExp: js.UndefOr[stdLib.RegExp] = js.undefined
  var unknownContextRequest: js.UndefOr[java.lang.String] = js.undefined
  var wrappedContextCritical: js.UndefOr[scala.Boolean] = js.undefined
  var wrappedContextRecursive: js.UndefOr[scala.Boolean] = js.undefined
  var wrappedContextRegExp: js.UndefOr[stdLib.RegExp] = js.undefined
}

object Module {
  @scala.inline
  def apply(
    rules: js.Array[RuleSetRule],
    exprContextCritical: js.UndefOr[scala.Boolean] = js.undefined,
    exprContextRecursive: js.UndefOr[scala.Boolean] = js.undefined,
    exprContextRegExp: stdLib.RegExp = null,
    exprContextRequest: java.lang.String = null,
    noParse: stdLib.RegExp | js.Array[stdLib.RegExp] | (js.Function1[/* content */ java.lang.String, scala.Boolean]) = null,
    postLoaders: js.Array[RuleSetRule] = null,
    preLoaders: js.Array[RuleSetRule] = null,
    strictExportPresence: js.UndefOr[scala.Boolean] = js.undefined,
    unknownContextCritical: js.UndefOr[scala.Boolean] = js.undefined,
    unknownContextRecursive: js.UndefOr[scala.Boolean] = js.undefined,
    unknownContextRegExp: stdLib.RegExp = null,
    unknownContextRequest: java.lang.String = null,
    wrappedContextCritical: js.UndefOr[scala.Boolean] = js.undefined,
    wrappedContextRecursive: js.UndefOr[scala.Boolean] = js.undefined,
    wrappedContextRegExp: stdLib.RegExp = null
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

