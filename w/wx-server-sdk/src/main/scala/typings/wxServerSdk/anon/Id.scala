package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var _id: String | Double = js.native
  var stats: Created = js.native
}

object Id {
  @scala.inline
  def apply(_id: String | Double, stats: Created): Id = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
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
    def set_id(value: String | Double): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Created): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
  
}

