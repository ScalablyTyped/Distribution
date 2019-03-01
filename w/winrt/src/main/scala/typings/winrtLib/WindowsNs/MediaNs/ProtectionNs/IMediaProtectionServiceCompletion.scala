package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaProtectionServiceCompletion extends js.Object {
  def complete(success: scala.Boolean): scala.Unit
}

object IMediaProtectionServiceCompletion {
  @scala.inline
  def apply(complete: js.Function1[scala.Boolean, scala.Unit]): IMediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.asInstanceOf[IMediaProtectionServiceCompletion]
  }
}

