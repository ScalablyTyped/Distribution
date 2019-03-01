package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contains
  extends vegaDashTypingsLib.typesSpecAutosizeMod.AutoSize {
  var contains: js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.content | vegaDashTypingsLib.vegaDashTypingsLibStrings.padding
  ] = js.undefined
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: vegaDashTypingsLib.typesSpecAutosizeMod.AutoSizeType
}

object Anon_Contains {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.typesSpecAutosizeMod.AutoSizeType,
    contains: vegaDashTypingsLib.vegaDashTypingsLibStrings.content | vegaDashTypingsLib.vegaDashTypingsLibStrings.padding = null,
    resize: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Contains = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[Anon_Contains]
  }
}

