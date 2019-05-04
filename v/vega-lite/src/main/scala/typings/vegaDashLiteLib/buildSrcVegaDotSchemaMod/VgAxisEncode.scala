package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgAxisEncode extends js.Object {
  var domain: js.UndefOr[VgGuideEncode] = js.undefined
  var grid: js.UndefOr[VgGuideEncode] = js.undefined
  var labels: js.UndefOr[VgGuideEncode] = js.undefined
  var ticks: js.UndefOr[VgGuideEncode] = js.undefined
  var title: js.UndefOr[VgGuideEncode] = js.undefined
}

object VgAxisEncode {
  @scala.inline
  def apply(
    domain: VgGuideEncode = null,
    grid: VgGuideEncode = null,
    labels: VgGuideEncode = null,
    ticks: VgGuideEncode = null,
    title: VgGuideEncode = null
  ): VgAxisEncode = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VgAxisEncode]
  }
}

