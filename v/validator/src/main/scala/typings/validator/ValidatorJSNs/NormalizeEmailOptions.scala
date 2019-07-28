package typings.validator.ValidatorJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for normalizeEmail
trait NormalizeEmailOptions extends js.Object {
  var all_lowercase: js.UndefOr[Boolean] = js.undefined
  var gmail_convert_googlemaildotcom: js.UndefOr[Boolean] = js.undefined
  var gmail_lowercase: js.UndefOr[Boolean] = js.undefined
  var gmail_remove_dots: js.UndefOr[Boolean] = js.undefined
  var gmail_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  var icloud_lowercase: js.UndefOr[Boolean] = js.undefined
  var icloud_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  var outlookdotcom_lowercase: js.UndefOr[Boolean] = js.undefined
  var outlookdotcom_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  var yahoo_lowercase: js.UndefOr[Boolean] = js.undefined
  var yahoo_remove_subaddress: js.UndefOr[Boolean] = js.undefined
}

object NormalizeEmailOptions {
  @scala.inline
  def apply(
    all_lowercase: js.UndefOr[Boolean] = js.undefined,
    gmail_convert_googlemaildotcom: js.UndefOr[Boolean] = js.undefined,
    gmail_lowercase: js.UndefOr[Boolean] = js.undefined,
    gmail_remove_dots: js.UndefOr[Boolean] = js.undefined,
    gmail_remove_subaddress: js.UndefOr[Boolean] = js.undefined,
    icloud_lowercase: js.UndefOr[Boolean] = js.undefined,
    icloud_remove_subaddress: js.UndefOr[Boolean] = js.undefined,
    outlookdotcom_lowercase: js.UndefOr[Boolean] = js.undefined,
    outlookdotcom_remove_subaddress: js.UndefOr[Boolean] = js.undefined,
    yahoo_lowercase: js.UndefOr[Boolean] = js.undefined,
    yahoo_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  ): NormalizeEmailOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all_lowercase)) __obj.updateDynamic("all_lowercase")(all_lowercase)
    if (!js.isUndefined(gmail_convert_googlemaildotcom)) __obj.updateDynamic("gmail_convert_googlemaildotcom")(gmail_convert_googlemaildotcom)
    if (!js.isUndefined(gmail_lowercase)) __obj.updateDynamic("gmail_lowercase")(gmail_lowercase)
    if (!js.isUndefined(gmail_remove_dots)) __obj.updateDynamic("gmail_remove_dots")(gmail_remove_dots)
    if (!js.isUndefined(gmail_remove_subaddress)) __obj.updateDynamic("gmail_remove_subaddress")(gmail_remove_subaddress)
    if (!js.isUndefined(icloud_lowercase)) __obj.updateDynamic("icloud_lowercase")(icloud_lowercase)
    if (!js.isUndefined(icloud_remove_subaddress)) __obj.updateDynamic("icloud_remove_subaddress")(icloud_remove_subaddress)
    if (!js.isUndefined(outlookdotcom_lowercase)) __obj.updateDynamic("outlookdotcom_lowercase")(outlookdotcom_lowercase)
    if (!js.isUndefined(outlookdotcom_remove_subaddress)) __obj.updateDynamic("outlookdotcom_remove_subaddress")(outlookdotcom_remove_subaddress)
    if (!js.isUndefined(yahoo_lowercase)) __obj.updateDynamic("yahoo_lowercase")(yahoo_lowercase)
    if (!js.isUndefined(yahoo_remove_subaddress)) __obj.updateDynamic("yahoo_remove_subaddress")(yahoo_remove_subaddress)
    __obj.asInstanceOf[NormalizeEmailOptions]
  }
}

