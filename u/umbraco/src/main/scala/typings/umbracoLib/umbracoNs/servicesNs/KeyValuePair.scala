package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValuePair[T] extends js.Object {
  var key: java.lang.String
  var value: T
}

object KeyValuePair {
  @scala.inline
  def apply[T](key: java.lang.String, value: T): KeyValuePair[T] = {
    val __obj = js.Dynamic.literal(key = key, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyValuePair[T]]
  }
}

