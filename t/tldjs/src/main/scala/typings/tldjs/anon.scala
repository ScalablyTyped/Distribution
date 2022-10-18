package typings.tldjs

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Domain extends StObject {
    
    var domain: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
      ]
    
    var hostname: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
      ]
    
    var isIp: Boolean
    
    var isValid: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
      ]
    
    var publicSuffix: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
      ]
    
    var subdomain: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
      ]
    
    var tldExists: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
      ]
  }
  object Domain {
    
    inline def apply(
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
    ): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setDomain(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
            ]
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setHostname(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
            ]
      ): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setIsIp(value: Boolean): Self = StObject.set(x, "isIp", value.asInstanceOf[js.Any])
      
      inline def setIsValid(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
            ]
      ): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setPublicSuffix(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
            ]
      ): Self = StObject.set(x, "publicSuffix", value.asInstanceOf[js.Any])
      
      inline def setSubdomain(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
            ]
      ): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setTldExists(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
            ]
      ): Self = StObject.set(x, "tldExists", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtractHostname extends StObject {
    
    var extractHostname: js.UndefOr[ReturnType[js.Function1[/* host */ String, String | Null]]] = js.undefined
    
    var rules: js.UndefOr[Any] = js.undefined
    
    var validHosts: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ExtractHostname {
    
    inline def apply(): ExtractHostname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractHostname]
    }
    
    extension [Self <: ExtractHostname](x: Self) {
      
      inline def setExtractHostname(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "extractHostname", value.asInstanceOf[js.Any])
      
      inline def setExtractHostnameUndefined: Self = StObject.set(x, "extractHostname", js.undefined)
      
      inline def setRules(value: Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setValidHosts(value: js.Array[String]): Self = StObject.set(x, "validHosts", value.asInstanceOf[js.Any])
      
      inline def setValidHostsUndefined: Self = StObject.set(x, "validHosts", js.undefined)
      
      inline def setValidHostsVarargs(value: String*): Self = StObject.set(x, "validHosts", js.Array(value*))
    }
  }
  
  trait FromUserSettings extends StObject
  
  trait GetDomain extends StObject {
    
    def extractHostname(host: String): String | Null
    @JSName("extractHostname")
    var extractHostname_Original: js.Function1[/* host */ String, String | Null]
    
    def fromUserSettings(options: Rules): FromUserSettings
    @JSName("fromUserSettings")
    var fromUserSettings_Original: js.Function1[/* options */ Rules, FromUserSettings]
    
    def getDomain(host: String): String | Null
    @JSName("getDomain")
    var getDomain_Original: js.Function1[/* host */ String, String | Null]
    
    def getPublicSuffix(host: String): String | Null
    @JSName("getPublicSuffix")
    var getPublicSuffix_Original: js.Function1[/* host */ String, String | Null]
    
    def getSubdomain(host: String): String | Null
    @JSName("getSubdomain")
    var getSubdomain_Original: js.Function1[/* host */ String, String | Null]
    
    def isValid(host: String): Boolean
    
    def isValidHostname(host: String): Boolean
    @JSName("isValidHostname")
    var isValidHostname_Original: js.Function1[/* host */ String, Boolean]
    
    @JSName("isValid")
    var isValid_Original: js.Function1[/* host */ String, Boolean]
    
    def parse(host: String): Domain
    @JSName("parse")
    var parse_Original: js.Function1[/* host */ String, Domain]
    
    def tldExists(host: String): Boolean
    @JSName("tldExists")
    var tldExists_Original: js.Function1[/* host */ String, Boolean]
  }
  object GetDomain {
    
    inline def apply(
      extractHostname: /* host */ String => String | Null,
      fromUserSettings: /* options */ Rules => FromUserSettings,
      getDomain: /* host */ String => String | Null,
      getPublicSuffix: /* host */ String => String | Null,
      getSubdomain: /* host */ String => String | Null,
      isValid: /* host */ String => Boolean,
      isValidHostname: /* host */ String => Boolean,
      parse: /* host */ String => Domain,
      tldExists: /* host */ String => Boolean
    ): GetDomain = {
      val __obj = js.Dynamic.literal(extractHostname = js.Any.fromFunction1(extractHostname), fromUserSettings = js.Any.fromFunction1(fromUserSettings), getDomain = js.Any.fromFunction1(getDomain), getPublicSuffix = js.Any.fromFunction1(getPublicSuffix), getSubdomain = js.Any.fromFunction1(getSubdomain), isValid = js.Any.fromFunction1(isValid), isValidHostname = js.Any.fromFunction1(isValidHostname), parse = js.Any.fromFunction1(parse), tldExists = js.Any.fromFunction1(tldExists))
      __obj.asInstanceOf[GetDomain]
    }
    
    extension [Self <: GetDomain](x: Self) {
      
      inline def setExtractHostname(value: /* host */ String => String | Null): Self = StObject.set(x, "extractHostname", js.Any.fromFunction1(value))
      
      inline def setFromUserSettings(value: /* options */ Rules => FromUserSettings): Self = StObject.set(x, "fromUserSettings", js.Any.fromFunction1(value))
      
      inline def setGetDomain(value: /* host */ String => String | Null): Self = StObject.set(x, "getDomain", js.Any.fromFunction1(value))
      
      inline def setGetPublicSuffix(value: /* host */ String => String | Null): Self = StObject.set(x, "getPublicSuffix", js.Any.fromFunction1(value))
      
      inline def setGetSubdomain(value: /* host */ String => String | Null): Self = StObject.set(x, "getSubdomain", js.Any.fromFunction1(value))
      
      inline def setIsValid(value: /* host */ String => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction1(value))
      
      inline def setIsValidHostname(value: /* host */ String => Boolean): Self = StObject.set(x, "isValidHostname", js.Any.fromFunction1(value))
      
      inline def setParse(value: /* host */ String => Domain): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setTldExists(value: /* host */ String => Boolean): Self = StObject.set(x, "tldExists", js.Any.fromFunction1(value))
    }
  }
  
  trait Hostname extends StObject {
    
    var domain: ReturnType[js.Function1[/* host */ String, String | Null]]
    
    var hostname: ReturnType[js.Function1[/* host */ String, String | Null]]
    
    var isIp: Boolean
    
    var isValid: ReturnType[js.Function1[/* host */ String, Boolean]]
    
    var publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]]
    
    var subdomain: ReturnType[js.Function1[/* host */ String, String | Null]]
    
    var tldExists: ReturnType[js.Function1[/* host */ String, Boolean]]
  }
  object Hostname {
    
    inline def apply(
      domain: ReturnType[js.Function1[/* host */ String, String | Null]],
      hostname: ReturnType[js.Function1[/* host */ String, String | Null]],
      isIp: Boolean,
      isValid: ReturnType[js.Function1[/* host */ String, Boolean]],
      publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]],
      subdomain: ReturnType[js.Function1[/* host */ String, String | Null]],
      tldExists: ReturnType[js.Function1[/* host */ String, Boolean]]
    ): Hostname = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    extension [Self <: Hostname](x: Self) {
      
      inline def setDomain(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setIsIp(value: Boolean): Self = StObject.set(x, "isIp", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: ReturnType[js.Function1[/* host */ String, Boolean]]): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setPublicSuffix(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "publicSuffix", value.asInstanceOf[js.Any])
      
      inline def setSubdomain(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setTldExists(value: ReturnType[js.Function1[/* host */ String, Boolean]]): Self = StObject.set(x, "tldExists", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rules extends StObject {
    
    var extractHostname: js.UndefOr[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
        ]
      ] = js.undefined
    
    var rules: js.UndefOr[Any] = js.undefined
    
    var validHosts: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Rules {
    
    inline def apply(): Rules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rules]
    }
    
    extension [Self <: Rules](x: Self) {
      
      inline def setExtractHostname(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
            ]
      ): Self = StObject.set(x, "extractHostname", value.asInstanceOf[js.Any])
      
      inline def setExtractHostnameUndefined: Self = StObject.set(x, "extractHostname", js.undefined)
      
      inline def setRules(value: Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setValidHosts(value: js.Array[String]): Self = StObject.set(x, "validHosts", value.asInstanceOf[js.Any])
      
      inline def setValidHostsUndefined: Self = StObject.set(x, "validHosts", js.undefined)
      
      inline def setValidHostsVarargs(value: String*): Self = StObject.set(x, "validHosts", js.Array(value*))
    }
  }
}
