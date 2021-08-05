package typings.webdriver.anon

import org.scalablytyped.runtime.StringDictionary
import typings.got.mod.Response
import typings.node.Buffer
import typings.std.Record
import typings.webdriver.typesMod.DesiredCapabilities
import typings.webdriver.typesMod.W3CCapabilities
import typings.webdriver.typesMod.WebDriverLogTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<webdriver.webdriver/build/types.Options> */
trait PartialOptions extends StObject {
  
  var agent: js.UndefOr[Http] = js.undefined
  
  var capabilities: js.UndefOr[DesiredCapabilities | W3CCapabilities] = js.undefined
  
  var connectionPollInterval: js.UndefOr[Double] = js.undefined
  
  var connectionRetryCount: js.UndefOr[Double] = js.undefined
  
  var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
  
  var directConnectHost: js.UndefOr[String] = js.undefined
  
  var directConnectPath: js.UndefOr[String] = js.undefined
  
  var directConnectPort: js.UndefOr[Double] = js.undefined
  
  var directConnectProtocol: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
  
  var logLevels: js.UndefOr[Record[String, js.UndefOr[WebDriverLogTypes]]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var requestedCapabilities: js.UndefOr[DesiredCapabilities | W3CCapabilities] = js.undefined
  
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  
  var transformRequest: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ js.Any
    ]
  ] = js.undefined
  
  var transformResponse: js.UndefOr[
    js.Function2[
      /* response */ Response[Buffer | String | js.Object], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any, 
      Response[Buffer | String | js.Object]
    ]
  ] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object PartialOptions {
  
  inline def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  extension [Self <: PartialOptions](x: Self) {
    
    inline def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setCapabilities(value: DesiredCapabilities | W3CCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setConnectionPollInterval(value: Double): Self = StObject.set(x, "connectionPollInterval", value.asInstanceOf[js.Any])
    
    inline def setConnectionPollIntervalUndefined: Self = StObject.set(x, "connectionPollInterval", js.undefined)
    
    inline def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
    
    inline def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
    
    inline def setDirectConnectHost(value: String): Self = StObject.set(x, "directConnectHost", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectHostUndefined: Self = StObject.set(x, "directConnectHost", js.undefined)
    
    inline def setDirectConnectPath(value: String): Self = StObject.set(x, "directConnectPath", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectPathUndefined: Self = StObject.set(x, "directConnectPath", js.undefined)
    
    inline def setDirectConnectPort(value: Double): Self = StObject.set(x, "directConnectPort", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectPortUndefined: Self = StObject.set(x, "directConnectPort", js.undefined)
    
    inline def setDirectConnectProtocol(value: String): Self = StObject.set(x, "directConnectProtocol", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectProtocolUndefined: Self = StObject.set(x, "directConnectProtocol", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogLevels(value: Record[String, js.UndefOr[WebDriverLogTypes]]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
    
    inline def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setRequestedCapabilities(value: DesiredCapabilities | W3CCapabilities): Self = StObject.set(x, "requestedCapabilities", value.asInstanceOf[js.Any])
    
    inline def setRequestedCapabilitiesUndefined: Self = StObject.set(x, "requestedCapabilities", js.undefined)
    
    inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
    
    inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
    
    inline def setTransformRequest(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ js.Any
    ): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
    
    inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    inline def setTransformResponse(
      value: (/* response */ Response[Buffer | String | js.Object], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any) => Response[Buffer | String | js.Object]
    ): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
    
    inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
