package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var all_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Converts addresses with domain `@googlemail.com` to `@gmail.com`, as they're equivalent.
    *
    * @default true
    */
  var gmail_convert_googlemaildotcom: js.UndefOr[Boolean] = js.native
  /**
    * GMail addresses are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, GMail addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var gmail_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Removes dots from the local part of the email address, as GMail ignores them
    * (e.g. `"john.doe"` and `"johndoe"` are considered equal).
    *
    * @default true
    */
  var gmail_remove_dots: js.UndefOr[Boolean] = js.native
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"+"` sign
    * (e.g. `"foo+bar@gmail.com"` becomes `"foo@gmail.com"`).
    *
    * @default true
    */
  var gmail_remove_subaddress: js.UndefOr[Boolean] = js.native
  /**
    * iCloud addresses (including MobileMe) are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, iCloud addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var icloud_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"+"` sign
    * (e.g. `"foo+bar@icloud.com"` becomes `"foo@icloud.com"`).
    *
    * @default true
    */
  var icloud_remove_subaddress: js.UndefOr[Boolean] = js.native
  /**
    * Outlook.com addresses (including Windows Live and Hotmail) are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, Outlook.com addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var outlookdotcom_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"+"` sign
    * (e.g. `"foo+bar@outlook.com"` becomes `"foo@outlook.com"`).
    *
    * @default true
    */
  var outlookdotcom_remove_subaddress: js.UndefOr[Boolean] = js.native
  /**
    * Yahoo Mail addresses are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, Yahoo Mail addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var yahoo_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"-"` sign
    * (e.g. `"foo-bar@yahoo.com"` becomes `"foo@yahoo.com"`).
    *
    * @default true
    */
  var yahoo_remove_subaddress: js.UndefOr[Boolean] = js.native
}

object NormalizeEmailOptions {
  @scala.inline
  def apply(): NormalizeEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeEmailOptions]
  }
  @scala.inline
  implicit class NormalizeEmailOptionsOps[Self <: NormalizeEmailOptions] (val x: Self) extends AnyVal {
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
    def setAll_lowercase(value: Boolean): Self = this.set("all_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll_lowercase: Self = this.set("all_lowercase", js.undefined)
    @scala.inline
    def setGmail_convert_googlemaildotcom(value: Boolean): Self = this.set("gmail_convert_googlemaildotcom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmail_convert_googlemaildotcom: Self = this.set("gmail_convert_googlemaildotcom", js.undefined)
    @scala.inline
    def setGmail_lowercase(value: Boolean): Self = this.set("gmail_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmail_lowercase: Self = this.set("gmail_lowercase", js.undefined)
    @scala.inline
    def setGmail_remove_dots(value: Boolean): Self = this.set("gmail_remove_dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmail_remove_dots: Self = this.set("gmail_remove_dots", js.undefined)
    @scala.inline
    def setGmail_remove_subaddress(value: Boolean): Self = this.set("gmail_remove_subaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmail_remove_subaddress: Self = this.set("gmail_remove_subaddress", js.undefined)
    @scala.inline
    def setIcloud_lowercase(value: Boolean): Self = this.set("icloud_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcloud_lowercase: Self = this.set("icloud_lowercase", js.undefined)
    @scala.inline
    def setIcloud_remove_subaddress(value: Boolean): Self = this.set("icloud_remove_subaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcloud_remove_subaddress: Self = this.set("icloud_remove_subaddress", js.undefined)
    @scala.inline
    def setOutlookdotcom_lowercase(value: Boolean): Self = this.set("outlookdotcom_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlookdotcom_lowercase: Self = this.set("outlookdotcom_lowercase", js.undefined)
    @scala.inline
    def setOutlookdotcom_remove_subaddress(value: Boolean): Self = this.set("outlookdotcom_remove_subaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlookdotcom_remove_subaddress: Self = this.set("outlookdotcom_remove_subaddress", js.undefined)
    @scala.inline
    def setYahoo_lowercase(value: Boolean): Self = this.set("yahoo_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYahoo_lowercase: Self = this.set("yahoo_lowercase", js.undefined)
    @scala.inline
    def setYahoo_remove_subaddress(value: Boolean): Self = this.set("yahoo_remove_subaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYahoo_remove_subaddress: Self = this.set("yahoo_remove_subaddress", js.undefined)
  }
  
}

