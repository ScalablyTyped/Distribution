package typings.twemoji.twemojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twemoji", "convert")
@js.native
object convert extends js.Object {
  /**
    * Given an HEX codepoint, returns UTF16 surrogate pairs.
    *
    * @param   codepoint string  generic codepoint, i.e. '1F4A9'
    * @return  string  codepoint transformed into utf16 surrogates pair,
    *          i.e. \\uD83D\\uDCA9
    *
    * @example
    *  twemoji.convert.fromCodePoint('1f1e8');
    *  // "\\ud83c\\udde8"
    *
    *  '1f1e8-1f1f3'.split('-').map(twemoji.convert.fromCodePoint).join('')
    *  // "\\ud83c\\udde8\\ud83c\\uddf3"
    */
  def fromCodePoint(codepoint: String): String = js.native
  /**
    * Given UTF16 surrogate pairs, returns the equivalent HEX codepoint.
    *
    * @param   unicodeSurrogates   string  generic utf16 surrogates pair, i.e. \\uD83D\\uDCA9
    * @param   sep                 string  optional separator for double code points, default='-'
    * @return  string  utf16 transformed into codepoint, i.e. '1F4A9'
    *
    * @example
    *  twemoji.convert.toCodePoint('\\ud83c\\udde8\\ud83c\\uddf3');
    *  // "1f1e8-1f1f3"
    *
    *  twemoji.convert.toCodePoint('\\ud83c\\udde8\\ud83c\\uddf3', '~');
    *  // "1f1e8~1f1f3"
    */
  def toCodePoint(unicodeSurrogates: String): String = js.native
  def toCodePoint(unicodeSurrogates: String, sep: String): String = js.native
}

