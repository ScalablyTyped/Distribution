package typings.timedCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timed-cache", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with Cache[T] {
    def this(options: CacheOptions) = this()
  }
  
  @js.native
  trait Cache[T] extends StObject {
    
    def clear(): Unit = js.native
    
    def get(key: String): js.UndefOr[T] = js.native
    def get(key: js.Object): js.UndefOr[T] = js.native
    
    def put(key: String, value: T): Unit = js.native
    def put(key: String, value: T, options: PutOptions): Unit = js.native
    
    def remove(key: String): Unit = js.native
    
    def size(): Double = js.native
  }
  
  trait CacheOptions extends StObject {
    
    var defaultTtl: Double
  }
  object CacheOptions {
    
    inline def apply(defaultTtl: Double): CacheOptions = {
      val __obj = js.Dynamic.literal(defaultTtl = defaultTtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
    }
  }
  
  trait PutOptions extends StObject {
    
    var ttl: Double
  }
  object PutOptions {
    
    inline def apply(ttl: Double): PutOptions = {
      val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutOptions] (val x: Self) extends AnyVal {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
}
