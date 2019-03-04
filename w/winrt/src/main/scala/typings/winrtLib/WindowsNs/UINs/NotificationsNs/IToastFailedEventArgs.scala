package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastFailedEventArgs extends js.Object {
  var errorCode: scala.Double
}

object IToastFailedEventArgs {
  @scala.inline
  def apply(errorCode: scala.Double): IToastFailedEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode)
  
    __obj.asInstanceOf[IToastFailedEventArgs]
  }
}

