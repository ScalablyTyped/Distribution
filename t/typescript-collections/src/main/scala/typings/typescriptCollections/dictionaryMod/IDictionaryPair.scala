package typings.typescriptCollections.dictionaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDictionaryPair[K, V] extends js.Object {
  var key: K
  var value: V
}

object IDictionaryPair {
  @scala.inline
  def apply[K, V](key: K, value: V): IDictionaryPair[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDictionaryPair[K, V]]
  }
}

