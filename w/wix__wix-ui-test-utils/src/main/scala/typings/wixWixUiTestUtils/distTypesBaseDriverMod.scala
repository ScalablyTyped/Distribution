package typings.wixWixUiTestUtils

import typings.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseDriverMod {
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/base-driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseUniDriverFactory(base: UniDriver[Any]): BaseUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseUniDriver]
  
  trait BaseUniDriver extends StObject {
    
    /** click on the element */
    def click(): js.Promise[Unit]
    
    /** returns the component element */
    def element(): js.Promise[Any]
    
    /** returns true if component exists */
    def exists(): js.Promise[Boolean]
  }
  object BaseUniDriver {
    
    inline def apply(click: () => js.Promise[Unit], element: () => js.Promise[Any], exists: () => js.Promise[Boolean]): BaseUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists))
      __obj.asInstanceOf[BaseUniDriver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseUniDriver] (val x: Self) extends AnyVal {
      
      inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    }
  }
}
