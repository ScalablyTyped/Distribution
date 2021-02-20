package typings.tinyLru

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-lru", JSImport.Default)
  @js.native
  def default[T](): Lru[T] = js.native
  @JSImport("tiny-lru", JSImport.Default)
  @js.native
  def default[T](max: js.UndefOr[scala.Nothing], ttl: Double): Lru[T] = js.native
  @JSImport("tiny-lru", JSImport.Default)
  @js.native
  def default[T](max: Double): Lru[T] = js.native
  @JSImport("tiny-lru", JSImport.Default)
  @js.native
  def default[T](max: Double, ttl: Double): Lru[T] = js.native
  
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
