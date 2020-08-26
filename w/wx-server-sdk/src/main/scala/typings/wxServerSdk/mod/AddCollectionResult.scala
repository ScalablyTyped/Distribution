package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCollectionResult extends js.Object {
  var _id: String | Double = js.native
}

object AddCollectionResult {
  @scala.inline
  def apply(_id: String | Double): AddCollectionResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCollectionResult]
  }
  @scala.inline
  implicit class AddCollectionResultOps[Self <: AddCollectionResult] (val x: Self) extends AnyVal {
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
  }
  
}

