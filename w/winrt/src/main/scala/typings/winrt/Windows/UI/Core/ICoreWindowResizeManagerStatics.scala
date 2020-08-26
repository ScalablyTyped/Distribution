package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowResizeManagerStatics extends js.Object {
  def getForCurrentView(): CoreWindowResizeManager = js.native
}

object ICoreWindowResizeManagerStatics {
  @scala.inline
  def apply(getForCurrentView: () => CoreWindowResizeManager): ICoreWindowResizeManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[ICoreWindowResizeManagerStatics]
  }
  @scala.inline
  implicit class ICoreWindowResizeManagerStaticsOps[Self <: ICoreWindowResizeManagerStatics] (val x: Self) extends AnyVal {
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
    def setGetForCurrentView(value: () => CoreWindowResizeManager): Self = this.set("getForCurrentView", js.Any.fromFunction0(value))
  }
  
}

