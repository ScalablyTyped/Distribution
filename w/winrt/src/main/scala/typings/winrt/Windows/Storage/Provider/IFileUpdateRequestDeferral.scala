package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdateRequestDeferral extends js.Object {
  def complete(): Unit
}

object IFileUpdateRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): IFileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IFileUpdateRequestDeferral]
  }
}

