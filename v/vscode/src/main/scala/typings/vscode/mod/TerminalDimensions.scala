package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalDimensions extends StObject {
  
  /**
    * The number of columns in the terminal.
    */
  val columns: Double
  
  /**
    * The number of rows in the terminal.
    */
  val rows: Double
}
object TerminalDimensions {
  
  @scala.inline
  def apply(columns: Double, rows: Double): TerminalDimensions = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalDimensions]
  }
  
  @scala.inline
  implicit class TerminalDimensionsMutableBuilder[Self <: TerminalDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
