package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverProtractorMod.BaseDriver
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/deprecated/divider/Divider.protractor.driver", "dividerDriverFactory")
  @js.native
  val dividerDriverFactory: DriverFactory[DividerDriver] = js.native
  
  trait DividerDriver
    extends StObject
       with BaseDriver {
    
    def exists(): js.Promise[Boolean]
  }
  object DividerDriver {
    
    inline def apply(element: () => ElementFinder, exists: () => js.Promise[Boolean]): DividerDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists))
      __obj.asInstanceOf[DividerDriver]
    }
    
    extension [Self <: DividerDriver](x: Self) {
      
      inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    }
  }
}
