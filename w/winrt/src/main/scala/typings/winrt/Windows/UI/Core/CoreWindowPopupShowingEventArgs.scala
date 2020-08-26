package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreWindowPopupShowingEventArgs extends ICoreWindowPopupShowingEventArgs

object CoreWindowPopupShowingEventArgs {
  @scala.inline
  def apply(setDesiredSize: Size => Unit): CoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal(setDesiredSize = js.Any.fromFunction1(setDesiredSize))
    __obj.asInstanceOf[CoreWindowPopupShowingEventArgs]
  }
}

