package typings.vexdb.cacheMod

import typings.vexdb.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheEntry[T] extends js.Object {
  var expiry: Double
  var value: AnonResult[T]
}

object CacheEntry {
  @scala.inline
  def apply[T](expiry: Double, value: AnonResult[T]): CacheEntry[T] = {
    val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheEntry[T]]
  }
}

