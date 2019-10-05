package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetVersionDeferral extends js.Object {
  def complete(): Unit
}

object ISetVersionDeferral {
  @scala.inline
  def apply(complete: () => Unit): ISetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[ISetVersionDeferral]
  }
}

