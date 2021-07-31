package typings.validator.mod.validator

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsURLOptions extends StObject {
  
  /**
    * @default false
    */
  var allow_protocol_relative_urls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var allow_trailing_dot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var allow_underscores: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var disallow_auth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var host_blacklist: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  
  /**
    * @default false
    */
  var host_whitelist: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  
  /**
    * @default ['http','https','ftp']
    */
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @default true
    */
  var require_host: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var require_protocol: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default true
    */
  var require_tld: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default true
    */
  var require_valid_protocol: js.UndefOr[Boolean] = js.undefined
}
object IsURLOptions {
  
  @scala.inline
  def apply(): IsURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsURLOptions]
  }
  
  @scala.inline
  implicit class IsURLOptionsMutableBuilder[Self <: IsURLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_protocol_relative_urls(value: Boolean): Self = StObject.set(x, "allow_protocol_relative_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_protocol_relative_urlsUndefined: Self = StObject.set(x, "allow_protocol_relative_urls", js.undefined)
    
    @scala.inline
    def setAllow_trailing_dot(value: Boolean): Self = StObject.set(x, "allow_trailing_dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_trailing_dotUndefined: Self = StObject.set(x, "allow_trailing_dot", js.undefined)
    
    @scala.inline
    def setAllow_underscores(value: Boolean): Self = StObject.set(x, "allow_underscores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_underscoresUndefined: Self = StObject.set(x, "allow_underscores", js.undefined)
    
    @scala.inline
    def setDisallow_auth(value: Boolean): Self = StObject.set(x, "disallow_auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallow_authUndefined: Self = StObject.set(x, "disallow_auth", js.undefined)
    
    @scala.inline
    def setHost_blacklist(value: js.Array[String | RegExp]): Self = StObject.set(x, "host_blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost_blacklistUndefined: Self = StObject.set(x, "host_blacklist", js.undefined)
    
    @scala.inline
    def setHost_blacklistVarargs(value: (String | RegExp)*): Self = StObject.set(x, "host_blacklist", js.Array(value :_*))
    
    @scala.inline
    def setHost_whitelist(value: js.Array[String | RegExp]): Self = StObject.set(x, "host_whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost_whitelistUndefined: Self = StObject.set(x, "host_whitelist", js.undefined)
    
    @scala.inline
    def setHost_whitelistVarargs(value: (String | RegExp)*): Self = StObject.set(x, "host_whitelist", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    
    @scala.inline
    def setRequire_host(value: Boolean): Self = StObject.set(x, "require_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_hostUndefined: Self = StObject.set(x, "require_host", js.undefined)
    
    @scala.inline
    def setRequire_protocol(value: Boolean): Self = StObject.set(x, "require_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_protocolUndefined: Self = StObject.set(x, "require_protocol", js.undefined)
    
    @scala.inline
    def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
    
    @scala.inline
    def setRequire_valid_protocol(value: Boolean): Self = StObject.set(x, "require_valid_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_valid_protocolUndefined: Self = StObject.set(x, "require_valid_protocol", js.undefined)
  }
}
