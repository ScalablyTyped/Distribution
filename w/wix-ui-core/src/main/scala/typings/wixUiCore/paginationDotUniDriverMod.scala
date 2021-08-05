package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationDotUniDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/pagination/Pagination.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginationDriverFactory(base: UniDriver[js.Any]): PaginationDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("paginationDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[PaginationDriver]
  
  trait PaginationDriver
    extends StObject
       with BaseUniDriver {
    
    def clickNextButton(): js.Promise[Unit]
    
    def clickOnPage(page: Double): js.Promise[Unit]
    
    def clickPreviousButton(): js.Promise[Unit]
    
    def getCurrentPage(): js.Promise[Double]
    
    def getTotalPages(): js.Promise[Double]
    
    def isVisible(): js.Promise[Boolean]
  }
  object PaginationDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickNextButton: () => js.Promise[Unit],
      clickOnPage: Double => js.Promise[Unit],
      clickPreviousButton: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getCurrentPage: () => js.Promise[Double],
      getTotalPages: () => js.Promise[Double],
      isVisible: () => js.Promise[Boolean]
    ): PaginationDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickNextButton = js.Any.fromFunction0(clickNextButton), clickOnPage = js.Any.fromFunction1(clickOnPage), clickPreviousButton = js.Any.fromFunction0(clickPreviousButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getCurrentPage = js.Any.fromFunction0(getCurrentPage), getTotalPages = js.Any.fromFunction0(getTotalPages), isVisible = js.Any.fromFunction0(isVisible))
      __obj.asInstanceOf[PaginationDriver]
    }
    
    extension [Self <: PaginationDriver](x: Self) {
      
      inline def setClickNextButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickNextButton", js.Any.fromFunction0(value))
      
      inline def setClickOnPage(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickOnPage", js.Any.fromFunction1(value))
      
      inline def setClickPreviousButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickPreviousButton", js.Any.fromFunction0(value))
      
      inline def setGetCurrentPage(value: () => js.Promise[Double]): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
      
      inline def setGetTotalPages(value: () => js.Promise[Double]): Self = StObject.set(x, "getTotalPages", js.Any.fromFunction0(value))
      
      inline def setIsVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    }
  }
}
