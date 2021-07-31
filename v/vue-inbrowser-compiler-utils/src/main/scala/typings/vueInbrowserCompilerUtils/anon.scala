package typings.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Func extends StObject {
    
    var func: js.UndefOr[Boolean] = js.undefined
    
    var name: String
  }
  object Func {
    
    @scala.inline
    def apply(name: String): Func = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Func]
    }
    
    @scala.inline
    implicit class FuncMutableBuilder[Self <: Func] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunc(value: Boolean): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var func: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunc(value: Boolean): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
