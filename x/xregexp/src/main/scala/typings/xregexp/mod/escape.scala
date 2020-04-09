package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "escape")
@js.native
object escape extends js.Object {
  /**
    * Escapes any regular expression metacharacters, for use when matching literal strings. The result
    * can safely be used at any point within a regex that uses any flags.
    *
    * @param str - String to escape.
    * @returns String with regex metacharacters escaped.
    * @example
    *
    * XRegExp.escape('Escaped? <.>');
    * // -> 'Escaped\?\ <\.>'
    */
  def apply(str: String): String = js.native
}

