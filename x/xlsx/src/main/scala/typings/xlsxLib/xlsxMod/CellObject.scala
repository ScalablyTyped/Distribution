package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellObject extends js.Object {
  /** Range of enclosing array if formula is array formula (if applicable) */
  var F: js.UndefOr[java.lang.String] = js.undefined
  /** Comments associated with the cell */
  var c: js.UndefOr[js.Array[Comment]] = js.undefined
  /** Cell formula (if applicable) */
  var f: js.UndefOr[java.lang.String] = js.undefined
  /** HTML rendering of the rich text (if applicable) */
  var h: js.UndefOr[java.lang.String] = js.undefined
  /** Cell hyperlink object (.Target holds link, .tooltip is tooltip) */
  var l: js.UndefOr[Hyperlink] = js.undefined
  /** Rich text encoding (if applicable) */
  var r: js.UndefOr[js.Any] = js.undefined
  /** The style/theme of the cell (if applicable) */
  var s: js.UndefOr[js.Any] = js.undefined
  /**
       * The Excel Data Type of the cell.
       * b Boolean, n Number, e Error, s String, d Date, z Empty
       */
  var t: ExcelDataType
  /** The raw value of the cell.  Can be omitted if a formula is specified */
  var v: js.UndefOr[java.lang.String | scala.Double | scala.Boolean | stdLib.Date] = js.undefined
  /** Formatted text (if applicable) */
  var w: js.UndefOr[java.lang.String] = js.undefined
  /** Number format string associated with the cell (if requested) */
  var z: js.UndefOr[NumberFormat] = js.undefined
}

