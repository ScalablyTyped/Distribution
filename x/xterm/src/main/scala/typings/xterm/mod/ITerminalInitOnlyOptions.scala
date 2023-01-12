package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITerminalInitOnlyOptions extends StObject {
  
  /**
    * The number of columns in the terminal.
    */
  var cols: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of rows in the terminal.
    */
  var rows: js.UndefOr[Double] = js.undefined
}
object ITerminalInitOnlyOptions {
  
  inline def apply(): ITerminalInitOnlyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITerminalInitOnlyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITerminalInitOnlyOptions] (val x: Self) extends AnyVal {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
