package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Unicode character range.
  *
  * All properties but `name` are optional, although one of `bmp` or `astral` is required (unless `inverseOf` is set).
  */
/* Rewritten from type alias, can be one of: 
  - typings.xregexp.anon.PickRequiredUnicodeCharac
  - typings.xregexp.anon.PickRequiredUnicodeCharacAlias
  - typings.xregexp.anon.PickRequiredUnicodeCharacAstral
*/
trait UnicodeCharacterRange extends js.Object

object UnicodeCharacterRange {
  @scala.inline
  def PickRequiredUnicodeCharac(
    name: String,
    alias: String = null,
    astral: String = null,
    bmp: String = null,
    inverseOf: String = null,
    isBmpLast: js.UndefOr[Boolean] = js.undefined
  ): UnicodeCharacterRange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (astral != null) __obj.updateDynamic("astral")(astral.asInstanceOf[js.Any])
    if (bmp != null) __obj.updateDynamic("bmp")(bmp.asInstanceOf[js.Any])
    if (inverseOf != null) __obj.updateDynamic("inverseOf")(inverseOf.asInstanceOf[js.Any])
    if (!js.isUndefined(isBmpLast)) __obj.updateDynamic("isBmpLast")(isBmpLast.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeCharacterRange]
  }
  @scala.inline
  def PickRequiredUnicodeCharacAlias(
    name: String,
    alias: String = null,
    astral: String = null,
    bmp: String = null,
    inverseOf: String = null,
    isBmpLast: js.UndefOr[Boolean] = js.undefined
  ): UnicodeCharacterRange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (astral != null) __obj.updateDynamic("astral")(astral.asInstanceOf[js.Any])
    if (bmp != null) __obj.updateDynamic("bmp")(bmp.asInstanceOf[js.Any])
    if (inverseOf != null) __obj.updateDynamic("inverseOf")(inverseOf.asInstanceOf[js.Any])
    if (!js.isUndefined(isBmpLast)) __obj.updateDynamic("isBmpLast")(isBmpLast.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeCharacterRange]
  }
  @scala.inline
  def PickRequiredUnicodeCharacAstral(
    name: String,
    alias: String = null,
    astral: String = null,
    bmp: String = null,
    inverseOf: String = null,
    isBmpLast: js.UndefOr[Boolean] = js.undefined
  ): UnicodeCharacterRange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (astral != null) __obj.updateDynamic("astral")(astral.asInstanceOf[js.Any])
    if (bmp != null) __obj.updateDynamic("bmp")(bmp.asInstanceOf[js.Any])
    if (inverseOf != null) __obj.updateDynamic("inverseOf")(inverseOf.asInstanceOf[js.Any])
    if (!js.isUndefined(isBmpLast)) __obj.updateDynamic("isBmpLast")(isBmpLast.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeCharacterRange]
  }
}

