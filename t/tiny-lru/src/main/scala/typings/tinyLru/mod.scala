package typings.tinyLru

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tiny-lru", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Lru[T] extends js.Object {
    def clear(): this.type = js.native
    def delete(key: String): this.type = js.native
    def evict(): this.type = js.native
    def get(key: String): js.UndefOr[T] = js.native
    def has(key: String): Boolean = js.native
    def keys(): js.Array[String] = js.native
    def set(key: String, value: T): this.type = js.native
    def set(key: String, value: T, bypass: Boolean): this.type = js.native
  }
  
  def default[T](): Lru[T] = js.native
  def default[T](max: Double): Lru[T] = js.native
  def default[T](max: Double, ttl: Double): Lru[T] = js.native
}

