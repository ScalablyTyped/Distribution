package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComposerHeaderComposerHeaderDotuniDotdriverMod {
  
  trait ComposerHeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def actionsExists(dataHook: String): js.Promise[Boolean]
    
    def backButtonExists(): js.Promise[Boolean]
    
    def clickBack(): js.Promise[Unit]
    
    def getBackButtonText(): js.Promise[String]
    
    def getSaveStatusValue(dataHook: String): js.Promise[String]
    
    def mainActionsExists(dataHook: String): js.Promise[Boolean]
    
    def saveStatusExists(dataHook: String): js.Promise[Boolean]
  }
  object ComposerHeaderUniDriver {
    
    inline def apply(
      actionsExists: String => js.Promise[Boolean],
      backButtonExists: () => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      clickBack: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getBackButtonText: () => js.Promise[String],
      getSaveStatusValue: String => js.Promise[String],
      mainActionsExists: String => js.Promise[Boolean],
      saveStatusExists: String => js.Promise[Boolean]
    ): ComposerHeaderUniDriver = {
      val __obj = js.Dynamic.literal(actionsExists = js.Any.fromFunction1(actionsExists), backButtonExists = js.Any.fromFunction0(backButtonExists), click = js.Any.fromFunction0(click), clickBack = js.Any.fromFunction0(clickBack), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getBackButtonText = js.Any.fromFunction0(getBackButtonText), getSaveStatusValue = js.Any.fromFunction1(getSaveStatusValue), mainActionsExists = js.Any.fromFunction1(mainActionsExists), saveStatusExists = js.Any.fromFunction1(saveStatusExists))
      __obj.asInstanceOf[ComposerHeaderUniDriver]
    }
    
    extension [Self <: ComposerHeaderUniDriver](x: Self) {
      
      inline def setActionsExists(value: String => js.Promise[Boolean]): Self = StObject.set(x, "actionsExists", js.Any.fromFunction1(value))
      
      inline def setBackButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "backButtonExists", js.Any.fromFunction0(value))
      
      inline def setClickBack(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickBack", js.Any.fromFunction0(value))
      
      inline def setGetBackButtonText(value: () => js.Promise[String]): Self = StObject.set(x, "getBackButtonText", js.Any.fromFunction0(value))
      
      inline def setGetSaveStatusValue(value: String => js.Promise[String]): Self = StObject.set(x, "getSaveStatusValue", js.Any.fromFunction1(value))
      
      inline def setMainActionsExists(value: String => js.Promise[Boolean]): Self = StObject.set(x, "mainActionsExists", js.Any.fromFunction1(value))
      
      inline def setSaveStatusExists(value: String => js.Promise[Boolean]): Self = StObject.set(x, "saveStatusExists", js.Any.fromFunction1(value))
    }
  }
}
