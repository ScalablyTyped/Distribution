package typings.xregexp.anon

import typings.xregexp.mod.UnicodeCharacterRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined xregexp.xregexp.PickRequired<xregexp.xregexp.UnicodeCharacterRangeBase, 'bmp'> */
trait PickRequiredUnicodeCharacAlias extends UnicodeCharacterRange {
  /**
    * An alternate name for the character range.
    */
  var alias: js.UndefOr[String] = js.undefined
  /**
    * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
    * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
    * When `bmp` is not present this `name` will error in BMP mode, but works in astral mode.
    * When this is present, it is used in combination with `bmp` in astral mode.
    * This can additionally use character classes and alternation, and should use surrogate pairs to represent astral code points.
    */
  var astral: js.UndefOr[String] = js.undefined
  /**
    * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
    * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
    * When `astral` is not present, this is used BMP and astral modes.
    * When this is present, it is used in BMP mode and in combination with `astral` in astral mode.
    */
  var bmp: js.UndefOr[String] = js.undefined
  /**
    * Can be used to avoid duplicating character data if a Unicode token is defined as the exact inverse of another token.
    */
  var inverseOf: js.UndefOr[String] = js.undefined
  /**
    * This is needed when a token matches orphan high surrogates *and* uses surrogate pairs to match astral code points.
    */
  var isBmpLast: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the character range.
    */
  var name: String
}

object PickRequiredUnicodeCharacAlias {
  @scala.inline
  def apply(
    name: String,
    alias: String = null,
    astral: String = null,
    bmp: String = null,
    inverseOf: String = null,
    isBmpLast: js.UndefOr[Boolean] = js.undefined
  ): PickRequiredUnicodeCharacAlias = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (astral != null) __obj.updateDynamic("astral")(astral.asInstanceOf[js.Any])
    if (bmp != null) __obj.updateDynamic("bmp")(bmp.asInstanceOf[js.Any])
    if (inverseOf != null) __obj.updateDynamic("inverseOf")(inverseOf.asInstanceOf[js.Any])
    if (!js.isUndefined(isBmpLast)) __obj.updateDynamic("isBmpLast")(isBmpLast.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequiredUnicodeCharacAlias]
  }
}

