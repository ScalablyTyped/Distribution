package typings.swag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofHandlebars extends StObject {
    
    val AST: js.Any = js.native
    
    val Utils: js.Any = js.native
    
    val VM: js.Any = js.native
  }
  object TypeofHandlebars {
    
    @scala.inline
    def apply(AST: js.Any, Utils: js.Any, VM: js.Any): TypeofHandlebars = {
      val __obj = js.Dynamic.literal(AST = AST.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], VM = VM.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofHandlebars]
    }
    
    @scala.inline
    implicit class TypeofHandlebarsMutableBuilder[Self <: TypeofHandlebars] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAST(value: js.Any): Self = StObject.set(x, "AST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtils(value: js.Any): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVM(value: js.Any): Self = StObject.set(x, "VM", value.asInstanceOf[js.Any])
    }
  }
}
