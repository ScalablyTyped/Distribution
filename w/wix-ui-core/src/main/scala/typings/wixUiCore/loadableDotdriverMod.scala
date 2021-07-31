package typings.wixUiCore

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.createDriverFactoryMod.ComponentFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadableDotdriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/loadable/Loadable.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loadableDriverFactory(hasElement: ComponentFactory): LoadableDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("loadableDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[LoadableDriver]
  
  trait LoadableDriver
    extends StObject
       with BaseDriver {
    
    def existsChild(selector: String): Boolean
  }
  object LoadableDriver {
    
    @scala.inline
    def apply(exists: () => Boolean, existsChild: String => Boolean): LoadableDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), existsChild = js.Any.fromFunction1(existsChild))
      __obj.asInstanceOf[LoadableDriver]
    }
    
    @scala.inline
    implicit class LoadableDriverMutableBuilder[Self <: LoadableDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExistsChild(value: String => Boolean): Self = StObject.set(x, "existsChild", js.Any.fromFunction1(value))
    }
  }
}
