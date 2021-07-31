package typings.wixUiCore

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverContextMod {
  
  @JSImport("wix-ui-core/dist/src/components/popover/PopoverContext", "PopoverContext")
  @js.native
  val PopoverContext: Context[PopoverContextValue] = js.native
  
  trait PopoverContextValue extends StObject {
    
    var excludeClickOutsideClasses: js.Array[String]
  }
  object PopoverContextValue {
    
    @scala.inline
    def apply(excludeClickOutsideClasses: js.Array[String]): PopoverContextValue = {
      val __obj = js.Dynamic.literal(excludeClickOutsideClasses = excludeClickOutsideClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverContextValue]
    }
    
    @scala.inline
    implicit class PopoverContextValueMutableBuilder[Self <: PopoverContextValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeClickOutsideClasses(value: js.Array[String]): Self = StObject.set(x, "excludeClickOutsideClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeClickOutsideClassesVarargs(value: String*): Self = StObject.set(x, "excludeClickOutsideClasses", js.Array(value :_*))
    }
  }
}
