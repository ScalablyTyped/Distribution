package typings.umijsRouteUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  var _owner: Null = js.native
  var key: Null = js.native
  var ref: Null = js.native
}

object Key {
  @scala.inline
  def apply(_owner: Null, key: Null, ref: Null): Key = {
    val __obj = js.Dynamic.literal(_owner = _owner.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
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
    def set_owner(value: Null): Self = this.set("_owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Null): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: Null): Self = this.set("ref", value.asInstanceOf[js.Any])
  }
  
}

