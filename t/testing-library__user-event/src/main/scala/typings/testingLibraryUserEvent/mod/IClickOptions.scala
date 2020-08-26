package typings.testingLibraryUserEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClickOptions extends js.Object {
  var clickCount: js.UndefOr[Double] = js.native
  var skipHover: js.UndefOr[Boolean] = js.native
}

object IClickOptions {
  @scala.inline
  def apply(): IClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClickOptions]
  }
  @scala.inline
  implicit class IClickOptionsOps[Self <: IClickOptions] (val x: Self) extends AnyVal {
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
    def setClickCount(value: Double): Self = this.set("clickCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickCount: Self = this.set("clickCount", js.undefined)
    @scala.inline
    def setSkipHover(value: Boolean): Self = this.set("skipHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipHover: Self = this.set("skipHover", js.undefined)
  }
  
}

