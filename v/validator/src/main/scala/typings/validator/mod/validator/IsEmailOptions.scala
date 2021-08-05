package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  inline def apply(): IsEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmailOptions]
  }
  
  extension [Self <: IsEmailOptions](x: Self) {
    
    inline def setAllow_display_name(value: Boolean): Self = StObject.set(x, "allow_display_name", value.asInstanceOf[js.Any])
    
    inline def setAllow_display_nameUndefined: Self = StObject.set(x, "allow_display_name", js.undefined)
    
    inline def setAllow_ip_domain(value: Boolean): Self = StObject.set(x, "allow_ip_domain", value.asInstanceOf[js.Any])
    
    inline def setAllow_ip_domainUndefined: Self = StObject.set(x, "allow_ip_domain", js.undefined)
    
    inline def setAllow_utf8_local_part(value: Boolean): Self = StObject.set(x, "allow_utf8_local_part", value.asInstanceOf[js.Any])
    
    inline def setAllow_utf8_local_partUndefined: Self = StObject.set(x, "allow_utf8_local_part", js.undefined)
    
    inline def setDomain_specific_validation(value: Boolean): Self = StObject.set(x, "domain_specific_validation", value.asInstanceOf[js.Any])
    
    inline def setDomain_specific_validationUndefined: Self = StObject.set(x, "domain_specific_validation", js.undefined)
    
    inline def setIgnore_max_length(value: Boolean): Self = StObject.set(x, "ignore_max_length", value.asInstanceOf[js.Any])
    
    inline def setIgnore_max_lengthUndefined: Self = StObject.set(x, "ignore_max_length", js.undefined)
    
    inline def setRequire_display_name(value: Boolean): Self = StObject.set(x, "require_display_name", value.asInstanceOf[js.Any])
    
    inline def setRequire_display_nameUndefined: Self = StObject.set(x, "require_display_name", js.undefined)
    
    inline def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
    
    inline def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
  }
}
