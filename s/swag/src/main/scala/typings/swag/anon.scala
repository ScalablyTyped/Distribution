package typings.swag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofHandlebars extends StObject {
    
    val AST: js.Any
    
    val Utils: js.Any
    
    val VM: js.Any
  }
  object TypeofHandlebars {
    
    inline def apply(AST: js.Any, Utils: js.Any, VM: js.Any): TypeofHandlebars = {
      val __obj = js.Dynamic.literal(AST = AST.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], VM = VM.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofHandlebars]
    }
    
    extension [Self <: TypeofHandlebars](x: Self) {
      
      inline def setAST(value: js.Any): Self = StObject.set(x, "AST", value.asInstanceOf[js.Any])
      
      inline def setUtils(value: js.Any): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
      
      inline def setVM(value: js.Any): Self = StObject.set(x, "VM", value.asInstanceOf[js.Any])
    }
  }
}
