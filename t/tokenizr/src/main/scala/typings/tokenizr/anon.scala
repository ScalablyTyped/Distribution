package typings.tokenizr

import typings.std.RegExp
import typings.std.RegExpExecArray
import typings.tokenizr.mod.ActionContext
import typings.tokenizr.mod.RuleAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Action extends StObject {
    
    def action(ctx: ActionContext, found: RegExpExecArray): Unit = js.native
    @JSName("action")
    var action_Original: RuleAction = js.native
    
    var name: String = js.native
    
    var pattern: RegExp = js.native
    
    var state: String = js.native
  }
  
  @js.native
  trait Column extends StObject {
    
    var column: Double = js.native
    
    var len: Double = js.native
    
    var line: Double = js.native
    
    var pos: Double = js.native
  }
  object Column {
    
    @scala.inline
    def apply(column: Double, len: Double, line: Double, pos: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
}
