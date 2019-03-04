package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetFileRequestDeferral extends js.Object {
  def complete(): scala.Unit
}

object ITargetFileRequestDeferral {
  @scala.inline
  def apply(complete: js.Function0[scala.Unit]): ITargetFileRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete)
  
    __obj.asInstanceOf[ITargetFileRequestDeferral]
  }
}

