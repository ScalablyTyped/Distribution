package typings.vueCropperjs

import typings.vueCropperjs.vueCropperjsBooleans.`true`
import typings.vueCropperjs.vueCropperjsStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Default extends StObject {
    
    var default: _empty = js.native
    
    var `type`: String = js.native
  }
  object Default {
    
    @scala.inline
    def apply(default: _empty, `type`: String): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: _empty): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var default: `true` = js.native
    
    var `type`: Boolean = js.native
  }
  object Type {
    
    @scala.inline
    def apply(default: `true`, `type`: Boolean): Type = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: `true`): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
