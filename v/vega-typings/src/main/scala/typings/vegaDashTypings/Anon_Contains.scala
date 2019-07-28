package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecAutosizeMod.AutoSize
import typings.vegaDashTypings.typesSpecAutosizeMod.AutoSizeType
import typings.vegaDashTypings.vegaDashTypingsStrings.content
import typings.vegaDashTypings.vegaDashTypingsStrings.padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contains extends AutoSize {
  var contains: js.UndefOr[content | padding] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  var `type`: AutoSizeType
}

object Anon_Contains {
  @scala.inline
  def apply(
    `type`: AutoSizeType,
    contains: content | padding = null,
    resize: js.UndefOr[Boolean] = js.undefined
  ): Anon_Contains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[Anon_Contains]
  }
}

