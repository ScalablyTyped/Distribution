package typings.vegaTypings

import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.autosizeMod.AutoSizeType
import typings.vegaTypings.vegaTypingsStrings.content
import typings.vegaTypings.vegaTypingsStrings.padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContains extends AutoSize {
  var contains: js.UndefOr[content | padding] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  var `type`: AutoSizeType
}

object AnonContains {
  @scala.inline
  def apply(
    `type`: AutoSizeType,
    contains: content | padding = null,
    resize: js.UndefOr[Boolean] = js.undefined
  ): AnonContains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContains]
  }
}

