package typings.uifabricUtilities

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncPlaceholder extends js.Object {
  var asyncPlaceholder: js.UndefOr[ElementType[_]] = js.undefined
}

object AnonAsyncPlaceholder {
  @scala.inline
  def apply(asyncPlaceholder: ElementType[_] = null): AnonAsyncPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (asyncPlaceholder != null) __obj.updateDynamic("asyncPlaceholder")(asyncPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncPlaceholder]
  }
}

