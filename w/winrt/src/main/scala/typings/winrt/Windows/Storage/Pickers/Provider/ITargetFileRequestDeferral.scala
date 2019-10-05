package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetFileRequestDeferral extends js.Object {
  def complete(): Unit
}

object ITargetFileRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): ITargetFileRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[ITargetFileRequestDeferral]
  }
}

