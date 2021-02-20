package typings.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vsoBaseInterfacesMod {
  
  @js.native
  trait ApiResourceLocation extends StObject {
    
    /**
      * Area name for this resource
      */
    var area: String = js.native
    
    /**
      * Unique Identifier for this location
      */
    var id: String = js.native
    
    /**
      * Maximum api version that this resource supports (current server version for this resource)
      */
    var maxVersion: String = js.native
    
    /**
      * Minimum api version that this resource supports
      */
    var minVersion: String = js.native
    
    /**
      * The latest version of this resource location that is in "Release" (non-preview) mode
      */
    var releasedVersion: String = js.native
    
    /**
      * Resource name
      */
    var resourceName: String = js.native
    
    /**
      * The current resource version supported by this resource location
      */
    var resourceVersion: Double = js.native
    
    /**
      * This location's route template (templated relative path)
      */
    var routeTemplate: String = js.native
  }
  object ApiResourceLocation {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ApiResourceLocationMutableBuilder[Self <: ApiResourceLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVersion(value: String): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVersion(value: String): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleasedVersion(value: String): Self = StObject.set(x, "releasedVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceVersion(value: Double): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTemplate(value: String): Self = StObject.set(x, "routeTemplate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBasicCredentials extends StObject {
    
    var password: String = js.native
    
    var username: String = js.native
  }
  object IBasicCredentials {
    
    @scala.inline
    def apply(password: String, username: String): IBasicCredentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBasicCredentials]
    }
    
    @scala.inline
    implicit class IBasicCredentialsMutableBuilder[Self <: IBasicCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICertConfiguration extends StObject {
    
    var caFile: js.UndefOr[String] = js.native
    
    var certFile: js.UndefOr[String] = js.native
    
    var keyFile: js.UndefOr[String] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
  }
  object ICertConfiguration {
    
    @scala.inline
    def apply(): ICertConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICertConfiguration]
    }
    
    @scala.inline
    implicit class ICertConfigurationMutableBuilder[Self <: ICertConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaFile(value: String): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
      
      @scala.inline
      def setCertFile(value: String): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertFileUndefined: Self = StObject.set(x, "certFile", js.undefined)
      
      @scala.inline
      def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    }
  }
  
  type IHeaders = StringDictionary[js.Any]
  
  @js.native
  trait IHttpResponse extends StObject {
    
    var headers: js.Any = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  object IHttpResponse {
    
    @scala.inline
    def apply(headers: js.Any): IHttpResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHttpResponse]
    }
    
    @scala.inline
    implicit class IHttpResponseMutableBuilder[Self <: IHttpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  @js.native
  trait IProxyConfiguration extends StObject {
    
    var proxyBypassHosts: js.UndefOr[js.Array[String]] = js.native
    
    var proxyPassword: js.UndefOr[String] = js.native
    
    var proxyUrl: String = js.native
    
    var proxyUsername: js.UndefOr[String] = js.native
  }
  object IProxyConfiguration {
    
    @scala.inline
    def apply(proxyUrl: String): IProxyConfiguration = {
      val __obj = js.Dynamic.literal(proxyUrl = proxyUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProxyConfiguration]
    }
    
    @scala.inline
    implicit class IProxyConfigurationMutableBuilder[Self <: IProxyConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxyBypassHosts(value: js.Array[String]): Self = StObject.set(x, "proxyBypassHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyBypassHostsUndefined: Self = StObject.set(x, "proxyBypassHosts", js.undefined)
      
      @scala.inline
      def setProxyBypassHostsVarargs(value: String*): Self = StObject.set(x, "proxyBypassHosts", js.Array(value :_*))
      
      @scala.inline
      def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
      
      @scala.inline
      def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
    }
  }
  
  @js.native
  trait IRequestHandler extends StObject {
    
    def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
    
    def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): Unit = js.native
    
    def prepareRequest(options: js.Any): Unit = js.native
  }
  object IRequestHandler {
    
    @scala.inline
    def apply(
      canHandleAuthentication: IHttpResponse => Boolean,
      handleAuthentication: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
      prepareRequest: js.Any => Unit
    ): IRequestHandler = {
      val __obj = js.Dynamic.literal(canHandleAuthentication = js.Any.fromFunction1(canHandleAuthentication), handleAuthentication = js.Any.fromFunction5(handleAuthentication), prepareRequest = js.Any.fromFunction1(prepareRequest))
      __obj.asInstanceOf[IRequestHandler]
    }
    
    @scala.inline
    implicit class IRequestHandlerMutableBuilder[Self <: IRequestHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanHandleAuthentication(value: IHttpResponse => Boolean): Self = StObject.set(x, "canHandleAuthentication", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleAuthentication(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "handleAuthentication", js.Any.fromFunction5(value))
      
      @scala.inline
      def setPrepareRequest(value: js.Any => Unit): Self = StObject.set(x, "prepareRequest", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IRequestOptions extends StObject {
    
    var cert: js.UndefOr[ICertConfiguration] = js.native
    
    var ignoreSslError: js.UndefOr[Boolean] = js.native
    
    var proxy: js.UndefOr[IProxyConfiguration] = js.native
    
    var socketTimeout: js.UndefOr[Double] = js.native
  }
  object IRequestOptions {
    
    @scala.inline
    def apply(): IRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestOptions]
    }
    
    @scala.inline
    implicit class IRequestOptionsMutableBuilder[Self <: IRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: ICertConfiguration): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setIgnoreSslError(value: Boolean): Self = StObject.set(x, "ignoreSslError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSslErrorUndefined: Self = StObject.set(x, "ignoreSslError", js.undefined)
      
      @scala.inline
      def setProxy(value: IProxyConfiguration): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
}
