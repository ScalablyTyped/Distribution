package typings.tensorflowTfjsData.deepMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepMapAsyncResult extends js.Object {
  var recurse: Boolean = js.native
  var value: js.Promise[_] = js.native
}

object DeepMapAsyncResult {
  @scala.inline
  def apply(recurse: Boolean, value: js.Promise[_]): DeepMapAsyncResult = {
    val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepMapAsyncResult]
  }
  @scala.inline
  implicit class DeepMapAsyncResultOps[Self <: DeepMapAsyncResult] (val x: Self) extends AnyVal {
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
    def setRecurse(value: Boolean): Self = this.set("recurse", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Promise[_]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

