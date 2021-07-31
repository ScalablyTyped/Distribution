package typings.wixUiTestUtils

import typings.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseDriverMod {
  
  @JSImport("wix-ui-test-utils/dist/src/base-driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def baseUniDriverFactory(base: UniDriver[js.Any]): BaseUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseUniDriver]
  
  trait BaseUniDriver extends StObject {
    
    /** click on the element */
    def click(): js.Promise[Unit]
    
    /** returns the component element */
    def element(): js.Promise[js.Any]
    
    /** returns true if component exists */
    def exists(): js.Promise[Boolean]
  }
  object BaseUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean]
    ): BaseUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists))
      __obj.asInstanceOf[BaseUniDriver]
    }
    
    @scala.inline
    implicit class BaseUniDriverMutableBuilder[Self <: BaseUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    }
  }
}
