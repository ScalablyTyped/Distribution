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
    initialize: CoreApplicationView => scala.Unit,
    load: java.lang.String => scala.Unit,
    run: () => scala.Unit,
    setWindow: winrtLib.WindowsNs.UINs.CoreNs.CoreWindow => scala.Unit,
    uninitialize: () => scala.Unit
  ): IFrameworkView = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), load = js.Any.fromFunction1(load), run = js.Any.fromFunction0(run), setWindow = js.Any.fromFunction1(setWindow), uninitialize = js.Any.fromFunction0(uninitialize))
  
    __obj.asInstanceOf[IFrameworkView]
  }
}

