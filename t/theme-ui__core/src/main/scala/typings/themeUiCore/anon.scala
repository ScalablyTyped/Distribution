package typings.themeUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ColumnNumber extends StObject {
    
    var columnNumber: Double
    
    var filename: String
    
    var lineNumber: Double
  }
  object ColumnNumber {
    
    inline def apply(columnNumber: Double, filename: String, lineNumber: Double): ColumnNumber = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnNumber]
    }
    
    extension [Self <: ColumnNumber](x: Self) {
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[A, B](a: A, B: B): A & B = js.native
    def apply[A, B, C](a: A, B: B, c: C): A & B & C = js.native
    def apply[A, B, C, D](a: A, B: B, c: C, d: D): A & B & C & D = js.native
  }
}
