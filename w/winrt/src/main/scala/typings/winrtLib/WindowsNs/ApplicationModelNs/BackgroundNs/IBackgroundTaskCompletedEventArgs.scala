package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskCompletedEventArgs extends js.Object {
  var instanceId: java.lang.String
  def checkResult(): scala.Unit
}

object IBackgroundTaskCompletedEventArgs {
  @scala.inline
  def apply(checkResult: js.Function0[scala.Unit], instanceId: java.lang.String): IBackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(checkResult = checkResult, instanceId = instanceId)
  
    __obj.asInstanceOf[IBackgroundTaskCompletedEventArgs]
  }
}

