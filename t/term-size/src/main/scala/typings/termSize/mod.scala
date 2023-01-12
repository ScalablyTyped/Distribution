package typings.termSize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("term-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): TerminalSize = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[TerminalSize]
  
  trait TerminalSize extends StObject {
    
    var columns: Double
    
    var rows: Double
  }
  object TerminalSize {
    
    inline def apply(columns: Double, rows: Double): TerminalSize = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[TerminalSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TerminalSize] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
}
