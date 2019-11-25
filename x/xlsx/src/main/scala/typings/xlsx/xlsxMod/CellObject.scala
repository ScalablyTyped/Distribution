package typings.xlsx.xlsxMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellObject extends js.Object {
  /** Range of enclosing array if formula is array formula (if applicable) */
  var F: js.UndefOr[String] = js.undefined
  /** Comments associated with the cell */
  var c: js.UndefOr[js.Array[Comment]] = js.undefined
  /** Cell formula (if applicable) */
  var f: js.UndefOr[String] = js.undefined
  /** HTML rendering of the rich text (if applicable) */
  var h: js.UndefOr[String] = js.undefined
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
  var v: js.UndefOr[String | Double | Boolean | Date] = js.undefined
  /** Formatted text (if applicable) */
  var w: js.UndefOr[String] = js.undefined
  /** Number format string associated with the cell (if requested) */
  var z: js.UndefOr[NumberFormat] = js.undefined
}

object CellObject {
  @scala.inline
  def apply(
    t: ExcelDataType,
    F: String = null,
    c: js.Array[Comment] = null,
    f: String = null,
    h: String = null,
    l: Hyperlink = null,
    r: js.Any = null,
    s: js.Any = null,
    v: String | Double | Boolean | Date = null,
    w: String = null,
    z: NumberFormat = null
  ): CellObject = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    if (F != null) __obj.updateDynamic("F")(F.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellObject]
  }
}

