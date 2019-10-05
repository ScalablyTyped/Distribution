package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.UI.Core.CoreWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrameworkView extends js.Object {
  def initialize(applicationView: CoreApplicationView): Unit
  def load(entryPoint: String): Unit
  def run(): Unit
  def setWindow(window: CoreWindow): Unit
  def uninitialize(): Unit
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
}

