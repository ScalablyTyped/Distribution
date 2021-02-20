package typings.twilioSync

import typings.twilioSync.treeMod.TreeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("twilio-sync/lib/cache", JSImport.Default)
  @js.native
  class default[K, V] () extends Cache[K, V]
  
  @JSImport("twilio-sync/lib/cache", "Cache")
  @js.native
  class Cache[K, V] () extends StObject {
    
    def delete(key: K, revision: Double): Unit = js.native
    def delete(key: K, revision: Double, force: Boolean): Unit = js.native
    
    def forEach(callbackfn: js.Function2[/* key */ K, /* value */ V, Unit]): Unit = js.native
    
    def get(key: K): V = js.native
    
    def has(key: K): Boolean = js.native
    
    def isKnown(key: K, revision: Double): Boolean = js.native
    
    val items: TreeMap[K, CacheEntry[V]] = js.native
    
    def store(key: K, value: V, revision: Double): V = js.native
  }
  
  @js.native
  trait CacheEntry[T] extends StObject {
    
    var isValid: Boolean = js.native
    
    var revision: Double = js.native
    
    var value: T = js.native
  }
  object CacheEntry {
    
    @scala.inline
    def apply[T](isValid: Boolean, revision: Double, value: T): CacheEntry[T] = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheEntry[T]]
    }
    
    @scala.inline
    implicit class CacheEntryMutableBuilder[Self <: CacheEntry[_], T] (val x: Self with CacheEntry[T]) extends AnyVal {
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
