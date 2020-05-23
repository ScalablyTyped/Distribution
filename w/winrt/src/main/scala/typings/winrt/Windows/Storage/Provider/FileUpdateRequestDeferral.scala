package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUpdateRequestDeferral extends IFileUpdateRequestDeferral

object FileUpdateRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): FileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[FileUpdateRequestDeferral]
  }
}

