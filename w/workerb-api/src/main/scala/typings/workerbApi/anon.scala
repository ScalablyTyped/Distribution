package typings.workerbApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Header extends StObject {
    
    var header: js.Array[String]
    
    var rows: js.Array[js.Object]
  }
  object Header {
    
    inline def apply(header: js.Array[String], rows: js.Array[js.Object]): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setRows(value: js.Array[js.Object]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: js.Object*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
}
