package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLSX$Utils extends js.Object {
  var consts: XLSX$Consts = js.native
  def aoa_to_sheet(data: js.Array[js.Array[_]]): WorkSheet = js.native
  def aoa_to_sheet(data: js.Array[js.Array[_]], opts: AOA2SheetOpts): WorkSheet = js.native
  /* --- Import Functions --- */
  /** Converts an array of arrays of JS data to a worksheet. */
  @JSName("aoa_to_sheet")
  def aoa_to_sheet_T[T](data: js.Array[js.Array[T]]): WorkSheet = js.native
  @JSName("aoa_to_sheet")
  def aoa_to_sheet_T[T](data: js.Array[js.Array[T]], opts: AOA2SheetOpts): WorkSheet = js.native
  /** Append a worksheet to a workbook */
  def book_append_sheet(workbook: WorkBook, worksheet: WorkSheet): scala.Unit = js.native
  def book_append_sheet(workbook: WorkBook, worksheet: WorkSheet, name: java.lang.String): scala.Unit = js.native
  /* --- General Utilities --- */
  /** Creates a new workbook */
  def book_new(): WorkBook = js.native
  def book_set_sheet_visibility(workbook: WorkBook, sheet: java.lang.String, visibility: scala.Double): scala.Unit = js.native
  /** Set sheet visibility (visible/hidden/very hidden) */
  def book_set_sheet_visibility(workbook: WorkBook, sheet: scala.Double, visibility: scala.Double): scala.Unit = js.native
  /** Add comment to a cell */
  def cell_add_comment(cell: CellObject, text: java.lang.String): scala.Unit = js.native
  def cell_add_comment(cell: CellObject, text: java.lang.String, author: java.lang.String): scala.Unit = js.native
  /** Set hyperlink for a cell */
  def cell_set_hyperlink(cell: CellObject, target: java.lang.String): CellObject = js.native
  def cell_set_hyperlink(cell: CellObject, target: java.lang.String, tooltip: java.lang.String): CellObject = js.native
  /** Set internal link for a cell */
  def cell_set_internal_link(cell: CellObject, target: java.lang.String): CellObject = js.native
  def cell_set_internal_link(cell: CellObject, target: java.lang.String, tooltip: java.lang.String): CellObject = js.native
  /** Set number format for a cell */
  def cell_set_number_format(cell: CellObject, fmt: java.lang.String): CellObject = js.native
  def cell_set_number_format(cell: CellObject, fmt: scala.Double): CellObject = js.native
  /** Converts A1 cell address to 0-indexed form */
  def decode_cell(address: java.lang.String): CellAddress = js.native
  /** Converts A1 column to 0-indexed form */
  def decode_col(col: java.lang.String): scala.Double = js.native
  /** Converts A1 range to 0-indexed form */
  def decode_range(range: java.lang.String): Range = js.native
  /** Converts A1 row to 0-indexed form */
  def decode_row(row: java.lang.String): scala.Double = js.native
  /* --- Cell Address Utilities --- */
  /** Converts 0-indexed cell address to A1 form */
  def encode_cell(cell: CellAddress): java.lang.String = js.native
  /** Converts 0-indexed column to A1 form */
  def encode_col(col: scala.Double): java.lang.String = js.native
  def encode_range(r: Range): java.lang.String = js.native
  /** Converts 0-indexed range to A1 form */
  def encode_range(s: CellAddress, e: CellAddress): java.lang.String = js.native
  /** Converts 0-indexed row to A1 form */
  def encode_row(row: scala.Double): java.lang.String = js.native
  /** Format cell */
  def format_cell(cell: CellObject): java.lang.String = js.native
  def format_cell(cell: CellObject, v: js.Any): java.lang.String = js.native
  def format_cell(cell: CellObject, v: js.Any, opts: js.Any): java.lang.String = js.native
  def json_to_sheet(data: js.Array[_]): WorkSheet = js.native
  def json_to_sheet(data: js.Array[_], opts: JSON2SheetOpts): WorkSheet = js.native
  /** Converts an array of JS objects to a worksheet. */
  @JSName("json_to_sheet")
  def json_to_sheet_T[T](data: js.Array[T]): WorkSheet = js.native
  @JSName("json_to_sheet")
  def json_to_sheet_T[T](data: js.Array[T], opts: JSON2SheetOpts): WorkSheet = js.native
  def sheet_add_aoa(ws: WorkSheet, data: js.Array[js.Array[_]]): WorkSheet = js.native
  def sheet_add_aoa(ws: WorkSheet, data: js.Array[js.Array[_]], opts: SheetAOAOpts): WorkSheet = js.native
  /** Add an array of arrays of JS data to a worksheet */
  @JSName("sheet_add_aoa")
  def sheet_add_aoa_T[T](ws: WorkSheet, data: js.Array[js.Array[T]]): WorkSheet = js.native
  @JSName("sheet_add_aoa")
  def sheet_add_aoa_T[T](ws: WorkSheet, data: js.Array[js.Array[T]], opts: SheetAOAOpts): WorkSheet = js.native
  /** Add an array of JS objects to a worksheet */
  def sheet_add_json(ws: WorkSheet, data: js.Array[_]): WorkSheet = js.native
  def sheet_add_json(ws: WorkSheet, data: js.Array[_], opts: SheetJSONOpts): WorkSheet = js.native
  @JSName("sheet_add_json")
  def sheet_add_json_T[T](ws: WorkSheet, data: js.Array[T]): WorkSheet = js.native
  @JSName("sheet_add_json")
  def sheet_add_json_T[T](ws: WorkSheet, data: js.Array[T], opts: SheetJSONOpts): WorkSheet = js.native
  def sheet_set_array_formula(ws: WorkSheet, range: java.lang.String, formula: java.lang.String): WorkSheet = js.native
  /** Assign an Array Formula to a range */
  def sheet_set_array_formula(ws: WorkSheet, range: Range, formula: java.lang.String): WorkSheet = js.native
  /** Generates delimiter-separated-values output */
  def sheet_to_csv(worksheet: WorkSheet): java.lang.String = js.native
  def sheet_to_csv(worksheet: WorkSheet, options: Sheet2CSVOpts): java.lang.String = js.native
  /** Generates DIF */
  def sheet_to_dif(worksheet: WorkSheet): java.lang.String = js.native
  def sheet_to_dif(worksheet: WorkSheet, options: Sheet2HTMLOpts): java.lang.String = js.native
  /** Generates ETH */
  def sheet_to_eth(worksheet: WorkSheet): java.lang.String = js.native
  def sheet_to_eth(worksheet: WorkSheet, options: Sheet2HTMLOpts): java.lang.String = js.native
  /** Generates a list of the formulae (with value fallbacks) */
  def sheet_to_formulae(worksheet: WorkSheet): js.Array[java.lang.String] = js.native
  /** Generates HTML */
  def sheet_to_html(worksheet: WorkSheet): java.lang.String = js.native
  def sheet_to_html(worksheet: WorkSheet, options: Sheet2HTMLOpts): java.lang.String = js.native
  def sheet_to_json(worksheet: WorkSheet): js.Array[js.Array[_]] = js.native
  def sheet_to_json(worksheet: WorkSheet, opts: Sheet2JSONOpts): js.Array[js.Array[_]] = js.native
  /* --- Export Functions --- */
  /** Converts a worksheet object to an array of JSON objects */
  @JSName("sheet_to_json")
  def sheet_to_json_T[T](worksheet: WorkSheet): js.Array[T] = js.native
  @JSName("sheet_to_json")
  def sheet_to_json_T[T](worksheet: WorkSheet, opts: Sheet2JSONOpts): js.Array[T] = js.native
  /** Generates SYLK (Symbolic Link) */
  def sheet_to_slk(worksheet: WorkSheet): java.lang.String = js.native
  def sheet_to_slk(worksheet: WorkSheet, options: Sheet2HTMLOpts): java.lang.String = js.native
  /** Generates UTF16 Formatted Text */
  def sheet_to_txt(worksheet: WorkSheet): java.lang.String = js.native
  def sheet_to_txt(worksheet: WorkSheet, options: Sheet2CSVOpts): java.lang.String = js.native
  def table_to_book(data: js.Any): WorkBook = js.native
  def table_to_book(data: js.Any, opts: Table2SheetOpts): WorkBook = js.native
  /** BROWSER ONLY! Converts a TABLE DOM element to a worksheet. */
  def table_to_sheet(data: js.Any): WorkSheet = js.native
  def table_to_sheet(data: js.Any, opts: Table2SheetOpts): WorkSheet = js.native
}

