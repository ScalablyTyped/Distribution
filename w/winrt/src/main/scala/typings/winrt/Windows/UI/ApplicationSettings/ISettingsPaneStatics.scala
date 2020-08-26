package typings.winrt.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettingsPaneStatics extends js.Object {
  var edge: SettingsEdgeLocation = js.native
  def getForCurrentView(): SettingsPane = js.native
  def show(): Unit = js.native
}

object ISettingsPaneStatics {
  @scala.inline
  def apply(edge: SettingsEdgeLocation, getForCurrentView: () => SettingsPane, show: () => Unit): ISettingsPaneStatics = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], getForCurrentView = js.Any.fromFunction0(getForCurrentView), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ISettingsPaneStatics]
  }
  @scala.inline
  implicit class ISettingsPaneStaticsOps[Self <: ISettingsPaneStatics] (val x: Self) extends AnyVal {
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
    def setEdge(value: SettingsEdgeLocation): Self = this.set("edge", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetForCurrentView(value: () => SettingsPane): Self = this.set("getForCurrentView", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

