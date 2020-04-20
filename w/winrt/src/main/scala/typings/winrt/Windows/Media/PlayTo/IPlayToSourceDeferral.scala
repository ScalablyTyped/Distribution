package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceDeferral extends js.Object {
  def complete(): Unit
}

object IPlayToSourceDeferral {
  @scala.inline
  def apply(complete: () => Unit): IPlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IPlayToSourceDeferral]
  }
}

