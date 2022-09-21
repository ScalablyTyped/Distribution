package typings.swag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofHandlebars extends StObject {
    
    val AST: Any
    
    val Utils: Any
    
    val VM: Any
  }
  object TypeofHandlebars {
    
    inline def apply(AST: Any, Utils: Any, VM: Any): TypeofHandlebars = {
      val __obj = js.Dynamic.literal(AST = AST.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], VM = VM.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofHandlebars]
    }
    
    extension [Self <: TypeofHandlebars](x: Self) {
      
      inline def setAST(value: Any): Self = StObject.set(x, "AST", value.asInstanceOf[js.Any])
      
      inline def setUtils(value: Any): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
      
      inline def setVM(value: Any): Self = StObject.set(x, "VM", value.asInstanceOf[js.Any])
    }
  }
}
