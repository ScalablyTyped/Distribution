package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperClosablePopoverClosablePopoverDotdriverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (param0 : wix-style-react.anon.ElementEventTrigger): wix-style-react.anon.GetArrowElement extends (args : any): infer R ? R : any */ trait ClosablePopoverDriver extends StObject {
    
    def isOpened(): Boolean
  }
  object ClosablePopoverDriver {
    
    inline def apply(isOpened: () => Boolean): ClosablePopoverDriver = {
      val __obj = js.Dynamic.literal(isOpened = js.Any.fromFunction0(isOpened))
      __obj.asInstanceOf[ClosablePopoverDriver]
    }
    
    extension [Self <: ClosablePopoverDriver](x: Self) {
      
      inline def setIsOpened(value: () => Boolean): Self = StObject.set(x, "isOpened", js.Any.fromFunction0(value))
    }
  }
}
