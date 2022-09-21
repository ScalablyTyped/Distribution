package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamUtils extends StObject {
  
  /** Set `Readable` (internal) */
  def set_readable(Readable: Any): Unit = js.native
  
  /** CSV output stream, generate one line at a time */
  def to_csv(sheet: WorkSheet): Any = js.native
  def to_csv(sheet: WorkSheet, opts: Sheet2CSVOpts): Any = js.native
  
  /** HTML output stream, generate one line at a time */
  def to_html(sheet: WorkSheet): Any = js.native
  def to_html(sheet: WorkSheet, opts: Sheet2HTMLOpts): Any = js.native
  
  /** JSON object stream, generate one row at a time */
  def to_json(sheet: WorkSheet): Any = js.native
  def to_json(sheet: WorkSheet, opts: Sheet2JSONOpts): Any = js.native
}
