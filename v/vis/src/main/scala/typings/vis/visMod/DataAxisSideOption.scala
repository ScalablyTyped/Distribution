package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataAxisSideOption extends js.Object {
  var format: js.UndefOr[js.Function0[String]] = js.undefined
  var range: js.UndefOr[RangeType] = js.undefined
  var title: js.UndefOr[TitleOption] = js.undefined
}

object DataAxisSideOption {
  @scala.inline
  def apply(format: () => String = null, range: RangeType = null, title: TitleOption = null): DataAxisSideOption = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction0(format))
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAxisSideOption]
  }
}

