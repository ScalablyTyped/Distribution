package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Network extends StObject {
  
  /* private */ val cache: Any
  
  /* private */ val cacheLifetime: Any
  
  /* private */ var cleanupCache: Any
  
  /* private */ val configuration: Any
  
  /* private */ var executeWithRetry: Any
  
  def get(url: String): js.Promise[Any]
  
  /* private */ var isExpired: Any
  
  def pokeTimer(): Unit
  
  /* private */ val services: Any
  
  /* private */ var timer: Any
}
object Network {
  
  inline def apply(
    cache: Any,
    cacheLifetime: Any,
    cleanupCache: Any,
    configuration: Any,
    executeWithRetry: Any,
    get: String => js.Promise[Any],
    isExpired: Any,
    pokeTimer: () => Unit,
    services: Any,
    timer: Any
  ): Network = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], cacheLifetime = cacheLifetime.asInstanceOf[js.Any], cleanupCache = cleanupCache.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], executeWithRetry = executeWithRetry.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), isExpired = isExpired.asInstanceOf[js.Any], pokeTimer = js.Any.fromFunction0(pokeTimer), services = services.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  
  extension [Self <: Network](x: Self) {
    
    inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheLifetime(value: Any): Self = StObject.set(x, "cacheLifetime", value.asInstanceOf[js.Any])
    
    inline def setCleanupCache(value: Any): Self = StObject.set(x, "cleanupCache", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: Any): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setExecuteWithRetry(value: Any): Self = StObject.set(x, "executeWithRetry", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String => js.Promise[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setIsExpired(value: Any): Self = StObject.set(x, "isExpired", value.asInstanceOf[js.Any])
    
    inline def setPokeTimer(value: () => Unit): Self = StObject.set(x, "pokeTimer", js.Any.fromFunction0(value))
    
    inline def setServices(value: Any): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setTimer(value: Any): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
  }
}
