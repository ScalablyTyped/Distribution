package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsEmailMod {
  
  @JSImport("validator/lib/isEmail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(str: String, options: IsEmailOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IsEmailOptions extends StObject {
    
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
      *  If blacklisted_chars receives a string, then the validator will reject emails that include
      *  any of the characters in the string, in the name part.
      */
    var blacklisted_chars: js.UndefOr[String] = js.undefined
    
    /**
      * If `domain_specific_validation` is `true`, some additional validation will be enabled,
      * e.g. disallowing certain syntactically valid email addresses that are rejected by GMail.
      *
      * @default false
      */
    var domain_specific_validation: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  If host_blacklist is set to an array of strings
      *  and the part of the email after the @ symbol matches one of the strings defined in it,
      *  the validation fails.
      */
    var host_blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
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
    
    inline def apply(): IsEmailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsEmailOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsEmailOptions] (val x: Self) extends AnyVal {
      
      inline def setAllow_display_name(value: Boolean): Self = StObject.set(x, "allow_display_name", value.asInstanceOf[js.Any])
      
      inline def setAllow_display_nameUndefined: Self = StObject.set(x, "allow_display_name", js.undefined)
      
      inline def setAllow_ip_domain(value: Boolean): Self = StObject.set(x, "allow_ip_domain", value.asInstanceOf[js.Any])
      
      inline def setAllow_ip_domainUndefined: Self = StObject.set(x, "allow_ip_domain", js.undefined)
      
      inline def setAllow_utf8_local_part(value: Boolean): Self = StObject.set(x, "allow_utf8_local_part", value.asInstanceOf[js.Any])
      
      inline def setAllow_utf8_local_partUndefined: Self = StObject.set(x, "allow_utf8_local_part", js.undefined)
      
      inline def setBlacklisted_chars(value: String): Self = StObject.set(x, "blacklisted_chars", value.asInstanceOf[js.Any])
      
      inline def setBlacklisted_charsUndefined: Self = StObject.set(x, "blacklisted_chars", js.undefined)
      
      inline def setDomain_specific_validation(value: Boolean): Self = StObject.set(x, "domain_specific_validation", value.asInstanceOf[js.Any])
      
      inline def setDomain_specific_validationUndefined: Self = StObject.set(x, "domain_specific_validation", js.undefined)
      
      inline def setHost_blacklist(value: js.Array[String]): Self = StObject.set(x, "host_blacklist", value.asInstanceOf[js.Any])
      
      inline def setHost_blacklistUndefined: Self = StObject.set(x, "host_blacklist", js.undefined)
      
      inline def setHost_blacklistVarargs(value: String*): Self = StObject.set(x, "host_blacklist", js.Array(value*))
      
      inline def setIgnore_max_length(value: Boolean): Self = StObject.set(x, "ignore_max_length", value.asInstanceOf[js.Any])
      
      inline def setIgnore_max_lengthUndefined: Self = StObject.set(x, "ignore_max_length", js.undefined)
      
      inline def setRequire_display_name(value: Boolean): Self = StObject.set(x, "require_display_name", value.asInstanceOf[js.Any])
      
      inline def setRequire_display_nameUndefined: Self = StObject.set(x, "require_display_name", js.undefined)
      
      inline def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
      
      inline def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
    }
  }
}
