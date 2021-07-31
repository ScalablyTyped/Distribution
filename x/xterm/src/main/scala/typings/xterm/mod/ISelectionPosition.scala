package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing a selection within the terminal.
  */
trait ISelectionPosition extends StObject {
  
  /**
    * The end column of the selection.
    */
  var endColumn: Double
  
  /**
    * The end row of the selection.
    */
  var endRow: Double
  
  /**
    * The start column of the selection.
    */
  var startColumn: Double
  
  /**
    * The start row of the selection.
    */
  var startRow: Double
}
object ISelectionPosition {
  
  @scala.inline
  def apply(endColumn: Double, endRow: Double, startColumn: Double, startRow: Double): ISelectionPosition = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionPosition]
  }
  
  @scala.inline
  implicit class ISelectionPositionMutableBuilder[Self <: ISelectionPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
  }
}
