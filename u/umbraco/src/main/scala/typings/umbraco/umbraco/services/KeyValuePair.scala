package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValuePair[T] extends js.Object {
  var key: String
  var value: T
}

object KeyValuePair {
  @scala.inline
  def apply[T](key: String, value: T): KeyValuePair[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair[T]]
  }
}

