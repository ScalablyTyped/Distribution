package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWallabyEnvironment extends js.Object {
  var params: js.UndefOr[IWallabyEnvironmentParameters] = js.native
  var runner: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var viewportSize: js.UndefOr[IWallabyEnvironmentViewportSize] = js.native
}

object IWallabyEnvironment {
  @scala.inline
  def apply(): IWallabyEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWallabyEnvironment]
  }
  @scala.inline
  implicit class IWallabyEnvironmentOps[Self <: IWallabyEnvironment] (val x: Self) extends AnyVal {
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
    def setParams(value: IWallabyEnvironmentParameters): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setRunner(value: String): Self = this.set("runner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunner: Self = this.set("runner", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setViewportSize(value: IWallabyEnvironmentViewportSize): Self = this.set("viewportSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportSize: Self = this.set("viewportSize", js.undefined)
  }
  
}

