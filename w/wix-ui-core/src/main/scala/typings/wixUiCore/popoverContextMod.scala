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
    
    inline def apply(excludeClickOutsideClasses: js.Array[String]): PopoverContextValue = {
      val __obj = js.Dynamic.literal(excludeClickOutsideClasses = excludeClickOutsideClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverContextValue]
    }
    
    extension [Self <: PopoverContextValue](x: Self) {
      
      inline def setExcludeClickOutsideClasses(value: js.Array[String]): Self = StObject.set(x, "excludeClickOutsideClasses", value.asInstanceOf[js.Any])
      
      inline def setExcludeClickOutsideClassesVarargs(value: String*): Self = StObject.set(x, "excludeClickOutsideClasses", js.Array(value :_*))
    }
  }
}
