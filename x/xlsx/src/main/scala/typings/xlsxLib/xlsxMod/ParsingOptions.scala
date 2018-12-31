package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsingOptions extends CommonOptions {
  /**
    * If true, parse calculation chains
    * @default false
    */
  var bookDeps: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, add raw files to book object
    * @default false
    */
  var bookFiles: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, only parse enough to get book metadata
    * @default false
    */
  var bookProps: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, only parse enough to get the sheet names
    * @default false
    */
  var bookSheets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save formulae to the .f field
    * @default true
    */
  var cellFormula: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Parse rich text and save HTML to the .h field
    * @default true
    */
  var cellHTML: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save number format string to the .z field
    * @default false
    */
  var cellNF: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Generate formatted text to the .w field
    * @default true
    */
  var cellText: js.UndefOr[scala.Boolean] = js.undefined
  /** Default codepage */
  var codepage: js.UndefOr[scala.Double] = js.undefined
  /** Override default date format (code 14) */
  var dateNF: js.UndefOr[java.lang.String] = js.undefined
  var dense: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If defined and file is encrypted, use password
    * @default ''
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /* If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If >0, read the first sheetRows rows
    * @default 0
    */
  var sheetRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * Create cell objects for stub cells
    * @default false
    */
  var sheetStubs: js.UndefOr[scala.Boolean] = js.undefined
  /** Input data encoding */
  var `type`: js.UndefOr[
    xlsxLib.xlsxLibStrings.base64 | xlsxLib.xlsxLibStrings.binary | xlsxLib.xlsxLibStrings.buffer | xlsxLib.xlsxLibStrings.file | xlsxLib.xlsxLibStrings.array | xlsxLib.xlsxLibStrings.string
  ] = js.undefined
}

