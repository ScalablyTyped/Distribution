package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileUpdaterUI extends js.Object {
  var onfileupdaterequested: js.Any
  var onuirequested: js.Any
  var title: java.lang.String
  var uIStatus: UIStatus
  var updateTarget: CachedFileTarget
}

object ICachedFileUpdaterUI {
  @scala.inline
  def apply(
    onfileupdaterequested: js.Any,
    onuirequested: js.Any,
    title: java.lang.String,
    uIStatus: UIStatus,
    updateTarget: CachedFileTarget
  ): ICachedFileUpdaterUI = {
    val __obj = js.Dynamic.literal(onfileupdaterequested = onfileupdaterequested, onuirequested = onuirequested, title = title, uIStatus = uIStatus, updateTarget = updateTarget)
  
    __obj.asInstanceOf[ICachedFileUpdaterUI]
  }
}

