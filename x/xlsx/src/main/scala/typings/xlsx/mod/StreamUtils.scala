package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamUtils extends js.Object {
  
  /** CSV output stream, generate one line at a time */
  def to_csv(sheet: WorkSheet): js.Any = js.native
  def to_csv(sheet: WorkSheet, opts: Sheet2CSVOpts): js.Any = js.native
  
  /** HTML output stream, generate one line at a time */
  def to_html(sheet: WorkSheet): js.Any = js.native
  def to_html(sheet: WorkSheet, opts: Sheet2HTMLOpts): js.Any = js.native
  
  /** JSON object stream, generate one row at a time */
  def to_json(sheet: WorkSheet): js.Any = js.native
  def to_json(sheet: WorkSheet, opts: Sheet2JSONOpts): js.Any = js.native
}
