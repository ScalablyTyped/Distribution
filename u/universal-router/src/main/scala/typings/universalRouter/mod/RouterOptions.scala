package typings.universalRouter.mod

import typings.pathToRegexp.mod.Key
import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.RegexpToFunctionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.pathToRegexp.mod.TokensToRegexpOptions because var conflicts: delimiter. Inlined encode, end, endsWith, sensitive, start, strict */ trait RouterOptions[R, C /* <: RouterContext */]
  extends ParseOptions
     with RegexpToFunctionOptions {
  var baseUrl: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[C] = js.undefined
  /**
    * Encode path tokens for use in the `RegExp`.
    */
  var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  /**
    * When `true` the regexp will match to the end of the string. (default: `true`)
    */
  var end: js.UndefOr[Boolean] = js.undefined
  /**
    * List of characters that can also be "end" characters.
    */
  var endsWith: js.UndefOr[String] = js.undefined
  var errorHandler: js.UndefOr[ErrorHandler[R]] = js.undefined
  var resolveRoute: js.UndefOr[ResolveRoute[R, C]] = js.undefined
  /**
    * When `true` the regexp will be case sensitive. (default: `false`)
    */
  var sensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true` the regexp will match from the beginning of the string. (default: `true`)
    */
  var start: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true` the regexp allows an optional trailing delimiter to match. (default: `false`)
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply[R, /* <: typings.universalRouter.mod.RouterContext */ C](
    baseUrl: String = null,
    context: C = null,
    decode: (/* value */ String, /* token */ Key) => String = null,
    delimiter: String = null,
    encode: /* value */ String => String = null,
    end: js.UndefOr[Boolean] = js.undefined,
    endsWith: String = null,
    errorHandler: (/* error */ RouteError, /* context */ ResolveContext) => RouteResult[R] = null,
    prefixes: String = null,
    resolveRoute: (/* context */ RouteContext[R, C], /* params */ RouteParams) => RouteResult[R] = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    start: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RouterOptions[R, C] = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (decode != null) __obj.updateDynamic("decode")(js.Any.fromFunction2(decode))
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1(encode))
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (endsWith != null) __obj.updateDynamic("endsWith")(endsWith.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction2(errorHandler))
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    if (resolveRoute != null) __obj.updateDynamic("resolveRoute")(js.Any.fromFunction2(resolveRoute))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions[R, C]]
  }
}

