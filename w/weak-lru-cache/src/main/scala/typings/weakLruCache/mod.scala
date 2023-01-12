package typings.weakLruCache

import typings.std.Map
import typings.weakLruCache.weakLruCacheBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("weak-lru-cache", "CacheEntry")
  @js.native
  open class CacheEntry[V] () extends StObject {
    
    var deref: js.UndefOr[js.Function0[V]] = js.native
    
    var value: js.UndefOr[V] = js.native
  }
  
  @JSImport("weak-lru-cache", "LRFUExpirer")
  @js.native
  open class LRFUExpirer () extends StObject {
    def this(options: LRFUExpirerOptions) = this()
  }
  
  @JSImport("weak-lru-cache", "WeakLRUCache")
  @js.native
  open class WeakLRUCache[K, V] ()
    extends StObject
       with Map[K, CacheEntry[V]] {
    def this(options: WeakLRUCacheOptions) = this()
    
    /**
      * Get a value from the cache, if it is still in memory. If the value is no longer cached, will return undefined.
      * @param key The key to use to retrieve the value
      */
    def getValue(key: K): js.UndefOr[V] = js.native
    
    /**
      * Put a key-value into the cache
      * @param key The key to use to insert the entry
      * @param value The value to insert into the cache
      * @param expirationPriority A priority for expiration, a higher value will expire sooner
      */
    def setValue(key: K, value: V): Unit = js.native
    def setValue(key: K, value: V, expirationPriority: Double): Unit = js.native
  }
  
  trait LRFUExpirerOptions extends StObject {
    
    var cleanupInterval: js.UndefOr[Double] = js.undefined
    
    var lruSize: js.UndefOr[Double] = js.undefined
  }
  object LRFUExpirerOptions {
    
    inline def apply(): LRFUExpirerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LRFUExpirerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LRFUExpirerOptions] (val x: Self) extends AnyVal {
      
      inline def setCleanupInterval(value: Double): Self = StObject.set(x, "cleanupInterval", value.asInstanceOf[js.Any])
      
      inline def setCleanupIntervalUndefined: Self = StObject.set(x, "cleanupInterval", js.undefined)
      
      inline def setLruSize(value: Double): Self = StObject.set(x, "lruSize", value.asInstanceOf[js.Any])
      
      inline def setLruSizeUndefined: Self = StObject.set(x, "lruSize", js.undefined)
    }
  }
  
  trait WeakLRUCacheOptions extends StObject {
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var deferRegister: js.UndefOr[Boolean] = js.undefined
    
    var expirer: js.UndefOr[LRFUExpirer | `false`] = js.undefined
  }
  object WeakLRUCacheOptions {
    
    inline def apply(): WeakLRUCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakLRUCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeakLRUCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setDeferRegister(value: Boolean): Self = StObject.set(x, "deferRegister", value.asInstanceOf[js.Any])
      
      inline def setDeferRegisterUndefined: Self = StObject.set(x, "deferRegister", js.undefined)
      
      inline def setExpirer(value: LRFUExpirer | `false`): Self = StObject.set(x, "expirer", value.asInstanceOf[js.Any])
      
      inline def setExpirerUndefined: Self = StObject.set(x, "expirer", js.undefined)
    }
  }
}
