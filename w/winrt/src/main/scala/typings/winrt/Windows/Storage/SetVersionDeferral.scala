package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetVersionDeferral extends ISetVersionDeferral

object SetVersionDeferral {
  @scala.inline
  def apply(complete: () => Unit): SetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SetVersionDeferral]
  }
}

