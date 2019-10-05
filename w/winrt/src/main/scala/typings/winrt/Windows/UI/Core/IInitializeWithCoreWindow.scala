package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitializeWithCoreWindow extends js.Object {
  def initialize(window: CoreWindow): Unit
}

object IInitializeWithCoreWindow {
  @scala.inline
  def apply(initialize: CoreWindow => Unit): IInitializeWithCoreWindow = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize))
  
    __obj.asInstanceOf[IInitializeWithCoreWindow]
  }
}

