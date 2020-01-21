package typings.uifabricUtilities

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultRender[T] extends js.Object {
  var defaultRender: js.UndefOr[ComponentType[T]] = js.undefined
}

object AnonDefaultRender {
  @scala.inline
  def apply[T](defaultRender: ComponentType[T] = null): AnonDefaultRender[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultRender[T]]
  }
}

