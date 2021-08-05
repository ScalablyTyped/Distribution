package typings.wixStyleReact

import typings.wixStyleReact.buttonUniDriverMod.ButtonUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseModalLayoutUniDriverMod {
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout/BaseModalLayout.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseModalLayoutDriverFactory(base: BaseUniDriver): BaseModalLayoutUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseModalLayoutDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseModalLayoutUniDriver]
  
  trait BaseModalLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def childExists(dataHook: String): js.Promise[Boolean]
    
    def clickCloseButton(): js.Promise[Unit]
    
    def clickHelpButton(): js.Promise[Unit]
    
    def getIllustrationSrc(): js.Promise[String]
    
    def getPrimaryButtonDriver(): js.Promise[ButtonUniDriver]
    
    def getSecondaryButtonDriver(): js.Promise[ButtonUniDriver]
    
    def getSubtitleText(): js.Promise[String]
    
    def getTheme(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
  }
  object BaseModalLayoutUniDriver {
    
    inline def apply(
      childExists: String => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      clickCloseButton: () => js.Promise[Unit],
      clickHelpButton: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getIllustrationSrc: () => js.Promise[String],
      getPrimaryButtonDriver: () => js.Promise[ButtonUniDriver],
      getSecondaryButtonDriver: () => js.Promise[ButtonUniDriver],
      getSubtitleText: () => js.Promise[String],
      getTheme: () => js.Promise[String],
      getTitleText: () => js.Promise[String]
    ): BaseModalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = js.Any.fromFunction0(click), clickCloseButton = js.Any.fromFunction0(clickCloseButton), clickHelpButton = js.Any.fromFunction0(clickHelpButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getIllustrationSrc = js.Any.fromFunction0(getIllustrationSrc), getPrimaryButtonDriver = js.Any.fromFunction0(getPrimaryButtonDriver), getSecondaryButtonDriver = js.Any.fromFunction0(getSecondaryButtonDriver), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTheme = js.Any.fromFunction0(getTheme), getTitleText = js.Any.fromFunction0(getTitleText))
      __obj.asInstanceOf[BaseModalLayoutUniDriver]
    }
    
    extension [Self <: BaseModalLayoutUniDriver](x: Self) {
      
      inline def setChildExists(value: String => js.Promise[Boolean]): Self = StObject.set(x, "childExists", js.Any.fromFunction1(value))
      
      inline def setClickCloseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCloseButton", js.Any.fromFunction0(value))
      
      inline def setClickHelpButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickHelpButton", js.Any.fromFunction0(value))
      
      inline def setGetIllustrationSrc(value: () => js.Promise[String]): Self = StObject.set(x, "getIllustrationSrc", js.Any.fromFunction0(value))
      
      inline def setGetPrimaryButtonDriver(value: () => js.Promise[ButtonUniDriver]): Self = StObject.set(x, "getPrimaryButtonDriver", js.Any.fromFunction0(value))
      
      inline def setGetSecondaryButtonDriver(value: () => js.Promise[ButtonUniDriver]): Self = StObject.set(x, "getSecondaryButtonDriver", js.Any.fromFunction0(value))
      
      inline def setGetSubtitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitleText", js.Any.fromFunction0(value))
      
      inline def setGetTheme(value: () => js.Promise[String]): Self = StObject.set(x, "getTheme", js.Any.fromFunction0(value))
      
      inline def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
    }
  }
}
