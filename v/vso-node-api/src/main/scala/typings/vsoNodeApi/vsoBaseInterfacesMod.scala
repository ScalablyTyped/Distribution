package typings.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vsoBaseInterfacesMod {
  
  trait ApiResourceLocation extends StObject {
    
    /**
      * Area name for this resource
      */
    var area: String
    
    /**
      * Unique Identifier for this location
      */
    var id: String
    
    /**
      * Maximum api version that this resource supports (current server version for this resource)
      */
    var maxVersion: String
    
    /**
      * Minimum api version that this resource supports
      */
    var minVersion: String
    
    /**
      * The latest version of this resource location that is in "Release" (non-preview) mode
      */
    var releasedVersion: String
    
    /**
      * Resource name
      */
    var resourceName: String
    
    /**
      * The current resource version supported by this resource location
      */
    var resourceVersion: Double
    
    /**
      * This location's route template (templated relative path)
      */
    var routeTemplate: String
  }
  object ApiResourceLocation {
    
    inline def apply(
      area: String,
      id: String,
      maxVersion: String,
      minVersion: String,
      releasedVersion: String,
      resourceName: String,
      resourceVersion: Double,
      routeTemplate: String
    ): ApiResourceLocation = {
      val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxVersion = maxVersion.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any], releasedVersion = releasedVersion.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], routeTemplate = routeTemplate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiResourceLocation]
    }
    
    extension [Self <: ApiResourceLocation](x: Self) {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMaxVersion(value: String): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersion(value: String): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setReleasedVersion(value: String): Self = StObject.set(x, "releasedVersion", value.asInstanceOf[js.Any])
      
      inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
      
      inline def setResourceVersion(value: Double): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
      
      inline def setRouteTemplate(value: String): Self = StObject.set(x, "routeTemplate", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBasicCredentials extends StObject {
    
    var password: String
    
    var username: String
  }
  object IBasicCredentials {
    
    inline def apply(password: String, username: String): IBasicCredentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBasicCredentials]
    }
    
    extension [Self <: IBasicCredentials](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICertConfiguration extends StObject {
    
    var caFile: js.UndefOr[String] = js.undefined
    
    var certFile: js.UndefOr[String] = js.undefined
    
    var keyFile: js.UndefOr[String] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
  }
  object ICertConfiguration {
    
    inline def apply(): ICertConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICertConfiguration]
    }
    
    extension [Self <: ICertConfiguration](x: Self) {
      
      inline def setCaFile(value: String): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
      
      inline def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
      
      inline def setCertFile(value: String): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
      
      inline def setCertFileUndefined: Self = StObject.set(x, "certFile", js.undefined)
      
      inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    }
  }
  
  type IHeaders = StringDictionary[Any]
  
  trait IHttpResponse extends StObject {
    
    var headers: Any
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object IHttpResponse {
    
    inline def apply(headers: Any): IHttpResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHttpResponse]
    }
    
    extension [Self <: IHttpResponse](x: Self) {
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait IProxyConfiguration extends StObject {
    
    var proxyBypassHosts: js.UndefOr[js.Array[String]] = js.undefined
    
    var proxyPassword: js.UndefOr[String] = js.undefined
    
    var proxyUrl: String
    
    var proxyUsername: js.UndefOr[String] = js.undefined
  }
  object IProxyConfiguration {
    
    inline def apply(proxyUrl: String): IProxyConfiguration = {
      val __obj = js.Dynamic.literal(proxyUrl = proxyUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProxyConfiguration]
    }
    
    extension [Self <: IProxyConfiguration](x: Self) {
      
      inline def setProxyBypassHosts(value: js.Array[String]): Self = StObject.set(x, "proxyBypassHosts", value.asInstanceOf[js.Any])
      
      inline def setProxyBypassHostsUndefined: Self = StObject.set(x, "proxyBypassHosts", js.undefined)
      
      inline def setProxyBypassHostsVarargs(value: String*): Self = StObject.set(x, "proxyBypassHosts", js.Array(value*))
      
      inline def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
      
      inline def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
      
      inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      inline def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
      
      inline def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
    }
  }
  
  trait IRequestHandler extends StObject {
    
    def canHandleAuthentication(res: IHttpResponse): Boolean
    
    def handleAuthentication(httpClient: Any, protocol: Any, options: Any, objs: Any, finalCallback: Any): Unit
    
    def prepareRequest(options: Any): Unit
  }
  object IRequestHandler {
    
    inline def apply(
      canHandleAuthentication: IHttpResponse => Boolean,
      handleAuthentication: (Any, Any, Any, Any, Any) => Unit,
      prepareRequest: Any => Unit
    ): IRequestHandler = {
      val __obj = js.Dynamic.literal(canHandleAuthentication = js.Any.fromFunction1(canHandleAuthentication), handleAuthentication = js.Any.fromFunction5(handleAuthentication), prepareRequest = js.Any.fromFunction1(prepareRequest))
      __obj.asInstanceOf[IRequestHandler]
    }
    
    extension [Self <: IRequestHandler](x: Self) {
      
      inline def setCanHandleAuthentication(value: IHttpResponse => Boolean): Self = StObject.set(x, "canHandleAuthentication", js.Any.fromFunction1(value))
      
      inline def setHandleAuthentication(value: (Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "handleAuthentication", js.Any.fromFunction5(value))
      
      inline def setPrepareRequest(value: Any => Unit): Self = StObject.set(x, "prepareRequest", js.Any.fromFunction1(value))
    }
  }
  
  trait IRequestOptions extends StObject {
    
    var cert: js.UndefOr[ICertConfiguration] = js.undefined
    
    var ignoreSslError: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[IProxyConfiguration] = js.undefined
    
    var socketTimeout: js.UndefOr[Double] = js.undefined
  }
  object IRequestOptions {
    
    inline def apply(): IRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestOptions]
    }
    
    extension [Self <: IRequestOptions](x: Self) {
      
      inline def setCert(value: ICertConfiguration): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setIgnoreSslError(value: Boolean): Self = StObject.set(x, "ignoreSslError", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSslErrorUndefined: Self = StObject.set(x, "ignoreSslError", js.undefined)
      
      inline def setProxy(value: IProxyConfiguration): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
}
