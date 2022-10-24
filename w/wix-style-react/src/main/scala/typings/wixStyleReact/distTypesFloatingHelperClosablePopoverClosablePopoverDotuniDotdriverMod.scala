package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperClosablePopoverClosablePopoverDotuniDotdriverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (base : @unidriver/core.@unidriver/core.UniDriver<any>, body : @unidriver/core.@unidriver/core.UniDriver<any>): wix-style-react.anon.GetArrowOffset extends (args : any): infer R ? R : any */ trait ClosablePopoverUniDriver extends StObject {
    
    def isOpened(): js.Promise[Boolean]
  }
  object ClosablePopoverUniDriver {
    
    inline def apply(isOpened: () => js.Promise[Boolean]): ClosablePopoverUniDriver = {
      val __obj = js.Dynamic.literal(isOpened = js.Any.fromFunction0(isOpened))
      __obj.asInstanceOf[ClosablePopoverUniDriver]
    }
    
    extension [Self <: ClosablePopoverUniDriver](x: Self) {
      
      inline def setIsOpened(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isOpened", js.Any.fromFunction0(value))
    }
  }
}
