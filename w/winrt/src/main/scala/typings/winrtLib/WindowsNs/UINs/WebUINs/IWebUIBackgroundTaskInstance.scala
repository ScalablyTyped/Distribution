package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUIBackgroundTaskInstance extends js.Object {
  var succeeded: scala.Boolean
}

object IWebUIBackgroundTaskInstance {
  @scala.inline
  def apply(succeeded: scala.Boolean): IWebUIBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(succeeded = succeeded)
  
    __obj.asInstanceOf[IWebUIBackgroundTaskInstance]
  }
}

