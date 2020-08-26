package typings.typescriptCollections.dictionaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDictionaryPair[K, V] extends js.Object {
  var key: K = js.native
  var value: V = js.native
}

object IDictionaryPair {
  @scala.inline
  def apply[K, V](key: K, value: V): IDictionaryPair[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDictionaryPair[K, V]]
  }
  @scala.inline
  implicit class IDictionaryPairOps[Self <: IDictionaryPair[_, _], K, V] (val x: Self with (IDictionaryPair[K, V])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

