package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskCompletedEventArgs extends js.Object {
  var instanceId: String
  def checkResult(): Unit
}

object IBackgroundTaskCompletedEventArgs {
  @scala.inline
  def apply(checkResult: () => Unit, instanceId: String): IBackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(checkResult = js.Any.fromFunction0(checkResult), instanceId = instanceId)
  
    __obj.asInstanceOf[IBackgroundTaskCompletedEventArgs]
  }
}

