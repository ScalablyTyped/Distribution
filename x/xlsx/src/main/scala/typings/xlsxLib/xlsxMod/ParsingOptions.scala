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

object ParsingOptions {
  @scala.inline
  def apply(
    WTF: js.UndefOr[scala.Boolean] = js.undefined,
    bookDeps: js.UndefOr[scala.Boolean] = js.undefined,
    bookFiles: js.UndefOr[scala.Boolean] = js.undefined,
    bookProps: js.UndefOr[scala.Boolean] = js.undefined,
    bookSheets: js.UndefOr[scala.Boolean] = js.undefined,
    bookVBA: js.UndefOr[scala.Boolean] = js.undefined,
    cellDates: js.UndefOr[scala.Boolean] = js.undefined,
    cellFormula: js.UndefOr[scala.Boolean] = js.undefined,
    cellHTML: js.UndefOr[scala.Boolean] = js.undefined,
    cellNF: js.UndefOr[scala.Boolean] = js.undefined,
    cellStyles: js.UndefOr[scala.Boolean] = js.undefined,
    cellText: js.UndefOr[scala.Boolean] = js.undefined,
    codepage: scala.Int | scala.Double = null,
    dateNF: java.lang.String = null,
    dense: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    sheetRows: scala.Int | scala.Double = null,
    sheetStubs: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: xlsxLib.xlsxLibStrings.base64 | xlsxLib.xlsxLibStrings.binary | xlsxLib.xlsxLibStrings.buffer | xlsxLib.xlsxLibStrings.file | xlsxLib.xlsxLibStrings.array | xlsxLib.xlsxLibStrings.string = null
  ): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (!js.isUndefined(bookDeps)) __obj.updateDynamic("bookDeps")(bookDeps)
    if (!js.isUndefined(bookFiles)) __obj.updateDynamic("bookFiles")(bookFiles)
    if (!js.isUndefined(bookProps)) __obj.updateDynamic("bookProps")(bookProps)
    if (!js.isUndefined(bookSheets)) __obj.updateDynamic("bookSheets")(bookSheets)
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA)
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates)
    if (!js.isUndefined(cellFormula)) __obj.updateDynamic("cellFormula")(cellFormula)
    if (!js.isUndefined(cellHTML)) __obj.updateDynamic("cellHTML")(cellHTML)
    if (!js.isUndefined(cellNF)) __obj.updateDynamic("cellNF")(cellNF)
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles)
    if (!js.isUndefined(cellText)) __obj.updateDynamic("cellText")(cellText)
    if (codepage != null) __obj.updateDynamic("codepage")(codepage.asInstanceOf[js.Any])
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF)
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (sheetRows != null) __obj.updateDynamic("sheetRows")(sheetRows.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetStubs)) __obj.updateDynamic("sheetStubs")(sheetStubs)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingOptions]
  }
}

