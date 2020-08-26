package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyString extends js.Object {
  var key: String = js.native
  var value: js.Array[KeyValue] = js.native
}

object KeyString {
  @scala.inline
  def apply(key: String, value: js.Array[KeyValue]): KeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyString]
  }
  @scala.inline
  implicit class KeyStringOps[Self <: KeyString] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: KeyValue*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[KeyValue]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

