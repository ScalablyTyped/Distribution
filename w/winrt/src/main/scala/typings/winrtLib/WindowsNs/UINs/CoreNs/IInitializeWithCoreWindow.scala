package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitializeWithCoreWindow extends js.Object {
  def initialize(window: CoreWindow): scala.Unit
}

object IInitializeWithCoreWindow {
  @scala.inline
  def apply(initialize: js.Function1[CoreWindow, scala.Unit]): IInitializeWithCoreWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initialize")(initialize)
    __obj.asInstanceOf[IInitializeWithCoreWindow]
  }
}

