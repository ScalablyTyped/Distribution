package typings
package winrtLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrameworkView extends js.Object {
  def initialize(applicationView: CoreApplicationView): scala.Unit
  def load(entryPoint: java.lang.String): scala.Unit
  def run(): scala.Unit
  def setWindow(window: winrtLib.WindowsNs.UINs.CoreNs.CoreWindow): scala.Unit
  def uninitialize(): scala.Unit
}

object IFrameworkView {
  @scala.inline
  def apply(
    initialize: js.Function1[CoreApplicationView, scala.Unit],
    load: js.Function1[java.lang.String, scala.Unit],
    run: js.Function0[scala.Unit],
    setWindow: js.Function1[winrtLib.WindowsNs.UINs.CoreNs.CoreWindow, scala.Unit],
    uninitialize: js.Function0[scala.Unit]
  ): IFrameworkView = {
    val __obj = js.Dynamic.literal(initialize = initialize, load = load, run = run, setWindow = setWindow, uninitialize = uninitialize)
  
    __obj.asInstanceOf[IFrameworkView]
  }
}

