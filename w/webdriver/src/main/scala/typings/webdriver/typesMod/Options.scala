package typings.webdriver.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.got.mod.Response
import typings.node.Buffer
import typings.std.Record
import typings.webdriver.anon.Http
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
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
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    @scala.inline
    def setCapabilities(value: DesiredCapabilities | W3CCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setConnectionPollInterval(value: Double): Self = StObject.set(x, "connectionPollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPollIntervalUndefined: Self = StObject.set(x, "connectionPollInterval", js.undefined)
    
    @scala.inline
    def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
    
    @scala.inline
    def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
    
    @scala.inline
    def setDirectConnectHost(value: String): Self = StObject.set(x, "directConnectHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectHostUndefined: Self = StObject.set(x, "directConnectHost", js.undefined)
    
    @scala.inline
    def setDirectConnectPath(value: String): Self = StObject.set(x, "directConnectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectPathUndefined: Self = StObject.set(x, "directConnectPath", js.undefined)
    
    @scala.inline
    def setDirectConnectPort(value: Double): Self = StObject.set(x, "directConnectPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectPortUndefined: Self = StObject.set(x, "directConnectPort", js.undefined)
    
    @scala.inline
    def setDirectConnectProtocol(value: String): Self = StObject.set(x, "directConnectProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectProtocolUndefined: Self = StObject.set(x, "directConnectProtocol", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setLogLevels(value: Record[String, js.UndefOr[WebDriverLogTypes]]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    @scala.inline
    def setRequestedCapabilities(value: DesiredCapabilities | W3CCapabilities): Self = StObject.set(x, "requestedCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedCapabilitiesUndefined: Self = StObject.set(x, "requestedCapabilities", js.undefined)
    
    @scala.inline
    def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
    
    @scala.inline
    def setTransformRequest(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ js.Any
    ): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    @scala.inline
    def setTransformResponse(
      value: (/* response */ Response[Buffer | String | js.Object], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any) => Response[Buffer | String | js.Object]
    ): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
