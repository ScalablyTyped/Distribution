package typings.termSize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("term-size", JSImport.Namespace)
  @js.native
  def apply(): Size = js.native
  
  @js.native
  trait Size extends StObject {
    
    var columns: Double = js.native
    
    var rows: Double = js.native
  }
  object Size {
    
    @scala.inline
    def apply(columns: Double, rows: Double): Size = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
}
