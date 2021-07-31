package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverDotprotractorMod.BaseDriver
import typings.wixUiCore.baseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleMapsIframeClientDotProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/GoogleMapsIframeClient.protractor.driver", "googleMapsIframeClientDriverFactory")
  @js.native
  val googleMapsIframeClientDriverFactory: DriverFactory[GoogleMapsIframeClientDriver] = js.native
  
  trait GoogleMapsIframeClientDriver
    extends StObject
       with BaseDriver {
    
    def enterText(text: String): js.Promise[Unit]
    
    def getParsedResults(): js.Promise[js.Any]
    
    def getResultsElementWrapper(): ElementFinder
    
    def selectByValue(value: String): js.Promise[Unit]
  }
  object GoogleMapsIframeClientDriver {
    
    @scala.inline
    def apply(
      element: () => ElementFinder,
      enterText: String => js.Promise[Unit],
      getParsedResults: () => js.Promise[js.Any],
      getResultsElementWrapper: () => ElementFinder,
      selectByValue: String => js.Promise[Unit]
    ): GoogleMapsIframeClientDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), getParsedResults = js.Any.fromFunction0(getParsedResults), getResultsElementWrapper = js.Any.fromFunction0(getResultsElementWrapper), selectByValue = js.Any.fromFunction1(selectByValue))
      __obj.asInstanceOf[GoogleMapsIframeClientDriver]
    }
    
    @scala.inline
    implicit class GoogleMapsIframeClientDriverMutableBuilder[Self <: GoogleMapsIframeClientDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetParsedResults(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getParsedResults", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetResultsElementWrapper(value: () => ElementFinder): Self = StObject.set(x, "getResultsElementWrapper", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSelectByValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "selectByValue", js.Any.fromFunction1(value))
    }
  }
}
