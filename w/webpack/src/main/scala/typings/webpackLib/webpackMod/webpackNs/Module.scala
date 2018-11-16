package typings
package webpackLib.webpackMod.webpackNs

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

