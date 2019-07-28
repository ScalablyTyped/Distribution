package typings.tetherDashDrop.tetherDashDropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropContextOptions extends js.Object {
  var classPrefix: js.UndefOr[String] = js.undefined
  var defaults: js.UndefOr[IDropOptions] = js.undefined
}

object IDropContextOptions {
  @scala.inline
  def apply(classPrefix: String = null, defaults: IDropOptions = null): IDropContextOptions = {
    val __obj = js.Dynamic.literal()
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[IDropContextOptions]
  }
}

