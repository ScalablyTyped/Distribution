package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  //#region constructor
  /**
    * Creates an extended regular expression object for matching text with a pattern. Differs from a
    * native regular expression in that additional syntax and flags are supported. The returned object
    * is in fact a native `RegExp` and works with all native methods.
    *
    * @param pattern - Regex pattern string, or an existing regex object to copy.
    * @param flags - Any combination of flags.
    *
    *   Native flags:
    *     - `g` - global
    *     - `i` - ignore case
    *     - `m` - multiline anchors
    *     - `u` - unicode (ES6)
    *     - `y` - sticky (Firefox 3+, ES6)
    *
    *   Additional XRegExp flags:
    *     - `n` - explicit capture
    *     - `s` - dot matches all (aka singleline)
    *     - `x` - free-spacing and line comments (aka extended)
    *     - `A` - astral (requires the Unicode Base addon)
    *
    *   **Flags cannot be provided when constructing one `RegExp` from another.**
    * @returns Extended regular expression object.
    * @example
    *
    * // With named capture and flag x
    * XRegExp('(?<year>  [0-9]{4} ) -?  # year  \n\
    *          (?<month> [0-9]{2} ) -?  # month \n\
    *          (?<day>   [0-9]{2} )     # day   ', 'x');
    *
    * // Providing a regex object copies it. Native regexes are recompiled using native (not XRegExp)
    * // syntax. Copies maintain extended data, are augmented with `XRegExp.prototype` properties, and
    * // have fresh `lastIndex` properties (set to zero).
    * XRegExp(/regex/);
    */
  def apply(pattern: String): RegExp = js.native
  def apply(pattern: String, flags: js.UndefOr[String]): RegExp = js.native
  def apply(pattern: String, flags: String): RegExp = js.native
  def apply(pattern: RegExp): RegExp = js.native
  def apply(pattern: RegExp, flags: js.UndefOr[String]): RegExp = js.native
}
