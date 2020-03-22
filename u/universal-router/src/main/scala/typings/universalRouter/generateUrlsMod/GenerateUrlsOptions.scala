package typings.universalRouter.generateUrlsMod

import typings.pathToRegexp.mod.Key
import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.TokensToFunctionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateUrlsOptions
  extends ParseOptions
     with TokensToFunctionOptions {
  /**
    * Add a query string to generated url based on unknown route params.
    */
  var stringifyQueryParams: js.UndefOr[js.Function1[/* params */ UrlParams, String]] = js.undefined
}

object GenerateUrlsOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    encode: (/* value */ String, /* token */ Key) => String = null,
    prefixes: String = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    stringifyQueryParams: /* params */ UrlParams => String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): GenerateUrlsOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction2(encode))
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (stringifyQueryParams != null) __obj.updateDynamic("stringifyQueryParams")(js.Any.fromFunction1(stringifyQueryParams))
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateUrlsOptions]
  }
}

