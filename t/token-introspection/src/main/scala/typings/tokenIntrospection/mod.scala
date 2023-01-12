package typings.tokenIntrospection

import org.scalablytyped.runtime.Instantiable0
import typings.jsonwebtoken.mod.JwtPayload
import typings.std.RequestInit
import typings.std.Response
import typings.tokenIntrospection.anon.Keys
import typings.tokenIntrospection.tokenIntrospectionBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): IntrospectionFunction = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[IntrospectionFunction]
  inline def apply(opts: Options): IntrospectionFunction = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[IntrospectionFunction]
  
  @JSImport("token-introspection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object errors {
    
    @JSImport("token-introspection", "errors")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("token-introspection", "errors.ConfigurationError")
    @js.native
    open class ConfigurationError ()
      extends typings.tokenIntrospection.errorsMod.ConfigurationError
    @JSImport("token-introspection", "errors.ConfigurationError")
    @js.native
    def ConfigurationError: Any | Instantiable0[typings.tokenIntrospection.errorsMod.ConfigurationError] = js.native
    inline def ConfigurationError_=(x: Any | Instantiable0[typings.tokenIntrospection.errorsMod.ConfigurationError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("token-introspection", "errors.IntrospectionError")
    @js.native
    open class IntrospectionError ()
      extends typings.tokenIntrospection.errorsMod.IntrospectionError
    @JSImport("token-introspection", "errors.IntrospectionError")
    @js.native
    def IntrospectionError: Any | Instantiable0[typings.tokenIntrospection.errorsMod.IntrospectionError] = js.native
    inline def IntrospectionError_=(x: Any | Instantiable0[typings.tokenIntrospection.errorsMod.IntrospectionError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IntrospectionError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("token-introspection", "errors.MalformedTokenError")
    @js.native
    open class MalformedTokenError ()
      extends typings.tokenIntrospection.errorsMod.MalformedTokenError
    @JSImport("token-introspection", "errors.MalformedTokenError")
    @js.native
    def MalformedTokenError: Any | Instantiable0[typings.tokenIntrospection.errorsMod.MalformedTokenError] = js.native
    inline def MalformedTokenError_=(x: Any | Instantiable0[typings.tokenIntrospection.errorsMod.MalformedTokenError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MalformedTokenError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("token-introspection", "errors.NotBeforeError")
    @js.native
    open class NotBeforeError ()
      extends typings.tokenIntrospection.errorsMod.NotBeforeError
    @JSImport("token-introspection", "errors.NotBeforeError")
    @js.native
    def NotBeforeError: Any | Instantiable0[typings.tokenIntrospection.errorsMod.NotBeforeError] = js.native
    inline def NotBeforeError_=(x: Any | Instantiable0[typings.tokenIntrospection.errorsMod.NotBeforeError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotBeforeError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("token-introspection", "errors.TokenExpiredError")
    @js.native
    open class TokenExpiredError ()
      extends typings.tokenIntrospection.errorsMod.TokenExpiredError
    @JSImport("token-introspection", "errors.TokenExpiredError")
    @js.native
    def TokenExpiredError: Any | Instantiable0[typings.tokenIntrospection.errorsMod.TokenExpiredError] = js.native
    inline def TokenExpiredError_=(x: Any | Instantiable0[typings.tokenIntrospection.errorsMod.TokenExpiredError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TokenExpiredError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("token-introspection", "errors.TokenNotActiveError")
    @js.native
    open class TokenNotActiveError ()
      extends typings.tokenIntrospection.errorsMod.TokenNotActiveError
    @JSImport("token-introspection", "errors.TokenNotActiveError")
    @js.native
    def TokenNotActiveError: Any | Instantiable0[typings.tokenIntrospection.errorsMod.TokenNotActiveError] = js.native
    inline def TokenNotActiveError_=(x: Any | Instantiable0[typings.tokenIntrospection.errorsMod.TokenNotActiveError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TokenNotActiveError")(x.asInstanceOf[js.Any])
  }
  
  type Fetch = js.Function2[/* url */ String, /* options */ RequestInit, js.Promise[Response]]
  
  trait IntrospectResult
    extends StObject
       with JwtPayload {
    
    var active: `true` | typings.tokenIntrospection.tokenIntrospectionStrings.`true`
  }
  object IntrospectResult {
    
    inline def apply(active: `true` | typings.tokenIntrospection.tokenIntrospectionStrings.`true`): IntrospectResult = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntrospectResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntrospectResult] (val x: Self) extends AnyVal {
      
      inline def setActive(value: `true` | typings.tokenIntrospection.tokenIntrospectionStrings.`true`): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  /** @async */
  type IntrospectionFunction = js.Function2[
    /* token */ String, 
    /* tokenTypeHint */ js.UndefOr[String], 
    js.Promise[IntrospectResult]
  ]
  
  trait Options extends StObject {
    
    /**
      * Access token used to introspect, instead of client credentials
      */
    var access_token: js.UndefOr[String] = js.undefined
    
    /**
      * List of allowed signing algorithms, defaults to `['RS256']`
      */
    var allowed_algs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Client ID used to introspect
      */
    var client_id: js.UndefOr[String] = js.undefined
    
    /**
      * Client secret used to introspect
      */
    var client_secret: js.UndefOr[String] = js.undefined
    
    /**
      * URL to call, for instance https://example.com/introspect
      */
    var endpoint: js.UndefOr[String] = js.undefined
    
    /**
      * Defaults to [node-fetch](https://github.com/bitinn/node-fetch), but you can inject [zipkin-instrumentation-fetch](https://www.npmjs.com/package/zipkin-instrumentation-fetch).
      */
    var fetch: js.UndefOr[Fetch] = js.undefined
    
    /**
      * Static JWKS of trusted keys, for example `{keys: [{kty:'RSA',n:'4-4mhUVhY2k',e:'AQAB'}]}`
      */
    var jwks: js.UndefOr[Keys] = js.undefined
    
    /**
      * If jwks response should be cached, defaults to true
      */
    var jwks_cache_enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How many jwk's to cache, defaults to 10
      */
    var jwks_cache_maxentries: js.UndefOr[Double] = js.undefined
    
    /**
      * How long a jwk is cached, in ms, defaults to 5 min
      */
    var jwks_cache_time: js.UndefOr[Double] = js.undefined
    
    /**
      * If ratelimit of calls to jwks endpoint, defaults to true
      */
    var jwks_ratelimit_enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limits of jwks calls, defaults to 60 rpm
      */
    var jwks_ratelimit_per_minute: js.UndefOr[Double] = js.undefined
    
    /**
      * URL of a trusted JWKS, for example `https://example.com/jwks`
      */
    var jwks_uri: js.UndefOr[String] = js.undefined
    
    /**
      * Defaults to `token-introspection`
      */
    var user_agent: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAllowed_algs(value: js.Array[String]): Self = StObject.set(x, "allowed_algs", value.asInstanceOf[js.Any])
      
      inline def setAllowed_algsUndefined: Self = StObject.set(x, "allowed_algs", js.undefined)
      
      inline def setAllowed_algsVarargs(value: String*): Self = StObject.set(x, "allowed_algs", js.Array(value*))
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setFetch(value: (/* url */ String, /* options */ RequestInit) => js.Promise[Response]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setJwks(value: Keys): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
      
      inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
      
      inline def setJwks_cache_enabled(value: Boolean): Self = StObject.set(x, "jwks_cache_enabled", value.asInstanceOf[js.Any])
      
      inline def setJwks_cache_enabledUndefined: Self = StObject.set(x, "jwks_cache_enabled", js.undefined)
      
      inline def setJwks_cache_maxentries(value: Double): Self = StObject.set(x, "jwks_cache_maxentries", value.asInstanceOf[js.Any])
      
      inline def setJwks_cache_maxentriesUndefined: Self = StObject.set(x, "jwks_cache_maxentries", js.undefined)
      
      inline def setJwks_cache_time(value: Double): Self = StObject.set(x, "jwks_cache_time", value.asInstanceOf[js.Any])
      
      inline def setJwks_cache_timeUndefined: Self = StObject.set(x, "jwks_cache_time", js.undefined)
      
      inline def setJwks_ratelimit_enabled(value: Boolean): Self = StObject.set(x, "jwks_ratelimit_enabled", value.asInstanceOf[js.Any])
      
      inline def setJwks_ratelimit_enabledUndefined: Self = StObject.set(x, "jwks_ratelimit_enabled", js.undefined)
      
      inline def setJwks_ratelimit_per_minute(value: Double): Self = StObject.set(x, "jwks_ratelimit_per_minute", value.asInstanceOf[js.Any])
      
      inline def setJwks_ratelimit_per_minuteUndefined: Self = StObject.set(x, "jwks_ratelimit_per_minute", js.undefined)
      
      inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
      
      inline def setJwks_uriUndefined: Self = StObject.set(x, "jwks_uri", js.undefined)
      
      inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
      
      inline def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
    }
  }
}
