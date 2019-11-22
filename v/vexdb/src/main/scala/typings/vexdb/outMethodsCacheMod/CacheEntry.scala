package typings.vexdb.outMethodsCacheMod

import typings.vexdb.Anon_0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheEntry[T] extends js.Object {
  var expiry: Double
  var value: Anon_0[T]
}

object CacheEntry {
  @scala.inline
  def apply[T](expiry: Double, value: Anon_0[T]): CacheEntry[T] = {
    val __obj = js.Dynamic.literal(expiry = expiry, value = value)
  
    __obj.asInstanceOf[CacheEntry[T]]
  }
}

