package typings
package vegaDashEmbedLib.vegaDashEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hover extends js.Object {
  var hoverSet: js.UndefOr[vegaDashTypingsLib.typesSpecEncodeMod.EncodeEntryName] = js.undefined
  var updateSet: js.UndefOr[vegaDashTypingsLib.typesSpecEncodeMod.EncodeEntryName] = js.undefined
}

object Hover {
  @scala.inline
  def apply(
    hoverSet: vegaDashTypingsLib.typesSpecEncodeMod.EncodeEntryName = null,
    updateSet: vegaDashTypingsLib.typesSpecEncodeMod.EncodeEntryName = null
  ): Hover = {
    val __obj = js.Dynamic.literal()
    if (hoverSet != null) __obj.updateDynamic("hoverSet")(hoverSet)
    if (updateSet != null) __obj.updateDynamic("updateSet")(updateSet)
    __obj.asInstanceOf[Hover]
  }
}

