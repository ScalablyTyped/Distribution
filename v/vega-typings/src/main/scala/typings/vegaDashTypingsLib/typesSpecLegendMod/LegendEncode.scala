package typings
package vegaDashTypingsLib.typesSpecLegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendEncode extends js.Object {
  var entries: js.UndefOr[GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry]] = js.undefined
  var gradient: js.UndefOr[GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.RectEncodeEntry]] = js.undefined
  var labels: js.UndefOr[GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry]] = js.undefined
  var legend: js.UndefOr[GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry]] = js.undefined
  var symbols: js.UndefOr[GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.SymbolEncodeEntry]] = js.undefined
  var title: js.UndefOr[GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry]] = js.undefined
}

object LegendEncode {
  @scala.inline
  def apply(
    entries: GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry] = null,
    gradient: GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.RectEncodeEntry] = null,
    labels: GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry] = null,
    legend: GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry] = null,
    symbols: GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.SymbolEncodeEntry] = null,
    title: GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry] = null
  ): LegendEncode = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (symbols != null) __obj.updateDynamic("symbols")(symbols)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LegendEncode]
  }
}

