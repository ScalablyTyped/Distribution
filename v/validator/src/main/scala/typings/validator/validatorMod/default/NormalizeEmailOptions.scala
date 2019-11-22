package typings.validator.validatorMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizeEmailOptions extends js.Object {
  /**
    * Transforms the local part (before the @ symbol) of all email addresses to lowercase.
    * Please note that this may violate RFC 5321, which gives providers the possibility
    * to treat the local part of email addresses in a case sensitive way
    * (although in practice most - yet not all - providers don't).
    * The domain part of the email address is always lowercased, as it's case insensitive per RFC 1035.
    *
    * @default true
    */
  var all_lowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * Converts addresses with domain `@googlemail.com` to `@gmail.com`, as they're equivalent.
    *
    * @default true
    */
  var gmail_convert_googlemaildotcom: js.UndefOr[Boolean] = js.undefined
  /**
    * GMail addresses are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, GMail addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var gmail_lowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * Removes dots from the local part of the email address, as GMail ignores them
    * (e.g. `"john.doe"` and `"johndoe"` are considered equal).
    *
    * @default true
    */
  var gmail_remove_dots: js.UndefOr[Boolean] = js.undefined
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"+"` sign
    * (e.g. `"foo+bar@gmail.com"` becomes `"foo@gmail.com"`).
    *
    * @default true
    */
  var gmail_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  /**
    * iCloud addresses (including MobileMe) are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, iCloud addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var icloud_lowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"+"` sign
    * (e.g. `"foo+bar@icloud.com"` becomes `"foo@icloud.com"`).
    *
    * @default true
    */
  var icloud_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  /**
    * Outlook.com addresses (including Windows Live and Hotmail) are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, Outlook.com addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var outlookdotcom_lowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"+"` sign
    * (e.g. `"foo+bar@outlook.com"` becomes `"foo@outlook.com"`).
    *
    * @default true
    */
  var outlookdotcom_remove_subaddress: js.UndefOr[Boolean] = js.undefined
  /**
    * Yahoo Mail addresses are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, Yahoo Mail addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var yahoo_lowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"-"` sign
    * (e.g. `"foo-bar@yahoo.com"` becomes `"foo@yahoo.com"`).
    *
    * @default true
    */
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

