package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeautifierOptions extends js.Object {
  /**
    * Output ASCII-safe? (encodes Unicode characters as ASCII)
    */
  var ascii_only: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Beautify output?
    */
  var beautify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use brackets every time?
    */
  var bracketize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Output comments?
    */
  var comments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Output IE-safe code?
    */
  var ie_proof: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indentation level (only when `beautify`)
    */
  var indent_level: js.UndefOr[scala.Double] = js.undefined
  /**
    * Start indentation on every line (only when `beautify`)
    */
  var indent_start: js.UndefOr[scala.Double] = js.undefined
  /**
    * Escape "</script"?
    */
  var inline_script: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum line length (for non-beautified output)
    */
  var max_line_len: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Quote all keys in {} literals?
    */
  var quote_keys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use semicolons to separate statements? (otherwise, newlines)
    */
  var semicolons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Output a source map
    */
  var source_map: js.UndefOr[SourceMap] = js.undefined
  /**
    * Add a space after colon signs?
    */
  var space_colon: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Informative maximum line width (for beautified output)
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

