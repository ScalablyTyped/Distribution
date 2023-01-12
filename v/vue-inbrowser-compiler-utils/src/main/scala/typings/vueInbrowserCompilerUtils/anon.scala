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
    
    inline def apply(name: String): Func = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Func]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Func] (val x: Self) extends AnyVal {
      
      inline def setFunc(value: Boolean): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var func: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setFunc(value: Boolean): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
