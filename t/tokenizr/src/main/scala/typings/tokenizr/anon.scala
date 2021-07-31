package typings.tokenizr

import typings.std.RegExp
import typings.std.RegExpExecArray
import typings.tokenizr.mod.ActionContext
import typings.tokenizr.mod.RuleAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    def action(ctx: ActionContext, found: RegExpExecArray): Unit
    @JSName("action")
    var action_Original: RuleAction
    
    var name: String
    
    var pattern: RegExp
    
    var state: String
  }
  object Action {
    
    @scala.inline
    def apply(action: RuleAction, name: String, pattern: RegExp, state: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: RuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Column extends StObject {
    
    var column: Double
    
    var len: Double
    
    var line: Double
    
    var pos: Double
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
