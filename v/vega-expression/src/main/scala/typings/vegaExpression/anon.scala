package typings.vegaExpression

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    /** The generated code as a string */
    var code: String
    
    /** A hash of all properties referenced within the _fieldvar_ scope */
    var fields: js.Array[String]
    
    /** A hash of all properties referenced outside a provided allowed list */
    var globals: js.Array[String]
  }
  object Code {
    
    inline def apply(code: String, fields: js.Array[String], globals: js.Array[String]): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setGlobals(value: js.Array[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsVarargs(value: String*): Self = StObject.set(x, "globals", js.Array(value*))
    }
  }
}
