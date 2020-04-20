package typings.twilioSync.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheEntry[T] extends js.Object {
  var isValid: Boolean
  var revision: Double
  var value: T
}

object CacheEntry {
  @scala.inline
  def apply[T](isValid: Boolean, revision: Double, value: T): CacheEntry[T] = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheEntry[T]]
  }
}

