package typings.wixStyleReact

import typings.wixUiCore.paginationUniDriverMod.PaginationDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationUniDriverMod {
  
  trait PaginationUniDriver
    extends StObject
       with PaginationDriver
  object PaginationUniDriver {
    
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
    ): PaginationUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickNextButton = js.Any.fromFunction0(clickNextButton), clickOnPage = js.Any.fromFunction1(clickOnPage), clickPreviousButton = js.Any.fromFunction0(clickPreviousButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getCurrentPage = js.Any.fromFunction0(getCurrentPage), getTotalPages = js.Any.fromFunction0(getTotalPages), isVisible = js.Any.fromFunction0(isVisible))
      __obj.asInstanceOf[PaginationUniDriver]
    }
  }
}
