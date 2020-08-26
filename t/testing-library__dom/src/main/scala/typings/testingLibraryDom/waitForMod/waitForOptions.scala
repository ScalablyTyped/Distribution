package typings.testingLibraryDom.waitForMod

import typings.std.Error
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait waitForOptions extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.native
  var interval: js.UndefOr[Double] = js.native
  var mutationObserverOptions: js.UndefOr[MutationObserverInit] = js.native
  var onTimeout: js.UndefOr[js.Function1[/* error */ Error, Error]] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object waitForOptions {
  @scala.inline
  def apply(): waitForOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[waitForOptions]
  }
  @scala.inline
  implicit class waitForOptionsOps[Self <: waitForOptions] (val x: Self) extends AnyVal {
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setMutationObserverOptions(value: MutationObserverInit): Self = this.set("mutationObserverOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutationObserverOptions: Self = this.set("mutationObserverOptions", js.undefined)
    @scala.inline
    def setOnTimeout(value: /* error */ Error => Error): Self = this.set("onTimeout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeout: Self = this.set("onTimeout", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

