package typings.vexdb.cacheMod

import typings.vexdb.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheEntry[T] extends js.Object {
  var expiry: Double
  var value: Result[T]
}

object CacheEntry {
  @scala.inline
  def apply[T](expiry: Double, value: Result[T]): CacheEntry[T] = {
    val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheEntry[T]]
  }
}

