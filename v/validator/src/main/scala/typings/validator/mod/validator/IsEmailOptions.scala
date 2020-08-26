package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsEmailOptions extends js.Object {
  /**
    * If `allow_display_name` is set to `true`, the validator will also match `Display Name <email-address>`.
    *
    * @default false
    */
  var allow_display_name: js.UndefOr[Boolean] = js.native
  /**
    * If `allow_ip_domain` is set to `true`, the validator will allow IP addresses in the host part.
    *
    * @default false
    */
  var allow_ip_domain: js.UndefOr[Boolean] = js.native
  /**
    * If `allow_utf8_local_part` is set to `false`, the validator will not allow any non-English UTF8 character in email address' local part.
    *
    * @default true
    */
  var allow_utf8_local_part: js.UndefOr[Boolean] = js.native
  /**
    * If `domain_specific_validation` is `true`, some additional validation will be enabled,
    * e.g. disallowing certain syntactically valid email addresses that are rejected by GMail.
    *
    * @default false
    */
  var domain_specific_validation: js.UndefOr[Boolean] = js.native
  /**
    * If `ignore_max_length` is set to `true`, the validator will not check for the standard max length of an email.
    *
    * @default false
    */
  var ignore_max_length: js.UndefOr[Boolean] = js.native
  /**
    * If `require_display_name` is set to `true`, the validator will reject strings without the format `Display Name <email-address>`.
    *
    * @default false
    */
  var require_display_name: js.UndefOr[Boolean] = js.native
  /**
    * If `require_tld` is set to `false`, e-mail addresses without having TLD in their domain will also be matched.
    *
    * @default true
    */
  var require_tld: js.UndefOr[Boolean] = js.native
}

object IsEmailOptions {
  @scala.inline
  def apply(): IsEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmailOptions]
  }
  @scala.inline
  implicit class IsEmailOptionsOps[Self <: IsEmailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllow_display_name(value: Boolean): Self = this.set("allow_display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_display_name: Self = this.set("allow_display_name", js.undefined)
    @scala.inline
    def setAllow_ip_domain(value: Boolean): Self = this.set("allow_ip_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_ip_domain: Self = this.set("allow_ip_domain", js.undefined)
    @scala.inline
    def setAllow_utf8_local_part(value: Boolean): Self = this.set("allow_utf8_local_part", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_utf8_local_part: Self = this.set("allow_utf8_local_part", js.undefined)
    @scala.inline
    def setDomain_specific_validation(value: Boolean): Self = this.set("domain_specific_validation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain_specific_validation: Self = this.set("domain_specific_validation", js.undefined)
    @scala.inline
    def setIgnore_max_length(value: Boolean): Self = this.set("ignore_max_length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_max_length: Self = this.set("ignore_max_length", js.undefined)
    @scala.inline
    def setRequire_display_name(value: Boolean): Self = this.set("require_display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire_display_name: Self = this.set("require_display_name", js.undefined)
    @scala.inline
    def setRequire_tld(value: Boolean): Self = this.set("require_tld", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire_tld: Self = this.set("require_tld", js.undefined)
  }
  
}

