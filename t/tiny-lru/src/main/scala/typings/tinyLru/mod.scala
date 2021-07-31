package typings.tinyLru

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-lru", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](): Lru[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Lru[T]]
  @scala.inline
  def default[T](max: Double): Lru[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(max.asInstanceOf[js.Any]).asInstanceOf[Lru[T]]
  @scala.inline
  def default[T](max: Double, ttl: Double): Lru[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(max.asInstanceOf[js.Any], ttl.asInstanceOf[js.Any])).asInstanceOf[Lru[T]]
  @scala.inline
  def default[T](max: Unit, ttl: Double): Lru[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(max.asInstanceOf[js.Any], ttl.asInstanceOf[js.Any])).asInstanceOf[Lru[T]]
  
  @js.native
  trait Lru[T] extends StObject {
    
    def clear(): this.type = js.native
    
    def delete(key: String): this.type = js.native
    
    def evict(): this.type = js.native
    
    def get(key: String): js.UndefOr[T] = js.native
    
    def has(key: String): Boolean = js.native
    
    def keys(): js.Array[String] = js.native
    
    def set(key: String, value: T): this.type = js.native
    def set(key: String, value: T, bypass: Boolean): this.type = js.native
  }
}
