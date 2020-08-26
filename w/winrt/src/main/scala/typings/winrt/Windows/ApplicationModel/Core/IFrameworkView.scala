package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.UI.Core.CoreWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFrameworkView extends js.Object {
  def initialize(applicationView: CoreApplicationView): Unit = js.native
  def load(entryPoint: String): Unit = js.native
  def run(): Unit = js.native
  def setWindow(window: CoreWindow): Unit = js.native
  def uninitialize(): Unit = js.native
}

object IFrameworkView {
  @scala.inline
  def apply(
    initialize: CoreApplicationView => Unit,
    load: String => Unit,
    run: () => Unit,
    setWindow: CoreWindow => Unit,
    uninitialize: () => Unit
  ): IFrameworkView = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), load = js.Any.fromFunction1(load), run = js.Any.fromFunction0(run), setWindow = js.Any.fromFunction1(setWindow), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[IFrameworkView]
  }
  @scala.inline
  implicit class IFrameworkViewOps[Self <: IFrameworkView] (val x: Self) extends AnyVal {
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
    def setInitialize(value: CoreApplicationView => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: String => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
    @scala.inline
    def setSetWindow(value: CoreWindow => Unit): Self = this.set("setWindow", js.Any.fromFunction1(value))
    @scala.inline
    def setUninitialize(value: () => Unit): Self = this.set("uninitialize", js.Any.fromFunction0(value))
  }
  
}

