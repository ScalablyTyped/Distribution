package typings.winrt.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyValuePair[K, V] extends js.Object {
  var key: K
  var value: V
}

object IKeyValuePair {
  @scala.inline
  def apply[K, V](key: K, value: V): IKeyValuePair[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeyValuePair[K, V]]
  }
}

