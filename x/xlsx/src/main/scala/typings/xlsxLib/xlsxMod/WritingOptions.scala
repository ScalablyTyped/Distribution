package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritingOptions extends CommonOptions {
  /** Override workbook properties on save */
  var Props: js.UndefOr[Properties] = js.undefined
  /**
    * Generate Shared String Table
    * @default false
    */
  var bookSST: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * File format of generated workbook
    * @default 'xlsx'
    */
  var bookType: js.UndefOr[BookType] = js.undefined
  /**
    * Use ZIP compression for ZIP-based formats
    * @default false
    */
  var compression: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Suppress "number stored as text" errors in generated files
    * @default true
    */
  var ignoreEC: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of Worksheet (for single-sheet formats)
    * @default ''
    */
  var sheet: js.UndefOr[java.lang.String] = js.undefined
  /** Output data encoding */
  var `type`: js.UndefOr[
    xlsxLib.xlsxLibStrings.base64 | xlsxLib.xlsxLibStrings.binary | xlsxLib.xlsxLibStrings.buffer | xlsxLib.xlsxLibStrings.file | xlsxLib.xlsxLibStrings.array | xlsxLib.xlsxLibStrings.string
  ] = js.undefined
}

object WritingOptions {
  @scala.inline
  def apply(
    Props: Properties = null,
    WTF: js.UndefOr[scala.Boolean] = js.undefined,
    bookSST: js.UndefOr[scala.Boolean] = js.undefined,
    bookType: BookType = null,
    bookVBA: js.UndefOr[scala.Boolean] = js.undefined,
    cellDates: js.UndefOr[scala.Boolean] = js.undefined,
    cellStyles: js.UndefOr[scala.Boolean] = js.undefined,
    compression: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreEC: js.UndefOr[scala.Boolean] = js.undefined,
    sheet: java.lang.String = null,
    `type`: xlsxLib.xlsxLibStrings.base64 | xlsxLib.xlsxLibStrings.binary | xlsxLib.xlsxLibStrings.buffer | xlsxLib.xlsxLibStrings.file | xlsxLib.xlsxLibStrings.array | xlsxLib.xlsxLibStrings.string = null
  ): WritingOptions = {
    val __obj = js.Dynamic.literal()
    if (Props != null) __obj.updateDynamic("Props")(Props)
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (!js.isUndefined(bookSST)) __obj.updateDynamic("bookSST")(bookSST)
    if (bookType != null) __obj.updateDynamic("bookType")(bookType)
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA)
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates)
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles)
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression)
    if (!js.isUndefined(ignoreEC)) __obj.updateDynamic("ignoreEC")(ignoreEC)
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritingOptions]
  }
}

