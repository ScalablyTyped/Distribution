package typings.vexdb.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheEntry[T] extends js.Object {
  var expires: Double
  var value: APIResponse[T]
}

object CacheEntry {
  @scala.inline
  def apply[T](expires: Double, value: APIResponse[T]): CacheEntry[T] = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheEntry[T]]
  }
}

