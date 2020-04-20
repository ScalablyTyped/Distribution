package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileUpdaterUI extends js.Object {
  var onfileupdaterequested: js.Any
  var onuirequested: js.Any
  var title: String
  var uIStatus: UIStatus
  var updateTarget: CachedFileTarget
}

object ICachedFileUpdaterUI {
  @scala.inline
  def apply(
    onfileupdaterequested: js.Any,
    onuirequested: js.Any,
    title: String,
    uIStatus: UIStatus,
    updateTarget: CachedFileTarget
  ): ICachedFileUpdaterUI = {
    val __obj = js.Dynamic.literal(onfileupdaterequested = onfileupdaterequested.asInstanceOf[js.Any], onuirequested = onuirequested.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uIStatus = uIStatus.asInstanceOf[js.Any], updateTarget = updateTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICachedFileUpdaterUI]
  }
}

