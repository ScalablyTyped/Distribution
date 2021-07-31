package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closablePopoverDriverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (hasElementEventTrigger : wix-ui-core.anon.Element): wix-ui-core.anon.GetArrowElement extends (args : any): infer R ? any : any */ trait ClosablePopoverDriver extends StObject {
    
    def isOpened(): Boolean
  }
  object ClosablePopoverDriver {
    
    @scala.inline
    def apply(isOpened: () => Boolean): ClosablePopoverDriver = {
      val __obj = js.Dynamic.literal(isOpened = js.Any.fromFunction0(isOpened))
      __obj.asInstanceOf[ClosablePopoverDriver]
    }
    
    @scala.inline
    implicit class ClosablePopoverDriverMutableBuilder[Self <: ClosablePopoverDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpened(value: () => Boolean): Self = StObject.set(x, "isOpened", js.Any.fromFunction0(value))
    }
  }
}
