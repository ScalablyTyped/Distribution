package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskSourceRequestedDeferral extends js.Object {
  def complete(): Unit
}

object IPrintTaskSourceRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): IPrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IPrintTaskSourceRequestedDeferral]
  }
}

