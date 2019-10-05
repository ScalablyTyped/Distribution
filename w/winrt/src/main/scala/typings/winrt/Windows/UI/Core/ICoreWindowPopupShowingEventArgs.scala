package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowPopupShowingEventArgs extends js.Object {
  def setDesiredSize(value: Size): Unit
}

object ICoreWindowPopupShowingEventArgs {
  @scala.inline
  def apply(setDesiredSize: Size => Unit): ICoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal(setDesiredSize = js.Any.fromFunction1(setDesiredSize))
  
    __obj.asInstanceOf[ICoreWindowPopupShowingEventArgs]
  }
}

