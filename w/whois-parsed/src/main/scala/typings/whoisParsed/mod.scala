package typings.whoisParsed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whois-parsed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lookup(domainName: String): js.Promise[WhoIsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(domainName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WhoIsResult]]
  inline def lookup(domainName: String, whoIsOptions: WhoIsOptions): js.Promise[WhoIsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(domainName.asInstanceOf[js.Any], whoIsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WhoIsResult]]
  
  trait BasicAuthCredentials extends StObject {
    
    var password: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object BasicAuthCredentials {
    
    inline def apply(): BasicAuthCredentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicAuthCredentials]
    }
    
    extension [Self <: BasicAuthCredentials](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait HttpProxy extends StObject {
    
    var authentication: js.UndefOr[BasicAuthCredentials] = js.undefined
    
    var ipaddress: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[Double] = js.undefined
  }
  object HttpProxy {
    
    inline def apply(): HttpProxy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpProxy]
    }
    
    extension [Self <: HttpProxy](x: Self) {
      
      inline def setAuthentication(value: BasicAuthCredentials): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      inline def setIpaddress(value: String): Self = StObject.set(x, "ipaddress", value.asInstanceOf[js.Any])
      
      inline def setIpaddressUndefined: Self = StObject.set(x, "ipaddress", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait WhoIsOptions extends StObject {
    
    var proxy: js.UndefOr[HttpProxy] = js.undefined
  }
  object WhoIsOptions {
    
    inline def apply(): WhoIsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhoIsOptions]
    }
    
    extension [Self <: WhoIsOptions](x: Self) {
      
      inline def setProxy(value: HttpProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  trait WhoIsResult extends StObject {
    
    var creationDate: js.UndefOr[String] = js.undefined
    
    var domainName: String
    
    var expirationDate: js.UndefOr[String] = js.undefined
    
    var isAvailable: Boolean
    
    var registrar: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[js.Array[String]] = js.undefined
    
    var updatedDate: js.UndefOr[String] = js.undefined
  }
  object WhoIsResult {
    
    inline def apply(domainName: String, isAvailable: Boolean): WhoIsResult = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any])
      __obj.asInstanceOf[WhoIsResult]
    }
    
    extension [Self <: WhoIsResult](x: Self) {
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: String): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      inline def setRegistrarUndefined: Self = StObject.set(x, "registrar", js.undefined)
      
      inline def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value*))
      
      inline def setUpdatedDate(value: String): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
      
      inline def setUpdatedDateUndefined: Self = StObject.set(x, "updatedDate", js.undefined)
    }
  }
}
