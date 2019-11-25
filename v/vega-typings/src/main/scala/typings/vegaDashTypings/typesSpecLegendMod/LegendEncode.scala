package typings.vegaDashTypings.typesSpecLegendMod

import typings.vegaDashTypings.typesSpecEncodeMod.GroupEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.RectEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.SymbolEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.TextEncodeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendEncode extends js.Object {
  var entries: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
  var gradient: js.UndefOr[GuideEncodeEntry[RectEncodeEntry]] = js.undefined
  var labels: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
  var legend: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
  var symbols: js.UndefOr[GuideEncodeEntry[SymbolEncodeEntry]] = js.undefined
  var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
}

object LegendEncode {
  @scala.inline
  def apply(
    entries: GuideEncodeEntry[GroupEncodeEntry] = null,
    gradient: GuideEncodeEntry[RectEncodeEntry] = null,
    labels: GuideEncodeEntry[TextEncodeEntry] = null,
    legend: GuideEncodeEntry[GroupEncodeEntry] = null,
    symbols: GuideEncodeEntry[SymbolEncodeEntry] = null,
    title: GuideEncodeEntry[TextEncodeEntry] = null
  ): LegendEncode = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (symbols != null) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendEncode]
  }
}

