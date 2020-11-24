package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", "forEach")
@js.native
object forEach extends js.Object {
  
  /**
    * Executes a provided function once per regex match. Searches always start at the beginning of the
    * string and continue until the end, regardless of the state of the regex's `global` property and
    * initial `lastIndex`.
    *
    * @param str - String to search.
    * @param regex - Regex to search with.
    * @param callback - Function to execute for each match. Invoked with four arguments:
    *   - The match array, with named capture groups properties.
    *   - The zero-based match index.
    *   - The string being traversed.
    *   - The regex object being used to traverse the string.
    * @example
    *
    * // Extracts every other digit from a string
    * const evens = [];
    * XRegExp.forEach('1a2345', /\d/, (match, i) => {
    *   if (i % 2) evens.push(+match[0]);
    * });
    * // evens -> [2, 4]
    */
  def apply(
    str: String,
    regex: RegExp,
    callback: js.Function4[/* matches */ MatchArray, /* index */ Double, /* str */ String, /* regex */ RegExp, Unit]
  ): Unit = js.native
}
