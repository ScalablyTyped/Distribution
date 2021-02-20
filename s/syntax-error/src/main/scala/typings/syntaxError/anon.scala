package typings.syntaxError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.SyntaxError & {  line :number,   column :number,   annotated :string, inspect (): string} */
  @js.native
  trait SyntaxErrorlinenumbercolu extends StObject {
    
    var annotated: String = js.native
    
    var column: Double = js.native
    
    def inspect(): String = js.native
    
    var line: Double = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object SyntaxErrorlinenumbercolu {
    
    @scala.inline
    def apply(
      annotated: String,
      column: Double,
      inspect: () => String,
      line: Double,
      message: String,
      name: String
    ): SyntaxErrorlinenumbercolu = {
      val __obj = js.Dynamic.literal(annotated = annotated.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxErrorlinenumbercolu]
    }
    
    @scala.inline
    implicit class SyntaxErrorlinenumbercoluMutableBuilder[Self <: SyntaxErrorlinenumbercolu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotated(value: String): Self = StObject.set(x, "annotated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInspect(value: () => String): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
