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

