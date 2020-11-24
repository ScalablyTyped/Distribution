package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", "addUnicodeData")
@js.native
object addUnicodeData extends js.Object {
  
  /**
    * Adds to the list of Unicode tokens that XRegExp regexes can match via `\p` or `\P`.
    *
    * @param data - Objects with named character ranges. Each object may have properties
    *   `name`, `alias`, `isBmpLast`, `inverseOf`, `bmp`, and `astral`. All but `name` are
    *   optional, although one of `bmp` or `astral` is required (unless `inverseOf` is set). If
    *   `astral` is absent, the `bmp` data is used for BMP and astral modes. If `bmp` is absent,
    *   the name errors in BMP mode but works in astral mode. If both `bmp` and `astral` are
    *   provided, the `bmp` data only is used in BMP mode, and the combination of `bmp` and
    *   `astral` data is used in astral mode. `isBmpLast` is needed when a token matches orphan
    *   high surrogates *and* uses surrogate pairs to match astral code points. The `bmp` and
    *   `astral` data should be a combination of literal characters and `\xHH` or `\\uHHHH` escape
    *   sequences, with hyphens to create ranges. Any regex metacharacters in the data should be
    *   escaped, apart from range-creating hyphens. The `astral` data can additionally use
    *   character classes and alternation, and should use surrogate pairs to represent astral code
    *   points. `inverseOf` can be used to avoid duplicating character data if a Unicode token is
    *   defined as the exact inverse of another token.
    * @example
    *
    * // Basic use
    * XRegExp.addUnicodeData([{
    *   name: 'XDigit',
    *   alias: 'Hexadecimal',
    *   bmp: '0-9A-Fa-f'
    * }]);
    * XRegExp('\\p{XDigit}:\\p{Hexadecimal}+').test('0:3D'); // -> true
    */
  def apply(data: js.Array[UnicodeCharacterRange]): Unit = js.native
}
