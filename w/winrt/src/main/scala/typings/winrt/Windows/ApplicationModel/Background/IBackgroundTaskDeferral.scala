package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskDeferral extends js.Object {
  def complete(): Unit
}

object IBackgroundTaskDeferral {
  @scala.inline
  def apply(complete: () => Unit): IBackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IBackgroundTaskDeferral]
  }
}

