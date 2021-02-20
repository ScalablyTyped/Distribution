package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLSXUtils extends StObject {
  
  def aoa_to_sheet(data: js.Array[js.Array[_]]): WorkSheet = js.native
  def aoa_to_sheet(data: js.Array[js.Array[_]], opts: AOA2SheetOpts): WorkSheet = js.native
  /* --- Import Functions --- */
  /** Converts an array of arrays of JS data to a worksheet. */
  @JSName("aoa_to_sheet")
  def aoa_to_sheet_T[T](data: js.Array[js.Array[T]]): WorkSheet = js.native
  @JSName("aoa_to_sheet")
  def aoa_to_sheet_T[T](data: js.Array[js.Array[T]], opts: AOA2SheetOpts): WorkSheet = js.native
  
  /** Append a worksheet to a workbook */
  def book_append_sheet(workbook: WorkBook, worksheet: WorkSheet): Unit = js.native
  def book_append_sheet(workbook: WorkBook, worksheet: WorkSheet, name: String): Unit = js.native
  
  /* --- General Utilities --- */
  /** Creates a new workbook */
  def book_new(): WorkBook = js.native
  
  def book_set_sheet_visibility(workbook: WorkBook, sheet: String, visibility: Double): Unit = js.native
  /** Set sheet visibility (visible/hidden/very hidden) */
  def book_set_sheet_visibility(workbook: WorkBook, sheet: Double, visibility: Double): Unit = js.native
  
  /** Add comment to a cell */
  def cell_add_comment(cell: CellObject, text: String): Unit = js.native
  def cell_add_comment(cell: CellObject, text: String, author: String): Unit = js.native
  
  /** Set hyperlink for a cell */
  def cell_set_hyperlink(cell: CellObject, target: String): CellObject = js.native
  def cell_set_hyperlink(cell: CellObject, target: String, tooltip: String): CellObject = js.native
  
  /** Set internal link for a cell */
  def cell_set_internal_link(cell: CellObject, target: String): CellObject = js.native
  def cell_set_internal_link(cell: CellObject, target: String, tooltip: String): CellObject = js.native
  
  /** Set number format for a cell */
  def cell_set_number_format(cell: CellObject, fmt: String): CellObject = js.native
  def cell_set_number_format(cell: CellObject, fmt: Double): CellObject = js.native
  
  var consts: XLSXConsts = js.native
  
  /** Converts A1 cell address to 0-indexed form */
  def decode_cell(address: String): CellAddress = js.native
  
  /** Converts A1 column to 0-indexed form */
  def decode_col(col: String): Double = js.native
  
  /** Converts A1 range to 0-indexed form */
  def decode_range(range: String): Range = js.native
  
  /** Converts A1 row to 0-indexed form */
  def decode_row(row: String): Double = js.native
  
  /* --- Cell Address Utilities --- */
  /** Converts 0-indexed cell address to A1 form */
  def encode_cell(cell: CellAddress): String = js.native
  
  /** Converts 0-indexed column to A1 form */
  def encode_col(col: Double): String = js.native
  
  def encode_range(r: Range): String = js.native
  /** Converts 0-indexed range to A1 form */
  def encode_range(s: CellAddress, e: CellAddress): String = js.native
  
  /** Converts 0-indexed row to A1 form */
  def encode_row(row: Double): String = js.native
  
  /** Format cell */
  def format_cell(cell: CellObject): String = js.native
  def format_cell(cell: CellObject, v: js.UndefOr[scala.Nothing], opts: js.Any): String = js.native
  def format_cell(cell: CellObject, v: js.Any): String = js.native
  def format_cell(cell: CellObject, v: js.Any, opts: js.Any): String = js.native
  
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
  
  def sheet_add_dom(ws: WorkSheet, data: js.Any): WorkSheet = js.native
  def sheet_add_dom(ws: WorkSheet, data: js.Any, opts: Table2SheetOpts): WorkSheet = js.native
  
  /** Add an array of JS objects to a worksheet */
  def sheet_add_json(ws: WorkSheet, data: js.Array[_]): WorkSheet = js.native
  def sheet_add_json(ws: WorkSheet, data: js.Array[_], opts: SheetJSONOpts): WorkSheet = js.native
  @JSName("sheet_add_json")
  def sheet_add_json_T[T](ws: WorkSheet, data: js.Array[T]): WorkSheet = js.native
  @JSName("sheet_add_json")
  def sheet_add_json_T[T](ws: WorkSheet, data: js.Array[T], opts: SheetJSONOpts): WorkSheet = js.native
  
  def sheet_set_array_formula(ws: WorkSheet, range: String, formula: String): WorkSheet = js.native
  /** Assign an Array Formula to a range */
  def sheet_set_array_formula(ws: WorkSheet, range: Range, formula: String): WorkSheet = js.native
  
  /** Generates delimiter-separated-values output */
  def sheet_to_csv(worksheet: WorkSheet): String = js.native
  def sheet_to_csv(worksheet: WorkSheet, options: Sheet2CSVOpts): String = js.native
  
  /** Generates DIF */
  def sheet_to_dif(worksheet: WorkSheet): String = js.native
  def sheet_to_dif(worksheet: WorkSheet, options: Sheet2HTMLOpts): String = js.native
  
  /** Generates ETH */
  def sheet_to_eth(worksheet: WorkSheet): String = js.native
  def sheet_to_eth(worksheet: WorkSheet, options: Sheet2HTMLOpts): String = js.native
  
  /** Generates a list of the formulae (with value fallbacks) */
  def sheet_to_formulae(worksheet: WorkSheet): js.Array[String] = js.native
  
  /** Generates HTML */
  def sheet_to_html(worksheet: WorkSheet): String = js.native
  def sheet_to_html(worksheet: WorkSheet, options: Sheet2HTMLOpts): String = js.native
  
  def sheet_to_json(worksheet: WorkSheet): js.Array[js.Array[_]] = js.native
  def sheet_to_json(worksheet: WorkSheet, opts: Sheet2JSONOpts): js.Array[js.Array[_]] = js.native
  /* --- Export Functions --- */
  /** Converts a worksheet object to an array of JSON objects */
  @JSName("sheet_to_json")
  def sheet_to_json_T[T](worksheet: WorkSheet): js.Array[T] = js.native
  @JSName("sheet_to_json")
  def sheet_to_json_T[T](worksheet: WorkSheet, opts: Sheet2JSONOpts): js.Array[T] = js.native
  
  /** Generates SYLK (Symbolic Link) */
  def sheet_to_slk(worksheet: WorkSheet): String = js.native
  def sheet_to_slk(worksheet: WorkSheet, options: Sheet2HTMLOpts): String = js.native
  
  /** Generates UTF16 Formatted Text */
  def sheet_to_txt(worksheet: WorkSheet): String = js.native
  def sheet_to_txt(worksheet: WorkSheet, options: Sheet2CSVOpts): String = js.native
  
  def table_to_book(data: js.Any): WorkBook = js.native
  def table_to_book(data: js.Any, opts: Table2SheetOpts): WorkBook = js.native
  
  /** BROWSER ONLY! Converts a TABLE DOM element to a worksheet. */
  def table_to_sheet(data: js.Any): WorkSheet = js.native
  def table_to_sheet(data: js.Any, opts: Table2SheetOpts): WorkSheet = js.native
}
