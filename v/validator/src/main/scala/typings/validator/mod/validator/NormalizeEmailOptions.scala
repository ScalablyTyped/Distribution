package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizeEmailOptions extends StObject {
  
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
  
  inline def apply(): NormalizeEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeEmailOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizeEmailOptions] (val x: Self) extends AnyVal {
    
    inline def setAll_lowercase(value: Boolean): Self = StObject.set(x, "all_lowercase", value.asInstanceOf[js.Any])
    
    inline def setAll_lowercaseUndefined: Self = StObject.set(x, "all_lowercase", js.undefined)
    
    inline def setGmail_convert_googlemaildotcom(value: Boolean): Self = StObject.set(x, "gmail_convert_googlemaildotcom", value.asInstanceOf[js.Any])
    
    inline def setGmail_convert_googlemaildotcomUndefined: Self = StObject.set(x, "gmail_convert_googlemaildotcom", js.undefined)
    
    inline def setGmail_lowercase(value: Boolean): Self = StObject.set(x, "gmail_lowercase", value.asInstanceOf[js.Any])
    
    inline def setGmail_lowercaseUndefined: Self = StObject.set(x, "gmail_lowercase", js.undefined)
    
    inline def setGmail_remove_dots(value: Boolean): Self = StObject.set(x, "gmail_remove_dots", value.asInstanceOf[js.Any])
    
    inline def setGmail_remove_dotsUndefined: Self = StObject.set(x, "gmail_remove_dots", js.undefined)
    
    inline def setGmail_remove_subaddress(value: Boolean): Self = StObject.set(x, "gmail_remove_subaddress", value.asInstanceOf[js.Any])
    
    inline def setGmail_remove_subaddressUndefined: Self = StObject.set(x, "gmail_remove_subaddress", js.undefined)
    
    inline def setIcloud_lowercase(value: Boolean): Self = StObject.set(x, "icloud_lowercase", value.asInstanceOf[js.Any])
    
    inline def setIcloud_lowercaseUndefined: Self = StObject.set(x, "icloud_lowercase", js.undefined)
    
    inline def setIcloud_remove_subaddress(value: Boolean): Self = StObject.set(x, "icloud_remove_subaddress", value.asInstanceOf[js.Any])
    
    inline def setIcloud_remove_subaddressUndefined: Self = StObject.set(x, "icloud_remove_subaddress", js.undefined)
    
    inline def setOutlookdotcom_lowercase(value: Boolean): Self = StObject.set(x, "outlookdotcom_lowercase", value.asInstanceOf[js.Any])
    
    inline def setOutlookdotcom_lowercaseUndefined: Self = StObject.set(x, "outlookdotcom_lowercase", js.undefined)
    
    inline def setOutlookdotcom_remove_subaddress(value: Boolean): Self = StObject.set(x, "outlookdotcom_remove_subaddress", value.asInstanceOf[js.Any])
    
    inline def setOutlookdotcom_remove_subaddressUndefined: Self = StObject.set(x, "outlookdotcom_remove_subaddress", js.undefined)
    
    inline def setYahoo_lowercase(value: Boolean): Self = StObject.set(x, "yahoo_lowercase", value.asInstanceOf[js.Any])
    
    inline def setYahoo_lowercaseUndefined: Self = StObject.set(x, "yahoo_lowercase", js.undefined)
    
    inline def setYahoo_remove_subaddress(value: Boolean): Self = StObject.set(x, "yahoo_remove_subaddress", value.asInstanceOf[js.Any])
    
    inline def setYahoo_remove_subaddressUndefined: Self = StObject.set(x, "yahoo_remove_subaddress", js.undefined)
  }
}
