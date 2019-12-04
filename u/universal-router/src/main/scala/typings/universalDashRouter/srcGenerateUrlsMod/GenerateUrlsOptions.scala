package typings.universalDashRouter.srcGenerateUrlsMod

import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.Key
import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.ParseOptions
import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.PathFunctionOptions
import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.TokensToFunctionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateUrlsOptions
  extends PathFunctionOptions
     with TokensToFunctionOptions
     with ParseOptions {
  var stringifyQueryParams: js.UndefOr[js.Function1[/* params */ Params, String]] = js.undefined
}

object GenerateUrlsOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    encode: (/* value */ String, /* token */ Key) => String = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    stringifyQueryParams: /* params */ Params => String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): GenerateUrlsOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction2(encode))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (stringifyQueryParams != null) __obj.updateDynamic("stringifyQueryParams")(js.Any.fromFunction1(stringifyQueryParams))
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateUrlsOptions]
  }
}

