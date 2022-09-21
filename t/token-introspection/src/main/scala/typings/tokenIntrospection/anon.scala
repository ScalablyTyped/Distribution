package typings.tokenIntrospection

import typings.pemJwk.mod.RSA_JWK
import typings.std.RequestInit
import typings.std.Response
import typings.tokenIntrospection.mod.Fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Keys extends StObject {
    
    var keys: js.Array[RSA_JWK]
  }
  object Keys {
    
    inline def apply(keys: js.Array[RSA_JWK]): Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    extension [Self <: Keys](x: Self) {
      
      inline def setKeys(value: js.Array[RSA_JWK]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: RSA_JWK*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
  
  /* Inlined std.Pick<token-introspection.token-introspection.Options, 'access_token' | 'client_id' | 'client_secret' | 'user_agent' | 'fetch' | 'endpoint'> */
  trait PickOptionsaccesstokencli extends StObject {
    
    var access_token: js.UndefOr[String] = js.undefined
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var client_secret: js.UndefOr[String] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var fetch: js.UndefOr[Fetch] = js.undefined
    
    var user_agent: js.UndefOr[String] = js.undefined
  }
  object PickOptionsaccesstokencli {
    
    inline def apply(): PickOptionsaccesstokencli = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptionsaccesstokencli]
    }
    
    extension [Self <: PickOptionsaccesstokencli](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setFetch(value: (/* url */ String, /* options */ RequestInit) => js.Promise[Response]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
      
      inline def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
    }
  }
  
  /* Inlined std.Pick<token-introspection.token-introspection.Options, 'jwks' | 'jwks_uri' | 'jwks_cache_enabled' | 'jwks_cache_maxentries' | 'jwks_cache_time' | 'jwks_ratelimit_enabled' | 'jwks_ratelimit_per_minute' | 'allowed_algs'> */
  trait PickOptionsjwksjwksurijwk extends StObject {
    
    var allowed_algs: js.UndefOr[js.Array[String]] = js.undefined
    
    var jwks: js.UndefOr[Keys] = js.undefined
    
    var jwks_cache_enabled: js.UndefOr[Boolean] = js.undefined
    
    var jwks_cache_maxentries: js.UndefOr[Double] = js.undefined
    
    var jwks_cache_time: js.UndefOr[Double] = js.undefined
    
    var jwks_ratelimit_enabled: js.UndefOr[Boolean] = js.undefined
    
    var jwks_ratelimit_per_minute: js.UndefOr[Double] = js.undefined
    
    var jwks_uri: js.UndefOr[String] = js.undefined
  }
  object PickOptionsjwksjwksurijwk {
    
    inline def apply(): PickOptionsjwksjwksurijwk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptionsjwksjwksurijwk]
    }
    
    extension [Self <: PickOptionsjwksjwksurijwk](x: Self) {
      
      inline def setAllowed_algs(value: js.Array[String]): Self = StObject.set(x, "allowed_algs", value.asInstanceOf[js.Any])
      
      inline def setAllowed_algsUndefined: Self = StObject.set(x, "allowed_algs", js.undefined)
      
      inline def setAllowed_algsVarargs(value: String*): Self = StObject.set(x, "allowed_algs", js.Array(value*))
      
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
    }
  }
}
