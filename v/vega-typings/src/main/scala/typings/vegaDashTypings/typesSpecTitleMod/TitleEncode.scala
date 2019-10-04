package typings.vegaDashTypings.typesSpecTitleMod

import typings.vegaDashTypings.typesSpecEncodeMod.GroupEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.TextEncodeEntry
import typings.vegaDashTypings.typesSpecLegendMod.GuideEncodeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleEncode extends js.Object {
  /**
    * Custom encoding for the title container group.
    */
  var group: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
  /**
    * Custom encoding for the subtitle text.
    */
  var subtitle: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
  /**
    * Custom encoding for the title text.
    */
  var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
}

object TitleEncode {
  @scala.inline
  def apply(
    group: GuideEncodeEntry[GroupEncodeEntry] = null,
    subtitle: GuideEncodeEntry[TextEncodeEntry] = null,
    title: GuideEncodeEntry[TextEncodeEntry] = null
  ): TitleEncode = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TitleEncode]
  }
}

