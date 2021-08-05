package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.anon.Height
import typings.wixUiCore.anon.X
import typings.wixUiCore.baseDriverDotprotractorMod.BaseDriver
import typings.wixUiCore.baseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationDotProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/pagination/Pagination.protractor.driver", "paginationDriverFactory")
  @js.native
  val paginationDriverFactory: DriverFactory[PaginationDriver] = js.native
  
  trait PaginationDriver
    extends StObject
       with BaseDriver {
    
    /** Returns x & y coordinates for the element found with data-hook */
    def getElementLocation(dataHook: String): js.Promise[X]
    
    /** Returns width & height for the element found with data-hook */
    def getElementSize(dataHook: String): js.Promise[Height]
    
    /** Get the text content of pages shown in "pages" mode  */
    def getPageList(): js.Promise[js.Array[String]]
  }
  object PaginationDriver {
    
    inline def apply(
      element: () => ElementFinder,
      getElementLocation: String => js.Promise[X],
      getElementSize: String => js.Promise[Height],
      getPageList: () => js.Promise[js.Array[String]]
    ): PaginationDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), getElementLocation = js.Any.fromFunction1(getElementLocation), getElementSize = js.Any.fromFunction1(getElementSize), getPageList = js.Any.fromFunction0(getPageList))
      __obj.asInstanceOf[PaginationDriver]
    }
    
    extension [Self <: PaginationDriver](x: Self) {
      
      inline def setGetElementLocation(value: String => js.Promise[X]): Self = StObject.set(x, "getElementLocation", js.Any.fromFunction1(value))
      
      inline def setGetElementSize(value: String => js.Promise[Height]): Self = StObject.set(x, "getElementSize", js.Any.fromFunction1(value))
      
      inline def setGetPageList(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getPageList", js.Any.fromFunction0(value))
    }
  }
}
