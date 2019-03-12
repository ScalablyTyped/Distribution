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
  def apply(initialize: CoreWindow => scala.Unit): IInitializeWithCoreWindow = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize))
  
    __obj.asInstanceOf[IInitializeWithCoreWindow]
  }
}

