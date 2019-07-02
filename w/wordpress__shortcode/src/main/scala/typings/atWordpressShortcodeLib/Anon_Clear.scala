package typings
package atWordpressShortcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Clear extends js.Object {
  /**
    * Parse shortcode attributes.
    *
    * @remarks
    * Shortcodes accept many types of attributes. These can chiefly be divided into
    * named and numeric attributes:
    *
    * Named attributes are assigned on a key/value basis, while numeric attributes
    * are treated as an array.
    *
    * Named attributes can be formatted as either `name="value"`, `name='value'`,
    * or `name=value`. Numeric attributes can be formatted as `"value"` or just
    * `value`.
    *
    * @param text - Serialised shortcode attributes.
    *
    * @returns Parsed shortcode attributes.
    */
  def apply(text: java.lang.String): atWordpressShortcodeLib.atWordpressShortcodeMod.ShortcodeAttrs = js.native
  /**
    * Used to clear the memoized cache of this function.
    */
  def clear(): scala.Unit = js.native
}

