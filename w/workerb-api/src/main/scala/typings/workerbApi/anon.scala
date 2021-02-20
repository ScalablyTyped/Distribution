package typings.workerbApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Header extends StObject {
    
    var header: js.Array[String] = js.native
    
    var rows: js.Array[js.Object] = js.native
  }
  object Header {
    
    @scala.inline
    def apply(header: js.Array[String], rows: js.Array[js.Object]): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      @scala.inline
      def setRows(value: js.Array[js.Object]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: js.Object*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
}
