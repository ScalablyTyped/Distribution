package typings.vegaDashEmbed.vegaDashEmbedMod

import typings.vegaDashTypings.typesSpecEncodeMod.EncodeEntryName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hover extends js.Object {
  var hoverSet: js.UndefOr[EncodeEntryName] = js.undefined
  var updateSet: js.UndefOr[EncodeEntryName] = js.undefined
}

object Hover {
  @scala.inline
  def apply(hoverSet: EncodeEntryName = null, updateSet: EncodeEntryName = null): Hover = {
    val __obj = js.Dynamic.literal()
    if (hoverSet != null) __obj.updateDynamic("hoverSet")(hoverSet)
    if (updateSet != null) __obj.updateDynamic("updateSet")(updateSet)
    __obj.asInstanceOf[Hover]
  }
}

