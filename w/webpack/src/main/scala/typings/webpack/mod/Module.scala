package typings.webpack.mod

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
    strictExportPresence: js.UndefOr[Boolean] = js.undefined,
    unknownContextCritical: js.UndefOr[Boolean] = js.undefined,
    unknownContextRecursive: js.UndefOr[Boolean] = js.undefined,
    unknownContextRegExp: RegExp = null,
    unknownContextRequest: String = null,
    wrappedContextCritical: js.UndefOr[Boolean] = js.undefined,
    wrappedContextRecursive: js.UndefOr[Boolean] = js.undefined,
    wrappedContextRegExp: RegExp = null
  ): Module = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    if (!js.isUndefined(exprContextCritical)) __obj.updateDynamic("exprContextCritical")(exprContextCritical.asInstanceOf[js.Any])
    if (!js.isUndefined(exprContextRecursive)) __obj.updateDynamic("exprContextRecursive")(exprContextRecursive.asInstanceOf[js.Any])
    if (exprContextRegExp != null) __obj.updateDynamic("exprContextRegExp")(exprContextRegExp.asInstanceOf[js.Any])
    if (exprContextRequest != null) __obj.updateDynamic("exprContextRequest")(exprContextRequest.asInstanceOf[js.Any])
    if (noParse != null) __obj.updateDynamic("noParse")(noParse.asInstanceOf[js.Any])
    if (!js.isUndefined(strictExportPresence)) __obj.updateDynamic("strictExportPresence")(strictExportPresence.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownContextCritical)) __obj.updateDynamic("unknownContextCritical")(unknownContextCritical.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownContextRecursive)) __obj.updateDynamic("unknownContextRecursive")(unknownContextRecursive.asInstanceOf[js.Any])
    if (unknownContextRegExp != null) __obj.updateDynamic("unknownContextRegExp")(unknownContextRegExp.asInstanceOf[js.Any])
    if (unknownContextRequest != null) __obj.updateDynamic("unknownContextRequest")(unknownContextRequest.asInstanceOf[js.Any])
    if (!js.isUndefined(wrappedContextCritical)) __obj.updateDynamic("wrappedContextCritical")(wrappedContextCritical.asInstanceOf[js.Any])
    if (!js.isUndefined(wrappedContextRecursive)) __obj.updateDynamic("wrappedContextRecursive")(wrappedContextRecursive.asInstanceOf[js.Any])
    if (wrappedContextRegExp != null) __obj.updateDynamic("wrappedContextRegExp")(wrappedContextRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

