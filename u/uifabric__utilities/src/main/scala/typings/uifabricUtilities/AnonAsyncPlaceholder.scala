package typings.uifabricUtilities

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncPlaceholder extends js.Object {
  var asyncPlaceholder: js.UndefOr[ReactType[_]] = js.undefined
}

object AnonAsyncPlaceholder {
  @scala.inline
  def apply(asyncPlaceholder: ReactType[_] = null): AnonAsyncPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (asyncPlaceholder != null) __obj.updateDynamic("asyncPlaceholder")(asyncPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncPlaceholder]
  }
}

