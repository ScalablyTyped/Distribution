package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetApplicationChosenEventArgs extends js.Object {
  var applicationName: java.lang.String
}

object ITargetApplicationChosenEventArgs {
  @scala.inline
  def apply(applicationName: java.lang.String): ITargetApplicationChosenEventArgs = {
    val __obj = js.Dynamic.literal(applicationName = applicationName)
  
    __obj.asInstanceOf[ITargetApplicationChosenEventArgs]
  }
}

