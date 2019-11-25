package typings.validator.validatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsEmailOptions extends js.Object {
  /**
    * If `allow_display_name` is set to `true`, the validator will also match `Display Name <email-address>`.
    *
    * @default false
    */
  var allow_display_name: js.UndefOr[Boolean] = js.undefined
  /**
    * If `allow_ip_domain` is set to `true`, the validator will allow IP addresses in the host part.
    *
    * @default false
    */
  var allow_ip_domain: js.UndefOr[Boolean] = js.undefined
  /**
    * If `allow_utf8_local_part` is set to `false`, the validator will not allow any non-English UTF8 character in email address' local part.
    *
    * @default true
    */
  var allow_utf8_local_part: js.UndefOr[Boolean] = js.undefined
  /**
    * If `domain_specific_validation` is `true`, some additional validation will be enabled,
    * e.g. disallowing certain syntactically valid email addresses that are rejected by GMail.
    *
    * @default false
    */
  var domain_specific_validation: js.UndefOr[Boolean] = js.undefined
  /**
    * If `ignore_max_length` is set to `true`, the validator will not check for the standard max length of an email.
    *
    * @default false
    */
  var ignore_max_length: js.UndefOr[Boolean] = js.undefined
  /**
    * If `require_display_name` is set to `true`, the validator will reject strings without the format `Display Name <email-address>`.
    *
    * @default false
    */
  var require_display_name: js.UndefOr[Boolean] = js.undefined
  /**
    * If `require_tld` is set to `false`, e-mail addresses without having TLD in their domain will also be matched.
    *
    * @default true
    */
  var require_tld: js.UndefOr[Boolean] = js.undefined
}

object IsEmailOptions {
  @scala.inline
  def apply(
    allow_display_name: js.UndefOr[Boolean] = js.undefined,
    allow_ip_domain: js.UndefOr[Boolean] = js.undefined,
    allow_utf8_local_part: js.UndefOr[Boolean] = js.undefined,
    domain_specific_validation: js.UndefOr[Boolean] = js.undefined,
    ignore_max_length: js.UndefOr[Boolean] = js.undefined,
    require_display_name: js.UndefOr[Boolean] = js.undefined,
    require_tld: js.UndefOr[Boolean] = js.undefined
  ): IsEmailOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_display_name)) __obj.updateDynamic("allow_display_name")(allow_display_name.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_ip_domain)) __obj.updateDynamic("allow_ip_domain")(allow_ip_domain.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_utf8_local_part)) __obj.updateDynamic("allow_utf8_local_part")(allow_utf8_local_part.asInstanceOf[js.Any])
    if (!js.isUndefined(domain_specific_validation)) __obj.updateDynamic("domain_specific_validation")(domain_specific_validation.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_max_length)) __obj.updateDynamic("ignore_max_length")(ignore_max_length.asInstanceOf[js.Any])
    if (!js.isUndefined(require_display_name)) __obj.updateDynamic("require_display_name")(require_display_name.asInstanceOf[js.Any])
    if (!js.isUndefined(require_tld)) __obj.updateDynamic("require_tld")(require_tld.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEmailOptions]
  }
}

