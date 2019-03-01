package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdateRequestDeferral extends js.Object {
  def complete(): scala.Unit
}

object IFileUpdateRequestDeferral {
  @scala.inline
  def apply(complete: js.Function0[scala.Unit]): IFileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.asInstanceOf[IFileUpdateRequestDeferral]
  }
}

