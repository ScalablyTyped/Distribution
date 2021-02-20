package typings.tldjs

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Domain extends StObject {
    
    var domain: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
    
    var hostname: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
    
    var isIp: Boolean = js.native
    
    var isValid: ReturnType[js.Function1[/* host */ String, Boolean]] = js.native
    
    var publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
    
    var subdomain: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
    
    var tldExists: ReturnType[js.Function1[/* host */ String, Boolean]] = js.native
  }
  object Domain {
    
    @scala.inline
    def apply(
      domain: ReturnType[js.Function1[/* host */ String, String | Null]],
      hostname: ReturnType[js.Function1[/* host */ String, String | Null]],
      isIp: Boolean,
      isValid: ReturnType[js.Function1[/* host */ String, Boolean]],
      publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]],
      subdomain: ReturnType[js.Function1[/* host */ String, String | Null]],
      tldExists: ReturnType[js.Function1[/* host */ String, Boolean]]
    ): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIp(value: Boolean): Self = StObject.set(x, "isIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValid(value: ReturnType[js.Function1[/* host */ String, Boolean]]): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicSuffix(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "publicSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdomain(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTldExists(value: ReturnType[js.Function1[/* host */ String, Boolean]]): Self = StObject.set(x, "tldExists", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExtractHostname extends StObject {
    
    var extractHostname: js.UndefOr[ReturnType[js.Function1[/* host */ String, String | Null]]] = js.native
    
    var rules: js.UndefOr[js.Any] = js.native
    
    var validHosts: js.UndefOr[js.Array[String]] = js.native
  }
  object ExtractHostname {
    
    @scala.inline
    def apply(): ExtractHostname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractHostname]
    }
    
    @scala.inline
    implicit class ExtractHostnameMutableBuilder[Self <: ExtractHostname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtractHostname(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "extractHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractHostnameUndefined: Self = StObject.set(x, "extractHostname", js.undefined)
      
      @scala.inline
      def setRules(value: js.Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setValidHosts(value: js.Array[String]): Self = StObject.set(x, "validHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidHostsUndefined: Self = StObject.set(x, "validHosts", js.undefined)
      
      @scala.inline
      def setValidHostsVarargs(value: String*): Self = StObject.set(x, "validHosts", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FromUserSettings extends StObject
  
  @js.native
  trait GetDomain extends StObject {
    
    def extractHostname(host: String): String | Null = js.native
    @JSName("extractHostname")
    var extractHostname_Original: js.Function1[/* host */ String, String | Null] = js.native
    
    def fromUserSettings(options: Rules): FromUserSettings = js.native
    @JSName("fromUserSettings")
    var fromUserSettings_Original: js.Function1[/* options */ Rules, FromUserSettings] = js.native
    
    def getDomain(host: String): String | Null = js.native
    @JSName("getDomain")
    var getDomain_Original: js.Function1[/* host */ String, String | Null] = js.native
    
    def getPublicSuffix(host: String): String | Null = js.native
    @JSName("getPublicSuffix")
    var getPublicSuffix_Original: js.Function1[/* host */ String, String | Null] = js.native
    
    def getSubdomain(host: String): String | Null = js.native
    @JSName("getSubdomain")
    var getSubdomain_Original: js.Function1[/* host */ String, String | Null] = js.native
    
    def isValid(host: String): Boolean = js.native
    
    def isValidHostname(host: String): Boolean = js.native
    @JSName("isValidHostname")
    var isValidHostname_Original: js.Function1[/* host */ String, Boolean] = js.native
    
    @JSName("isValid")
    var isValid_Original: js.Function1[/* host */ String, Boolean] = js.native
    
    def parse(host: String): Hostname = js.native
    @JSName("parse")
    var parse_Original: js.Function1[/* host */ String, Hostname] = js.native
    
    def tldExists(host: String): Boolean = js.native
    @JSName("tldExists")
    var tldExists_Original: js.Function1[/* host */ String, Boolean] = js.native
  }
  
  @js.native
  trait Hostname extends StObject {
    
    var domain: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
      ] = js.native
    
    var hostname: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
      ] = js.native
    
    var isIp: Boolean = js.native
    
    var isValid: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
      ] = js.native
    
    var publicSuffix: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
      ] = js.native
    
    var subdomain: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
      ] = js.native
    
    var tldExists: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
      ] = js.native
  }
  object Hostname {
    
    @scala.inline
    def apply(
      domain: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
        ],
      hostname: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
        ],
      isIp: Boolean,
      isValid: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
        ],
      publicSuffix: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
        ],
      subdomain: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
        ],
      tldExists: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
        ]
    ): Hostname = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
            ]
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
            ]
      ): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIp(value: Boolean): Self = StObject.set(x, "isIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValid(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
            ]
      ): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicSuffix(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
            ]
      ): Self = StObject.set(x, "publicSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdomain(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
            ]
      ): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTldExists(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
            ]
      ): Self = StObject.set(x, "tldExists", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rules extends StObject {
    
    var extractHostname: js.UndefOr[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
        ]
      ] = js.native
    
    var rules: js.UndefOr[js.Any] = js.native
    
    var validHosts: js.UndefOr[js.Array[String]] = js.native
  }
  object Rules {
    
    @scala.inline
    def apply(): Rules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rules]
    }
    
    @scala.inline
    implicit class RulesMutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtractHostname(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
            ]
      ): Self = StObject.set(x, "extractHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractHostnameUndefined: Self = StObject.set(x, "extractHostname", js.undefined)
      
      @scala.inline
      def setRules(value: js.Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setValidHosts(value: js.Array[String]): Self = StObject.set(x, "validHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidHostsUndefined: Self = StObject.set(x, "validHosts", js.undefined)
      
      @scala.inline
      def setValidHostsVarargs(value: String*): Self = StObject.set(x, "validHosts", js.Array(value :_*))
    }
  }
}
