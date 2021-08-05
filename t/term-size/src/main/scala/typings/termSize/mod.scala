package typings.termSize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Reliably get the terminal window size.
  @example
  ```
  import terminalSize = require('term-size');
  terminalSize();
  //=> {columns: 143, rows: 24}
  ```
  */
  inline def apply(): Size = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Size]
  
  @JSImport("term-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Size extends StObject {
    
    var columns: Double
    
    var rows: Double
  }
  object Size {
    
    inline def apply(columns: Double, rows: Double): Size = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
}
