package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.BaseDriver
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleMapsIframeClientProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/clients/GoogleMaps/GoogleMapsIframeClient.protractor.driver", "googleMapsIframeClientDriverFactory")
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
    
    inline def apply(
      element: () => ElementFinder,
      enterText: String => js.Promise[Unit],
      getParsedResults: () => js.Promise[js.Any],
      getResultsElementWrapper: () => ElementFinder,
      selectByValue: String => js.Promise[Unit]
    ): GoogleMapsIframeClientDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), getParsedResults = js.Any.fromFunction0(getParsedResults), getResultsElementWrapper = js.Any.fromFunction0(getResultsElementWrapper), selectByValue = js.Any.fromFunction1(selectByValue))
      __obj.asInstanceOf[GoogleMapsIframeClientDriver]
    }
    
    extension [Self <: GoogleMapsIframeClientDriver](x: Self) {
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetParsedResults(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getParsedResults", js.Any.fromFunction0(value))
      
      inline def setGetResultsElementWrapper(value: () => ElementFinder): Self = StObject.set(x, "getResultsElementWrapper", js.Any.fromFunction0(value))
      
      inline def setSelectByValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "selectByValue", js.Any.fromFunction1(value))
    }
  }
}
