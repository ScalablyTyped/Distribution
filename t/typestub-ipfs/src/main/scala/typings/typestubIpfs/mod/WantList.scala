package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WantList extends js.Object {
  var Keys: js.Array[WantListItem] = js.native
}

object WantList {
  @scala.inline
  def apply(Keys: js.Array[WantListItem]): WantList = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[WantList]
  }
  @scala.inline
  implicit class WantListOps[Self <: WantList] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: WantListItem*): Self = this.set("Keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[WantListItem]): Self = this.set("Keys", value.asInstanceOf[js.Any])
  }
  
}

