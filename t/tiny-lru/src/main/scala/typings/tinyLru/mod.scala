package typings.tinyLru

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-lru", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lru[T](): LRU_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lru")().asInstanceOf[LRU_[T]]
  inline def lru[T](max: Double): LRU_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lru")(max.asInstanceOf[js.Any]).asInstanceOf[LRU_[T]]
  inline def lru[T](max: Double, ttl: Double): LRU_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("lru")(max.asInstanceOf[js.Any], ttl.asInstanceOf[js.Any])).asInstanceOf[LRU_[T]]
  inline def lru[T](max: Unit, ttl: Double): LRU_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("lru")(max.asInstanceOf[js.Any], ttl.asInstanceOf[js.Any])).asInstanceOf[LRU_[T]]
  
  @js.native
  trait LRU_[T] extends StObject {
    
    def clear(): this.type = js.native
    
    def delete(key: Any): this.type = js.native
    
    def evict(): this.type = js.native
    def evict(bypass: Boolean): this.type = js.native
    
    var first: T | Null = js.native
    
    def get(key: Any): js.UndefOr[T] = js.native
    
    def has(key: Any): Boolean = js.native
    
    def keys(): js.Array[String] = js.native
    
    var last: T | Null = js.native
    
    var max: Double = js.native
    
    def set(key: Any, value: T): this.type = js.native
    def set(key: Any, value: T, bypass: Boolean): this.type = js.native
    
    var size: Double = js.native
    
    var ttl: Double = js.native
  }
}
