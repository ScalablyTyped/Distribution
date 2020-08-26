package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWallabyWorkers extends js.Object {
  var recycle: js.UndefOr[Boolean] = js.native
}

object IWallabyWorkers {
  @scala.inline
  def apply(): IWallabyWorkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWallabyWorkers]
  }
  @scala.inline
  implicit class IWallabyWorkersOps[Self <: IWallabyWorkers] (val x: Self) extends AnyVal {
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
    def setRecycle(value: Boolean): Self = this.set("recycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecycle: Self = this.set("recycle", js.undefined)
  }
  
}

