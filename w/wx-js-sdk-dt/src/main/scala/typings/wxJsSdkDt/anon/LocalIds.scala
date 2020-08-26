package typings.wxJsSdkDt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalIds extends js.Object {
  var localIds: js.Array[String] = js.native
}

object LocalIds {
  @scala.inline
  def apply(localIds: js.Array[String]): LocalIds = {
    val __obj = js.Dynamic.literal(localIds = localIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalIds]
  }
  @scala.inline
  implicit class LocalIdsOps[Self <: LocalIds] (val x: Self) extends AnyVal {
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
    def setLocalIdsVarargs(value: String*): Self = this.set("localIds", js.Array(value :_*))
    @scala.inline
    def setLocalIds(value: js.Array[String]): Self = this.set("localIds", value.asInstanceOf[js.Any])
  }
  
}

